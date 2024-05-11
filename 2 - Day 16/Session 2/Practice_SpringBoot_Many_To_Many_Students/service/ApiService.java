package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.examly.springapp.model.Course;
import com.examly.springapp.model.Student;
import com.examly.springapp.repository.CourseRepo;
import com.examly.springapp.repository.StudentRepo;

@Service
public class ApiService {

    @Autowired
    private CourseRepo crepo;

    @Autowired
    private StudentRepo srepo;

    public Student addS(Student s) {
        return srepo.save(s);
    }

    public List<Student> getListS() {
        return srepo.findAll();
    }

    public Student getByIdS(int sid) {
        if (srepo.existsById(sid)) {
            return srepo.findById(sid).get();
        }
        return null;
    }

    public Student updateById(int sid, Student s1) {
        if (srepo.existsById(sid)) {
            s1.setId(sid);
            return srepo.save(s1);
        }
        return null;
    }

    public Course updateCourse(int cid, Course s) {
        if (crepo.existsById(cid)) {
            s.setId(cid);
            return crepo.save(s);
        }
        return null;
    }

    public boolean delete(int cid) {
        if (crepo.existsById(cid)) {
            crepo.deleteById(cid);
            return true;
        }
        return false;
    }

}
