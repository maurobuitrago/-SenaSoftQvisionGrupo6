package com.co.qvision.models;

public class credentials {

    private String id_user;
    private String password;

    public credentials(String id_user, String password) {

        this.id_user = id_user;
        this.password = password;
    }

    public String getId_User() {
        return id_user;
    }

    public void setId_User(String username) {
        this.id_user = id_user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}