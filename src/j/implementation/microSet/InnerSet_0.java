package j.implementation.microSet;


import java.util.Collection;

public class InnerSet_0 <T> implements InnerSet<T>
{
	static InnerSet_0<Object> singleton = new InnerSet_0<>();
	
	@Override
	public InnerSet<T> addElement(T p_element)
	{
		return null;//new InnerSet_1(p_element);
	}

	@Override
	public InnerSet<T> addAllElements(Collection<? extends T> p_newC) {
		return null;
	}

	@Override
	public InnerSet<T> removeElement(Object p_element)
	{
		return this;
	}

	@Override
	public InnerSet<T> removeAllElements(Collection<?> p_cToDelete) {
		return null;
	}

	@Override
	public InnerSet<T> retainAllElements(Collection<?> p_cToKeep) {
		return null;
	}

	public T getElement(int index)
	{
		return null;
	}
	
	@Override
	public String toString()
	{
		return "{}";
	}
	
	@Override
	public int getSize()
	{
		return 0;
	}

	@Override
	public boolean containsElement(Object p_element)
	{
		return false;
	}

	@Override
	public boolean containsAllElements(Collection<?> p_c) {
		return false;
	}
}
