package com.example.hari.signupform;

import java.io.Serializable;

/**
 * Created by Nicky on 7/24/2015.
 */
public class User implements Serializable {

    private final String mUsername;
    private final String mPassword;


    public User(String userName, String passWord) {
        mUsername = userName;
        mPassword = passWord;


    }

    public String getUsername() {
        return mUsername;
    }

}

