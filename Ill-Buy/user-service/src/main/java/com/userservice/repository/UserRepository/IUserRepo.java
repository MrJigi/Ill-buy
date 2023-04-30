package com.userservice.repository.UserRepository;

import com.userservice.model.*;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@ComponentScan
@Repository
public interface IUserRepo extends JpaRepository<Users, UUID> {

//    Users getById(UUID id);

//    User findByUsername(String username);
//    List<User> findByUsername(String username);
}
