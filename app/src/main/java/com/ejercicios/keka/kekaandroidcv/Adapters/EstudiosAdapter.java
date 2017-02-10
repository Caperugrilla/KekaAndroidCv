package com.ejercicios.keka.kekaandroidcv.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ejercicios.keka.kekaandroidcv.Estudios;
import com.ejercicios.keka.kekaandroidcv.R;

import java.util.List;

/**
 * Created by Keka on 09/02/2017.
 */

public class EstudiosAdapter extends ArrayAdapter<Estudios> {

    public EstudiosAdapter(Context context, List<Estudios> objects){
        super(context, 0, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

       ViewHolder holder;

        if (null==convertView){
            convertView = inflater.inflate(R.layout.fragment_estudios_adaptador,parent,false);

            holder = new ViewHolder();
            holder.avatarC= (ImageView)convertView.findViewById(R.id.avatarC);
            holder.txtCentro= (TextView)convertView.findViewById(R.id.txtCentro);
            holder.txtCurso= (TextView)convertView.findViewById(R.id.txtCurso);
            convertView.setTag(holder);

        } else {
            holder = (EstudiosAdapter.ViewHolder) convertView.getTag();
        }

        Estudios estudio = getItem(position);

        holder.txtCurso.setText(estudio.getName());
        holder.txtCentro.setText(estudio.getCompany());
        Glide.with(getContext()).load(estudio.getImage()).into(holder.avatarC);

        return convertView;
    }

    static class ViewHolder{
        ImageView avatarC;
        TextView txtCurso;
        TextView txtCentro;

    }
}
