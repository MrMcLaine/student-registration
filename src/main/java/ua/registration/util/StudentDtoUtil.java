package ua.registration.util;

import ua.registration.domain.Student;
import ua.registration.dto.StudentDto;

public class StudentDtoUtil {
    public static Student studentDtoConvert(StudentDto studentDto) {
        StudentDto forReturn = isLegalPassword(studentDto);
        return new Student(forReturn.getFirstName(), forReturn.getLastName(),
                forReturn.getAge(), forReturn.getEmail(), forReturn.getPassword());
    }

    private static StudentDto isLegalPassword(StudentDto studentDto) {
        if (studentDto.getPassword().equals(studentDto.getCPassword())) {
            return studentDto;
        } else {
            throw new IllegalArgumentException("Passwords have difference");
        }
    }
}
