package com.example.minhgiang.pet;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView navView;

    class C03971 implements OnNavigationItemSelectedListener {
        C03971() {
        }

        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment f = null;
            switch (item.getItemId()) {
                case C0310R.id.mni1:
                    f = new AccountFragment();
                    break;
                case C0310R.id.mni2:
                    f = new NewFeedsFragment();
                    break;
                case C0310R.id.mni3:
                    f = new MessengerFragment();
                    break;
            }
            if (f == null) {
                return false;
            }
            FragmentTransaction fragmentTransaction = MainActivity.this.getFragmentManager().beginTransaction();
            fragmentTransaction.replace(C0310R.id.frame, f);
            fragmentTransaction.commit();
            return true;
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0310R.layout.activity_main);
        this.navView = (BottomNavigationView) findViewById(C0310R.id.navView);
        this.navView.setSelectedItemId(C0310R.id.mni2);
        Fragment f = new NewFeedsFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(C0310R.id.frame, f);
        fragmentTransaction.commit();
        this.navView.setOnNavigationItemSelectedListener(new C03971());
    }
}
