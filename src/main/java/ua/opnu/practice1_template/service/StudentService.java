package ua.opnu.practice1_template.service;

import ua.opnu.practice1_template.entity.Student;
import java.util.List;

public interface StudentService {
    Student createStudent(Student student);
    Student getStudentById(Long id);
    List<Student> getAllStudents();
    Student updateStudent(Long id, Student updatedStudent);
    void deleteStudent(Long id);
    List<Student> getStudentsWithoutGrades();

}

