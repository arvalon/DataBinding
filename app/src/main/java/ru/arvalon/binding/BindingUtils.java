package ru.arvalon.binding;

import androidx.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by arvalon on 29.01.2018.
 */

public class BindingUtils {

    @BindingAdapter(value={"src","error"},requireAll=false)
    public static void loadImage(ImageView view, String url, Drawable error){
        if (view!=null){
            Picasso.with(view.getContext()).load(url).fit().centerCrop().error(error).into(view);
        }
    }
}
