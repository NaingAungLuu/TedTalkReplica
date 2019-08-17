package com.androboy.tedtalkreplica.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.androboy.tedtalkreplica.R;
import com.androboy.tedtalkreplica.adapters.NewestVideoListAdapter;
import com.androboy.tedtalkreplica.delegates.VideoListDelegate;

public class FragmentNewest extends Fragment implements VideoListDelegate {

    private VideoListDelegate mVideoListDelegate;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycler_fragment, container , false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NewestVideoListAdapter adapter = new NewestVideoListAdapter(this);

        RecyclerView rvMostViewed = view.findViewById(R.id.rv_videos);
        rvMostViewed.setLayoutManager(new LinearLayoutManager(getContext() , LinearLayoutManager.VERTICAL , false));
        rvMostViewed.setAdapter(adapter);

    }

    @Override
    public void onTapVideo() {
        Toast.makeText(getContext() , "Hey You Clicked the item!", Toast.LENGTH_SHORT).show();
    }
}
