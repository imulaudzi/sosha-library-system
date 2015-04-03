package com.library.student.service;

import com.library.student.dao.StudentDao;
import com.library.student.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by ISAAC on 3/21/2015.
 */
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public void addStudent(Student student) {
      studentDao.create(student);
    }

    @Override
    public List<Student> getStudents(Long userId) {
        List<Student> students = studentDao.getStudents(userId);
        return students;
    }
}
