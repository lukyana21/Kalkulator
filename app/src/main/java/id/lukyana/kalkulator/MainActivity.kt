package id.lukyana.kalkulator

import android.content.Intent
import android.nfc.NfcAdapter.EXTRA_DATA
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputData1: EditText = findViewById(R.id.isiData1)
        val inputData2: EditText = findViewById(R.id.isiData2)
        val btnTambah: Button = findViewById(R.id.tombolTambah)
        val btnKurang: Button = findViewById(R.id.tombolKurang)
        val btnKali: Button = findViewById(R.id.tombolKali)
        val btnBagi: Button = findViewById(R.id.tombolBagi)
        val hasilOperasi: TextView = findViewById(R.id.hasilHitung)

        btnTambah.setOnClickListener {
            val data1 = inputData1.text.toString()
            val data2 = inputData2.text.toString()
            if (data1.isNullOrBlank() && data2.isNullOrBlank()){
                hasilOperasi.text = "Data 1 & 2 nggak boleh kosong!"
            }else if(data2.isNullOrBlank()){
                hasilOperasi.text = "Data 2 nggak boleh kosong!"
            }else if(data1.isNullOrBlank()){
                hasilOperasi.text = "Data 1 nggak boleh kosong!"
            }else{
                val data = HalamanPindah(
                    "Hasil Penjumlahan",
                    "${data1.toDouble() + data2.toDouble()}"
                )
                val i = Intent(this@MainActivity, HasilActivity::class.java)
                i.putExtra(HasilActivity.EXTRA_DATA, data)
                startActivity(i)
            }
        }

        btnKurang.setOnClickListener {
            val data1 = inputData1.text.toString()
            val data2 = inputData2.text.toString()
            if (data1.isNullOrBlank() && data2.isNullOrBlank()){
                hasilOperasi.text = "Data 1 & 2 nggak boleh kosong!"
            }else if(data2.isNullOrBlank()){
                hasilOperasi.text = "Data 2 nggak boleh kosong!"
            }else if(data1.isNullOrBlank()){
                hasilOperasi.text = "Data 1 nggak boleh kosong!"
            }else{
                val data = HalamanPindah(
                    "Hasil Pengurangan",
                    "${data1.toDouble() - data2.toDouble()}"
                )
                val i = Intent(this@MainActivity, HasilActivity::class.java)
                i.putExtra(HasilActivity.EXTRA_DATA, data)
                startActivity(i)
            }
        }

        btnKali.setOnClickListener {
            val data1 = inputData1.text.toString()
            val data2 = inputData2.text.toString()
            if (data1.isNullOrBlank() && data2.isNullOrBlank()){
                hasilOperasi.text = "Data 1 & 2 nggak boleh kosong!"
            }else if(data2.isNullOrBlank()){
                hasilOperasi.text = "Data 2 nggak boleh kosong!"
            }else if(data1.isNullOrBlank()){
                hasilOperasi.text = "Data 1 nggak boleh kosong!"
            }else{
                val data = HalamanPindah(
                    "Hasil Perkalian",
                    "${data1.toDouble() * data2.toDouble()}"
                )
                val i = Intent(this@MainActivity, HasilActivity::class.java)
                i.putExtra(HasilActivity.EXTRA_DATA, data)
                startActivity(i)
            }
        }

        btnBagi.setOnClickListener {
            val data1 = inputData1.text.toString()
            val data2 = inputData2.text.toString()
            if (data1.isNullOrBlank() && data2.isNullOrBlank()){
                hasilOperasi.text = "Data 1 & 2 nggak boleh kosong!"
            }else if(data2.isNullOrBlank()){
                hasilOperasi.text = "Data 2 nggak boleh kosong!"
            }else if(data1.isNullOrBlank()){
                hasilOperasi.text = "Data 1 nggak boleh kosong!"
            }else{
                val data = HalamanPindah(
                    "Hasil Pembagian",
                    "${data1.toDouble() / data2.toDouble()}"
                )
                val i = Intent(this@MainActivity, HasilActivity::class.java)
                i.putExtra(HasilActivity.EXTRA_DATA, data)
                startActivity(i)
            }
        }
    }
}