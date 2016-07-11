package com.example.jago.fragmentworkout;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragmentLifeDetail1 extends Fragment {
    private long activtyId;


    public fragmentLifeDetail1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //get the saved variables back;
        if(savedInstanceState!=null){
            activtyId=savedInstanceState.getLong("activityId");

        }
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_life_cycle_detail1, container, false);
    }
    public void setActivityId(long id){
        this.activtyId=id;
    }


    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if(view!=null){
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            FragmentLifeCycle fragmentLifeCycle = FragmentLifeCycle.lifeCycle[(int)activtyId];
            title.setText(fragmentLifeCycle.getTitle());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(fragmentLifeCycle.getDescription());
        }
    }

    //save variables status.
    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putLong("activityId", activtyId);
        super.onSaveInstanceState(outState);
    }
}
