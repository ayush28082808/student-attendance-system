package com.ayush.student_attendance_docker.service;

import com.ayush.student_attendance_docker.entity.Student;
import com.ayush.student_attendance_docker.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    
public Student getStudentById(Long id) {
    return studentRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Student not found"));
}//

    public Student updateStudent(Long id, Student updatedStudent) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        student.setName(updatedStudent.getName());
        student.setRollNumber(updatedStudent.getRollNumber());
        student.setEmail(updatedStudent.getEmail());
        student.setBranch(updatedStudent.getBranch());
        student.setYear(updatedStudent.getYear());

        return studentRepository.save(student);
    }
    public void deleteStudent(Long id) {
    studentRepository.deleteById(id);
}
}