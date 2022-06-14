package id.lukyana.kalkulator

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class HalamanPindah(
    val judulHalaman: String,
    val Hasil: String
): Parcelable
