/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.williamsirsal.mcc.StudentJournal.repositories;

import com.williamsirsal.mcc.StudentJournal.entities.Journal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ASUS-PC
 */
@Repository
public interface JournalRepository extends JpaRepository<Journal, Integer>{
    
}
