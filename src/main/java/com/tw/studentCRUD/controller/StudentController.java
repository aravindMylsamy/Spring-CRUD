package com.tw.studentCRUD.controller;

import com.tw.studentCRUD.model.Student;
import com.tw.studentCRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/student")
    public Student saveStudent(@Valid @RequestBody Student student , BindingResult results) throws Exception {
        System.out.println("-----------  "+results.hasErrors());
        if(results.hasErrors()){

            throw new Exception();
        }
        return studentService.saveStudent(student);
    }

    @GetMapping("/student/{id}")
    public Student getStudentByEmail(@PathVariable(value = "id") Long id) throws Exception {
         return studentService.getStudentById(id);
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
       return studentService.getAllStudents();
    }

    @PutMapping("/student/{id}")
    public Student updateStudent(@PathVariable(value = "id") Long id , @RequestBody Student student) throws Exception {
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable(value = "id") Long id) throws Exception {
         studentService.deleteStudent(id);
         return "deleted Successfully";
    }

}
