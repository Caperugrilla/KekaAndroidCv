package com.ejercicios.keka.kekaandroidcv.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.ejercicios.keka.kekaandroidcv.Adapters.EstudiosAdapter;
import com.ejercicios.keka.kekaandroidcv.Estudios;
import com.ejercicios.keka.kekaandroidcv.R;
import com.ejercicios.keka.kekaandroidcv.Repository.EstudiosRepository;


public class EstudiosFragment extends android.support.v4.app.Fragment {

private ListView mEstList;
private EstudiosAdapter mEstAdapter;


public EstudiosFragment() {

        }

public static EstudiosFragment newInstance(){
        EstudiosFragment fragment = new EstudiosFragment();
        return fragment;
        }

public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if(getArguments()!=null){

        }
        }

public View onCreateView(LayoutInflater inflater,
        ViewGroup container, Bundle savedInstanceState){
        View root = inflater.inflate(R.layout.fragment_estudios, container, false);

        mEstList = (ListView) root.findViewById(R.id.estudios);

        mEstAdapter = new EstudiosAdapter(getActivity(), EstudiosRepository.getInstance().getEstudios());

        mEstList.setAdapter(mEstAdapter);

        mEstList.setOnItemClickListener(new AdapterView.OnItemClickListener(){

@Override
public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        Estudios currentEst = mEstAdapter.getItem(position);
        Toast.makeText(getActivity(), "Esto puede funcionar \n" + currentEst.getName(),Toast.LENGTH_LONG).show();

        }
        });

        return root;

        }

public interface OnFragmentInteractionListener {
}
}
