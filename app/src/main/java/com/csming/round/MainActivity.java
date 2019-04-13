package com.csming.round;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.csming.roundtab.RoundTabBar;

public class MainActivity extends AppCompatActivity {

    private static final int ID_1 = 1;
    private static final int ID_2 = 2;
    private static final int ID_3 = 3;
    private static final int ID_4 = 4;
    private static final int ID_5 = 5;

    private RoundTabBar mRoundTabBar;
    private RoundTabBar mRoundTabBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRoundTabBar = findViewById(R.id.round_tabbar);
        mRoundTabBar.add(new RoundTabBar.Item(ID_1, R.color.test1, "Item 1"));
        mRoundTabBar.add(new RoundTabBar.Item(ID_2, R.color.test2, "Item 2"));
        mRoundTabBar.add(new RoundTabBar.Item(ID_3, R.color.test3, "Item 3"));
        mRoundTabBar.add(new RoundTabBar.Item(ID_4, R.color.test4, "Item 4"));
        mRoundTabBar.add(new RoundTabBar.Item(ID_5, R.color.test5, "Item 5"));

        mRoundTabBar.setSelectedItem(2);

        mRoundTabBar2 = findViewById(R.id.round_tabbar2);
        mRoundTabBar2.add(new RoundTabBar.Item(ID_1, R.color.test6, "Item 1", R.color.color_black));
        mRoundTabBar2.add(new RoundTabBar.Item(ID_2, R.color.test6, "Item 2", R.color.color_black));
        mRoundTabBar2.add(new RoundTabBar.Item(ID_2, R.color.test6, "Item 2", R.color.color_black));

        mRoundTabBar2.setSelectedItem(0);
    }
}
