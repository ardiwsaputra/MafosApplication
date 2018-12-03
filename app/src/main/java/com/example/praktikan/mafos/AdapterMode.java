package com.example.praktikan.mafos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterMode extends BaseAdapter {

    LayoutInflater inflater;
    private List<Mode> modes;
    Context context;

    public AdapterMode(Context context, List<Mode> modes) {
        inflater = LayoutInflater.from(context);
        this.context = context;
        this.modes = modes;
    }

    @Override
    public int getCount() {
        return modes.size();
    }

    @Override
    public Object getItem(int arg0) {
        return modes.get(arg0);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewParent){
        AdapterMode.ViewHolder holder;
        if (convertView == null){
            convertView = inflater.inflate(R.layout.row_mode, null);
            holder = new AdapterMode.ViewHolder();
            holder.nameMode = (TextView) convertView.findViewById(R.id.jenisMode);
            convertView.setTag(holder);
        }else {
            holder = (AdapterMode.ViewHolder) convertView.getTag();
        }

        holder.nameMode.setText(modes.get(position).getJenisMode());
        return convertView;
    }

    static  class  ViewHolder{
        TextView nameMode;
    }
}