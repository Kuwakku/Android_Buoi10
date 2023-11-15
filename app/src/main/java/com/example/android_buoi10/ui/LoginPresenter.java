package com.example.android_buoi10.ui;

import com.example.android_buoi10.interfaces.ILoginPresenterListener;
import com.example.android_buoi10.interfaces.ILoginView;
import com.example.android_buoi10.model.user.Database;
import com.example.android_buoi10.model.object.UserModel;

public class LoginPresenter implements ILoginPresenterListener {

    private ILoginView iLoginView;
    private Database database;

    public LoginPresenter(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
        database = new Database(this);
    }

    public void login(String userName, String password) {
        database.Login(userName, password);
    }

    public void logout() {

    }

    @Override
    public void onLoginSuccess(UserModel userModel) {
        iLoginView.onLoginSuccess(userModel);
    }

    @Override
    public void onLoginFailed(String message) {
        iLoginView.onLoginFailed(message);
    }
}
