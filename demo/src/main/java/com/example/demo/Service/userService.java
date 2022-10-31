package com.example.demo.Service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.userRepository;
import com.example.demo.modals.users;



@Service
public class userService {
    @Autowired
   private userRepository UserRepository;

   public List<users> getAllUsers(){
  List<users> list=(List)this.UserRepository.findAll();
  return list;
   }

   public users getuserById(int id){
    
        users user=this.UserRepository.findById(id);
        
           return user;
   }
   public void Adduser(users user){
    this.UserRepository.save(user);

   }
   


}
