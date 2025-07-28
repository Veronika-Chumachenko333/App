package ua.opnu.practice1_template.service;

import ua.opnu.practice1_template.entity.DrivingGroup;
import ua.opnu.practice1_template.entity.Student;
import java.util.List;

public interface DrivingGroupService {
    DrivingGroup createGroup(DrivingGroup group);
    DrivingGroup getGroupById(Long id);
    List<DrivingGroup> getAllGroups();
    DrivingGroup updateGroup(Long id, DrivingGroup updatedGroup);
    void deleteGroup(Long id);
    void addStudentToGroup(Long groupId, Long studentId);
    List<Student> getStudentsInGroup(Long groupId);
    void removeStudentFromGroup(Long groupId, Long studentId);
    List<DrivingGroup> getGroupsByInstructor(Long instructorId);
    int countStudentsInGroup(Long groupId);

}

