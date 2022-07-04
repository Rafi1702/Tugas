package com.kelompok3.quizAPP;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by Azhar Rivaldi on 19/08/2018.
 */

public class HasilKuis extends Activity{
    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil_kuis);
        button2 = (Button)findViewById(R.id.btn2);
        setSkor();
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HasilKuis.this, MainActivity.class));
            }
        });
    }
    public void setSkor(){
        button1 = (Button)findViewById(R.id.btn1);
        TextView hasil = (TextView)findViewById(R.id.hasil);
        TextView nilai = (TextView)findViewById(R.id.nilai);
        //hasil lemparan (putExtra) dari activity sebelumnya ditampung dalam variabel lokal
        String activity = getIntent().getStringExtra("activity");
        if(activity.equals("quiz1")){
            hasil.setText("Jawaban Benar :"+quiz1.benar+"\nJawaban Salah :"+quiz1.salah);
            nilai.setText(""+quiz1.hasil);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(HasilKuis.this, quiz1.class));
                }
            });
        }else{
            hasil.setText("Jawaban Benar :"+quiz2.benar+"\nJawaban Salah :"+quiz2.salah);
            nilai.setText(""+quiz2.hasil);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(HasilKuis.this, quiz2.class));
                }
            });

        }

    }


}
