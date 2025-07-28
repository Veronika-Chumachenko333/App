package ua.opnu.practice1_template.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.opnu.practice1_template.entity.DrivingGroup;
import ua.opnu.practice1_template.entity.Student;
import ua.opnu.practice1_template.service.DrivingGroupService;

import java.util.List;

@RestController
@RequestMapping("/api/groups")
@RequiredArgsConstructor
public class DrivingGroupController {
    private final DrivingGroupService groupService;

    @Autowired
    public DrivingGroupController(DrivingGroupService groupService) {
        this.groupService = groupService;
    }

    @PostMapping("/group")
    public ResponseEntity<DrivingGroup> createGroup(@RequestBody DrivingGroup group) {
        return ResponseEntity.ok(groupService.createGroup(group));
    }

    @GetMapping
    public List<DrivingGroup> getAllGroups() {
        return groupService.getAllGroups();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DrivingGroup> getGroupById(@PathVariable Long id) {
        return ResponseEntity.ok(groupService.getGroupById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DrivingGroup> updateGroup(@PathVariable Long id, @RequestBody DrivingGroup group) {
        return ResponseEntity.ok(groupService.updateGroup(id, group));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGroup(@PathVariable Long id) {
        groupService.deleteGroup(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{groupId}/students/{studentId}")
    public ResponseEntity<Void> addStudentToGroup(@PathVariable Long groupId, @PathVariable Long studentId) {
        groupService.addStudentToGroup(groupId, studentId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{groupId}/students")
    public ResponseEntity<List<Student>> getStudentsInGroup(@PathVariable Long groupId) {
        return ResponseEntity.ok(groupService.getStudentsInGroup(groupId));
    }

    @DeleteMapping("/{groupId}/students/{studentId}")
    public ResponseEntity<Void> removeStudentFromGroup(@PathVariable Long groupId, @PathVariable Long studentId) {
        groupService.removeStudentFromGroup(groupId, studentId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/instructor/{instructorId}")
    public List<DrivingGroup> getGroupsByInstructor(@PathVariable Long instructorId) {
        return groupService.getGroupsByInstructor(instructorId);
    }


    @GetMapping("/{groupId}/students/count")
    public int countStudents(@PathVariable Long groupId) {
        return groupService.countStudentsInGroup(groupId);
    }

}