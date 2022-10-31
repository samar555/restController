package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.emailRepo;
import com.example.demo.modals.Email;

@Service
public class EmailService {
    @Autowired
    private emailRepo EmailRepo;

    public void createEmail(Email email){
        this.EmailRepo.save(email);

    }
    public List<Email> getAllEmail(){
        List<Email> list=(List)this.EmailRepo.findAll();
        return list;
    }
    
}
