package com.example.mnb.happyshopping;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Intent intent_receive = getIntent(); // Check엑티비티로부터 putExtra된 정보들을 받음.
        final boolean SA_CB1 = intent_receive.getBooleanExtra("SA_CB1", false); // 넘어온 데이터 하나하나를 가져오는 것은 getDatatypeExtra(~~) 메소드 이용.
        final boolean SA_CB2 = intent_receive.getBooleanExtra("SA_CB2", false);
        final boolean SA_CB3 = intent_receive.getBooleanExtra("SA_CB3", false); // SearchActivity에서 최초로 넘어온 값임.
        final boolean CA_RB1 = intent_receive.getBooleanExtra("CA_RB1", false);
        final boolean CA_RB2 = intent_receive.getBooleanExtra("CA_RB2", false); // 라디오버튼 정보.

        TextView MA_TextView1 = (TextView)findViewById(R.id.MA_TextView1);
        TextView MA_TextView2 = (TextView)findViewById(R.id.MA_TextView2);
        TextView MA_TextView3 = (TextView)findViewById(R.id.MA_TextView3); // TV3을 임의로 행사상품을 모아둔 지점으로 정함.
        TextView MA_TextView4 = (TextView)findViewById(R.id.MA_TextView4);
        TextView MA_TextView5 = (TextView)findViewById(R.id.MA_TextView5);
        TextView MA_TextView6 = (TextView)findViewById(R.id.MA_TextView6); // Goods_A의 위치로 지정.
        TextView MA_TextView7 = (TextView)findViewById(R.id.MA_TextView7);
        TextView MA_TextView8 = (TextView)findViewById(R.id.MA_TextView8);
        TextView MA_TextView9 = (TextView)findViewById(R.id.MA_TextView9); // Goods_B의 위치로 지정.
        TextView MA_TextView10 = (TextView)findViewById(R.id.MA_TextView10); // Goods_C의 위치로 지정.
        TextView MA_TextView11 = (TextView)findViewById(R.id.MA_TextView11);
        TextView MA_TextView12 = (TextView)findViewById(R.id.MA_TextView12);
        TextView MA_TextView13 = (TextView)findViewById(R.id.MA_TextView13);
        TextView MA_TextView14 = (TextView)findViewById(R.id.MA_TextView14);
        TextView MA_TextView15 = (TextView)findViewById(R.id.MA_TextView15);
        TextView MA_TextView16 = (TextView)findViewById(R.id.MA_TextView16); // 사용자의 출발지점으로 임의로 지정.

        //거쳐가야 하는 상품들이 위치한 지점이 어디어디인지 체크.
        if(CA_RB1) // 라디오버튼1은 행사상품을 포함한 경로 안내이다.
            MA_TextView3.setBackgroundColor(Color.rgb(00, 00, 255)); // 텍스트뷰 배경색 세팅하는 메소드.
        if(SA_CB1)
            MA_TextView6.setBackgroundColor(Color.rgb(00, 00, 255));
        if(SA_CB2)
            MA_TextView9.setBackgroundColor(Color.rgb(00, 00, 255));
        if(SA_CB3)
            MA_TextView10.setBackgroundColor(Color.rgb(00, 00, 255));
        //거쳐야 할 점들 체크 완료.



    }
}
