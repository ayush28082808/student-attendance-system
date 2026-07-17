package com.ayush.student_attendance_docker.repository;

import com.ayush.student_attendance_docker.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}