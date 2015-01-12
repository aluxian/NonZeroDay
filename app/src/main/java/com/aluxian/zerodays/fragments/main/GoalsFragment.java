package com.aluxian.zerodays.fragments.main;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.aluxian.zerodays.R;
import com.aluxian.zerodays.db.DayGoal;
import com.aluxian.zerodays.db.YearGoal;

public class GoalsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_goals, container, false);

        TextView yearGoal = (TextView) rootView.findViewById(R.id.text_goal_year);
        TextView dayGoal = (TextView) rootView.findViewById(R.id.text_goal_today);

        yearGoal.setText(YearGoal.getForThisYear().description);
        dayGoal.setText(DayGoal.getForToday().description);

        return rootView;
    }

}
