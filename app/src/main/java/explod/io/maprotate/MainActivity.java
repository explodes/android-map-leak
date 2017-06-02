package explod.io.maprotate;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String TAG_MAP = "map";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate() called with: savedInstanceState = [" + savedInstanceState + "]");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            MapFragment frag = new MapFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, frag, TAG_MAP)
                    .commit();
        }

    }

    public static class MapFragment extends SupportMapFragment implements OnMapReadyCallback {

        private static final String TAG = MapFragment.class.getSimpleName();

        @Override
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setRetainInstance(true);
        }

        @Override
        public void onResume() {
            super.onResume();
            getMapAsync(this);
        }

        @Override
        public void onMapReady(@NonNull GoogleMap googleMap) {
            Log.d(TAG, "onMapReady() called with: googleMap = [" + googleMap + "]");
        }

    }

}
