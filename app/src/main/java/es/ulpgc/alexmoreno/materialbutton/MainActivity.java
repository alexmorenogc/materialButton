package es.ulpgc.alexmoreno.materialbutton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private MaterialButton cancelButton;
    private MaterialButton nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cancelButton = findViewById(R.id.cancel_button);
        nextButton = findViewById(R.id.next_button);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disableNextButton();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disableCancelButton();
            }
        });
    }

    private void disableCancelButton() {
        cancelButton.setEnabled(false);
    }

    private void disableNextButton() {
        nextButton.setEnabled(false);
    }
}
