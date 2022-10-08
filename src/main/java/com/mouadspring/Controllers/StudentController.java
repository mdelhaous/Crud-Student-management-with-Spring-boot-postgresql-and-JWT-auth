package com.mouadspring.Controllers;
import com.mouadspring.Models.Student;
import com.mouadspring.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Students")
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/GetAllStudents")
    public List<Student> students() {
        return studentService.getAllStudents();
    }
    @PostMapping("/AdminAuth/saveStudent")
    public Student createStudent(@RequestBody Student student) {
        return studentService.CreateStudent(student);
    }
    @DeleteMapping("/AdminAuth/delStudent/{id}")
    public void deletonestudent(@PathVariable Long id) {
        studentService.DeleteStudent(id);
    }
    @PutMapping("/AdminAuth/updateSt/{id}")
    public void updateStudent(@RequestBody Student  student,@PathVariable Long id){
        studentService.UpdateStudent(student,id);
    }
}
