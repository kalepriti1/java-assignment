package com.example.repository;

import com.example.entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends JpaRepository<Register,String> {
    boolean existsByEmailId(String emailId);

    Register findByEmailId(String emailId);
}
