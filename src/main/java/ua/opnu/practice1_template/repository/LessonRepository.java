package ua.opnu.practice1_template.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.opnu.practice1_template.entity.DrivingGroup;
import ua.opnu.practice1_template.entity.Lesson;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface LessonRepository extends CrudRepository<Lesson, Long> {
    List<Lesson> findByGroup(DrivingGroup group);
    List<Lesson> findByDateAfter(LocalDate now);
}