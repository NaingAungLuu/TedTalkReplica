package com.androboy.tedtalkreplica.views.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.androboy.tedtalkreplica.delegates.VideoListDelegate;

public class VideoListViewHolder extends RecyclerView.ViewHolder {

    public VideoListViewHolder(@NonNull View itemView , final VideoListDelegate delegate) {
        super(itemView);


        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delegate.onTapVideo();
            }
        });
    }



}
