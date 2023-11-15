package com.example.android_buoi10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.android_buoi10.interfaces.ILoginView;
import com.example.android_buoi10.model.object.UserModel;
import com.example.android_buoi10.ui.LoginPresenter;

public class MainActivity extends AppCompatActivity implements ILoginView {

    private LoginPresenter loginPresenter;
    private EditText edtUserName, edtPassword;
    private Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initView();
    }

    private void initView() {
        edtUserName = findViewById(R.id.edtUserName);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin); 
    }

    private void initData() {
        loginPresenter = new LoginPresenter(this);

        loginPresenter.login("Thai", "1");

        loginPresenter.logout();
    }

    @Override
    public void onLoginSuccess(UserModel userModel) {
        Toast.makeText(this, "Hello" + userModel.getUserName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginFailed(String message) {
            Toast.makeText(this, "" + message, Toast.LENGTH_SHORT).show();
    }
}