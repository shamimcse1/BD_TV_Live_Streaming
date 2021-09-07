package codercamp.com.bd_tv_live_streaming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        String name= intent.getStringExtra("name");

        TextView textView = findViewById(R.id.textView);

        textView.setText(name);
    }
}