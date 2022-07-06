package com.manuni.postrequestwithretrofit;

public class MainResponseObjectData {
    private String email;
    private String gender;
    private String id;
    private LastLoginObjectData last_login;

    public MainResponseObjectData() {
    }

    public MainResponseObjectData(String email, String gender, String id, LastLoginObjectData last_login) {
        this.email = email;
        this.gender = gender;
        this.id = id;
        this.last_login = last_login;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LastLoginObjectData getLast_login() {
        return last_login;
    }

    public void setLast_login(LastLoginObjectData last_login) {
        this.last_login = last_login;
    }
}
