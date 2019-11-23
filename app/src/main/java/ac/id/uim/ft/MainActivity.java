package ac.id.uim.ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPindahActivity, btnPindahDenganData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPindahActivity = findViewById(R.id.btn_pindah_activity);
        btnPindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent moveActivity = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveActivity);
            }
        });

        btnPindahDenganData = findViewById(R.id.btn_pindah_dengan_data);
        btnPindahDenganData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent moveData = new Intent(MainActivity.this, MoveWithDataActivity.class);
                moveData.putExtra("data", "Fakultas Teknik UIM");
                startActivity(moveData);
            }
        });
    }
}
