package polinema.ac.id.starterchapter05.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import polinema.ac.id.starterchapter05.R;

public class RedFragment extends Fragment {

//    static boolean activityRed = false;
    public RedFragment() {
        // Required empty public constructor
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
    }

    @Override
    public boolean getUserVisibleHint() {
        return super.getUserVisibleHint();
    }
    //    @Override
//    public void onStart() {
//        super.onStart();
//        activityRed = true;
//    }
//
//    @Override
//    public void onStop() {
//        super.onStop();
//        activityRed = false;
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_red, container, false);
    }
}





