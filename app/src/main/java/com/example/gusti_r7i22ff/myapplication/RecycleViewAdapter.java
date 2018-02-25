package com.example.gusti_r7i22ff.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by gusti_r7i22ff on 25/02/2018.
 */

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MerkViewHolder>{
    public List<Merk> listMinuman;
    public Context context;

    public RecycleViewAdapter(List<Merk> Listminuman) {
        this.listMinuman = Listminuman;
    }

    public class MerkViewHolder extends RecyclerView.ViewHolder {
        public ImageView gambar;
        public TextView nama, detail, komposisi;

        public MerkViewHolder(View view) {
            super(view);
            context = itemView.getContext();
            gambar = (ImageView)itemView.findViewById(R.id.image);
            nama = (TextView)view.findViewById(R.id.name);
            detail = (TextView)view.findViewById(R.id.detailbarang);
            komposisi = (TextView)view.findViewById(R.id.komposisi);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int posisi = getAdapterPosition();
                    Merk klikMenu = listMinuman.get(posisi);
                    Intent intent = new Intent(context, DetailMinuman.class);
                    intent.putExtra("image", listMinuman.get(posisi).getImage());
                    intent.putExtra("name", listMinuman.get(posisi).getNamaMinuman());
                    intent.putExtra("detailbarang", listMinuman.get(posisi).getDetailMinuman());
                    intent.putExtra("komposisi", listMinuman.get(posisi).getKomposisiMinuman());
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                    Toast.makeText(view.getContext(), "Kamu Memilih " + klikMenu.getNamaMinuman(), Toast.LENGTH_LONG).show();
                }

            });
        }
    }

    @Override
    public MerkViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.halamankedua, parent, false);

        return new MerkViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MerkViewHolder holder, int position) {
        holder.gambar.setImageResource(listMinuman.get(position).getImage());
        holder.nama.setText(listMinuman.get(position).getNamaMinuman());
        holder.detail.setText(listMinuman.get(position).getDetailMinuman());
        holder.komposisi.setText(listMinuman.get(position).getKomposisiMinuman());
    }

    @Override
    public int getItemCount() {
        return listMinuman.size();
    }
}


