package com.effugiumtechnologies.jchaf.idinformation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etID;
    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        etID = (EditText) findViewById(R.id.etID);
        tvMessage = (TextView) findViewById(R.id.tvMessage);
    }

    public void btnSubmit_OnClick(View view){
        String data = etID.getText().toString();
        String dob = data.substring(0, 6);
        int gender = Integer.parseInt(data.charAt(6) + "");

        String sGender;
        if(gender >= 5){
            sGender = "male";
        }else {
            sGender = "female";
        }

        int nationality = Integer.parseInt(data.charAt(10) + "");

        String sNationality;
        if(nationality == 0){
            sNationality =  "South African";
        } else {
            sNationality = "Permanent Resident";
        }

        tvMessage.setText("Your information from your ID number: \n" +
                            "Date of Birth: " + dob + "\n" +
                            "Gender: " + sGender + "\n" +
                             "Nationality: " + sNationality);
    }


}
