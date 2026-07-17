
package com.ayush.student_attendance_docker.service;

import com.ayush.student_attendance_docker.entity.Attendance;

import java.util.List;
import java.util.Optional;

public interface AttendanceService {

    Attendance saveAttendance(Attendance attendance);

    List<Attendance> getAllAttendance();

    Optional<Attendance> getAttendanceById(Long id);

    Attendance updateAttendance(Long id, Attendance attendance);

    void deleteAttendance(Long id);
}