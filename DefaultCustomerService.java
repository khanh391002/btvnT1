package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultCustomerService implements StudentService{
    @Autowired
    private StudentReponsitory studentReponsitory;

    public void saveStudent(){
        studentReponsitory.save(new Student("3","KhanhSmile",21,"Hà Nội"));
    }
}
