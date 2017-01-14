package com.ejercicios.keka.kekaandroidcv.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ejercicios.keka.kekaandroidcv.Lista_contenido;
import com.ejercicios.keka.kekaandroidcv.R;


public class DetalleFragment extends Fragment {

   public static final String ARG_ID_ENTRADA_SELECCIONADA = "item_id";
    public static final String ARG_ID_ENTRADA_SELECIONADA ="item_id" ;

    private OnFragmentInteractionListener mListener;
    private Lista_contenido.Lista_entrada mItem;
    private TextView tvSuperior,tvInferior;
    private ImageView ivImagen;

    public DetalleFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments().containsKey(ARG_ID_ENTRADA_SELECCIONADA)) {

           mItem= Lista_contenido.ENTRADAS_LISTA_HASHMAP.get(getArguments().getString(ARG_ID_ENTRADA_SELECCIONADA));

            tvSuperior = (TextView) getView().findViewById(R.id.tvSuperior);
            tvInferior = (TextView)getView().findViewById(R.id.tvInferior);
            ivImagen = (ImageView)getView().findViewById(R.id.ivImagen);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalle, container, false);
        if(mItem!=null){
            tvSuperior.setText(mItem.textoEncima);
            tvInferior.setText(mItem.textoDebajo);
            ivImagen.setImageResource(mItem.idImagen);
        }

        return view;
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
