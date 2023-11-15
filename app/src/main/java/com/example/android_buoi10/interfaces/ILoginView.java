package com.example.android_buoi10.interfaces;

import com.example.android_buoi10.model.object.UserModel;

public interface ILoginView {

    void onLoginSuccess(UserModel userModel);
    void onLoginFailed(String message);
}
