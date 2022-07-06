package com.manuni.postrequestwithretrofit;

public class MainObjectData {
    private String token;
    private LoginObjectData data;

    public MainObjectData() {
    }

    public MainObjectData(String token, LoginObjectData data) {
        this.token = token;
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LoginObjectData getData() {
        return data;
    }

    public void setData(LoginObjectData data) {
        this.data = data;
    }
}
