package scala.tests

import java.util.{HashSet, Random, TreeSet}

import com.google.caliper.{BeforeExperiment, Benchmark}
import com.google.caliper.api.VmOptions
import com.google.caliper.runner.CaliperMain

import scala.implementation.MicroSet

/**
  * Created by pxl on 03/04/17.
  */

@VmOptions (Array ("-XX:-TieredCompilation") )
class MicroSet_Benchmark_Add {

  val NUMBER_OF_TEST_OBJECT: Int = 30
  val microInnerSet = new MicroSet[TestObject]()
  val microArraySet = new MicroSet[TestObject]()
  val microHAshSet = new MicroSet[TestObject]()

  val hashSet = new HashSet[TestObject]
  val treeSet = new TreeSet[TestObject]

  var tabTestObject: Array[TestObject] = Array.ofDim(NUMBER_OF_TEST_OBJECT)
  var tabRandomInt: Array[Int] = Array.ofDim(NUMBER_OF_TEST_OBJECT)

  @BeforeExperiment()
  def setUp() =
  {
    val rand: Random = new Random
    for(i <- 0 to NUMBER_OF_TEST_OBJECT -1) tabTestObject(i) = new TestObject(rand.nextInt(13))
    for(i <- 0 to NUMBER_OF_TEST_OBJECT -1) tabRandomInt(i) = rand.nextInt(NUMBER_OF_TEST_OBJECT)
  }

  @Benchmark
  def testAdd_TreeSet(reps: Int) =
  {
     for(i <- 0 to reps)
     {
       for(j <- 0 to NUMBER_OF_TEST_OBJECT) treeSet.add(tabTestObject(tabRandomInt(j)))
     }
  }

  @Benchmark
  def testAdd_HashSet(reps: Int) =
  {
    for(i <- 0 to reps)
    {
      for(j <- 0 to NUMBER_OF_TEST_OBJECT) hashSet.add(tabTestObject(tabRandomInt(j)))
    }
  }

  @Benchmark
  def testAdd_InnerSet(reps: Int) =
  {
    for(i <- 0 to reps)
    {
      for(j <- 0 to NUMBER_OF_TEST_OBJECT) microInnerSet.add(tabTestObject(tabRandomInt(j)))
    }
  }

  @Benchmark
  def testAdd_InnerArraySet(reps: Int) =
  {
    for(i <- 0 to reps)
    {
      for(j <- 0 to NUMBER_OF_TEST_OBJECT) microArraySet.add(tabTestObject(tabRandomInt(j)))
    }
  }

  @Benchmark
  def testAdd_InnerHashSet(reps: Int) =
  {
    for(i <- 0 to reps)
    {
      for(j <- 0 to NUMBER_OF_TEST_OBJECT) microHAshSet.add(tabTestObject(tabRandomInt(j)))
    }
  }
}

object runner {
  def main(args: Array[String]): Unit = {
    //val args = Array[String]("-i", "runtime", "-r", "ADD scale=" + MiNUMBER_OF_TEST_OBJECT + ", object_number=" + NUMBER_OF_TEST_OBJECT)
    CaliperMain.main(classOf[MicroSet_Benchmark_Add], args)
  }
}
