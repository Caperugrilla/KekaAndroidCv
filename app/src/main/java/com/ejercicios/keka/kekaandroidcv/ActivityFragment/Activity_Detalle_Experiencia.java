package com.ejercicios.keka.kekaandroidcv.ActivityFragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ejercicios.keka.kekaandroidcv.Fragments.DetalleFragment;
import com.ejercicios.keka.kekaandroidcv.R;

public class Activity_Detalle_Experiencia extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_activity__detalle__experiencia);

        // Comprobamos que previamente no hayamos entrado en esta actividad (por ejemplo, al rotar el dispositivo). Si es as� se a�ade el fragmento al contenedor
        if (savedInstanceState == null) {
            // Crea el fragmento del detalle de la entrada y lo a�ade a la actividad
            Bundle arguments = new Bundle();
            arguments.putString(DetalleFragment.ARG_ID_ENTRADA_SELECIONADA, getIntent().getStringExtra(DetalleFragment.ARG_ID_ENTRADA_SELECIONADA));
            DetalleFragment fragment = new DetalleFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction().add(R.id.content_detalle_fragment, fragment).commit();
        }
    }
}
