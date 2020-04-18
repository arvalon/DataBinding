package ru.arvalon.binding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

/**
 * Created by arvalon on 30.01.2018.
 */

public class Echo extends BaseObservable {
    private String name;

    public Echo(String name) {
        this.name = name;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
}
