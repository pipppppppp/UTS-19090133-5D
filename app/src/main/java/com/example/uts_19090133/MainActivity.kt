package com.example.uts_19090133

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var data: ArrayList<modelData>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(
            modelData(R.drawable.aceh,"Rumah Krong Bade","Aceh","Rumah Krong Bade dari Aceh " +
                    "ini berbentuk memanjang dari timur ke barat menyerupai persegi panjang. Di bagian depan rumah " +
                    "dilengkapi dengan tangga untuk masuk ke dalam rumah. Umumnya, tangga pada rumah adat Aceh ini " +
                    "jumlahnya ganjil, yaitu sekitar 7 hingga 9 anak tangga.")
        )

        data?.add(
            modelData(R.drawable.banten,"Rumah Baduy","Banten", "Rumah adat dari Banten ini " +
                    "penghuninya adalah suku Baduy yang merupakan suku asli di wilayah tersebut. Biasanya, suku Baduy " +
                    "membuat rumah ini menggunakan bambu dan ijuk untuk atapnya. Suku Baduy juga memiliki asas kekeluargaan " +
                    "yang amat kental sehingga mereka membangun rumah ini secara gotong royong untuk tempat tinggal.")
        )

        data?.add(
            modelData(R.drawable.belitung,"Rumah Rakit","Bangka Belitung", "Karena Bangka Belitung memiliki " +
                    "banyak yang tergenang air atau di tepi laut, warga setempat harus menyesuaikan diri yaitu dengan membangun " +
                    "rumah di atas air juga yang dinamakan Rumah Rakit. Rumah ini sangat unik yaitu merupakan rumah Melayu namun " +
                    "dengan aksen arsitektur Tionghoa.\n" + "\n" + "Pembuatan rumah ini menggunakan bambu khusus dan bahan lainnya " +
                    "yang tentunya kuat dan membuatnya dapat mengapung dengan baik di atas air. Rumah Rakit ini biasa menjadi tempat " +
                    "tinggal warga.")
        )

        data?.add(
            modelData(R.drawable.bengkulu,"Rumah Bubungan Lima","Bengkulu", "Rumah adat dari Bengkulu ini memiliki " +
                    "tiang penopang dan menggunakan kayu khusus untuk membuatnya, yaitu kayu Medang Kemuning. Untuk memasuki rumah ini " +
                    "juga harus menggunakan tangga yang berada pada bagian depan rumah. Sama seperti rumah adat dari Riau, masyarakat " +
                    "Bengkulu menggunakan rumah ini untuk acara adat saja, bukan untuk mereka tinggali.")
        )

        data?.add(
            modelData(R.drawable.jambi,"Rumah Panggung","Jambi", "Rumah adat dari Jambi ini adalah desain yang tertua " +
                    "di daerah tersebut. Bentuk dari rumah Panggung ini adalah persegi panjang dengan tangga di depan rumah. Orang-orang " +
                    "sering menyebutkan bagian atap dari Rumah Panggung ini sebagai “Gajah Mabuk” karena bentuknya yang menyerupai perahu " +
                    "dengan ujung melengkung. Rumah ini digunakan untuk tempat tinggal dan juga tempat bermusyawarah.")
        )

        data?.add(
            modelData(R.drawable.jateng,"Rumah Joglo","Jawa Tengah", "Mungkin kamu sudah sering mendengar Rumah " +
                    "Joglo ini. Di bagian depan rumah akan ada pendopo untuk menjamu tamu. Rumah Joglo dari Jawa Tengah ini memiliki " +
                    "empat tiang penopang dan juga memiliki sentuhan kejawen dari suku Jawa di sisi-sisi rumah.")
        )

        data?.add(
            modelData(R.drawable.lampung,"Rumah Nuwo Sesat","Lampung", "Rumah adat Provinsi Lampung memiliki nama " +
                    "Nuwo Sesat. Ciri khas dari rumah ini adalah bentuknya panggung dan di sisi-sisinya terdapat ornamen yang khas. " +
                    "Biasanya, ukuran dari rumah ini sangat besar, namun saat ini banyak yang membuat Rumah Nuwo Sesat ini menjadi lebih " +
                    "kecil. \n" + "\n" + "Bukanlah untuk tempat tinggal, Rumah Nuwo Sesat ini sama seperti beberapa rumah adat lainnya " +
                    "yang hanya dibangun untuk acara adat dan melakukan musyawarah. ")
        )


        data?.add(
            modelData(R.drawable.riau,"Rumah Adat Selaso Jatuh Kembar","Riau", "Nama dari rumah ini memiliki arti " +
                    "yaitu rumah dengan dua selasar. Masyarakat Riau bukan menjadikan Rumah Selaso Jatuh Kembar sebagai tempat tinggal " +
                    "mereka, namun hanya menggunakannya untuk acara adat saja.")
        )

        data?.add(
            modelData(R.drawable.riaukepulauan,"Rumah Atap Limas Potong","Kepulauan Riau", "Rumah adat dari Kepulauan " +
                    "Riau ini terlihat sangat sederhana. Bentuknya adalah rumah panggung yang memanjang ke belakang dengan dinding kayu yang " +
                    "di susun vertikal. Atap dari rumah adat ini memiliki lima bumbungan dengan seng warna merah.")
        )

        data?.add(
            modelData(R.drawable.sumbar,"Rumah Gadang","Sumatera Barat", "Rumah adat satu ini berasal dari Sumatera " +
                    "Barat, rumah ini memiliki beberapa atap yang runcing dan menjulang keatas. Rumah ini terbuat dari ijuk dan bentuknya " +
                    "mirip seperti tanduk kerbau yang melambangkan kemenangan suku Minang dalam perlombaan adu kerbau di Jawa.")
        )

        data?.add(
            modelData(R.drawable.sumut,"Rumah Bolon","Sumatera Utara", "Pada rumah adat Bolon ini, terdapat dua bagian " +
                    "yang berbeda, yaitu Jabu Bolon dan juga Jabu Parsakitan. Jabu Bolon biasa menjadi tempat untuk keluarga besar, sedangkan " +
                    "Jabu Parsakitan adalah tempat untuk membicarakan masalah adat. Uniknya dari rumah adat Sumatera Utara ini adalah tidak ada " +
                    "sekatan antara tiap ruangan, sehingga semua anggota keluarga tidur bersama.")
        )

        data?.add(
            modelData(R.drawable.susel,"Rumah Adat Tongkonan","Sulawesi Selatan", "Kamu pastinya sering mendengar " +
                    "Rumah Tongkonan ini. Rumah ini merupakan rumah adat suku Toraja yang berada di Sulawesi Selatan. Tongkonan berfungsi " +
                    "sebagai tempat tinggal masyarakat dan juga tempat acara adat. Arsitekturnya yang unik dan khas ini membuatnya menjadi " +
                    "sangat indah.")
        )

        //Set data to Adapter
        recyclerView.adapter = adapter(data, object : adapter.OnClickListener{
            override fun detail(item: modelData?) {
                val intent = Intent(this@MainActivity, detail()::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("asal", item?.asal)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })
    }
}