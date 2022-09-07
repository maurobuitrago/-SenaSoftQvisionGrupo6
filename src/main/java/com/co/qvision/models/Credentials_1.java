package com.co.qvision.models;

public class Credentials {

    private String id_user;
    private String email;
    private String password;

    public Credentials(String id_user, String email, String password) {

        this.id_user = id_user;
        this.email = email;
        this.password = password;
    }

    public String getId_User() {
        return id_user;
    }

    public void setId_User(String username) {
        this.id_user = id_user;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
