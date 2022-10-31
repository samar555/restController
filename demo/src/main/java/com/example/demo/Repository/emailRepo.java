package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modals.Email;
@Repository
public interface emailRepo extends CrudRepository<Email,Integer> {
    public Email findById(int id);
    
}
