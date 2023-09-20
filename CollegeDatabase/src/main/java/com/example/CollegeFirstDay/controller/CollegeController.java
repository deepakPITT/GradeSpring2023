package com.example.CollegeFirstDay.controller;

import com.example.CollegeFirstDay.model.College;
import com.example.CollegeFirstDay.service.CollegeService;
//import com.example.GradeFirstDay.repo.GradeRepo;
//import com.example.GradeFirstDay.service.GradeService;
//import com.example.GradeFirstDay.service.GradeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@Slf4j

public class CollegeController {

    //GradeService service= new GradeServiceImpl();

   // List<Grade> grades = new ArrayList<>();
    @Autowired
    private CollegeService service;

    @GetMapping("/college")
    public List<College> getColleges() {
        log.info("get grade request");
        return service.getAllColleges();
    }


    @PostMapping("/college")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public List<College> createCollege(@Valid @RequestBody List<College> gList) {
       log.info("add service service {}",gList);
       return service.saveCollege(gList);
    }

   // @GetMapping("/grades/{name}")
    //@ResponseStatus(HttpStatus.BAD_REQUEST)
    //public void getGradesByName(@Valid @PathVariable String name) {
    //        return;

   // }

}

//    @PutMapping("/grades/{name}/{score}")
//    //@ResponseStatus(HttpStatus.BAD_REQUEST)
//    public ResponseEntity<Grade> updateGradeByName(@PathVariable String name ,@PathVariable String score) {
//        service.updateGradeByName(name,score);
//        return new ResponseEntity("Success",HttpStatus.CREATED);
//    }
//
//
//    @DeleteMapping("/grades/{name}")
//    public void  delGradesByName(@PathVariable String name) {
//        service.deleteGradeByName(name);
//        return;
//    }


//    @GetMapping("/grades/{name}")
//    public Grade getGradesByName(@PathVariable String name) {
//        Grade grade = service.findByName(name);
//        return grade;
//    }



//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public Map<String, String> handleValidationExceptions(
//            MethodArgumentNotValidException ex) {
//        Map<String, String> errors = new HashMap<>();
//        ex.getBindingResult().getAllErrors().forEach((error) -> {
//            String fieldName = ((FieldError) error).getField();
//            String errorMessage = error.getDefaultMessage();
//            errors.put(fieldName, errorMessage);
//        });
//        return errors;
//    }

