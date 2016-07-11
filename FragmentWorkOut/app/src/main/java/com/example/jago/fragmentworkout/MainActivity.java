package com.example.jago.fragmentworkout;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements FragmentLifeCycleList.FragmentLifeCycleListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ger references to fragments via fragment manager, to talk to fragment
       // fragmentLifeDetail1 frag = (fragmentLifeDetail1) getFragmentManager().findFragmentById(R.id.detail_frag);
        //frag.setActivityId(1);
    }

    @Override
    public void itemClicked(long id) {
        View fragContainer = findViewById(R.id.fragment_container);
        if(fragContainer!=null) {
            fragmentLifeDetail1 fragment = new fragmentLifeDetail1();
            //get fragmenttransation from fragment manager
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            fragment.setActivityId(id);
            //now for the actions in the transaction. replace method repalcs es the fratment
            transaction.replace(R.id.fragment_container, fragment);
            ///add the fragment to the backstack
            transaction.addToBackStack(null);

            //what kind of transition animation do you want
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            //commit the transaction.
            transaction.commit();
        }

        //if the framelayout is not there, then it must be running on the iphone.
        //start intent and pass it the id via putextra

        else{
            Intent intent = new Intent(this, DescriptionActivity.class);
            intent.putExtra(DescriptionActivity.lose, (int)id);
                    startActivity(intent);

        }
    }
}
