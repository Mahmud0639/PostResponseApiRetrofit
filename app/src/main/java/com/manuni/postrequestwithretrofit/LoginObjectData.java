package com.manuni.postrequestwithretrofit;

public class LoginObjectData {
    private String id;
    private String email;
    private String gender;
    private LastLoginObjectData last_login;

    public LoginObjectData() {
    }

    public LoginObjectData(String id, String email, String gender, LastLoginObjectData last_login) {
        this.id = id;
        this.email = email;
        this.gender = gender;
        this.last_login = last_login;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LastLoginObjectData getLast_login() {
        return last_login;
    }

    public void setLast_login(LastLoginObjectData last_login) {
        this.last_login = last_login;
    }
}
