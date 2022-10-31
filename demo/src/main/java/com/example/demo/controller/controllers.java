package com.example.demo.controller;


import java.util.List;
import java.util.Optional;

// import javax.servlet.http.HttpServletRequest;

// import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmailService;
import com.example.demo.Service.userService;
import com.example.demo.modals.Email;
import com.example.demo.modals.users;

// import aj.org.objectweb.asm.Handle;

@RestController
public class controllers {
    @Autowired
    private userService UserService;
    @Autowired
    private EmailService emailService;

    // testing home
    @RequestMapping("/")
    public String testController(){
        return "these is test";
   
    }

    // add user 
    @PostMapping("/user")
    public ResponseEntity createUser(@RequestBody users user){
    
      try{
        this.UserService.Adduser(user);
       return ResponseEntity.ok().build();
      }catch(Exception e){
        System.out.println(e);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
      }
       
        // System.out.println(user);
       
  
       
    }

    // fatch users
    @GetMapping("/users")
    public ResponseEntity<List<users>>allUsers(){

        List<users> list= this.UserService.getAllUsers();
        if(list.size()==0){
          return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));

    }

    // get user by id 
    @GetMapping("/user/{id}")
    public ResponseEntity<users> getUserById(@PathVariable("id") int id){

      users user=  this.UserService.getuserById(id);
      if(user==null){
       return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
      }
    //   System.out.println(user);
      return ResponseEntity.of(Optional.of(user));
    }
    // ********************************email controller********************************************** 


    // send email 
    @PostMapping("/email")
    public void addEmail(@RequestBody Email email){
       List<users> list= this.UserService.getAllUsers();
       users user1=null;
    //    finding user who is sending email 
       for(users user:list){
              if(user.getEmail_address().equals(email.getEmailFrom())){
                user1=user;
                break;
              }
       }
    //    increase count value by 1 
       user1.setCount(user1.getCount()+1);
       System.out.println(user1);
       this.UserService.Adduser(user1);
       System.out.println(user1);
       
        this.emailService.createEmail(email);
    }
    @GetMapping("/emails")
    public List<Email> getAllEmail(){
        return this.emailService.getAllEmail();
    }
    // simply finding values
    @GetMapping("emails/count")
    public int getNumberOfEmailSend( Integer  user){
        
       
       users user1= this.UserService.getuserById(user);
        if(user1==null){
            return 0;
        } // NullPointerException not Handled 
        return user1.getCount();
        
       
    }
}
