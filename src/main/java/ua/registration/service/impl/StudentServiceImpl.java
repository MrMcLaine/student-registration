package ua.registration.service.impl;

import org.springframework.stereotype.Service;
import ua.registration.domain.Student;
import ua.registration.repository.StudentRepository;
import ua.registration.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student save(Student student) {
        return repository.save(student);
    }
}
