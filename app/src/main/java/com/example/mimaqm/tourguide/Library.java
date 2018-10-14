package com.example.mimaqm.tourguide;

import android.content.Context;

import java.util.ArrayList;

public class Library {

    private ArrayList<Location> locations;

    public Library(){
        this.locations = makeLocations();
    }


    public Location getSpecificLocation(String title){
        Location location = null;
        for (int i = 0; i < locations.size(); i++)
        {
            if(locations.get(i).getTitle().equals(title)){
                location = locations.get(i);
                break;
            }
        }
        return location;
    }

    public ArrayList<Location> getLocations(){
        return locations;
    }

    private ArrayList<Location> makeLocations(){
        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location("Museum","VDMA gedbouw", "A museum in Eindhoven, whose purpose I am not sure about, yet", "Vestdijk 31T, 5611 CA Eindhoven"));
        locations.add(new Location("Museum","The Philips Museum", "Museum on company's history and products", "Emmasingel 31, 5611 AZ Eindhoven", R.drawable.museum_philips));
        locations.add(new Location("Museum","Van Abbe Museum", "Museum with Contemporary and experimental art, installations & photo", "Bilderdijklaan 10, 5611 NH Eindhoven"));
        locations.add(new Location("Museum","The PSV Museum", "Museum of the PSV Eindhoven home ground", "Stadionplein 4, 5616 RX Eindhoven", R.drawable.museum_psv));

        locations.add(new Location("Restaurant", "Berlage Kitchen And Bar", "A nice and cosy restaurant", "Kleine Berg 16, 5611 JV Eindhoven", R.drawable.restaurant_berlage));
        locations.add(new Location("Restaurant", "Restaurant Wiesen", "A nice restaurant near the center", "Kleine Berg 10, 5611 JV Eindhoven"));
        locations.add(new Location("Restaurant", "Lithos Grieks Specialiteiten Restaurant", "A nice greek restaurant near the cnter", "Kerkstraat 40, 5611 GK Eindhoven", R.drawable.restaurant_lithos));
        locations.add(new Location("Restaurant", "Zarzo", "A cosy restaurant near the center", "Bleekweg 7, 5611 EZ Eindhoven"));

        locations.add(new Location("Relaxation", "Nada Thaise massage", "Thai Massage Therapist", "Grote Berg85 5611 KJ Eindhoven"));
        locations.add(new Location("Relaxation", "Hilversum massage", "Relaxation massage and sports massage", "Mozartlaan 25, 1217 CM Hilversum", R.drawable.relaxation_hilversum));
        locations.add(new Location("Relaxation", "Glamour Studio", "Hair Salon", "Grote Berg 31, 5611 KH Eindhoven"));
        locations.add(new Location("Relaxation", "Agua - Spa, Health & Beauty", "Spa and Health Club", "Wilhelminaplein 17, 5611 HG Eindoven", R.drawable.relaxation_aqua));

        locations.add(new Location("Mall", "Piazza", "The Piazza shopping mall in the centre of Eindhoven", "5611 AE Eindhoven", R.drawable.mall_piazza));
        locations.add(new Location("Mall", "Admirant Shopping", "The Admirant shopping mall in the centre of Eindhoven", "Nieuwe Emmasingel 54, 5611 AM Eindhoven"));
        locations.add(new Location("Mall", "Heuvel Eindhoven Mall", "The Heuvel Eindhoven shopping mall in the centre of Eindhoven", "Heuvel Galerie 241, 5611 DK Eindhoven", R.drawable.mall_heuvel));
        locations.add(new Location("Mall", "Eindhoven Parkhaus", "The Eindhoven Parkhaus shopping mall in the centre of Eindhoven", "31153, AZ, Emmasingel, 5611 AM Eindhoven"));

        return locations;
    }

    public class Location{

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

        public String getType(){
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
