package com.example.mimaqm.tourguide;

import android.content.res.Resources;

import java.util.ArrayList;

public class Library {

    private ArrayList<Location> locations;

    public Library() {
        this.locations = makeLocations();
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    private ArrayList<Location> makeLocations() {
        ArrayList<Location> locations = new ArrayList<>();
        Resources r = App.getContext().getResources();
        String type = r.getString(R.string.museum);

        locations.add(new Location(type, r.getString(R.string.vdma_title), r.getString(R.string.vdma_description), r.getString(R.string.vdma_location)));
        locations.add(new Location(type, r.getString(R.string.philips_title), r.getString(R.string.philips_description), r.getString(R.string.philips_location), R.drawable.museum_philips));
        locations.add(new Location(type, r.getString(R.string.vam_title), r.getString(R.string.vam_description), r.getString(R.string.vam_location)));
        locations.add(new Location(type, r.getString(R.string.psv_title), r.getString(R.string.psv_description), r.getString(R.string.psv_location), R.drawable.museum_psv));

        type = r.getString(R.string.restaurant);

        locations.add(new Location(type, r.getString(R.string.berlage_title), r.getString(R.string.berlage_description), r.getString(R.string.berlage_location), R.drawable.restaurant_berlage));
        locations.add(new Location(type, r.getString(R.string.wiesen_title), r.getString(R.string.wiesen_description), r.getString(R.string.wiesen_location)));
        locations.add(new Location(type, r.getString(R.string.lithos_title), r.getString(R.string.lithos_description), r.getString(R.string.lithos_location), R.drawable.restaurant_lithos));
        locations.add(new Location(type, r.getString(R.string.zarzo_title), r.getString(R.string.zarzo_description), r.getString(R.string.zarzo_location)));

        type = r.getString(R.string.relaxation);

        locations.add(new Location(type, r.getString(R.string.nada_title), r.getString(R.string.nada_description), r.getString(R.string.nada_location)));
        locations.add(new Location(type, r.getString(R.string.hilversum_title), r.getString(R.string.hilversum_description), r.getString(R.string.hilversum_location), R.drawable.relaxation_hilversum));
        locations.add(new Location(type, r.getString(R.string.glamour_title), r.getString(R.string.glamour_description), r.getString(R.string.glamour_location)));
        locations.add(new Location(type, r.getString(R.string.aqua_title), r.getString(R.string.aqua_description), r.getString(R.string.aqua_location), R.drawable.relaxation_aqua));

        type = r.getString(R.string.mall);

        locations.add(new Location(type, r.getString(R.string.piazza_title), r.getString(R.string.piazza_description), r.getString(R.string.piazza_location), R.drawable.mall_piazza));
        locations.add(new Location(type, r.getString(R.string.admirant_title), r.getString(R.string.admirant_description), r.getString(R.string.admirant_location)));
        locations.add(new Location(type, r.getString(R.string.heuvel_title), r.getString(R.string.heuvel_description), r.getString(R.string.heuvel_location), R.drawable.mall_heuvel));
        locations.add(new Location(type, r.getString(R.string.parkhaus_title), r.getString(R.string.parkhaus_description), r.getString(R.string.parkhaus_location)));

        return locations;
    }

    public class Location {

        private String mType;
        private String mTitle;
        private String mDescription;
        private String mLocation;
        private int mImageResource;

        public Location(String type, String title, String description, String location, int imageResource) {
            this.mType = type;
            this.mTitle = title;
            this.mDescription = description;
            this.mLocation = location;
            this.mImageResource = imageResource;
        }

        public Location(String type, String title, String description, String location) {
            this.mType = type;
            this.mTitle = title;
            this.mDescription = description;
            this.mLocation = location;
        }

        public String getType() {
            return mType;
        }

        public String getTitle() {
            return mTitle;
        }

        public String getDescription() {
            return mDescription;
        }

        public String getLocation() {
            return mLocation;
        }

        public int getImageResource() {
            return mImageResource;
        }
    }

}
