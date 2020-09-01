package com.example.da_ngon_ngu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // ánh xạ
    EditText mEdtAccount, mEdtPass;
    Button mBtnLogin;
    TextView mTvInfor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mEdtAccount =findViewById(R.id.etTaiKhoan);
        mEdtPass = findViewById(R.id.etMatKhau);
        mBtnLogin = findViewById(R.id.btnDangNhap);
        mTvInfor =findViewById(R.id.textViewinfor);

        //bắt sự kiện
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // lấy thông tin bên trong
                String textAccount = mEdtAccount.getText().toString();
                String textPass = mEdtPass.getText().toString();

                // gán vào  info
                String titleAccount = getResources().getString(R.string.text_account);
                String titlePass = getResources().getString(R.string.text_password);

                mTvInfor.setText(String.format("%s : %s\n%s : %s",titleAccount,textAccount,titlePass,textPass));
                //gắn pass vs user vào text info


            }
        });
    }
}