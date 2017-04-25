package com.cristian_sedano.cristiansedanocv;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cristian extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cristian);
        Button experience = (Button) findViewById(R.id.experience);
        experience.setOnClickListener(this);
        Button skills = (Button) findViewById(R.id.skills);
        skills.setOnClickListener(this);
        Button education = (Button) findViewById(R.id.education);
        education.setOnClickListener(this);
        Button linkedin = (Button) findViewById(R.id.linkedin);
        linkedin.setOnClickListener(this);
        Button facebook = (Button) findViewById(R.id.facebook);
        facebook.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.experience:
                Intent intent = new Intent(this,Experience.class);
                startActivity(intent);
                break;
            case R.id.skills:
                Intent intent1 = new Intent(this,Skills.class);
                startActivity(intent1);
                break;
            case R.id.education:
                Intent intent2 = new Intent(this,Education.class);
                startActivity(intent2);
                break;
            case R.id.linkedin:
                Uri uri = Uri.parse("https://www.linkedin.com/in/cristian-sedano-9b5a47141/");
                Intent intent3 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent3);
                break;
            case R.id.facebook:
                Uri uri1 = Uri.parse("https://www.facebook.com/cristian.sedano.90");
                Intent intent4 = new Intent(Intent.ACTION_VIEW, uri1);
                startActivity(intent4);
            default:
                break;
        }
    }
}
