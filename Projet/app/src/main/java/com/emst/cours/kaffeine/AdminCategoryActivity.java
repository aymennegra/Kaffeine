package com.emst.cours.kaffeine;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView ff;
    private TextView pizza, salade, crepe, sandwish;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);


        sandwish = (TextView) findViewById(R.id.sandwish_but);
        pizza = (TextView) findViewById(R.id.pizza_but);
        crepe = (TextView) findViewById(R.id.crepe_but);
        salade = (TextView) findViewById(R.id.salade_but);
        ff = (ImageView) findViewById(R.id.ff);

        ff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminHomeActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });


        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AddNewProductActivity.class);
                intent.putExtra("category", "Pizza");
                startActivity(intent);
            }
        });


        crepe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AddNewProductActivity.class);
                intent.putExtra("category", "Crepe");
                startActivity(intent);
            }
        });


        sandwish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AddNewProductActivity.class);
                intent.putExtra("category", "Sandwish");
                startActivity(intent);
            }
        });


        salade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AddNewProductActivity.class);
                intent.putExtra("category", "Salade");
                startActivity(intent);
            }
        });
    }
}