package com.example.baitapbuoi7.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.baitapbuoi7.Fragment.Login;
import com.example.baitapbuoi7.Fragment.Register;
import com.example.baitapbuoi7.LoginSignUp;

public class LoginSignUpAdapter extends FragmentPagerAdapter {
    private Context context;
    private int totalTab;


    public LoginSignUpAdapter(@NonNull FragmentManager fm, Context context, int totalTab) {
        super(fm);
        this.context = context;
        this.totalTab = totalTab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new Login();
        } else {
            return new Register();
        }

    }

    @Override
    public int getCount() {
        return totalTab;
    }
}
