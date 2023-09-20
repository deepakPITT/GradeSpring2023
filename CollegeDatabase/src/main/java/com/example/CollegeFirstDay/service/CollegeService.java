package com.example.CollegeFirstDay.service;

import com.example.CollegeFirstDay.model.College;

import java.util.List;

public interface CollegeService {
    List<College> saveCollege(List<College> gList);
   // void deleteGradeByName(String name);
    List<College> getAllColleges();
  //  void updateGradeByName(String name,String score);
}
