package simple.example.hewanpedia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import simple.example.hewanpedia.model.AlasKaki;

public class PrifleActifity extends AppCompatActivity {
    AlasKaki alasKaki;
    TextView txJudul,txJenis,txAsal,txDeskripsi;
    ImageView pakaianivFotoHewan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_ras);
        Intent intent = getIntent();
        alasKaki = (AlasKaki) intent.getSerializableExtra(DaftarAlaskaki.HEWAN_TERPILIH);
        inisialisasiView();
        tampilkanProfil(alasKaki);
    }

    private void inisialisasiView() {
        txJudul = findViewById(R.id.txJudul);
        txJenis = findViewById(R.id.txJenis);
        txAsal = findViewById(R.id.txAsal);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        pakaianivFotoHewan = findViewById(R.id.gambarHewan);
    }


    private void tampilkanProfil(AlasKaki alasKaki) {
        Log.d("Profil","Menampilkan "+alasKaki.getJenis());
        txJudul.setText(alasKaki.getJenis());
        txJenis.setText(alasKaki.getRas());
        txAsal.setText(alasKaki.getAsal());
        txDeskripsi.setText(alasKaki.getDeskripsi());
        pakaianivFotoHewan.setImageDrawable(this.getDrawable(alasKaki.getDrawableRes()));
    }

}
