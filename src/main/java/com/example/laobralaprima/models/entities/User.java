package com.example.laobralaprima.models.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class User {
    //User info
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String nickName;
    private String password;

    //Contructor
    public User(String id, String firstName, String lastName, String email, String address, String nickName, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.nickName = nickName;
        this.password = password;
    }

    //Getter's and Setter's
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNickName() {
        return nickName;
    }

    public void setUserName(String userName) {
        this.nickName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
