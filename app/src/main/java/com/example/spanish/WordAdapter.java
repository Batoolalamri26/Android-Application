package com.example.spanish;

import android.content.Context;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ImageView;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context,0, words);
    }


    @Override public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView spanishTextView = (TextView) listItemView.findViewById(R.id.spanish_text_view);
        spanishTextView.setText(currentWord.getspanishTranslation());


        TextView numberTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        numberTextView.setText(currentWord.getDefaultTranslation());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.Images);
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }


}
