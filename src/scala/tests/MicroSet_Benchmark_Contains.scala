package scala.tests

import java.util.{HashSet, Random, TreeSet}

import com.google.caliper.runner.CaliperMain
import com.google.caliper.{BeforeExperiment, Benchmark}

import scala.implementation.{MicroSet, Use}

/**
  * Created by pxl on 03/04/17.
  */

class MicroSet_Benchmark_Contains {

  val microInnerSet = new MicroSet[TestObject]()
  MicroSet.use = Use.ARRAY_SET
  val microArraySet = new MicroSet[TestObject]()
  MicroSet.use = Use.HASH_SET
  val microHAshSet = new MicroSet[TestObject]()

  val hashSet = new HashSet[TestObject]
  val treeSet = new TreeSet[TestObject]

  var tabTestObject: Array[TestObject] = Array.ofDim(runnerContains.NUMBER_OF_TEST_OBJECT)
  var tabRandomInt: Array[Int] = Array.ofDim(runnerContains.NUMBER_OF_TEST_OBJECT)

  @BeforeExperiment()
  def setUp() = {
    val rand: Random = new Random
    for (i <- 0 until runnerContains.NUMBER_OF_TEST_OBJECT) tabTestObject(i) = TestObject(rand.nextInt())
    for (i <- 0 until runnerContains.NUMBER_OF_TEST_OBJECT / 2) {
      microArraySet.add(tabTestObject(i))
      microHAshSet.add(tabTestObject(i))
      microInnerSet.add(tabTestObject(i))

      hashSet.add(tabTestObject(i))
      treeSet.add(tabTestObject(i))
    }
    for (i <- 0 until runnerContains.NUMBER_OF_TEST_OBJECT) tabRandomInt(i) = rand.nextInt(runnerContains.NUMBER_OF_TEST_OBJECT)
  }

  @Benchmark
  def testContains_TreeSet(reps: Int) = {
    for (i <- 0 to reps) {
      for (j <- 0 until runnerContains.NUMBER_OF_TEST_OBJECT) treeSet.contains(tabTestObject(tabRandomInt(j)))
    }
  }

  @Benchmark
  def testContains_HashSet(reps: Int) = {
    for (i <- 0 to reps) {
      for (j <- 0 until runnerContains.NUMBER_OF_TEST_OBJECT) hashSet.contains(tabTestObject(tabRandomInt(j)))
    }
  }

  @Benchmark
  def testContains_InnerSet(reps: Int) = {
    for (i <- 0 to reps) {
      for (j <- 0 until runnerContains.NUMBER_OF_TEST_OBJECT) microInnerSet.contains(tabTestObject(tabRandomInt(j)))
    }
  }

  @Benchmark
  def testContains_InnerArraySet(reps: Int) = {
    for (i <- 0 to reps) {
      for (j <- 0 until runnerContains.NUMBER_OF_TEST_OBJECT) microArraySet.contains(tabTestObject(tabRandomInt(j)))
    }
  }

  @Benchmark
  def testContains_InnerHashSet(reps: Int) = {
    for (i <- 0 to reps) {
      for (j <- 0 until runnerContains.NUMBER_OF_TEST_OBJECT) microHAshSet.contains(tabTestObject(tabRandomInt(j)))
    }
  }
}

object runnerContains
  {
    val NUMBER_OF_TEST_OBJECT: Int = 30
    def main(args: Array[String]): Unit = {
      val args = Array[String]("-i", "runtime", "-r", "ADD scale=" + NUMBER_OF_TEST_OBJECT + ", object_number=" + NUMBER_OF_TEST_OBJECT)
      CaliperMain.main(classOf[MicroSet_Benchmark_Contains], args)
    }
  }

