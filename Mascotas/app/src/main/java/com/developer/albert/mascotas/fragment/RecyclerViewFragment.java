package com.developer.albert.mascotas.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.developer.albert.mascotas.R;
import com.developer.albert.mascotas.adapter.MascotaAdaptador;
import com.developer.albert.mascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by Albert on 12/03/2017.
 */

public class RecyclerViewFragment extends Fragment {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview,container,false);


        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        //GridLayoutManager glm = new GridLayoutManager(this,2);

        listaMascotas.setLayoutManager(llm);
        inicializarListaContactos();
        inicializarAdaptador();



        return v;
    }


    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,getActivity());
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaContactos(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.mascota_1,"Juan",0));
        mascotas.add(new Mascota(R.drawable.mascota_2,"Perez",0));
        mascotas.add(new Mascota(R.drawable.mascota_3,"Pawan",0));
        mascotas.add(new Mascota(R.drawable.mascota_4,"Pedro",0));
        mascotas.add(new Mascota(R.drawable.mascota_5,"Luis",0));
    }
}
