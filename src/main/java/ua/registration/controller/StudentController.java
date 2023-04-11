package ua.registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ua.registration.dto.StudentDto;
import ua.registration.service.StudentService;

import javax.servlet.http.HttpServletRequest;

import static ua.registration.util.StudentDtoUtil.studentDtoConvert;

@Controller
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String init(HttpServletRequest req) {
        req.setAttribute("mode", "S_REGISTRATION");
        return "index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute StudentDto studentDto, HttpServletRequest req) {
        try {
            service.save(studentDtoConvert(studentDto));
            req.setAttribute("mode", "S_SUCCESS");
        } catch (Exception e) {
            req.setAttribute("mode", "S_ERROR");
        }
        return "index";
    }
}
