package j.implementation.microSet;

import java.util.Iterator;

public class InnerSet_4 <T> extends AbstractInnerSet<T>
{
        protected T element_1;
        protected T element_2;
        protected T element_3;
        protected T element_4;
        
    public InnerSet_4(T p_element_1, T p_element_2, T p_element_3, T p_element_4)
    {
                element_1 = p_element_1;
                element_2 = p_element_2;
                element_3 = p_element_3;
                element_4 = p_element_4;
            }

    public InnerSet_4(InnerSet_4<T> i)
    {
            element_1 = i.element_1;
            element_2 = i.element_2;
            element_3 = i.element_3;
            element_4 = i.element_4;
        }

    public InnerSet_4<T> copy() {
        return new InnerSet_4(this);
    }

    public InnerSet_4(InnerSet_3<T> i, T el)
    {
            element_1 = i.element_1;            element_2 = i.element_2;            element_3 = i.element_3;                    element_4 = el;
    }
    
    @Override
    public InnerSet<T> addElement(T p_element)
    {
        if(element_1.equals(p_element) || element_2.equals(p_element) || element_3.equals(p_element) || element_4.equals(p_element))
            return this;
        else
            return new InnerSet_5<>(this, p_element);    }

    @Override
    public InnerSet<T> addUnChecked(T p_element)
    {
        return new InnerSet_5<>(this, p_element);    }

    @Override
    public InnerSet<T> removeElement(Object p_element)
    {
                if(element_1.equals(p_element))
            return  new InnerSet_3<>(element_2, element_3, element_4);
         else                 if(element_2.equals(p_element))
            return  new InnerSet_3<>(element_1, element_3, element_4);
         else                 if(element_3.equals(p_element))
            return  new InnerSet_3<>(element_1, element_2, element_4);
         else                 if(element_4.equals(p_element))
            return  new InnerSet_3<>(element_1, element_2, element_3);
                        else
            return this;
    }

    @Override
    public boolean containsElement(Object p_element)
    {
        return element_1.equals(p_element) || element_2.equals(p_element) || element_3.equals(p_element) || element_4.equals(p_element);
    }


    public T getElement(int index)
    {switch(index) {
                case 1:
            return element_1;
                case 2:
            return element_2;
                case 3:
            return element_3;
                case 4:
            return element_4;
                default:
            return null;
            }
    }


    public InnerSet<T> addAllElements(InnerSet<T> innerSet) {
        return innerSet.addElement(element_1).addElement(element_2).addElement(element_3).addElement(element_4);
    }


    @Override
    public InnerSet<T> removeAllElements(InnerSet<T> innerSet) {
        return innerSet.removeElement(element_1).removeElement(element_2).removeElement(element_3).removeElement(element_4);
    }

    @Override
    public InnerSet<T> retainAllElements(InnerSet<T> innerSet) {
        InnerSet<T> i = this;
                if (!innerSet.containsElement(element_1)) i = i.removeElement(element_1);
                if (!innerSet.containsElement(element_2)) i = i.removeElement(element_2);
                if (!innerSet.containsElement(element_3)) i = i.removeElement(element_3);
                if (!innerSet.containsElement(element_4)) i = i.removeElement(element_4);
                return i;
    }

    @Override
    public boolean containsAllElements(InnerSet<T> innerSet) {
        return  innerSet.containsElement(element_1) && innerSet.containsElement(element_2) && innerSet.containsElement(element_3) && innerSet.containsElement(element_4);
    }

    public InnerSet<T> addAllAndPropagate(InnerSet<T> innerSet, MicroSet<T> microSetToPropagate) {
        return innerSet.addAllAndPropagateReverse(this, microSetToPropagate);
    }


    public InnerSet<T> addAllAndPropagateReverse(InnerSet<T> innerSet, MicroSet<T> microSetToPropagate) {
        return innerSet.addAndPropagate(element_1, microSetToPropagate).addAndPropagate(element_2, microSetToPropagate).addAndPropagate(element_3, microSetToPropagate).addAndPropagate(element_4, microSetToPropagate);
    }

    public InnerSet<T> addAndPropagate(T p_element, MicroSet<T> microSetToPropagate) {
        if(element_1.equals(p_element) || element_2.equals(p_element) || element_3.equals(p_element) || element_4.equals(p_element))
            return this;
        else {
            microSetToPropagate.add(p_element);
            return new InnerSet_5<>(this, p_element);        }
    }

    @Override
    public String toString()
    {
        return "{" + element_1 + ", " + element_2 + ", " + element_3 + ", " + element_4 + " }";
    }
    
    @Override
    public int getSize()
    {
        return 4;
    }

    @Override
    public Iterator<T> iterator() {
        return new InnerSetIterator<>(this);
    }

    @Override
    public InnerSet<T> clear(boolean unused) {
        return (InnerSet<T>) InnerSet_0.singleton;
    }
}
