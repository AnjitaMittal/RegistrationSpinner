package com.example.hp.registrationspinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.autoCompleteTextView)TextView DName;
    @BindView(R.id.Email)TextView DEmail;
    @BindView(R.id.Phone)TextView DPhone;
    @BindView(R.id.State)TextView DState;
    @BindView(R.id.country)TextView Dcountry;
    String bname;
    String bemail;
    String bphone;
    String bcountry;
    String bstate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        Bundle bundle=getIntent().getExtras();
        String bname = bundle.getString("name");
        String bemail = bundle.getString("email");
        String bphone = bundle.getString("Phone");
        String bcountry = bundle.getString("Country");
        String bstate = bundle.getString("State");
        DName.setText(bname);
        DEmail.setText(bemail);
        DPhone.setText(bphone);
        Dcountry.setText(bcountry);
        DState.setText(bstate);

    }
    @OnClick(R.id.edit)
    public void click(View v)
    {
        final int Requestcode=111;
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        intent.putExtra("State",bstate);
        intent.putExtra("Country",bcountry);
        intent.putExtra("name",bname);
        intent.putExtra("email",bemail);
        intent.putExtra("Phone",bphone);
        startActivityForResult(intent,Requestcode);
    }
}
