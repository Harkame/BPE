#include "inner_set.hpp"
#include "inner_set_0.hpp"

template<typename T>
inner_set_0<T>::inner_set_0() : inner_set<T>()
{
}

template<typename T>
inner_set_0<T>::~inner_set_0()
{

}

template<typename T>
inner_set<T>* inner_set_0<T>::add_element(T* p_element)
{
    return new inner_set_1<T>(p_element);
}

template<typename T>
inner_set<T>* inner_set_0<T>::add_elements(T** p_elements)
{
    //TODO
    return nullptr;
}

template<typename T>
bool inner_set_0<T>::contains_element(T* p_element)
{
    return false;
}

template<typename T>
bool inner_set_0<T>::contains_all_elements(T* p_elements)
{
    return false;
}

template<typename T>
T* inner_set_0<T>::get_element(int p_index)
{
    return nullptr;
}

template<typename T>
inner_set<T>* inner_set_0<T>::remove_element(T* p_element)
{
    return this;
}

template<typename T>
inner_set<T>* inner_set_0<T>::retain_all_element(T** p_elements)
{
    return this;
}

template<typename T>
int inner_set_0<T>::get_size()
{
    return 0;
}