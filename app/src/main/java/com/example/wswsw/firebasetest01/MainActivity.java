package com.example.wswsw.firebasetest01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference questionRef = database.getReference("question");
    private DatabaseReference questionRef2 = database.getReference("multiple questions");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        questionRef.setValue("Hello World");
    }

    public void setQuestion(View view){
        questionRef.setValue(new Question("Austrilia","The highest waterfall in Australia is in Queensland state.",125,true));
    }

    public void addQuestion(View view){
        questionRef2.push().setValue(new Question("asia","Asia is the largest continent.",125,true));
    }
}
