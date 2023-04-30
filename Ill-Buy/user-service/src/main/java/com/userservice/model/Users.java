package com.userservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Data
//@Document(collection = "users")
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Users {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID uuid;
//    @Id
    @GeneratedValue(generator="increment")
//    @GenericGenerator(name="increment", strategy = "increment")
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private String role;

}
