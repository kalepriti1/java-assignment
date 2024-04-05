package com.example.repositry;

import com.example.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositry extends JpaRepository<Department,Integer> {
    Department findAllById(int id);
}
