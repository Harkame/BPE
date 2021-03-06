#ifndef INNER_ARRAY_SET_HPP
#define INNER_ARRAY_SET_HPP

#include "inner_set.hpp"
#include "inner_set.hpp"
#include "inner_set_0.hpp"
#include "inner_set_1.hpp"
#include "inner_set_2.hpp"
#include "inner_set_3.hpp"
#include "inner_set_4.hpp"
#include "inner_set_5.hpp"
#include "inner_set_6.hpp"
#include "inner_set_7.hpp"
#include "inner_set_8.hpp"
#include "inner_set_9.hpp"
#include "inner_set_10.hpp"
#include "inner_set_11.hpp"
#include "inner_set_12.hpp"
#include "inner_set_13.hpp"
#include "inner_set_14.hpp"
#include "inner_set_15.hpp"
#include "inner_set_16.hpp"
#include "inner_set_17.hpp"
#include "inner_set_18.hpp"
#include "inner_set_19.hpp"

using namespace std;

template<typename T, int p_to_up>
class inner_array_set : public inner_set<T, p_to_up>
{
    public :
        T a_values [20];
        int a_index;

          inner_array_set<T, p_to_up>();
          inner_array_set<T, p_to_up>(T);
          inner_array_set<T, p_to_up>(inner_set_1<T, p_to_up>*, T);
          inner_array_set<T, p_to_up>(inner_set_2<T, p_to_up>*, T);
          inner_array_set<T, p_to_up>(inner_set_3<T, p_to_up>*, T);
          inner_array_set<T, p_to_up>(inner_set_4<T, p_to_up>*, T);
          inner_array_set<T, p_to_up>(inner_set_5<T, p_to_up>*, T);
          inner_array_set<T, p_to_up>(inner_set_6<T, p_to_up>*, T);
          inner_array_set<T, p_to_up>(inner_set_7<T, p_to_up>*, T);
          inner_array_set<T, p_to_up>(inner_set_8<T, p_to_up>*, T);
          inner_array_set<T, p_to_up>(inner_set_9<T, p_to_up>*, T);
          inner_array_set<T, p_to_up>(inner_set_10<T, p_to_up>*, T);
          inner_array_set<T, p_to_up>(inner_set_11<T, p_to_up>*, T);
          inner_array_set<T, p_to_up>(inner_set_12<T, p_to_up>*, T);
          inner_array_set<T, p_to_up>(inner_set_13<T, p_to_up>*, T);
          inner_array_set<T, p_to_up>(inner_set_14<T, p_to_up>*, T);
          inner_array_set<T, p_to_up>(inner_set_15<T, p_to_up>*, T);
          inner_array_set<T, p_to_up>(inner_set_16<T, p_to_up>*, T);
          inner_array_set<T, p_to_up>(inner_set_17<T, p_to_up>*, T);
          inner_array_set<T, p_to_up>(inner_set_18<T, p_to_up>*, T);
          inner_array_set<T, p_to_up>(inner_set_19<T, p_to_up>*, T);

          inner_array_set<T, p_to_up>(inner_set<T, p_to_up>*);

        virtual ~inner_array_set<T, p_to_up>();

        virtual inner_set<T, p_to_up>* add_element(T);
        virtual inner_set<T, p_to_up>* add_all_elements(inner_set<T, p_to_up>*);

        virtual bool contains_element(T);
        virtual bool contains_all_elements(inner_set<T, p_to_up>*);

        virtual inner_set<T, p_to_up>* copy();

        virtual T get_element(int);

        virtual inner_set<T, p_to_up>* remove_element(T);
        virtual inner_set<T, p_to_up>* remove_all_elements(inner_set<T, p_to_up>*);

        virtual inner_set<T, p_to_up>* retain_all_elements(inner_set<T, p_to_up>*);

        virtual inner_set<T, p_to_up>* add_and_propagate(T, micro_set<T, p_to_up>*);
        virtual inner_set<T, p_to_up>* add_all_and_propagate(inner_set<T, p_to_up>*, micro_set<T, p_to_up>*);
        virtual inner_set<T, p_to_up>* add_all_and_propagate_reverse(inner_set<T, p_to_up>*, micro_set<T, p_to_up>*);

        virtual int get_size();
};

#endif
