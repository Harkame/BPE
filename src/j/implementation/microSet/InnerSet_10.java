package j.implementation.microSet;

import java.util.Collection;

public class InnerSet_10 <T> implements InnerSet<T>
{
        protected T element_1;
        protected T element_2;
        protected T element_3;
        protected T element_4;
        protected T element_5;
        protected T element_6;
        protected T element_7;
        protected T element_8;
        protected T element_9;
        protected T element_10;
        
    public InnerSet_10(T p_element_1, T p_element_2, T p_element_3, T p_element_4, T p_element_5, T p_element_6, T p_element_7, T p_element_8, T p_element_9, T p_element_10)
    {
                element_1 = p_element_1;
                element_2 = p_element_2;
                element_3 = p_element_3;
                element_4 = p_element_4;
                element_5 = p_element_5;
                element_6 = p_element_6;
                element_7 = p_element_7;
                element_8 = p_element_8;
                element_9 = p_element_9;
                element_10 = p_element_10;
            }
    
    @Override
    public InnerSet<T> addElement(T p_element)
    {
        if(element_1.equals(p_element) || element_2.equals(p_element) || element_3.equals(p_element) || element_4.equals(p_element) || element_5.equals(p_element) || element_6.equals(p_element) || element_7.equals(p_element) || element_8.equals(p_element) || element_9.equals(p_element) || element_10.equals(p_element))
            return this;
        else
            return new InnerSet_11(element_1, element_2, element_3, element_4, element_5, element_6, element_7, element_8, element_9, element_10 , p_element);
    }

    @Override
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public InnerSet<T> removeElement(Object p_element)
    {
                if(element_1.equals(p_element))
            return new InnerSet_9(element_2, element_3, element_4, element_5, element_6, element_7, element_8, element_9, element_10);
         else                 if(element_2.equals(p_element))
            return new InnerSet_9(element_1, element_3, element_4, element_5, element_6, element_7, element_8, element_9, element_10);
         else                 if(element_3.equals(p_element))
            return new InnerSet_9(element_1, element_2, element_4, element_5, element_6, element_7, element_8, element_9, element_10);
         else                 if(element_4.equals(p_element))
            return new InnerSet_9(element_1, element_2, element_3, element_5, element_6, element_7, element_8, element_9, element_10);
         else                 if(element_5.equals(p_element))
            return new InnerSet_9(element_1, element_2, element_3, element_4, element_6, element_7, element_8, element_9, element_10);
         else                 if(element_6.equals(p_element))
            return new InnerSet_9(element_1, element_2, element_3, element_4, element_5, element_7, element_8, element_9, element_10);
         else                 if(element_7.equals(p_element))
            return new InnerSet_9(element_1, element_2, element_3, element_4, element_5, element_6, element_8, element_9, element_10);
         else                 if(element_8.equals(p_element))
            return new InnerSet_9(element_1, element_2, element_3, element_4, element_5, element_6, element_7, element_9, element_10);
         else                 if(element_9.equals(p_element))
            return new InnerSet_9(element_1, element_2, element_3, element_4, element_5, element_6, element_7, element_8, element_10);
         else                 if(element_10.equals(p_element))
            return new InnerSet_9(element_1, element_2, element_3, element_4, element_5, element_6, element_7, element_8, element_9);
                        else
            return this;
    }

    @Override
    public boolean containsElement(Object p_element)
    {
        return element_1.equals(p_element) || element_2.equals(p_element) || element_3.equals(p_element) || element_4.equals(p_element) || element_5.equals(p_element) || element_6.equals(p_element) || element_7.equals(p_element) || element_8.equals(p_element) || element_9.equals(p_element) || element_10.equals(p_element);
    }


    public T getElement(int index)
    {
                if (index == 1 )
            return element_1;
         else                 if (index == 2 )
            return element_2;
         else                 if (index == 3 )
            return element_3;
         else                 if (index == 4 )
            return element_4;
         else                 if (index == 5 )
            return element_5;
         else                 if (index == 6 )
            return element_6;
         else                 if (index == 7 )
            return element_7;
         else                 if (index == 8 )
            return element_8;
         else                 if (index == 9 )
            return element_9;
         else                 if (index == 10 )
            return element_10;
                        else
            return null;
    }

    @Override
    public InnerSet<T> addAllElements(Collection<? extends T> p_newC) {
        return null;
    }

    @Override
    public InnerSet<T> removeAllElements(Collection<?> p_cToDelete) {
        return null;
    }

    @Override
    public InnerSet<T> retainAllElements(Collection<?> p_cToKeep) {
        return null;
    }

    @Override
    public boolean containsAllElements(Collection<?> p_c) {
        return false;
    }

    @Override
    public String toString()
    {
        return "{" + element_1 + ", " + element_2 + ", " + element_3 + ", " + element_4 + ", " + element_5 + ", " + element_6 + ", " + element_7 + ", " + element_8 + ", " + element_9 + ", " + element_10 + " }";
    }
    
    @Override
    public int getSize()
    {
        return 10;
    }

}