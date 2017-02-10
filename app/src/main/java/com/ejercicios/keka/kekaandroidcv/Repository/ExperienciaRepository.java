package com.ejercicios.keka.kekaandroidcv.Repository;

import com.ejercicios.keka.kekaandroidcv.Experiencia;
import com.ejercicios.keka.kekaandroidcv.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Keka on 09/02/2017.
 */

public class ExperienciaRepository {
    private static ExperienciaRepository repository = new ExperienciaRepository();
    private HashMap<String, Experiencia> experiencia = new HashMap<>();

    public static ExperienciaRepository getInstance(){
        return repository;
    }

    private ExperienciaRepository(){
        savedExperiencia (new Experiencia("Operador Atencion al Cliente", "Emergia CC", R.drawable.fundaciontelefonica));
        savedExperiencia (new Experiencia("Desarrollador de aplicaciones móviles", "Empleo digital", R.drawable.fundaciontelefonica));
        savedExperiencia (new Experiencia("Agente de soporte técnico/Helpdesk", "Sitel", R.drawable.sitel));
        savedExperiencia (new Experiencia("Operador de consola", "Alma Technologies", R.drawable.alma));
    }
    private void savedExperiencia(Experiencia expe){
        experiencia.put(expe.getId(), expe);
    }

    public List<Experiencia> getExperiencia(){
        return new ArrayList<>(experiencia.values());
    }
}
