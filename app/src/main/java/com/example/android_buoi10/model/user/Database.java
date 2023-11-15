package com.example.android_buoi10.model.user;

import android.util.Log;

import com.example.android_buoi10.interfaces.ILoginPresenterListener;
import com.example.android_buoi10.model.object.UserModel;

import java.util.ArrayList;

public class Database {

    ILoginPresenterListener iLoginPresenterListener;

    public Database(ILoginPresenterListener iLoginPresenterListener) {
        this.iLoginPresenterListener = iLoginPresenterListener;
    }

    ArrayList<UserModel> userModels;

    public void Login(String userName, String password) {
        if(userName.equals("Thai") && password.equals("1")) {
            iLoginPresenterListener.onLoginSuccess(new UserModel(userName, password));
            Log.d("TAG", "Login done" + userName);
        } else {
            iLoginPresenterListener.onLoginFailed("Login failed!");
            Log.d("TAG", "Login failed ");
        }
    }


}
