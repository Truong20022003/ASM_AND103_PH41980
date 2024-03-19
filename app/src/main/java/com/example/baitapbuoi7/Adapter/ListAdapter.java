package com.example.baitapbuoi7.Adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.baitapbuoi7.databinding.ItemRcvDanhsachBinding;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHodle> {


    @NonNull
    @Override
    public ViewHodle onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHodle holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHodle extends RecyclerView.ViewHolder {
        ItemRcvDanhsachBinding binding;
        public ViewHodle(@NonNull ItemRcvDanhsachBinding binding) {
            super(binding.getRoot());
        }
    }
}
