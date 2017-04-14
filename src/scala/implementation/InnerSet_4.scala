package scala.implementation

object InnerSet_4
{
    def apply[T](element1: T, element2: T, element3: T, element4: T): InnerSet_4[T] = new InnerSet_4[T](element1, element2, element3, element4)
}

class InnerSet_4[T](element1: T, element2: T, element3: T, element4: T) extends AbstractInnerSet[T]
{

    override def addElement(p_element: T): InnerSet[T] =
    {
        if (element1.equals(p_element) || element2.equals(p_element) || element3.equals(p_element) || element4.equals(p_element))
        {
            this
        }
        else  InnerSet_5(element1, element2, element3, element4, p_element)
    }

    override def addUnchecked(p_element: T): InnerSet[T] = InnerSet_5(element1, element2, element3, element4, p_element)


    override def addAllElements(p_innerSet: InnerSet[T]): InnerSet[T] =     {
                p_innerSet.addElement(element1)
                p_innerSet.addElement(element2)
                p_innerSet.addElement(element3)
                p_innerSet.addElement(element4)
            }
    override def containsElement(p_element: Object): Boolean = element1.equals(p_element) || element2.equals(p_element) || element3.equals(p_element) || element4.equals(p_element)
    override def containsAllElements(p_innerSet: InnerSet[T]): Boolean =  p_innerSet.containsElement(element1.asInstanceOf[Object]) && p_innerSet.containsElement(element2.asInstanceOf[Object]) && p_innerSet.containsElement(element3.asInstanceOf[Object]) && p_innerSet.containsElement(element4.asInstanceOf[Object])

    override def getElement(p_index: Int): Option[T] = p_index match{
        case 1 => Option(element1)
        case 2 => Option(element2)
        case 3 => Option(element3)
        case 4 => Option(element4)
        case _ => None
    }


    override def removeElement(p_element: Object): InnerSet[T] =
    {
            if(element1.equals(p_element))
         InnerSet_3(element2, element3, element4)
                  else             if(element2.equals(p_element))
         InnerSet_3(element1, element3, element4)
                  else             if(element3.equals(p_element))
         InnerSet_3(element1, element2, element4)
                  else             if(element4.equals(p_element))
         InnerSet_3(element1, element2, element3)
                        else this
    }

    override def removeAllElements(p_innerSet: InnerSet[T]): InnerSet[T] =     {
                p_innerSet.removeElement(element1.asInstanceOf[Object])
                p_innerSet.removeElement(element2.asInstanceOf[Object])
                p_innerSet.removeElement(element3.asInstanceOf[Object])
                p_innerSet.removeElement(element4.asInstanceOf[Object])
            }

    override def retainAllElements(p_innerSet: InnerSet[T]): InnerSet[T] =
    {
      var i: InnerSet[T] = this
            if(!p_innerSet.containsElement(element1.asInstanceOf[Object])) i = i.removeElement(element1.asInstanceOf[Object])
            if(!p_innerSet.containsElement(element2.asInstanceOf[Object])) i = i.removeElement(element2.asInstanceOf[Object])
            if(!p_innerSet.containsElement(element3.asInstanceOf[Object])) i = i.removeElement(element3.asInstanceOf[Object])
            if(!p_innerSet.containsElement(element4.asInstanceOf[Object])) i = i.removeElement(element4.asInstanceOf[Object])
            i
    }

    override def getSize: Int = 4

    override def iterator: InnerSetIterator[T] = InnerSetIterator(this)

    override def copy: Option[InnerSet[T]] = Option(InnerSet_4(element1: T, element2: T, element3: T, element4: T))

    override def clear(unused: Boolean): InnerSet[T] = new InnerSet_0

    override def toString : String = "{ " + element1 + ", " + element2 + ", " + element3 + ", " + element4 + " }"
}