package com.example.signupscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

//import android.graphics.drawable.Drawable;
import android.os.Bundle;
/*import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;*/

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.rv);
        ArrayList<data>user=new ArrayList<>();
        user.add(new data("meald","ezyak"));
        user.add(new data("atef","a7a"));
        user.add(new data("el7ol","wallla"));
        user.add(new data("meald","ezyak"));
        chat_adapter chat_adapter=new chat_adapter(user,MainActivity.this);

        recyclerView.setAdapter(chat_adapter);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

        final  EditText name=findViewById(R.id.name);
        final  EditText email=findViewById(R.id.email);
        final   EditText milatry=findViewById(R.id.milatry);
        final EditText password=findViewById(R.id.password);
        final   ImageView male=findViewById(R.id.male);
        final   ImageView female=findViewById(R.id.male);
        final   Button signup=findViewById(R.id.signup);
         female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                female.setBackground(Drawable.createFromPath("drawable/active_image_shape.xml"));
                male.setBackground(Drawable.createFromPath("drawable/un_active_image_shape.xml"));
                milatry.setVisibility(View.GONE);



            }
        });
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                male.setBackground(Drawable.createFromPath("drawable/active_image_shape.xml"));
                female.setBackground(Drawable.createFromPath("drawable/un_active_image_shape.xml"));



            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<2;i++){
                    if((i == 0) && (name.getText().toString() == "")){
                        Toast.makeText(MainActivity.this, "please enter your name", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    if(i==1&&email.getText().toString()==""){
                        Toast.makeText(MainActivity.this, "please enter your email", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    if(i==2&&password.getText().toString()==""){
                        Toast.makeText(MainActivity.this, "please enter your password0", Toast.LENGTH_SHORT).show();
                        break;
                    }

                }


            }
        });
    }
}
