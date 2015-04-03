package com.library.student.dao;

import com.library.common.GenericDao;
import com.library.student.model.Student;

import java.util.List;

/**
 * Created by ISAAC on 3/11/2015.
 */
public interface StudentDao extends GenericDao<Student,Long>{

        List<Student> getStudents(Long userId);

}
