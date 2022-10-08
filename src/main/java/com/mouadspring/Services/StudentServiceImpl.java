package com.mouadspring.Services;
import com.mouadspring.Models.Student;
import com.mouadspring.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @Override
    public Student CreateStudent(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public void DeleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
    @Override
    public Student UpdateStudent(Student student, Long id) {
        Student stu= new Student();
        stu = studentRepository.getById(id);
        if(stu != null){
            stu.setName(student.getName());
            studentRepository.save(stu);
        }
        return stu;
    }
}
