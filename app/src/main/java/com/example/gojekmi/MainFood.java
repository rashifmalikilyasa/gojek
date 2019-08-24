package com.example.gojekmi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainFood extends AppCompatActivity implements View.OnClickListener {

    public EditText edit_nama;
    public EditText edit_alamat;
    public EditText edit_pesanan;
    public Button pesan;
    public String nama = null;
    public String alamat = null;
    public String pesanan = null;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        edit_nama = (EditText)findViewById(R.id.edit_nama);
        edit_alamat = (EditText)findViewById(R.id.edit_alamat);
        edit_pesanan = (EditText)findViewById(R.id.edit_pesanan);
        pesan = (Button)findViewById(R.id.pesan);
        pesan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()) {
            case R.id.pesan:
                Pesanan makanan = new Pesanan();
                makanan.setNama(nama = edit_nama.getText().toString());
                makanan.setAlamat(alamat = edit_alamat.getText().toString());
                makanan.setMakanan(pesanan = edit_pesanan.getText().toString());
                Intent pesan = new Intent(MainFood.this, MainOrder.class);
                pesan.putExtra(MainOrder.EXTRA_PESANAN, makanan);
                startActivity(pesan);
                break;
            default:
                break;
        }
    }

}
