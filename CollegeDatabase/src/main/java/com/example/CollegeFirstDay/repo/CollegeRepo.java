package com.example.CollegeFirstDay.repo;

import com.example.CollegeFirstDay.model.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepo extends JpaRepository<College, Long>{

}
