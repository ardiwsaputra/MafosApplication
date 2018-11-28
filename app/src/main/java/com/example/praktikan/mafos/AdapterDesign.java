package com.example.praktikan.mafos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterDesign extends BaseAdapter {
    LayoutInflater inflater;
    private List<Design> designs;
    Context context;

    public AdapterDesign(Context context, List<Design> designs){
        inflater = LayoutInflater.from(context);
        this.context = context;
        this.designs = designs;
    }

    @Override
    public int getCount() {
        return designs.size();
    }

    @Override
    public Object getItem(int arg0) {
        return designs.get(arg0);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewParent){
        ViewHolder holder;
        if (convertView == null){
            convertView = inflater.inflate(R.layout.row_design, null);
            holder = new ViewHolder();
            holder.nameDesign = (TextView) convertView.findViewById(R.id.jenisDesign);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.nameDesign.setText(designs.get(position).getJenisDesign());
    }

    static  class  ViewHolder{
        TextView nameDesign;
    }

}
