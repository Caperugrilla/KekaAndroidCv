package com.ejercicios.keka.kekaandroidcv.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;

import com.ejercicios.keka.kekaandroidcv.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class EstudiosFragment extends ListFragment {

    String[] formacion = {"Desarrollo de productos electrónicos", "Montaje y mantenimiento de paneles solares térmicos"};
    int[] imagen1={R.drawable.ies, R.drawable.ceysa};
    String[] descripcionFor = {"IES San Fernando", "CEYSA, Escuela de Instaladores"};


    private EstudiosFragment.OnFragmentInteractionListener mListener;

    public EstudiosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        for (int i=0;i<2;i++){
            HashMap<String,String> hm = new HashMap<String, String>();
            hm.put("listaEs", formacion[i]);
            hm.put("descripcionFor", descripcionFor[i]);
            hm.put("imgformacion", Integer.toString(imagen1[i]));
            aList.add(hm);

        }

        String[] from ={"imgformacion", "listaEs", "descripcionFor"};
        int[] to = {R.id.imgformacion, R.id.listaEs, R.id.descripcionFor};

        SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList,R.layout.fragment_estudios_adaptador, from,to);
        setListAdapter(adapter);


        return super.onCreateView(inflater, container, savedInstanceState);
    }


    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof EstudiosFragment.OnFragmentInteractionListener) {
            mListener = (EstudiosFragment.OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
