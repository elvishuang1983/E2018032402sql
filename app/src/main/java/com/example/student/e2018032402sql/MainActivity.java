package com.example.student.e2018032402sql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void copyDb()
    {
        //raw裡面的檔案Android不會去解析所以直接提取
        File fout = new File(getFilesDir(),"student.sqlite");
        InputStream is = getResources().openRawResource(R.raw.student);
        try {
            //得到檔案後再把輸出到Android裡面
            FileOutputStream fos = new FileOutputStream(fout);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
