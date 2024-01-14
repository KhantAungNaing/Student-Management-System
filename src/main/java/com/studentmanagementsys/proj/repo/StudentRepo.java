package com.studentmanagementsys.proj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanagementsys.proj.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
