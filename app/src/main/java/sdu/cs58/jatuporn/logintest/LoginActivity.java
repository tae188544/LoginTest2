package sdu.cs58.jatuporn.logintest;

import android.app.PictureInPictureParams;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    EditText nameEditText,usernameEditText, passwordEditText;
    Button loginButton;
    String nameString,userString,passwordString;

    @Override
    public boolean enterPictureInPictureMode(@NonNull PictureInPictureParams params) {
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //initial view ผูกตัวแปร java ให้รู้จักกับ element บน xml
        nameEditText = findViewById(R.id.txtName);
        usernameEditText = findViewById(R.id.txtUsername);
        passwordEditText = findViewById(R.id.txtPassword);
        loginButton = findViewById(R.id.btnLogin);
        //สั่งให้ปุ่ม user กับปุ่ม Login

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameString = nameEditText.getText().toString().trim();
                userString = usernameEditText.getText().toString().trim();
                passwordString = passwordEditText.getText().toString().trim();
                if ((nameString.length()==0)||(passwordString.length()==0)) {
                    Toast.makeText(getApplicationContext(),"กรุณาใส่ข้อมูลให้ครบทุกช่อง",Toast.LENGTH_LONG).show();
                }
                //ตวรจสอบการ Login

                if ((userString.equals("admin")) && (passwordString.equals("1234"))) {
                    Toast.makeText(getApplicationContext(), "login,success", Toast.LENGTH_LONG).show();

                    //ส่งข้อมูล  nameString ไปหน้า mainactivity
                    Intent mainIntent = new Intent(LoginActivity.this, MainActivity.class);
                    mainIntent.putExtra("nameString",nameString);
                    startActivity(mainIntent);
                } else {
                    Toast.makeText(getApplicationContext(), "login,fail", Toast.LENGTH_LONG).show();
                }

                Toast.makeText(getApplicationContext(), "Hello " +  nameString,Toast.LENGTH_SHORT).show();

            }
        });//end OnClickListener
    }//method onCreate

}//end class

