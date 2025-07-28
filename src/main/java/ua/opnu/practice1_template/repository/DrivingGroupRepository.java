package ua.opnu.practice1_template.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.opnu.practice1_template.entity.DrivingGroup;

import java.util.List;

@Repository
public interface DrivingGroupRepository extends CrudRepository<DrivingGroup, Long> {
    List<DrivingGroup> findByInstructorId(Long instructorId);
}