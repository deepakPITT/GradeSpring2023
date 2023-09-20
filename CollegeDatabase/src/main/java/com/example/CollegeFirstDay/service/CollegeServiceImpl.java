package com.example.CollegeFirstDay.service;

import com.example.CollegeFirstDay.model.College;
import com.example.CollegeFirstDay.repo.CollegeRepo;
//import com.example.GradeFirstDay.model.Grade;
//import com.example.GradeFirstDay.repo.GradeRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j

public class CollegeServiceImpl implements CollegeService{

    @Autowired
    CollegeRepo repo;

    @Override
    public List<College> saveCollege(List<College> gList) {

        repo.saveAll(gList);
        return gList;
    }

    @Override
    public List<College> getAllColleges() {

        return repo.findAll();
    }


}
