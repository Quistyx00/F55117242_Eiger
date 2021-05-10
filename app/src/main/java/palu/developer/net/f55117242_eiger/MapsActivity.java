package palu.developer.net.f55117242_eiger;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        MarkerOptions marker1 = new MarkerOptions();
        MarkerOptions marker2 = new MarkerOptions();

        LatLng jalan1 = new LatLng(-0.8866546361151694, 119.86873143632623);
        LatLng jalan2 = new LatLng(-0.8862030710817784, 119.86886353152786);
        LatLng jalan3 = new LatLng(-0.8856607059945774, 119.86912526345569);
        LatLng jalan4 = new LatLng(-0.8868442484250193, 119.87109302973212);
        LatLng jalan5 = new LatLng(-0.8870318388280022, 119.87156009253941);
        LatLng rumahku = new LatLng(-0.886664, 119.868642);
        mMap.addMarker(new MarkerOptions().position(rumahku).title("Lokasi saya").icon(BitmapDescriptorFactory.fromResource(R.drawable.homme)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rumahku,17f));

        LatLng eiger = new LatLng(-0.8871279827296014, 119.87159015533499);
        mMap.addMarker(new MarkerOptions().position(eiger).title("TOKO EIGER").icon(BitmapDescriptorFactory.fromResource(R.drawable.eiger)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(eiger));

        PolylineOptions jalur = new PolylineOptions()
                .add(jalan1).add(jalan2).add(jalan3)
                .add(jalan4).add(jalan5);
        Polyline garisjalan = googleMap.addPolyline(jalur);
    }
}