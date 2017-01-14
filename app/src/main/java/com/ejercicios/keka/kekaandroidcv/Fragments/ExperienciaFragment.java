package com.ejercicios.keka.kekaandroidcv.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.ejercicios.keka.kekaandroidcv.MainActivity;
import com.ejercicios.keka.kekaandroidcv.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExperienciaFragment extends ListFragment {

    String[] experiencia = new String[] {
            "Desarrollo de aplicaciones móviles", "Agente de soporte técnico informático para Telefonica de España",
            "Operador de consola para Telefonica de España"};
    int[] empresas = new int[]{
            R.drawable.fundaciontelefonica, R.drawable.sitel, R.drawable.alma};

    String[] descripcion = new String[]{
            "Fundación Telefónica", "Sitel Ibérica", "Alma Technologies"};

    private ExperienciaFragment.OnFragmentInteractionListener mListener;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();



        for (int i=0;i<3;i++){
            HashMap<String,String> hm = new HashMap<String, String>();
            hm.put("txt", experiencia[i]);
            hm.put("descripcion",descripcion[i]);
            hm.put("empresa", Integer.toString(empresas[i]));
            aList.add(hm);

        }

        String[] from ={"empresa", "txt", "descripcion"};
        int[] to = {R.id.empresa, R.id.txt, R.id.descripcion};

        SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList,R.layout.fragment_experiencia_adaptador,
                from,to);

        setListAdapter(adapter);


        return  super.onCreateView(inflater, container, saveInstanceState);

    }



    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof ExperienciaFragment.OnFragmentInteractionListener) {
            mListener = (ExperienciaFragment.OnFragmentInteractionListener) context;
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
