package id.lukyana.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val judulHasilOperasi: TextView = findViewById(R.id.judulHasil)
        val hasilTangkap: TextView = findViewById(R.id.hasilTangkap)

        val bingkisan = intent.getParcelableExtra<HalamanPindah>(EXTRA_DATA) as HalamanPindah
        judulHasilOperasi.text = bingkisan.judulHalaman
        hasilTangkap.text = bingkisan.Hasil
    }
    companion object{
        const val EXTRA_DATA = "extra_data"
    }
}