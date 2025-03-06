package net.weg.pedagogic.repository;

import net.weg.pedagogic.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
