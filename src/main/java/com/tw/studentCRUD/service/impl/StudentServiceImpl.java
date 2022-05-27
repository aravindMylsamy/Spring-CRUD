package com.tw.studentCRUD.service.impl;

import com.tw.studentCRUD.model.Student;
import com.tw.studentCRUD.repository.StudentRepository;
import com.tw.studentCRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long Id) throws Exception {
        Optional< Student > student =  studentRepository.findById(Id);

        if(student.isPresent()){
            return student.get();
        }
        else{
            throw new Exception();
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Long id ,Student studentDetails) throws Exception {
        Student student = getStudentById(id);
        student.setName(studentDetails.getName());
        student.setEmail(studentDetails.getEmail());
        student.setMobileNumber(studentDetails.getMobileNumber());
        student.setAge(studentDetails.getAge());
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) throws Exception {
        Student student = getStudentById(id);
        studentRepository.delete(student);
    }
}
