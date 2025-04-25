package iot.button.faisal5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup questionRadioGroup;
    private RadioButton radioButtonMaharashtra, radioButtonKerala, radioButtonTamilNadu, radioButtonLakshadweep;
    private CheckBox checkBoxMale, checkBoxFemale;
    private Button submitButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionRadioGroup = findViewById(R.id.questionRadioGroup);
        radioButtonMaharashtra = findViewById(R.id.radioButton);
        radioButtonKerala = findViewById(R.id.radioButton2);
        radioButtonTamilNadu = findViewById(R.id.radioButton3);
        radioButtonLakshadweep = findViewById(R.id.radioButton4);
        checkBoxMale = findViewById(R.id.checkBox);
        checkBoxFemale = findViewById(R.id.checkBox2);
        submitButton = findViewById(R.id.button);
        resultTextView = findViewById(R.id.textView4);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswerAndDisplayResult();
            }
        });
    }

    private void checkAnswerAndDisplayResult() {
        int selectedRadioButtonId = questionRadioGroup.getCheckedRadioButtonId();
        RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);

        if (selectedRadioButton == null) {
            Toast.makeText(this, "Please select an answer", Toast.LENGTH_SHORT).show();
            return;
        }

        String selectedAnswer = selectedRadioButton.getText().toString();
        String correctAnswer = "Kerala";

        String gender = "";
        if (checkBoxMale.isChecked()) {
            gender += "Male ";
        }
        if (checkBoxFemale.isChecked()) {
            gender += "Female";
        }

        if (selectedAnswer.equals(correctAnswer)) {
            Toast.makeText(this, "Correct Answer!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Wrong Answer!\nCorrect Answer is Kerala.", Toast.LENGTH_LONG).show();
        }

        resultTextView.setText("Gender: " + gender);
    }
}