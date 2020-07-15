/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.williamsirsal.mcc.StudentJournal.services;

import com.williamsirsal.mcc.StudentJournal.entities.Journal;
import com.williamsirsal.mcc.StudentJournal.repositories.JournalRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS-PC
 */
@Service
public class JournalService {
    
    @Autowired
    JournalRepository journalRepository;
    
    public List<Journal> getAll() {
        return journalRepository.findAll();
    }
    
    public void save(Journal journal) {
        journalRepository.save(journal);
    }
    
    public void delete(Integer key) {
//        Integer key = Integer.parseInt(id);
        journalRepository.delete(new Journal(key));
    }
}
