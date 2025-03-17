package com.example.aboutme;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialCardView aboutMeCard = findViewById(R.id.cardAboutMe);
        MaterialCardView projectsCard = findViewById(R.id.cardProjects);
        MaterialCardView contactCard = findViewById(R.id.cardContact);

        aboutMeCard.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, AboutMeActivity.class)));
        projectsCard.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, ProjectsActivity.class)));
        contactCard.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, ContactActivity.class)));
    }
}