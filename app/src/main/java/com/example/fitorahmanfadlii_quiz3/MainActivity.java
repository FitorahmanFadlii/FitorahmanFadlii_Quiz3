package com.example.fitorahmanfadlii_quiz3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Nama, Kode, Jumlah;
    private RadioGroup Radio;
    Button ProsesTotal;

    RadioButton RadioGold, RadioSilver, RadioReguler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nama = findViewById(R.id.Nama);
        Kode = findViewById(R.id.Kode);
        Jumlah = findViewById(R.id.Jumlah);
        Radio = findViewById(R.id.Radio);
        RadioGold = findViewById(R.id.RadioGold);
        RadioSilver = findViewById(R.id.RadioSilver);
        RadioReguler = findViewById(R.id.RadioReguler);
        ProsesTotal = findViewById(R.id.ProsesTotal);
        ProsesTotal.setOnClickListener(v -> Prosestotal());


    }

    private void Prosestotal() {
        int Gold = 2131231080;
        int Silver = 2131231081;
        int Reguler = 2131231079;

        String NamaBarang = Kode.getText().toString();
        double Hargabarang = 0;
        String Namabarang = "";
        String nama = Nama.getText().toString();

        int Member = Radio.getCheckedRadioButtonId();
        if (Member == Gold){
            System.out.println("Gold");
        } else if (Member == Silver){
            System.out.println("Silver");
        } else if (Member == Reguler){
            System.out.println("Reguler");
        }

        if (NamaBarang.isEmpty()){
            Toast.makeText(this, "Masukkan Nama", Toast.LENGTH_SHORT).show();
        } else if (Member != 0) {
            Toast.makeText(this, "Kode barang tidak valid", Toast.LENGTH_SHORT).show();
        }
        System.out.println(Nama);



        int JumlahBarang = Integer.parseInt(Jumlah.getText().toString());

        String NamaPelanggan = Nama.getText().toString();
        String KodeBa = Kode.getText().toString();
        int HargaBarang = 0;

        switch (KodeBa.toLowerCase()) {
            case "ipx":
                HargaBarang = 5725300;
                break;
            case "mp3":
                HargaBarang = 28999999;
                break;
            case "pco":
                HargaBarang = 2730551;
                break;

        }

        int TotalTransaksi = HargaBarang * JumlahBarang;

        double diskon = 0;
        int selectedId = Radio.getCheckedRadioButtonId();
        if (selectedId!=-1){
            RadioButton selectedRadioButton = findViewById(selectedId);
            String Membership = selectedRadioButton.getText().toString();

            switch (Membership.toLowerCase()){
                case "Gold":
                    diskon = TotalTransaksi * 0.1;
                    break;
                case "Silver":
                    diskon = TotalTransaksi * 0.05;
                    break;
                case "Reguler":
                    diskon = TotalTransaksi * 0.02;
                    break;
            }

        }

        if (TotalTransaksi > 10000000){
            diskon += 100000;
        }
        Intent jualbeli = new Intent(this, MainActivity2.class);




    }
}