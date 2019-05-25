package com.example.dsctask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void thankToast(View view)
    {
        LayoutInflater inflater=getLayoutInflater();
        View layout=inflater.inflate(R.layout.toast_layout,(ViewGroup)findViewById(R.id.toast_root));
        Toast toast=new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    public void nextLayout(View view)
    {
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }

}
