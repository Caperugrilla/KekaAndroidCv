package com.ejercicios.keka.kekaandroidcv.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;

import com.ejercicios.keka.kekaandroidcv.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ComplementariaFragment extends ListFragment {
    String[]complementaria = {"Desarrollador de aplicaciones móviles", "Operario básico de instalaciones eléctricas de baja tensión",
            "Autómatas programables en procesos industriales"};
    int[] imagen2={R.drawable.fundaciontelefonica, R.drawable.asefosam, R.drawable.politecnica};
    String[] descripcionCom = {"Empleo digital, Funcación Telefonica", "Asefosam", "Universidad Politécnica de Madrid"};

    private ComplementariaFragment.OnFragmentInteractionListener mListener;

    public ComplementariaFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        for (int i=0;i<3;i++){
            HashMap<String,String> hm = new HashMap<String, String>();
            hm.put("complementaria", complementaria[i]);
            hm.put("descripcionCom", descripcionCom[i]);
            hm.put("imgcentro", Integer.toString(imagen2[i]));
            aList.add(hm);

        }

        String[] from ={"imgcentro", "complementaria", "descripcionCom"};
        int[] to = {R.id.imgcentro, R.id.complementaria, R.id.descripcionCom};

        SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList,R.layout.fragment_adaptador_complementaria, from,to);
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
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
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
