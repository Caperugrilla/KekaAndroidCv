package com.ejercicios.keka.kekaandroidcv.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.ejercicios.keka.kekaandroidcv.Adapters.ExperienciaAdapter;
import com.ejercicios.keka.kekaandroidcv.Experiencia;
import com.ejercicios.keka.kekaandroidcv.R;
import com.ejercicios.keka.kekaandroidcv.Repository.ExperienciaRepository;

public class ExperienciaFragment extends android.support.v4.app.Fragment {

    private ListView mExpList;
    private ExperienciaAdapter mExpAdapter;


    public ExperienciaFragment() {

    }

    public static ExperienciaFragment newInstance(){
        ExperienciaFragment fragment = new ExperienciaFragment();
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if(getArguments()!=null){

        }
    }

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState){
        View root = inflater.inflate(R.layout.fragment_experiencia, container, false);

        mExpList = (ListView) root.findViewById(R.id.experiencia);

        mExpAdapter = new ExperienciaAdapter(getActivity(), ExperienciaRepository.getInstance().getExperiencia());

        mExpList.setAdapter(mExpAdapter);

        mExpList.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Experiencia currentExp = mExpAdapter.getItem(position);
                Toast.makeText(getActivity(), "Esto puede funcionar \n" + currentExp.getName(),Toast.LENGTH_LONG).show();

            }
        });

        return root;

    }

    public interface OnFragmentInteractionListener {
    }
}
