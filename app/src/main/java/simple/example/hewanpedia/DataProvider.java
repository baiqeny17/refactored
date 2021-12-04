package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Sepatu;
import simple.example.hewanpedia.model.AlasKaki;
import simple.example.hewanpedia.model.Sandal;
import simple.example.hewanpedia.model.Slop;

public class DataProvider {
    private static List<AlasKaki> alasKakis = new ArrayList<>();

    private static List<Sandal> initDataSandal(Context ctx) {
        List<Sandal> sandals = new ArrayList<>();
        sandals.add(new Sandal("sandalcoksu", "Indonesia",
                "Aslinya berasal dari Indonesia, dengan ciri khas yang halus+lembut", R.drawable.sandalcoksu));
        sandals.add(new Sandal("sendaldaun", "singapura",
                "Aslinya berasal dari singapura, dengan ciri khas yang halus+nyaman untuk di gunakan", R.drawable.sandaldaun));
        sandals.add(new Sandal("sandalldg", "Indonesia",
                "Aslinya berasal dari Indonesia, dengan bahan karet yang sangat nyaman untuk di gunakan", R.drawable.sandalldg));
        sandals.add(new Sandal("sandalpink", "Indonesia",
                "Aslinya berasal dari Indonesia, dengan ciri khas mempunyai hak sedikit dan bahannya dari karet", R.drawable.sandalpink));
        sandals.add(new Sandal("sandalhak", "Indonesia",
                "Aslinya berasal dari Indonesia, dengan ciri khas yang mempunyai pita di atas dengan warna pink dan bahannya dari mika tebal dan suede sintetis", R.drawable.sandalhak));
        sandals.add(new Sandal("sendallucu", "italia",
                "Aslinya berasal dari Italia, dengan ciri khas bahannya dari karet dan mempunyai sedikit hak dan nyaman untuk di gunakan", R.drawable.sandallucu));
        return sandals;
    }

    private static List<Sepatu> initDataSepatu(Context ctx) {
        List<Sepatu> sepatus = new ArrayList<>();
        sepatus.add(new Sepatu("Sepatu1", "Inggris",
                "Aslinya berasal dari Inggriss, dengan ciri khas yang berwarna putih dan sedikit mempunyai warna pink", R.drawable.sepatu1));
        sepatus.add(new Sepatu("Sepatu2", "jerman ",
                "Aslinya berasal dari jerman dengan ciri khas yang berwarna putih", R.drawable.sepatu2));
        sepatus.add(new Sepatu("sepatcowok", "Indonesia",
                "Aslinya berasal dari Indonesia, dengan ciri khas mempunyai tali dan berwarna hitam,dan cocok di gunakan saat liburan ", R.drawable.sepatucowok));
        sepatus.add(new Sepatu("Sepatupink", "Inggris",
                "Aslinya berasal dari Inggris, dengan ciri khas bahannya dari karet", R.drawable.sepatupink));
        sepatus.add(new Sepatu("Sepatu3", "Inggris",
                "Aslinya berasal dari Indonesia, dengan ciri khas yang halus+lembut", R.drawable.sepatu3));
        sepatus.add(new Sepatu("Sepatuputih", "Inggris",
                "Aslinya berasal dari Inggris, dengan ciri khas yang berwarna putih dan bahannya dari karet", R.drawable.sepatuputih));
        return sepatus;
    }

    private static List<Slop> initDataSlop(Context ctx) {
        List<Slop> slops = new ArrayList<>();
        slops.add(new Slop("Slopbiru", "Surabaya",
                "Aslinya berasal dari Surabaya, dengan ciri khas yang halus+lembut dengan mempunyai warna biru", R.drawable.slopbiru));
        slops.add(new Slop("Slopcowok", "Surbaya",
                "Aslinya berasal dari Indonesia, dengan ciri khas yang halus+lembut dengan bahan karet yang nyaman saat di gunakan", R.drawable.slopcowok));
        slops.add(new Slop("Slophitam", "Indonesia",
                "Aslinya berasal dari Indonesia, dengan ciri khas yang halus+lembut dan tebal", R.drawable.slophitam));
        slops.add(new Slop("Slophitamtinggi", "malang",
                "Aslinya berasal dari malang, dengan ciri khas yang halus+lembut", R.drawable.slophitamtinggi));
        slops.add(new Slop("slopp", "Surabaya",
                "Aslinya berasal dari Surabaya, dengan ciri khas yang halus+lembut (K9)", R.drawable.slopp));
        slops.add(new Slop("Slopcantikk", "Surabaya",
                "Aslinya berasal dari Surabaya, dengan ciri khas yang halus+lembut dan sangat nyaman saat di gunaka", R.drawable.slopcantikk));
        return slops;
    }

    private static void initAllAlasKakis(Context ctx) {
        alasKakis.addAll(initDataSandal(ctx));
        alasKakis.addAll(initDataSepatu(ctx));
        alasKakis.addAll(initDataSlop(ctx));
    }

    public static List<AlasKaki> getAllHewan(Context ctx) {
        if (alasKakis.size() == 0) {
            initAllAlasKakis(ctx);
        }
        return alasKakis;
    }

    public static List<AlasKaki> getAlasKakisByTipe(Context ctx, String jenis) {
        List<AlasKaki> hewansByType = new ArrayList<>();
        if (alasKakis.size() == 0) {
            initAllAlasKakis(ctx);
        }
        for (AlasKaki h : alasKakis) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
