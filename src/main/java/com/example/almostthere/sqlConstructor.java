package com.example.almostthere;

public class sqlConstructor {
    private int ID;
    private String name;
    private String email;
    private String password;
    private String encryptedPassword;

    public sqlConstructor(String name, String email, String password, String encryptedPassword) {
        /*this.ID = ID;*/
        this.name = name;
        this.email = email;
        this.password = password;
        this.encryptedPassword = encryptedPassword;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }
}
