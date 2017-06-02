package explod.io.maprotate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.SupportMapFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            SupportMapFragment map = new SupportMapFragment();
            map.setRetainInstance(true);
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, map)
                    .commit();
        }

    }

}
