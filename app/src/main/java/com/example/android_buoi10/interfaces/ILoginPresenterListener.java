package com.example.android_buoi10.interfaces;

import com.example.android_buoi10.model.object.UserModel;

public interface ILoginPresenterListener {
    void onLoginSuccess(UserModel userModel);
    void onLoginFailed(String message);
}
