package com.mouadspring.Services;
import com.mouadspring.Models.Student;
import com.mouadspring.Repositories.StudentRepository;
import java.util.List;
public interface StudentService {
    public List<Student> getAllStudents();
    public Student CreateStudent(Student student);
    public void DeleteStudent(Long id);
    Student UpdateStudent(Student student, Long id);
}
