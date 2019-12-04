package com.example.Spring_postgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class ProcController {

    @Autowired
    private ProcServiceInterface Service;

    @GetMapping("/showAll")
    public String showAllproccessors(Model model) {

        var procs = (List<Proc>) Service.findAll();

        model.addAttribute("processors", procs);

        return "showAll";
    }
}