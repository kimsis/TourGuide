package com.example.mimaqm.tourguide;


import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RelaxationFragment extends Fragment {

    Library library;
    Context context;
    ListView listView;

    public RelaxationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_relaxation, container, false);
        context = rootView.getContext();
        library = new Library();
        listView = rootView.findViewById(R.id.relaxation_list_view);

        locationPopulation();
        return rootView;
    }

    public void locationPopulation(){

        ArrayList<Library.Location> locations = new ArrayList<>();
        for (Library.Location item : library.getLocations()) {
            if(item.getType().equals("Relaxation"))
            {
                locations.add(item);
            }
        }
        final ItemAdapter adapter;
        View.OnClickListener locationOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Library.Location location = (Library.Location) view.getTag();
                String uriLocation = location.getTitle() + ", " + location.getLocation();
                Uri uri = Uri.parse("https://www.google.com/maps/search/?api=1&query=" + uriLocation.replaceAll("\\p{Z}","+"));
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(uri);
                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        };
        adapter = new ItemAdapter(context, locations,locationOnClickListener);
        listView.setAdapter(adapter);
    }
}
