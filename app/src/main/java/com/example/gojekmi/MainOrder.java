package com.example.gojekmi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainOrder extends AppCompatActivity implements View.OnClickListener{

    public static String EXTRA_PESANAN = "extra_pesanan";
    public TextView view_nama;
    public TextView view_alamat;
    public TextView view_pesanan;
    public Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        view_nama = (TextView)findViewById(R.id.nama2);
        view_alamat = (TextView)findViewById(R.id.alamat2);
        view_pesanan = (TextView)findViewById(R.id.pesanan2);
        Pesanan makanan = getIntent().getParcelableExtra(EXTRA_PESANAN);
        String nama = makanan.getNama();
        String alamat = makanan.getAlamat();
        String pesanan = makanan.getMakanan();
        view_nama.setText(nama);
        view_alamat.setText(alamat);
        view_pesanan.setText(pesanan);
        cancel = (Button)findViewById(R.id.cancel);
        cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.cancel:
                Intent cancel = new Intent(MainOrder.this, MainMenu.class);
                startActivity(cancel);
        }
    }
}
