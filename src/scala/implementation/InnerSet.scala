package scala.implementation

trait InnerSet[T] {

  def addElement(p_element: T): InnerSet[T]

  def addUnchecked(p_element: T): InnerSet[T]

  def addAllElements(p_innerSet: InnerSet[T]): InnerSet[T]

  def containsElements(p_element: T): Boolean

  def containsAllElements(p_innerSet: InnerSet[T]): Boolean

  def getElement(index: Int): Option[T]

  def removeElement(p_element: T): InnerSet[T]

  def removeAllElements(p_innerSet: InnerSet[T]): InnerSet[T]

  def retainAllElements(p_innerSet: InnerSet[T]): InnerSet[T]

  def getSize: Int

  def iterator: InnerSetIterator[T]

  def copy: Option[InnerSet[T]]

  def clear(unused: Boolean): InnerSet[T]

  def toString: String
}
