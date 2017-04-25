#ifndef INNER_SET_10_H
#define INNER_SET_10_H


#include "inner_set.hpp"
#include "inner_set_9.hpp"

using namespace std;

template<typename T>
class inner_set_10 : public inner_set<T>
{
    public :
        struct values
        {
             T element_1;  T element_2;  T element_3;  T element_4;  T element_5;  T element_6;  T element_7;  T element_8;  T element_9;  T element_10;
        } a_values;

        inner_set_10<T>();
        inner_set_10<T>(T , T , T , T , T , T , T , T , T , T );
        inner_set_10<T>(inner_set_9<T>, T);

        virtual ~inner_set_10<T>();

        virtual inner_set<T>* add_element(T);
        virtual inner_set<T>* add_elements(T*);

        virtual bool contains_element(T);
        virtual bool contains_all_elements(T*);

        virtual T get_element(int);

        virtual inner_set<T>* remove_element(T);

        virtual inner_set<T>* retain_all_element(T*);

        virtual inner_set<T>* add_all_and_propagate(inner_set<T>*, micro_set<T>*);
        virtual inner_set<T>* add_all_and_propagate_reverse(inner_set<T>*, micro_set<T>*);

        virtual int get_size();
};

#endif
