package ua.registration.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.registration.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
