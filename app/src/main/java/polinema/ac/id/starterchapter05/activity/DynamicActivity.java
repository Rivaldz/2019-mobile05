package polinema.ac.id.starterchapter05.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragment.BlueFragment;
import polinema.ac.id.starterchapter05.fragment.RedFragment;

public class DynamicActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);
    }

    public void handleClickLoadRedFragment(View view) {

        RedFragment checkVisible = (RedFragment) getSupportFragmentManager().findFragmentByTag("RED_FRAGMENT");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (checkVisible != null && checkVisible.isVisible() ){
//            fragmentTransaction.commit();
        }
        else {
//            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new RedFragment(),"RED_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }


    }
    public void handleClickLoadBLueFragment(View view) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        BlueFragment checkVisible = (BlueFragment) getSupportFragmentManager().findFragmentByTag("BLUE_FRAGMENT");
        if (checkVisible != null && checkVisible.isVisible()){
//            fragmentTransaction.commit();

        }
        else {
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left, R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new BlueFragment(),"BLUE_FRAGMENT");
//            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.commit();
            fragmentTransaction.addToBackStack(null);

        }

    }
}
