#include "micro_tree_set.hpp"

using namespace std;

template<typename T>
micro_tree_set<T>::micro_tree_set()
{
	//a_inner_set = (inner_set<T>*) inner_set_0<T>::INNER_SET_0;
	a_inner_set = new inner_tree_set<T>();
}

template<typename T>
micro_tree_set<T>::~micro_tree_set()
{

}

/* Operator */
/*
template<typename T>
micro_tree_set<T> micro_tree_set<T>::operator=(micro_tree_set<T> p_micro_tree_set)
{
	//TODO
	micro_tree_set<T>* r_micro_tree_set = new micro_tree_set<T>(){}

	return r_micro_tree_set;
}
*/

/* Iterators */

template<typename T>
void micro_tree_set<T>::begin()
{

}

template<typename T>
void micro_tree_set<T>::end()
{

}

template<typename T>
void micro_tree_set<T>::rbegin()
{

}

template<typename T>
void micro_tree_set<T>::rend()
{

}

template<typename T>
void micro_tree_set<T>::cbegin()
{

}

template<typename T>
void micro_tree_set<T>::cend()
{

}

template<typename T>
void micro_tree_set<T>::crbegin()
{

}

template<typename T>
void micro_tree_set<T>::crend()
{

}

template<typename T>
bool micro_tree_set<T>::empty() const
{
    return a_inner_set->get_size() == 0;
}

template<typename T>
int micro_tree_set<T>::size() const
{
    return a_inner_set->get_size();
}

template<typename T>
int micro_tree_set<T>::max_size() const
{
	return -1; //Pas de taille max ?
}

/* Modifiers */

template<typename T>
void micro_tree_set<T>:: insert(T p_element)
{
	a_inner_set = a_inner_set->add_element(p_element);
}

template<typename T>
void micro_tree_set<T>:: erase(T p_element)
{
	a_inner_set->remove_element(p_element);
}

template<typename T>
void micro_tree_set<T>:: swap(){}

template<typename T>
void micro_tree_set<T>:: clear(){}

template<typename T>
void micro_tree_set<T>:: emplace(){}

template<typename T>
void micro_tree_set<T>:: emplace_hint(){}

/* Observers */ //TODO

/* Operations */
/*
template<typename T>
void micro_tree_set<T>:: find()
{

}

template<typename T>
void micro_tree_set<T>:: count()
{

}
*/

template<typename T>
void micro_tree_set<T>:: lower_bound(){}

template<typename T>
void micro_tree_set<T>:: upper_bound(){}

template<typename T>
void micro_tree_set<T>:: equal_range(){}

/* Allocator */

template<typename T>
void micro_tree_set<T>:: get_allocator(){}
