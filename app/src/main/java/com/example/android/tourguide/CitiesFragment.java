package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

    /**
     * {@link Fragment} that displays a list of attractions.
     */
    public class CitiesFragment extends Fragment {


        public CitiesFragment() {
            // Required empty public constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_attractions_list, container, false);

            // Create a list of attractions
            final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
            attractions.add(new Attraction(R.string.bucharest, R.string.bucharest_description, R.drawable.bucharest));
            attractions.add(new Attraction(R.string.cluj_napoca, R.string.cluj_napoca_description, R.drawable.cluj));
            attractions.add(new Attraction(R.string.timisoara, R.string.timisoara_description, R.drawable.timisoara));
            attractions.add(new Attraction(R.string.iasi, R.string.iasi_description, R.drawable.iasi));
            attractions.add(new Attraction(R.string.constanta, R.string.constanta_description, R.drawable.constanta));
            attractions.add(new Attraction(R.string.brasov, R.string.brasov_description, R.drawable.brasov));
            attractions.add(new Attraction(R.string.sibiu, R.string.sibiu_description, R.drawable.sibiu));
            attractions.add(new Attraction(R.string.targu_mures, R.string.targu_mures_description, R.drawable.targu_mures));
            attractions.add(new Attraction(R.string.alba_iulia, R.string.alba_iulia_description, R.drawable.alba_iulia));
            attractions.add(new Attraction(R.string.suceava, R.string.suceava_description, R.drawable.suceava));
            attractions.add(new Attraction(R.string.sighisoara, R.string.sighisoara_description, R.drawable.sighisoara));
            attractions.add(new Attraction(R.string.targu_jiu, R.string.targu_jiu_description, R.drawable.targu_jiu));

            // Create an {@link WordAdapter}, whose data source is a list of {@link Attraction}s. The
            // adapter knows how to create list items for each item in the list.
            AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_cities);

            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // fragment_attractions_list.xml layout file.
            ListView listView = (ListView) rootView.findViewById(R.id.list);

            // Make the {@link ListView} use the {@link PagerAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link Attraction} in the list.
            listView.setAdapter(adapter);

            return rootView;
        }
    }


