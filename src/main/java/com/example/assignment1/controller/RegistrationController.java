package com.example.assignment1.controller;

import com.example.assignment1.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String showForm(Model model) {
        // Add empty student object to the model
        model.addAttribute("student", new Student());
        return "register";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("student") Student student, Model model) {
        // Add submitted student object to the model for confirmation page
        model.addAttribute("student", student);
        return "confirmation";
    }
}