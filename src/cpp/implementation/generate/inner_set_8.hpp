#ifndef INNER_SET_8_H
#define INNER_SET_8_H


#include "inner_set.hpp"
#include "inner_set_7.hpp"

using namespace std;

template<typename T>
class inner_set_8 : public inner_set<T>
{
    public :
        struct values
        {
             T element_1;  T element_2;  T element_3;  T element_4;  T element_5;  T element_6;  T element_7;  T element_8;
        } a_values;

        inner_set_8<T>();
        inner_set_8<T>(T , T , T , T , T , T , T , T );
        inner_set_8<T>(inner_set_7<T>, T);

        virtual ~inner_set_8<T>();

        virtual inner_set<T>* add_element(T);
        virtual inner_set<T>* add_elements(T*);

        virtual bool contains_element(T);
        virtual bool contains_all_elements(T*);

        virtual T get_element(int);

        virtual inner_set<T>* remove_element(T);

        virtual inner_set<T>* retain_all_element(T*);

        virtual int get_size();
};

#endif
