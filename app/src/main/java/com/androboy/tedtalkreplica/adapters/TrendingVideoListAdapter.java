package com.androboy.tedtalkreplica.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androboy.tedtalkreplica.R;
import com.androboy.tedtalkreplica.delegates.VideoListDelegate;
import com.androboy.tedtalkreplica.views.holders.VideoListViewHolder;

public class TrendingVideoListAdapter extends RecyclerView.Adapter {
    VideoListDelegate delegate ;
    public TrendingVideoListAdapter(VideoListDelegate delegate)
    {
        this.delegate = delegate;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.treding_video_list_item, viewGroup , false);
        return new VideoListViewHolder(view , delegate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
