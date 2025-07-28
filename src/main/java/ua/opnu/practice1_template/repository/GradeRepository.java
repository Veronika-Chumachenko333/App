package ua.opnu.practice1_template.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.opnu.practice1_template.entity.Grade;
import ua.opnu.practice1_template.entity.Lesson;
import ua.opnu.practice1_template.entity.Student;
import java.util.List;

@Repository
public interface GradeRepository extends CrudRepository<Grade, Long> {
    List<Grade> findByStudent(Student student);
    List<Grade> findByLesson(Lesson lesson);

}