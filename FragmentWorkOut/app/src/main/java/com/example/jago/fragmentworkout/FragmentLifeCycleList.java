package com.example.jago.fragmentworkout;


import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.app.Fragment;
import android.renderscript.Element;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentLifeCycleList extends ListFragment {

    //addign an interface to talk to the other activites
    static interface FragmentLifeCycleListener{
        void itemClicked(long id);
    }
    private FragmentLifeCycleListener listener;
    public FragmentLifeCycleList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[FragmentLifeCycle.lifeCycle.length];
        for(int i =0;i<names.length;i++){
            names[i]=FragmentLifeCycle.lifeCycle[i].getTitle();
        }
        //get access to the context via inflater, use the pre done layout to list items, and assign the array created above.
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(inflater.getContext(),android.R.layout.simple_list_item_1,names);
        setListAdapter(adapter);
        return super.onCreateView(inflater,container,savedInstanceState);
    }

    //when do we tell the fragment to be a listner, when it is attached, listen!


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.listener = (FragmentLifeCycleListener) activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if(listener!=null){listener.itemClicked(id);}
    }
}
