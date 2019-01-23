package ru.arvalon.binding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import ru.arvalon.binding.databinding.ActivityMainBinding;
import ru.arvalon.binding.list.MetroAdapter;
import ru.arvalon.binding.model.Line;
import ru.arvalon.binding.model.Metro;
import ru.arvalon.binding.model.Station;

/**
 * Data Binding
 */
public class MainActivity extends AppCompatActivity {

    private User user = new User("Mikhail","Svetlov");

    private String src="http://developer.alexanderklimov.ru/android/library/picasso-cat2.jpg";

    private Presenter presenter = new Presenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(
                this,R.layout.activity_main);

        binding.setPresenter(presenter);
        binding.setUser(user);
        binding.setSrc(src);

        List<Metro> objects = new ArrayList<>();

        objects.add(new Station("one"));
        objects.add(new Station("two"));
        objects.add(new Line("line"));

        binding.list.setAdapter(new MetroAdapter(objects));
        binding.list.setLayoutManager(new LinearLayoutManager(this));

    }

    public void changeUser(View view) {
        user.setFirstName("rrr");
    }
}
