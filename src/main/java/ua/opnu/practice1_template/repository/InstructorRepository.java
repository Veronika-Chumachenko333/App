package ua.opnu.practice1_template.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.opnu.practice1_template.entity.Instructor;

@Repository
public interface InstructorRepository extends CrudRepository<Instructor, Long> { }