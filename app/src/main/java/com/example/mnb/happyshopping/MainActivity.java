package com.example.mnb.happyshopping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // MA_Button1은 메인화면의 'SEARCH' 버튼을 의미. SEARCH 버튼을 클릭했을때 다음화면으로 넘어가게 하는부분.
        // 참고로 변수 MA_Button1에서 MA는 MainActivity를 의미. 즉
        Button MA_Button1 = (Button)findViewById(R.id.MA_Button1);
        MA_Button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v1){
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        }); // MA_Button1 클릭 시 수행되는 과정. 완료. 따로 넘어갈 변수는 없음.


        // MA_Button1은 메인화면의 'Route Guide' 버튼을 의미. 이 버튼을 클릭했을때 다음화면으로 넘어가게 하는부분.
        // 변수하나 만들어서 main에서 바로 RouteGuide로 넘어갈 때 Route1 선택 못하게 해야함.
        Button MA_Button2 = (Button)findViewById(R.id.MA_Button2);
        MA_Button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v2){
                //int MA_CB2=1; // MA(MainActivity),C(클릭),B2(버튼2) 의미. 즉 버튼2 눌렀을때 CheckActivity로 넘어가면서, 딱히 구매할 상품이 없다는것을 알려주기 위한 변수
                Intent intent2 = new Intent(MainActivity.this, CheckActivity.class);
                intent2.putExtra("SA_CB1", 0); // SearchActivity의 CheckBox1 의미.
                intent2.putExtra("SA_CB2", 0);
                intent2.putExtra("SA_CB3", 0);
                //intent2.putExtra("MA_CB2", MA_CB2);
                startActivity(intent2);
            }
        }); // MA_Button2 클릭 시 수행되는 과정. 완료.

    }
}
