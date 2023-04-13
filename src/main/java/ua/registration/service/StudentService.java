package ua.registration.service;

import ua.registration.domain.Student;

public interface StudentService {
    Student save(Student student);
    Student getById(int id);
}
