package com.example.viewpager2tabs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class FragmentPrincipal extends Fragment {
    public FragmentPrincipal() {
    }

    List<Foto> fotos = List.of(
            new Foto("Ardilla", R.drawable.ardilla),
            new Foto("Gato", R.drawable.gato),
            new Foto("Mariposa", R.drawable.mariposa),
            new Foto("Pato", R.drawable.pato),
            new Foto("Rana", R.drawable.rana));

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_principal, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        FotoAdapter adapter = new FotoAdapter(fotos);

        recyclerView.setAdapter(adapter);

        return view;
    }
}