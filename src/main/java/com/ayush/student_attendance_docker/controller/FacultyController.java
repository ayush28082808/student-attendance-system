
package com.ayush.student_attendance_docker.controller;

import com.ayush.student_attendance_docker.entity.Faculty;
import com.ayush.student_attendance_docker.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty")
@CrossOrigin("*")
public class FacultyController {

    @Autowired
    private FacultyService service;

    @PostMapping
    public Faculty save(@RequestBody Faculty faculty) {
        return service.save(faculty);
    }

    @GetMapping
    public List<Faculty> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Faculty getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Faculty update(@PathVariable Long id,
                          @RequestBody Faculty faculty) {
        return service.update(id, faculty);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Faculty Deleted Successfully";
    }
}