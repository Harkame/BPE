#include "inner_set_3.hpp"

template<typename T>
inner_set_3<T>::inner_set_3()
{

}

template<typename T>
inner_set_3<T>::inner_set_3(T p_element_1, T p_element_2, T p_element_3)
{
            a_values.element_1 = p_element_1;
            a_values.element_2 = p_element_2;
            a_values.element_3 = p_element_3;
    }

template<typename T>
inner_set_3<T>::inner_set_3(inner_set_2<T> p_inner_set, T p_element)
{
            a_values.element_1 = p_inner_set.a_values.element_1;            a_values.element_2 = p_inner_set.a_values.element_2;                    a_values.element_3 = p_element;
}

template<typename T>
inner_set_3<T>::~inner_set_3()
{

}

                                                template<typename T>
inner_set<T>* inner_set_3<T>::add_element(T p_element)
{
    if(!contains_element(p_element))
        return new inner_set_4<T>(this, p_element);
    else
        return this;
}

template<typename T>
inner_set<T>* inner_set_3<T>::add_elements(T* p_elements)
{
    return nullptr; //TODO
}

template<typename T>
bool inner_set_3<T>::contains_element(T p_element)
{
    return  a_values.element_1 == p_element ||  a_values.element_2 == p_element ||  a_values.element_3 == p_element;
}

template<typename T>
bool inner_set_3<T>::contains_all_elements(T* p_elements)
{
    return false; //TODO
}

template<typename T>
T inner_set_3<T>::get_element(int p_index)
{
    return reinterpret_cast<T*>(&a_values)[p_index];
}

template<typename T>
inner_set<T>* inner_set_3<T>::remove_element(T p_element)
{
            if(a_values.element_1 == p_element)
            return new inner_set_2<T>( a_values.element_2,  a_values.element_3);
         else             if(a_values.element_2 == p_element)
            return new inner_set_2<T>( a_values.element_1,  a_values.element_3);
         else             if(a_values.element_3 == p_element)
            return new inner_set_2<T>( a_values.element_1,  a_values.element_2);
                else
        return this;
}

template<typename T>
inner_set<T>* inner_set_3<T>::retain_all_element(T* p_elements)
{
    return this; //TODO
}

template<typename T>
int inner_set_3<T>::get_size()
{
    return 3;
}