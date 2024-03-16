package com.example.fitorahmanfadlii_quiz3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.OutputStream;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle Extras = getIntent().getExtras();
        if (Extras != null) {
            String Nama = Extras.getString("NamPelanggan");
            String Kode = Extras.getString("KodeBarang");
            int Jumlah = Extras.getInt("JumlahBarang");
            int TotalTransaksaksi = Extras.getInt("TotalTransaksi");
            double diskon = Extras.getInt("Diskon");
            double TotalBayar = Extras.getInt("TotalBayar");

            TextView Output = findViewById(R.id.Outputs);
            String Struk = "Selamat Datang : "+ Nama + "!\n" +
                    "Tipe Member : " + Extras.getString("Membership")+ "\n\n" + "Transaksi Hari Ini :\n" +
                    "Transaksi Hari Ini:\n" +
                    "Kode Barang : " + Kode + "\n" +
                    "Nama Barang: -\n" +
                    "Harga : Rp "+Extras.getInt("HargaBarang") + "\n" +
                    "Total Harga :Rp " +TotalTransaksaksi + "\n" +
                    "Discount Harga : Rp" +diskon+ "\n" +
                    "Discount Member :-\n" +
                    "Jumlah Bayar: Rp" +TotalBayar;

            Output.setText(Struk);

        }
    }
}