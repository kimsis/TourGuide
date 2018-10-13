package com.example.mimaqm.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Library.Location> {

    View.OnClickListener mLocationOnClickListener;
    //View.OnClickListener mInfoOnClickListener;
    //This is commented out because I would like to add a few more features in this app at a later date and I don't want to forget about it

    public ItemAdapter(Context context, ArrayList<Library.Location> tourItemArrayList, View.OnClickListener locationOnClickListener) {
        super(context, 0, tourItemArrayList);
        this.mLocationOnClickListener = locationOnClickListener;
        //this.mInfoOnClickListener = infoOnClickListener;
        //This is commented out because I would like to add a few more features in this app at a later date and I don't want to forget about it
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Library.Location locationForDisplay = getItem(position);
        if (locationForDisplay.getImageResource() != 0)
        viewHolder.image.setImageResource(locationForDisplay.getImageResource());
        viewHolder.title.setText(locationForDisplay.getTitle());
        viewHolder.description.setText(locationForDisplay.getDescription());
        //viewHolder.description.setOnClickListener(mInfoOnClickListener);
        //viewHolder.description.setTag(locationForDisplay);
        //This is commented out because I would like to add a few more features in this app at a later date and I don't want to forget about it
        viewHolder.location.setTag(locationForDisplay);
        viewHolder.location.setText(locationForDisplay.getLocation());
        viewHolder.location.setOnClickListener(mLocationOnClickListener);

        return convertView;
    }

    public class ViewHolder{
        final ImageView image;
        final TextView title;
        final TextView description;
        final TextView location;

        ViewHolder(View view){
            this.image = view.findViewById(R.id.item_image);
            this.title = view.findViewById(R.id.item_title);
            this.description = view.findViewById(R.id.item_description);
            this.location = view.findViewById(R.id.item_location);
        }
    }
}
