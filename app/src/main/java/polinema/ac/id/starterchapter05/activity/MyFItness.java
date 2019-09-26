package polinema.ac.id.starterchapter05.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragment.FragmentDIps;
import polinema.ac.id.starterchapter05.fragment.FragmentFitness;
import polinema.ac.id.starterchapter05.fragment.FragmentPushUp;

public class MyFItness extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_fitness);
    }

    public void handlerPushUp(View view) {
        FragmentPushUp checkVisible = (FragmentPushUp) getSupportFragmentManager().findFragmentByTag("FRAGMENT_PUSH_UP");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (checkVisible != null && checkVisible.isVisible() ){
//            fragmentTransaction.commit();
        }
        else {
//            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.myFitnessPlaceholder,new FragmentPushUp(),"FRAGMENT_PUSH_UP");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }

    }

    public void handlerHandStand(View view) {

        FragmentFitness checkVisible = (FragmentFitness) getSupportFragmentManager().findFragmentByTag("FRAGMENT_FITNESS");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (checkVisible != null && checkVisible.isVisible() ){
//            fragmentTransaction.commit();
        }
        else {
//            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.myFitnessPlaceholder,new FragmentFitness(),"FRAGMENT_FITNESS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerDips(View view) {

        FragmentDIps checkVisible = (FragmentDIps) getSupportFragmentManager().findFragmentByTag("FRAGMENT_DIPS");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (checkVisible != null && checkVisible.isVisible() ){
//            fragmentTransaction.commit();
        }
        else {
//            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.myFitnessPlaceholder,new FragmentDIps(),"FRAGMENT_DIPS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
