package com.androboy.tedtalkreplica.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androboy.tedtalkreplica.R;
import com.androboy.tedtalkreplica.delegates.VideoListDelegate;
import com.androboy.tedtalkreplica.views.holders.VideoListViewHolder;

public class NewestVideoListAdapter extends RecyclerView.Adapter {

    VideoListDelegate mVideoListDelegate;

    public NewestVideoListAdapter(VideoListDelegate delegate)
    {
        mVideoListDelegate = delegate;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.newest_video_list_item, viewGroup , false);
        return new VideoListViewHolder(view , mVideoListDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
