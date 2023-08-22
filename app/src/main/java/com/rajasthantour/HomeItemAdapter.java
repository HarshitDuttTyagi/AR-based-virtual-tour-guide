package com.rajasthantour;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;


public class HomeItemAdapter extends RecyclerView.Adapter<HomeItemAdapter.MyViewHolder> {

    private Context mContext;
    private List<HomeItem> albumList;


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView title;
        public ImageView thumbnail1;
        private final Context context;

        public MyViewHolder(View view) {
            super(view);
            context = view.getContext();
            title = (TextView) view.findViewById(R.id.title1);
            thumbnail1 = (ImageView) view.findViewById(R.id.thumbnail1);
            view.setClickable(true);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            if (position != RecyclerView.NO_POSITION) {
                Toast.makeText(context, "Pos: " + position, Toast.LENGTH_SHORT).show();
                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(mContext, Explore.class);
                        break;
                    case 1:
                        intent = new Intent(mContext, Explore.class);
                        break;
                    default:
                        intent = new Intent(mContext, Explore.class);
                        break;
                }
                mContext.startActivity(intent);
            }
        }
    }

    public HomeItemAdapter(Context mContext, List<HomeItem> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.homeitem_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        HomeItem album = albumList.get(position);
        holder.title.setText(album.getName());
        // loading album cover2 using Glide library
        Glide.with(mContext).load(album.getThumbnail()).into(holder.thumbnail1);
    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }
}
