package net.weg.pedagogic.service;

import lombok.AllArgsConstructor;
import net.weg.pedagogic.model.Student;
import net.weg.pedagogic.repository.StudentRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    public StudentRepository repository;

    public Student createStudent (Student student) {
        return repository.save(student);
    }

    public Student getStudent (Integer id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Erro ao Buscar Estudante!"));
    }

    public Page<Student> getAll (Pageable pageable) {
        return repository.findAll(pageable);
    }


}
