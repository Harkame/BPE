package scala.implementation

object InnerSet_8
{
    def apply[T](element1: T, element2: T, element3: T, element4: T, element5: T, element6: T, element7: T, element8: T): InnerSet_8[T] = new InnerSet_8[T](element1, element2, element3, element4, element5, element6, element7, element8)
}

class InnerSet_8[T](element1: T, element2: T, element3: T, element4: T, element5: T, element6: T, element7: T, element8: T) extends InnerSet[T]
{

    override def addElement(p_element: T): InnerSet[T] =
    {
        if (element1.equals(p_element) || element2.equals(p_element) || element3.equals(p_element) || element4.equals(p_element) || element5.equals(p_element) || element6.equals(p_element) || element7.equals(p_element) || element8.equals(p_element))
        {
            this
        }
        else  new InnerSet_9(element1element2element3element4element5element6element7element8, p_element)
    }

    override def addUnchecked(p_element: T): InnerSet[T] = InnerSet_9(element1, p_element)element2, p_element)element3, p_element)element4, p_element)element5, p_element)element6, p_element)element7, p_element)element8, p_element)

    override def addAllElements(p_innerSet: InnerSet[T]): InnerSet[T] =     {
                p_innerSet.addElement(element1)        p_innerSet.addElement(element2)        p_innerSet.addElement(element3)        p_innerSet.addElement(element4)        p_innerSet.addElement(element5)        p_innerSet.addElement(element6)        p_innerSet.addElement(element7)        p_innerSet.addElement(element8)    }
    override def containsElements(p_element: T): Boolean = element1.equals(p_element) || element2.equals(p_element) || element3.equals(p_element) || element4.equals(p_element) || element5.equals(p_element) || element6.equals(p_element) || element7.equals(p_element) || element8.equals(p_element)

    override def containsAllElements(p_innerSet: InnerSet[T]): Boolean =  p_innerSet.containsElements(element1) && p_innerSet.containsElements(element2) && p_innerSet.containsElements(element3) && p_innerSet.containsElements(element4) && p_innerSet.containsElements(element5) && p_innerSet.containsElements(element6) && p_innerSet.containsElements(element7) && p_innerSet.containsElements(element8)

    override def getElement(p_index: Int): Option[T] = p_index match{
    case 1 => Option(element1)
    case 2 => Option(element2)
    case 3 => Option(element3)
    case 4 => Option(element4)
    case 5 => Option(element5)
    case 6 => Option(element6)
    case 7 => Option(element7)
    case 8 => Option(element8)
    case _ => null
    }


    override def removeElement(p_element: T): InnerSet[T] =
    {
            if(element1.equals(p_element)){
             new InnerSet_7(element2, element3, element4, element5, element6, element7, element8)                     if(element2.equals(p_element)){
             new InnerSet_7(element1, element3, element4, element5, element6, element7, element8)                     if(element3.equals(p_element)){
             new InnerSet_7(element1, element2, element4, element5, element6, element7, element8)                     if(element4.equals(p_element)){
             new InnerSet_7(element1, element2, element3, element5, element6, element7, element8)                     if(element5.equals(p_element)){
             new InnerSet_7(element1, element2, element3, element4, element6, element7, element8)                     if(element6.equals(p_element)){
             new InnerSet_7(element1, element2, element3, element4, element5, element7, element8)                     if(element7.equals(p_element)){
             new InnerSet_7(element1, element2, element3, element4, element5, element6, element8)                     if(element8.equals(p_element)){
             new InnerSet_7(element1, element2, element3, element4, element5, element6, element7)            }
        else this
    }


    override def removeAllElements(p_innerSet: InnerSet[T]): InnerSet[T] =     {
                p_innerSet.removeElement(element1)        p_innerSet.removeElement(element2)        p_innerSet.removeElement(element3)        p_innerSet.removeElement(element4)        p_innerSet.removeElement(element5)        p_innerSet.removeElement(element6)        p_innerSet.removeElement(element7)        p_innerSet.removeElement(element8)    }

    override def retainAllElements(p_innerSet: InnerSet[T]): InnerSet[T] =
    {
      var i: InnerSet[T] = this
            if(!p_innerSet.containsElements(element1)) i = i.removeElement(element1)      if(!p_innerSet.containsElements(element2)) i = i.removeElement(element2)      if(!p_innerSet.containsElements(element3)) i = i.removeElement(element3)      if(!p_innerSet.containsElements(element4)) i = i.removeElement(element4)      if(!p_innerSet.containsElements(element5)) i = i.removeElement(element5)      if(!p_innerSet.containsElements(element6)) i = i.removeElement(element6)      if(!p_innerSet.containsElements(element7)) i = i.removeElement(element7)      if(!p_innerSet.containsElements(element8)) i = i.removeElement(element8)      i
    }

    override def getSize: Int = 8

    override def iterator: Iterator[T] = ???

    override def copy: Option[InnerSet[T]] = Option(new InnerSet_8(element1: T, element2: T, element3: T, element4: T, element5: T, element6: T, element7: T, element8: T))

    override def clear(unused: Boolean): InnerSet[T] = new InnerSet_0
}