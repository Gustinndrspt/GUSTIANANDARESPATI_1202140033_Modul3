package com.example.gusti_r7i22ff.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public List<Merk> listMinuman = new ArrayList<>();
    public RecyclerView recyclerView;
    public RecycleViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Sample2");

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        mAdapter = new RecycleViewAdapter(listMinuman);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        dataMinuman();
    }


    public void dataMinuman() {
        Merk menu = new Merk(R.drawable.aqua, "Aqua", "Ini Adalah Air Minum Merk Aqua", "Aqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei. Aqua adalah merek AMDK dengan penjualan terbesar di Indonesia dan merupakan salah satu merek AMDK yang paling terkenal di Indonesia, sehingga telah menjadi seperti merek generik untuk AMDK.");
        listMinuman.add(menu);
        menu = new Merk(R.drawable.pristine, "Pristine", "Ini Adalah Air Minum Merk Pristine", "Water Sources of PRISTINE original come from Pangrango Gede Mountain, 30 miles from the South Jakarta (1.5 hours from Central Jakarta), located beside the \"National Park Pangrango Gede\".");
        listMinuman.add(menu);
        menu = new Merk(R.drawable.leminerale, "Leminerale", "Ini Adalah Air Minum Merk Leminerale", "Le Minerale, pure and preserved mineral water sourced from the mountain and packed directly on site using the latest technology (mineral protection system) to bring you a healthy refreshment for optimum body function.");
        listMinuman.add(menu);
        menu = new Merk(R.drawable.cleo, "Cleo", "Ini Adalah Air Minum Merk Cleo", "Cleo pure water adalah air yang kadar kemurniannya mendekati 100%. Air semacam ini tidak lagi mengandung bakteri, virus, mineral atau zat-zat lain yang akan membahayakan tubuh dalam jangka panjang. Konsumsilah air murni, sebab mengonsumsi air yang tidak murni justru mengundang risiko");
        listMinuman.add(menu);
        menu = new Merk(R.drawable.club, "Club", "Ini Adalah Air Minum Merk Club", "Club adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986. Pada bulan November 2013, merek Club diakuisisi oleh PT Indofood CBP Sukses Makmur Tbk.");
        listMinuman.add(menu);
        menu = new Merk(R.drawable.vit, "Vit", "Ini Adalah Air Minum Merk Vit", "VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta. Pada tanggal 17 Juli 1987 kepemilikan PT Varia Industri Tirta beralih kepada Tirto Utomo. Sebelas tahun kemudian, setelah melakukan merger dengan PT Varia Industri Tirta, PT Tirta Investama menjadi pemilik merek VIT.");
        listMinuman.add(menu);
        menu = new Merk(R.drawable.ades, "Ades", "Ini Adalah Air Minum Merk Ades", "AdeS is a brand of drinking water available in Indonesia. The mineral water is also known as I-Lohas in Japan. The Coca-Cola Company acquired the Ades bottled water brand for $20 million in 2000 as part of its $45 million investment in the country since 1999 under PT Akasha Wira International Tbk. It is currently made by PT Coca-Cola Bottling Indonesia in Bekasi, West Java, where it also made Coca-Cola, Fanta and Sprite.");
        listMinuman.add(menu);
        menu = new Merk(R.drawable.nestle, "Nestle", "Ini Adalah Air Minum Merk Nestle", "Henri Nestlé’s water bottling factory was the earliest incarnation of what would eventually become the world’s leading bottled water company. Nestlé took a step onto the world stage with giants such as Perrier and Nestlé Pure Life. This is commercialized since 1998. Today this impressive portfolio encompasses 50 brands on five continents");
        listMinuman.add(menu);
        menu = new Merk(R.drawable.amidis, "Amidis", "Ini Adalah Air Minum Merk Amidis", "AMIDIS adalah produk Air Minum Dalam Kemasan (AMDK) yang sudah diproduksi sejak tahun 1997 dan merupakan air minum distilasi pertama di Indonesia yang telah menjadi salah satu produk AMDK yang dipercaya karena kualitas mutu dan kemurniannya.");
        listMinuman.add(menu);
        menu = new Merk(R.drawable.equil, "Equil", "Ini Adalah Air Minum Merk Equil", "EQUIL  was first bottled in 1998 at the source, Villa D’Equilibrium, and launched to the market which was then predominantly monopolized by few European brands. Although drinking natural mineral water is embedded in the European fine dining culture, the gourmet and exclusivity of the concept has been accepted by the local Socialites.");
        listMinuman.add(menu);
        menu = new Merk(R.drawable.evian, "Evian", "Ini Adalah Air Minum Merk Evian", "Evian is owned by Danone, a French multinational corporation. In addition to the mineral water, Danone Group uses the Evian name for a line of organic skin care products as well as a luxury resort in France.");
        listMinuman.add(menu);
        mAdapter.notifyDataSetChanged();
    }
}






