package com.afarapartners.credicardviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.cooltechworks.creditcarddesign.CardEditActivity;
import com.cooltechworks.creditcarddesign.CreditCardView;

public class MainActivity extends AppCompatActivity {


 private final int CREATE_NEW_CARD = 0;


    private EditText cardno;
    private EditText cardexpiry;
    private EditText cardcvv,cardHolder;
    private Button save;
    private LinearLayout cardContainer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       initialize();
        listeners();
    }



    private void initialize(){

        save = findViewById(R.id.save_details);
        cardContainer =  findViewById(R.id.card_container);




        cardno = findViewById(R.id.cardNo);
        cardexpiry = findViewById(R.id.card_expiry);
        cardcvv = findViewById(R.id.card_cvv);
        cardHolder = findViewById(R.id.usercard_holder);


//        populate();
        assignValues();

    }



    private void populate() {

        CreditCardView usercard =  new CreditCardView(this);

        String name = "*****";
        String cvv ="168";
        String expiry = "02/22";
        String cardnumber = "5199110792719715";






        usercard.setCardHolderName(name);
        usercard.setCardNumber(cardnumber);
        usercard.setCVV(cvv);
        usercard.setCardExpiry(expiry);

        cardContainer.addView(usercard);
        int index = cardContainer.getChildCount() - 1;






    }


    private void listeners() {

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent intent = new Intent(MainActivity.this, CardEditActivity.class);
//                startActivityForResult(intent, CREATE_NEW_CARD);

               assignValues();




            }
        });

    }



    private void assignValues(){

        CreditCardView usercard =  new CreditCardView(this);

        String name = cardHolder.getText().toString();
        String cvv =  cardcvv.getText().toString();
        String expiry = cardexpiry.getText().toString();
        String cardnumber = cardno.getText().toString();








            usercard.setCardHolderName(name);
            usercard.setCardNumber(cardnumber);
            usercard.setCVV(cvv);
            usercard.setCardExpiry(expiry);



//                cardContainer.addView(usercard);
//                int index = cardContainer.getChildCount() - 1;










    }




}
