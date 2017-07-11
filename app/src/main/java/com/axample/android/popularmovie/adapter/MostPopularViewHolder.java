package com.axample.android.popularmovie.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.axample.android.popularmovie.BuildConfig;
import com.axample.android.popularmovie.DetailActivity;
import com.axample.android.popularmovie.R;
import com.axample.android.popularmovie.model.MovieItem;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

/**
 * Created by imam.munandar on 07/11/17.
 */

public class MostPopularViewHolder extends RecyclerView.ViewHolder {

    ImageView poster;

    public MostPopularViewHolder(View itemView) {
        super(itemView);
        poster = (ImageView) itemView.findViewById(R.id.img_movie);
    }

    public void bind(final MovieItem data) {
        Picasso.with(itemView.getContext())
                .load(BuildConfig.BASE_URL_IMG + "w185" + data.getPosterPath())
                .into(poster);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detail = new Intent(itemView.getContext(), DetailActivity.class);
                detail.putExtra("movie", new Gson().toJson(data));
                itemView.getContext().startActivity(detail);
            }
        });
    }
}
