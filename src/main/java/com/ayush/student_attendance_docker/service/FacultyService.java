package com.ayush.student_attendance_docker.service;

import com.ayush.student_attendance_docker.entity.Faculty;
import com.ayush.student_attendance_docker.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository repository;

    public Faculty save(Faculty faculty) {
        return repository.save(faculty);
    }

    public List<Faculty> getAll() {
        return repository.findAll();
    }

    public Faculty getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Faculty update(Long id, Faculty faculty) {

        Faculty old = repository.findById(id).orElseThrow();

        old.setName(faculty.getName());
        old.setEmail(faculty.getEmail());
        old.setDepartment(faculty.getDepartment());
        old.setPhone(faculty.getPhone());

        return repository.save(old);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}