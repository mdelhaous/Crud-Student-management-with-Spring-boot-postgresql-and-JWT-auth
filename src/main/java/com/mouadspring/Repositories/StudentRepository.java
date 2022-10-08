package com.mouadspring.Repositories;
import com.mouadspring.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    public List<Student> findAll();
    public void deleteById(Long id);
}