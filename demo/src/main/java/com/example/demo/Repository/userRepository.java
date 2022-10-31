package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modals.users;

@Repository
public interface userRepository extends CrudRepository<users,Integer> {
    public users findById(int id);
}
