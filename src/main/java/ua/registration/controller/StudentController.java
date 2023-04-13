package ua.registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import ua.registration.domain.FileMultipart;
import ua.registration.domain.Student;
import ua.registration.dto.StudentDto;
import ua.registration.service.FileMultipartService;
import ua.registration.service.StudentService;

import javax.servlet.http.HttpServletRequest;

import static ua.registration.util.StudentDtoUtil.studentDtoConvert;

@Controller
public class StudentController {
    private final StudentService studentService;
    private final FileMultipartService multipartService;

    public StudentController(StudentService studentService, FileMultipartService multipartService) {
        this.studentService = studentService;
        this.multipartService = multipartService;
    }

    @GetMapping("/")
    public String init(HttpServletRequest req) {
        req.setAttribute("mode", "S_REGISTRATION");
        return "index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute StudentDto studentDto,
                       @RequestParam("file") MultipartFile file, HttpServletRequest req) {
        try {
            // Save the file to the database
            Student student = studentDtoConvert(studentDto);
            FileMultipart fileMultipart = multipartService.storeFile(file);
            student.setFile(fileMultipart);
            studentService.save(student);
            req.setAttribute("mode", "S_SUCCESS");
        } catch (Exception e) {
            req.setAttribute("mode", "S_ERROR");
        }
        return "index";
    }
}
