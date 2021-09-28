package com.example.perhitungansuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //mendeklarasikan id
    Spinner spinner;
    EditText etNilai;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //memanggil fungsi load dan isiSpinner untuk ditampilkan pada layar android
        load();
        isiSpinner();
    }
    //membuat fungsi load
    public void load() {
        spinner = findViewById(R.id.spinner);
        etNilai = findViewById(R.id.etNilai);
        tvHasil = findViewById(R.id.tvHasil);
    }
    // membuat array di spinner menggunakan methode adapter
    public void isiSpinner() {
        String[] isi = {"Celcius To Reamur", "Celcius To Kelvin", "Celcius To Farenheit",
                "Reamur To Celcius", "Reamur To Kelvin", "Reamur To Farenheit",
                "Farenheit To Celcius", "Farenheit To Reamur", "Farenheit To  Kelvin",
                "Kelvin To Celcius", "Kelvin To Reamur", "Kelvin To Farenheit"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, isi);
        spinner.setAdapter(adapter);
    }

    //menggunakan percabangan pada tombol konversi di aplikasi dengan memanggil array pada adapter
    public void btnKonversi(View view) {
        String pilihan = spinner.getSelectedItem().toString();

        if (etNilai.getText().toString().equals("")) {
            Toast.makeText(this, "Nilai Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else {
            if (spinner.getSelectedItem().toString().equals("Celcius To Reamur")) {
                CtoR();
            }

            if (spinner.getSelectedItem().toString().equals("Celcius To Kelvin")) {
                CtoK();
            }
            if (spinner.getSelectedItem().toString().equals("Celcius To Farenheit")) {
                CtoF();
            }
            if (spinner.getSelectedItem().toString().equals("Celcius To Farenheit")) {
                CtoF();
            }
            if (spinner.getSelectedItem().toString().equals("Reamur To Celcius")) {
                RtoC();
            }
            if (spinner.getSelectedItem().toString().equals("Reamur To Kelvin")) {
                RtoK();
            }
            if (spinner.getSelectedItem().toString().equals("Reamur To Farenheit")) {
                RtoF();
            }
            if (spinner.getSelectedItem().toString().equals("Farenheit To Celcius")) {
                FtoC();
            }
            if (spinner.getSelectedItem().toString().equals("Farenheit To Reamur")) {
                FtoR();
            }
            if (spinner.getSelectedItem().toString().equals("Farenheit To  Kelvin")) {
                FtoK();
            }
            if (spinner.getSelectedItem().toString().equals("Kelvin To Celcius")) {
                KtoC();
            }
            if (spinner.getSelectedItem().toString().equals("Kelvin To Reamur")) {
                KtoR();
            }
            if (spinner.getSelectedItem().toString().equals("Kelvin To Farenheit")) {
                KtoF();
            }
        }


    }
    //fungsi untuk rumus konversi
    public void CtoR() {
        double suhu = Double.parseDouble(etNilai.getText().toString());
        double hasil = (4.0 / 5.0) * suhu;
        tvHasil.setText(hasil + "");
    }

    public void CtoK() {
        double suhu = Double.parseDouble(etNilai.getText().toString());
        double hasil = suhu + 273;
        tvHasil.setText(hasil + "");
    }

    public void CtoF() {
        double suhu = Double.parseDouble(etNilai.getText().toString());
        double hasil = (9.0 / 5.0) * suhu + 32;
        tvHasil.setText(hasil + "");
    }

    public void RtoC() {
        double suhu = Double.parseDouble(etNilai.getText().toString());
        double hasil = (5.0 / 4.0) * suhu;
        tvHasil.setText(hasil + "");
    }

    public void RtoK() {
        double suhu = Double.parseDouble(etNilai.getText().toString());
        double hasil = (5.0 / 4.0) * suhu + 273;
        tvHasil.setText(hasil + "");
    }

    public void RtoF() {
        double suhu = Double.parseDouble(etNilai.getText().toString());
        double hasil = (9.0 / 4.0) * suhu + 32;
        tvHasil.setText(hasil + "");
    }

    public void FtoC() {
        double suhu = Double.parseDouble(etNilai.getText().toString());
        double hasil = 5.0 / 9.0 * (suhu - 32);
        tvHasil.setText(hasil + "");
    }

    public void FtoR() {
        double suhu = Double.parseDouble(etNilai.getText().toString());
        double hasil = 4.0 / 9.0 * (suhu - 32);
        tvHasil.setText(hasil + "");
    }

    public void FtoK() {
        double suhu = Double.parseDouble(etNilai.getText().toString());
        double hasil = 5.0 / 9.0 * (suhu - 32) + 273;
        tvHasil.setText(hasil + "");
    }

    public void KtoC() {
        double suhu = Double.parseDouble(etNilai.getText().toString());
        double hasil = suhu - 273;
        tvHasil.setText(hasil + "");
    }

    public void KtoR() {
        double suhu = Double.parseDouble(etNilai.getText().toString());
        double hasil = 4.0 / 5.0 * (suhu - 273);
        tvHasil.setText(hasil + "");
    }

    public void KtoF() {
        double suhu = Double.parseDouble(etNilai.getText().toString());
        double hasil = 9.0/5.0 * (suhu - 273) + 32;
        tvHasil.setText(hasil + "");
    }
}