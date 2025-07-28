package ua.opnu.practice1_template.service;

import ua.opnu.practice1_template.entity.Instructor;
import java.util.List;

public interface InstructorService {
    Instructor createInstructor(Instructor instructor);
    Instructor getInstructorById(Long id);
    List<Instructor> getAllInstructors();
    Instructor updateInstructor(Long id, Instructor updatedInstructor);
    void deleteInstructor(Long id);
}

