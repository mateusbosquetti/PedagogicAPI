package net.weg.pedagogic.controller;

import lombok.AllArgsConstructor;
import net.weg.pedagogic.model.Student;
import net.weg.pedagogic.service.StudentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student/api")
@AllArgsConstructor
public class StudentController {

    public StudentService service;

    @PostMapping
    public ResponseEntity<Student> postStudent(@RequestBody Student student) {
        return new ResponseEntity<>(service.createStudent(student), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Integer id) {
        return new ResponseEntity<>(service.getStudent(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Page<Student>> getStudent(Pageable pageable) {
        return new ResponseEntity<>(service.getAll(pageable), HttpStatus.OK);
    }


}
