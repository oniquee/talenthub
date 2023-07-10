package com.example.projecttalenthub4_2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.projecttalenthub4_2.fragments.AFragment;
import com.example.projecttalenthub4_2.fragments.BFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new AFragment();
            case 1:
                return new BFragment();
            default:
                return new AFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
