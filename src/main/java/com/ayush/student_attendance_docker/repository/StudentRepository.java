package com.ayush.student_attendance_docker.repository;

import com.ayush.student_attendance_docker.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}