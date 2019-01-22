package ru.arvalon.binding.list;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import ru.arvalon.binding.R;
import ru.arvalon.binding.model.Metro;
import ru.arvalon.binding.model.Station;

/**
 * Created by arvalon on 29.01.2018.
 */

public class MetroAdapter extends RecyclerView.Adapter {

    private List<Metro> objects;

    public MetroAdapter(List<Metro> objects){
        this.objects=objects;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from (parent.getContext());
        ViewDataBinding binding = DataBindingUtil.inflate(inflater,viewType,parent,false);
        return new Holder(binding);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Holder h=(Holder)holder;
        h.bind(objects.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        Metro metro = objects.get(position);
        if(metro instanceof Station){
            return R.layout.station_item;
        }else {
            return R.layout.line_item;
        }
    }

    @Override
    public int getItemCount() {
        return objects.size();
    }
}
