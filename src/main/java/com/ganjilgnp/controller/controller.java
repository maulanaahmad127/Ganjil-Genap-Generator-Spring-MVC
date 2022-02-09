package com.ganjilgnp.controller;

import com.ganjilgnp.model.NumberGenerator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {
    
    @GetMapping
    public String home(Model model){
        model.addAttribute("msg", "Ganjil Genap Generator");
        model.addAttribute("number", new NumberGenerator());
        return "index";
    }

    @PostMapping("/cetak")
    public String cetak(Model model, NumberGenerator number){
        model.addAttribute("msg", "Ganjil Genap Generator");
        model.addAttribute("number", number);
        model.addAttribute("cetaks", number.cetak());
        return "index";
    }

    @PostMapping("/reset")
    public String reset(Model model){
        model.addAttribute("msg", "Kalkulator Sederhana");
        model.addAttribute("number", new NumberGenerator());
        return "redirect:/";
    }
}
