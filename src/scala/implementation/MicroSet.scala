package scala.implementation

import java.util.Set
import java.util

import scala.implementation.Use.Use

object MicroSet
{
  def apply[T](innerSet: InnerSet[T]): MicroSet[T] = new MicroSet[T](innerSet)
  def apply[T](microSet: MicroSet[T]): MicroSet[T] = new MicroSet[T](microSet)
  def apply[T](use: Use): MicroSet[T] = new MicroSet[T](use)
  def apply[T](): MicroSet[T] = new MicroSet[T](InnerSet_0[T])
}

object Use extends Enumeration
{
  type Use = Value
  val INNER_SET, ARRAY_SET, HASH_SET = Value
}

class MicroSet[T](var innerSet: InnerSet[T]) extends Set[T] {

  def apply(innerSet_0: InnerSet_0[T]) = new MicroSet[T](innerSet_0)
  def apply(as: InnerArraySet[T]) = new MicroSet[T](as)
  def apply(hs: InnerHashSet[T]) = new MicroSet[T](hs)

  def this(microSet: MicroSet[T]) =
  {
    this(microSet.innerSet.copy.get)
  }
  
  def this(use: Use) = this(selectUse(use))

  def selectUse(use: Use): InnerSet[T] = use match{
    case Use.ARRAY_SET => new InnerArraySet[T]
    case Use.HASH_SET => new InnerHashSet[T]
    case Use.INNER_SET | _ => InnerSet_0[T]
  }

  def add(element: T): Boolean =
  {
    val oldInnerSet: InnerSet[T] = innerSet
    innerSet = innerSet.addElement(element)
    innerSet.getSize == oldInnerSet.getSize + 1
  }

  def addAll(microSet: MicroSet[T]): Boolean =
  {
    val oldInnerSet: InnerSet[T] = innerSet
    innerSet = microSet.innerSet.addAllElements(oldInnerSet)
    !innerSet.getSize.equals(oldInnerSet.getSize)
  }

  override def addAll(c: util.Collection[_ <: T]): Boolean =
  {
    val oldInnerSet = this.innerSet
    val scalaIterable: Iterable[_ <: T] = c.asInstanceOf[Iterable[_ <: T]]


    scalaIterable foreach innerSet.addElement

    !innerSet.getSize.equals(oldInnerSet.getSize)
  }

  def addAllAndPropagate(microSetToAdd: MicroSet[T]): MicroSet[T] =
  {
    var microSetReturn: MicroSet[T] = MicroSet[T]
    innerSet = innerSet.addAllAndPropagate(microSetToAdd.innerSet, microSetReturn)
    microSetReturn
  }

  def remove(element: Object): Boolean =
  {
    val oldInnerSet: InnerSet[T] = innerSet
    innerSet = innerSet.removeElement(element)
    innerSet.getSize == oldInnerSet.getSize - 1
  }

  def removeAll(microSet: MicroSet[T]): Boolean =
  {
    val oldInnerSet: InnerSet[T] = innerSet
    innerSet = microSet.innerSet.removeAllElements(oldInnerSet)
    innerSet.getSize != oldInnerSet.getSize
  }

  override def removeAll(c: util.Collection[_]): Boolean =
  {
    val oldInnerSet = innerSet
    val scalaIterable: Iterable[_ <: Object] = c.asInstanceOf[Iterable[_ <: Object]]

    def removeEl(el: Object) = if(innerSet.containsElement(el)) innerSet.removeElement(el)

    scalaIterable foreach removeEl

    innerSet.getSize != oldInnerSet.getSize
  }

  override def contains(element: Object): Boolean = innerSet.containsElement(element)

  def containsAll(microSet: MicroSet[T]): Boolean = microSet.innerSet.containsAllElements(innerSet)

  override def containsAll(c: util.Collection[_]): Boolean =
  {
    val scalaIterable: Iterable[_] = c.asInstanceOf[Iterable[_]]
    for(el <-  scalaIterable) {
      if(!innerSet.containsElement(el.asInstanceOf[Object])) return false
    }
    true
  }

  def retainAll(microSet: MicroSet[T]): Boolean =
  {
    var oldInnerSet: InnerSet[T] = innerSet
    innerSet = microSet.innerSet.retainAllElements(innerSet)
    innerSet.getSize != microSet.innerSet.getSize
  }

  override def retainAll(c: util.Collection[_]): Boolean =
  {
    val oldInnerSet: InnerSet[T] = innerSet
    val scalaIterable: Iterable[_ <: T] = c.asInstanceOf[Iterable[_ <: T]]
    this.innerSet = InnerSet_0[T]

    for (el <- scalaIterable) {
      if (oldInnerSet.containsElement(el.asInstanceOf[Object])) innerSet = innerSet.addElement(el)
    }
    innerSet.getSize != oldInnerSet.getSize
  }

  def size(): Int = innerSet.getSize

  def isEmpty(): Boolean = innerSet.getSize == 0

  def clear() = innerSet = innerSet.clear(false)

  override def iterator(): util.Iterator[T] = ??? //TODO

  override def toString: String = "MicroSet { " + "innerSet = " + innerSet + " }" + "\n"

  override def toArray[T](a: Array[T with Object ]): Array[T with Object] = ??? //TODO
  override def toArray: Array[AnyRef] = ??? //TODO
}
