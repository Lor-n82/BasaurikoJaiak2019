package com.example.basaurikojaiak2019;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

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

        // Add a marker in Sydney and move the camera
        LatLng basauri = new LatLng(43.2370221, -2.8846411);

        LatLng alaiak = new LatLng(43.239052, -2.8830202);
        LatLng aldatxa = new LatLng(43.2305085, -2.9077631);
        LatLng basajaunak = new LatLng(43.2305085, -2.9077631);
        LatLng edurre = new LatLng(43.2305085, -2.9077631);
        LatLng hauspoak = new LatLng(43.239113, -2.8824882);
        LatLng itsaslapurrak = new LatLng(43.239113, -2.8824882);
        LatLng laguntasuna = new LatLng(43.2305085, -2.9077631);
        LatLng mozkorrak = new LatLng(43.2305085, -2.9077631);
        LatLng ogeta = new LatLng(43.2365634, -2.8921682);
        LatLng ontzak = new LatLng(43.2305085, -2.9077631);
        LatLng txano = new LatLng(43.2305085, -2.9077631);
        LatLng txikerrak = new LatLng(43.2305085, -2.9077631);
        LatLng urbiko = new LatLng(43.23756, -2.8915322);
        LatLng zigorrak = new LatLng(43.2305085, -2.9077631);
        LatLng zoroak = new LatLng(43.2305085, -2.9077631);

        mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.
                        fromResource(R.drawable.alaiakico)).anchor(1.0f,1.0f).position(alaiak).title("Alaiak"));
        ///mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.
        //                fromResource(R.drawable.alaiakico)).anchor(1.0f,1.0f).position(aldatxa).title(String.valueOf(R.string.Aldatxa)));
        //mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.
        //                fromResource(R.drawable.alaiakico)).anchor(1.0f,1.0f).position(basajaunak).title(String.valueOf(R.string.Basajaunak)));
       // mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.
        //                fromResource(R.drawable.alaiakico)).anchor(1.0f,1.0f).position(edurre).title(String.valueOf(R.string.Edurre)));
        mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.
                        fromResource(R.drawable.alaiakico)).anchor(1.0f,1.0f).position(hauspoak).title("Hauspoak"));
       // mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.
        //                fromResource(R.drawable.alaiakico)).anchor(1.0f,1.0f).position(itsaslapurrak).title(String.valueOf(R.string.Itsaslapurrak)));
        //mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.
        //                fromResource(R.drawable.alaiakico)).anchor(1.0f,1.0f).position(laguntasuna).title(String.valueOf(R.string.Laguntasuna)));
        //mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.
        //                fromResource(R.drawable.alaiakico)).anchor(1.0f,1.0f).position(mozkorrak).title(String.valueOf(R.string.Mozkorrak)));
        mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.
                fromResource(R.drawable.alaiakico)).anchor(1.0f,1.0f).position(ogeta).title("Ogeta Bat"));
        //mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.
        //                fromResource(R.drawable.alaiakico)).anchor(1.0f,1.0f).position(ontzak).title(String.valueOf(R.string.Ontzak)));
        //mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.
        //                fromResource(R.drawable.alaiakico)).anchor(1.0f,1.0f).position(txano).title(String.valueOf(R.string.Txano)));
        //mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.
        //                fromResource(R.drawable.alaiakico)).anchor(1.0f,1.0f).position(txikerrak).title(String.valueOf(R.string.Txikerrak)));
        mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.
                        fromResource(R.drawable.basajaico)).anchor(1.0f,1.0f).position(urbiko).title(String.valueOf("Urbiko Lagunak")));
        //mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.
        //                fromResource(R.drawable.alaiakico)).anchor(1.0f,1.0f).position(zigorrak).title(String.valueOf(R.string.Zigorrak)));
        //mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.
        //                fromResource(R.drawable.alaiakico)).anchor(1.0f,1.0f).position(zoroak).title(String.valueOf(R.string.Zoroak)));

        //mMap.moveCamera(CameraUpdateFactory.newLatLng(basauri));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(basauri,14));
    }
}
