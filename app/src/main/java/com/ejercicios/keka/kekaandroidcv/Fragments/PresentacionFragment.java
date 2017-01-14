package com.ejercicios.keka.kekaandroidcv.Fragments;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ejercicios.keka.kekaandroidcv.R;


public class PresentacionFragment extends Fragment {


    private TextView tvFrase, tvAutor;


    private PresentacionFragment.OnFragmentInteractionListener mListener;

    public static PresentacionFragment newInstance() {
        return new PresentacionFragment();
    }

    public PresentacionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_presentacion, container, false);

        tvFrase = (TextView) view.findViewById(R.id.tvFrase);
        tvAutor = (TextView) view.findViewById(R.id.tvAutor);


        //Cargamos fuente externa
        Typeface TF = Typeface.createFromAsset(getActivity().getAssets(), "Fonts/BrightLarch_PERSONAL_USE.ttf");
        tvFrase.setTypeface(TF);
        tvAutor.setTypeface(TF);

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

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }



}
