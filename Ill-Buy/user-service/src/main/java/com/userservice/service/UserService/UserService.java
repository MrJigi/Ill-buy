package com.userservice.service.UserService;

import com.userservice.dto.User.UserRequest;
import com.userservice.model.Users;
import com.userservice.repository.UserRepository.IUserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@Service
//@RequiredArgsConstructor
@Slf4j
public class UserService {


    private final IUserRepo IUserRepository;


    @Autowired
    public UserService(IUserRepo IUserRepository) {
        this.IUserRepository = IUserRepository;
    }


    public List<Users> getAllUsers() {
        return IUserRepository.findAll();
    }

    public Users addTestUsers() {
        Users users = new Users(
                UUID.randomUUID(),
                1,
                "Usagi",
                "Minako",
                "usagi@gmail.com",
                "Usagi",
                "password",
                "Admin");
        return IUserRepository.save(users);
    }

    public Users getUserById(UUID id) {
        return IUserRepository.findById(id).orElse(null);
    }

    public Users addUser(Users user) {
        return IUserRepository.save(user);
    }

    public void createUser(UserRequest user){
        Users newUser = Users.builder()
//                .uuid(UUID.randomUUID())
                .id(user.getId())
                .username(user.getUsername())
                .password(user.getPassword())
                .email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .role("USER")
                .build();

        IUserRepository.save(newUser);
        log.info("User"+ user.getUsername() + "has been saved");
    }
    public void createAdmin(UserRequest user){
        Users newUser = Users.builder()
                .uuid(UUID.randomUUID())
                .username(user.getUsername())
                .password(user.getPassword())
                .email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .role("ADMIN")
                .build();

        IUserRepository.save(newUser);
        log.info("Admin"+ user.getUsername() + "has been saved");
    }
    public void deleteUserById(UUID id) {
        IUserRepository.deleteById(id);
        log.info("User"+ id + "has been saved");
    }

    public Users updateUser(UUID id, Users user) {
        Users existingUser = IUserRepository.findById(id).orElse(null);
        if (existingUser != null) {
            IUserRepository.save(user);
        }
        return existingUser;
    }
}
