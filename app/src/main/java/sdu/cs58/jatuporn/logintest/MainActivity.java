package sdu.cs58.jatuporn.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //1 ปรพการตัวแปร บนjava
    TextView nameTextView;
    String getnameString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2IniTIAL viev ผูกตัวแปรบนjava
        nameTextView = findViewById(R.id.txvname);

        // รับค่า nameString จากหน้า Login
        getnameString = getIntent().getStringExtra("nameString") ;
        nameTextView.setText(" ยินดีตอนรับ " + getnameString + " ได้เข้าสู่ระบบ ");


    } //end onCreate
} //end class
