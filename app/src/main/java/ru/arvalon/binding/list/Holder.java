package ru.arvalon.binding.list;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import ru.arvalon.binding.BR;

/**
 * Created by arvalon on 29.01.2018.
 */

public class Holder extends RecyclerView.ViewHolder {

    private final ViewDataBinding binding;

    public Holder(ViewDataBinding binding) {
        super(binding.getRoot());
        this.binding=binding;
    }

    public void bind(Object obj){
        binding.setVariable(BR.obj,obj);
        binding.executePendingBindings();
    }
}
