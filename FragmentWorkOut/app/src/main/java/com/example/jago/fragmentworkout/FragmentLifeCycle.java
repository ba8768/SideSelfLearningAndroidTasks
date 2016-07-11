package com.example.jago.fragmentworkout;

/**
 * Created by JaGo on 7/10/16.
 */
public class FragmentLifeCycle {



    //class variables
    private String title;
    private String description;

    //constructor
    private FragmentLifeCycle(String title, String description){
        this.title = title;
        this.description= description;

    }

    public static final FragmentLifeCycle[] lifeCycle = {
            new FragmentLifeCycle("onAttach()", "Happens when the fragment is associated with an activity. "),
            new FragmentLifeCycle("onCreate()", "Used to do the initial setup of the fragment. "),
            new FragmentLifeCycle("onCreateView()", "Use the layout inflater to create their view at this stage. "),
            new FragmentLifeCycle("onActivityCreated()", "Method is called when on create() method of the activity has completed. "),
            new FragmentLifeCycle("onStart()", "this method is called when the fragment is about to become visible "),
            new FragmentLifeCycle("onResume()", "fragment is visible and activity running. "),
            new FragmentLifeCycle("onPause()", "called when fragment is no longer interacting with the users "),
            new FragmentLifeCycle("onStop()", "called when the fragment is no longer visible to the user. "),
            new FragmentLifeCycle("onDestroyView()", "gives the fragment the chance to clear away any resources that were assocaited with its view "),
            new FragmentLifeCycle("onDestroy()", "fragment can clear away any other resources it created "),
            new FragmentLifeCycle("onDetach()", "fragment loses contact with the activity. ")

    };



    //getters and setters for the class

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
