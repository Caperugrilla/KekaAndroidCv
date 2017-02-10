package com.ejercicios.keka.kekaandroidcv.Repository;

import com.ejercicios.keka.kekaandroidcv.Estudios;
import com.ejercicios.keka.kekaandroidcv.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Keka on 09/02/2017.
 */

public class EstudiosRepository {
    private static EstudiosRepository esRepository = new EstudiosRepository();
    private HashMap<String, Estudios> estudios = new HashMap<>();

    public static EstudiosRepository getInstance(){
        return esRepository;
    }

    private EstudiosRepository(){
        savedEstudios (new Estudios("Desarrollo de productos electrónicos", "IES San Fernando", R.drawable.ies));
        savedEstudios (new Estudios("Montaje y mantenimiento de paneles solares térmicos", "CEYSA, Escuela de Instaladores", R.drawable.ceysa));
    }
    private void savedEstudios(Estudios estudio){
        estudios.put(estudio.getId(), estudio);
    }

    public List<Estudios> getEstudios(){
        return new ArrayList<>(estudios.values());
    }
}
