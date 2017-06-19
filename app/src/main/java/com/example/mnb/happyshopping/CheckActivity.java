package com.example.mnb.happyshopping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class CheckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);


        // 이전 엑티비티에서 보낸 intent를 받는 부분.
        Intent intent_receive = getIntent(); // getIntent() 메소드를 호출하면, 이전의 엑티비티에서 putExtra시킨 데이터들이 전부 넘어온것임.
        final boolean SA_CB1 = intent_receive.getBooleanExtra("SA_CB1", false); // 넘어온 데이터 하나하나를 가져오는 것은 getDatatypeExtra(~~) 메소드 이용.
        final boolean SA_CB2 = intent_receive.getBooleanExtra("SA_CB2", false); // 밑에서 putExtra시키니까 자동으로 final 붙음.
        final boolean SA_CB3 = intent_receive.getBooleanExtra("SA_CB3", false);


        //'Route Guide' 클릭 시 수행할 작업들.
        Button CA_Button1 = (Button)findViewById(R.id.CA_Button1);
        CA_Button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(CheckActivity.this, MapActivity.class);
                intent.putExtra("SA_CB1", SA_CB1);
                intent.putExtra("SA_CB2", SA_CB2); // SearchActivity로부터 가져온 값들임.
                intent.putExtra("SA_CB3", SA_CB3); // 최종적으로는 전부 MapActivity로 넘겨야할 값이었음.

                RadioButton CA_RadioButton1 = (RadioButton)findViewById(R.id.CA_RadioButton1);
                RadioButton CA_RadioButton2 = (RadioButton)findViewById(R.id.CA_RadioButton2);
                boolean CA_RB1 = CA_RadioButton1.isChecked();
                boolean CA_RB2 = CA_RadioButton2.isChecked();
                intent.putExtra("CA_RB1", CA_RB1);
                intent.putExtra("CA_RB2", CA_RB2); // 라디오버튼 정보 intent시킴.

                startActivity(intent);

            }

        }); // 'Route Guide 작업 수행 완료.

    }
}
