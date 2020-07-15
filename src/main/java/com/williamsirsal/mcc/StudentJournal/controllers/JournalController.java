/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.williamsirsal.mcc.StudentJournal.controllers;

import com.williamsirsal.mcc.StudentJournal.entities.Journal;
import com.williamsirsal.mcc.StudentJournal.services.JournalService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author ASUS-PC
 */
@Controller
public class JournalController {
    
    @Autowired
    JournalService journalService;
    
    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("journal", new Journal());
        model.addAttribute("journals", journalService.getAll());
        return "index";
    }
    @PostMapping("/save")
    public String save(@Valid Journal journal) {
        journalService.save(journal);
        return "redirect:/";
    }
}
