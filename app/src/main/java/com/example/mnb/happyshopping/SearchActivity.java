package com.example.mnb.happyshopping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        //'Route Guide' 클릭 시 수행할 작업들.
        Button SA_Button1 = (Button)findViewById(R.id.SA_Button1);
        SA_Button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //int MA_CB2=0; // MA(MainActivity),C(클릭),B2(버튼2) 의미. 지금 상황은 MA에서 B1을 눌러서 온 경로이므로 MA_CB2=0으로 해서 넘김.
                CheckBox SA_CheckBox1 = (CheckBox)findViewById(R.id.SA_CheckBox1);
                CheckBox SA_CheckBox2 = (CheckBox)findViewById(R.id.SA_CheckBox2);
                CheckBox SA_CheckBox3 = (CheckBox)findViewById(R.id.SA_CheckBox3);

                boolean SA_CB1 = SA_CheckBox1.isChecked();
                boolean SA_CB2 = SA_CheckBox2.isChecked();
                boolean SA_CB3 = SA_CheckBox3.isChecked();

                Intent intent = new Intent(SearchActivity.this, CheckActivity.class);
                intent.putExtra("SA_CB1", SA_CB1); // SearchActivity의 CheckBox1 의미.
                intent.putExtra("SA_CB2", SA_CB2);
                intent.putExtra("SA_CB3", SA_CB3);
                //intent.putExtra("MA_CB2", MA_CB2); // 이자식은 메인엑티비티에서 바로 Check엑티비티로 넘어갔는지 확인하기 위한 변수를 담은 것임.
                startActivity(intent);
            }

        }); // 'Route Guide 작업 수행 완료.

    }
}
