package com.library.common;

import java.io.Serializable;

/**
 * Created by ISAAC on 3/11/2015.
 */
public interface GenericDao<T, P extends Serializable> {

    P create(T t);
    void delete(T o);
    T find (P o);
    void update(T t);

}
