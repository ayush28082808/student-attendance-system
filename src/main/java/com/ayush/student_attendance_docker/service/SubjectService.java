package com.ayush.student_attendance_docker.service;

import com.ayush.student_attendance_docker.entity.Subject;
import com.ayush.student_attendance_docker.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public Subject saveSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }
    public Subject getSubjectById(Long id) {
    return subjectRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Subject not found"));
}

    public Subject updateSubject(Long id, Subject updatedSubject) {

        Subject subject = subjectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Subject not found"));

        subject.setSubjectName(updatedSubject.getSubjectName());
        subject.setSubjectCode(updatedSubject.getSubjectCode());
        subject.setCredits(updatedSubject.getCredits());

        return subjectRepository.save(subject);
    }

    public void deleteSubject(Long id) {
        subjectRepository.deleteById(id);
    }
}