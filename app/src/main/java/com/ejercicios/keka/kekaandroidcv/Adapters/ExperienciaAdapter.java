package com.ejercicios.keka.kekaandroidcv.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ejercicios.keka.kekaandroidcv.Experiencia;
import com.ejercicios.keka.kekaandroidcv.R;

import java.util.List;

/**
 * Created by Keka on 09/02/2017.
 */

public class ExperienciaAdapter extends ArrayAdapter<Experiencia> {
    public ExperienciaAdapter(Context context, List<Experiencia> objects){
        super(context, 0, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        ViewHolder holder;

        if (null==convertView){
            convertView = inflater.inflate(R.layout.fragment_experiencia_adaptador, parent, false);

            holder = new ViewHolder();
            holder.avatar= (ImageView)convertView.findViewById(R.id.avatar);
            holder.txtEmpr= (TextView)convertView.findViewById(R.id.txtEmpr);
            holder.txtPuesto= (TextView)convertView.findViewById(R.id.txtPuesto);
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Experiencia experiencia = getItem(position);

        holder.txtPuesto.setText(experiencia.getName());
        holder.txtEmpr.setText(experiencia.getCompany());
        Glide.with(getContext()).load(experiencia.getImage()).into(holder.avatar);

        return convertView;
    }

    static class ViewHolder{
        ImageView avatar;
        TextView txtPuesto;
        TextView txtEmpr;

    }
}
