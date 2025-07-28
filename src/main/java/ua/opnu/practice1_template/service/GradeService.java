package ua.opnu.practice1_template.service;

import ua.opnu.practice1_template.entity.Grade;
import java.util.List;

public interface GradeService {
    Grade createGrade(Grade grade);
    List<Grade> getGradesByStudent(Long studentId);
    List<Grade> getGradesByLesson(Long lessonId);
    Grade updateGrade(Long id, Grade updatedGrade);
    Double getAverageScoreByStudentId(Long studentId);

}

