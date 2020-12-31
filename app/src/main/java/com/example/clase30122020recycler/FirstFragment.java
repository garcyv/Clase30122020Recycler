package com.example.clase30122020recycler;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.clase30122020recycler.databinding.FragmentFirstBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;
    ArrayList<String> listDatos;


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    private void  wordsList(){
        for (int i = 0;i <50;i++){
            listDatos.add( "Palabra " + i);
        }
    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listDatos= new ArrayList<>();

        //  binding.recyclerid.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));

        wordsList();

        Adapter adapter = new Adapter(listDatos);
        binding.recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();

    }




}