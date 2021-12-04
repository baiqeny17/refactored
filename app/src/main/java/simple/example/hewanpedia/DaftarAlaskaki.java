package simple.example.hewanpedia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import simple.example.hewanpedia.model.AlasKaki;

public class DaftarAlaskaki extends AppCompatActivity {
    public final static String HEWAN_TERPILIH ="hewan_obj_key";
    List<AlasKaki> alasKakis;
    ListView listView;
    String jenisAlaskaki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftaractivity_alaskaki);
        Intent intent = getIntent();
        jenisAlaskaki = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        TextView txJudul = findViewById(R.id.text_title_daftar);
        txJudul.setText("DAFTAR BERBAGAI RAS "+jenisAlaskaki.toUpperCase());
        alasKakis = DataProvider.getAlasKakisByTipe(this,jenisAlaskaki);
        setupListView();
    }

    private void setupListView() {
        listView = findViewById(R.id.listview_daftar_hewan);
        DaftarAdapterActifity adapter = new DaftarAdapterActifity(this, alasKakis);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onListClik);
    }

    private AdapterView.OnItemClickListener onListClik = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            AlasKaki terpilih = alasKakis.get(position);
            bukaProfileHewan(terpilih);
        }
    };

    private void bukaProfileHewan(AlasKaki hewanTerpilih) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, PrifleActifity.class);
        intent.putExtra(HEWAN_TERPILIH, hewanTerpilih);
        startActivity(intent);
    }
}
