package com.avenueinfotech.templesinnashik;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by suken on 17-01-2017.
 */

public class GmapFragment extends Fragment implements OnMapReadyCallback{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gmaps,container,false);
        return rootView;
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        MapFragment fragment = (MapFragment) getChildFragmentManager().findFragmentById(R.id.mapfragment);
//        fragment.getMapAsync(this);
        initMap();
    }

    private void initMap() {
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.mapfragment);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        LatLng marker = new LatLng(20.00829, 73.79319);

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(marker, 18));

        googleMap.addMarker(new MarkerOptions().title("Shree Kapaleshwer Mahadev Mandir").position(marker));

    }
}
