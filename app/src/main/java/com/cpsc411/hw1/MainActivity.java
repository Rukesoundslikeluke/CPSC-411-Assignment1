package com.cpsc411.hw1;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);

        //Layout types
        ViewGroup.LayoutParams WW = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        //Main wrapping grid  5x11 cells
        GridLayout root = new GridLayout(this);
        root.setOrientation(GridLayout.VERTICAL);
        root.setLayoutParams(WW);
        root.setColumnCount(5);
        root.setRowCount(11);

        //Column widths

        int col1width = 60;
        int col2width = 225;
        int col3width = 470; // handles 3 and 4
        int col5width = 670;
        int titleWidth = col2width + col3width + col5width;

    //Column 1 + title
        for (int i=1;i<12;i++){
            TextView x = new TextView(this);
            x.setText(java.lang.Integer.toString(i));
            x.setBackgroundColor(Color.GRAY);
            x.setGravity(Gravity.CENTER);
            x.setMinWidth(col1width);
            x.setBackground(getDrawable(R.drawable.thin_border));
            root.addView(x);
        }
        //Title bar
        GridLayout.LayoutParams gParams = new GridLayout.LayoutParams(
                GridLayout.spec(0),
                GridLayout.spec(1,4)
        );
        TextView title = new TextView(this);
        title.setBackgroundColor(Color.BLACK);
        title.setTextColor(Color.WHITE);
        title.setMinWidth(titleWidth);
        title.setText("Rules void hello1(int hour)");
        title.setGravity(Gravity.CENTER);
        title.setLayoutParams(gParams);
        root.addView(title);

    //Column 2
        //Grid for column 2
        GridLayout col2 = new GridLayout(this);
        col2.setOrientation(GridLayout.VERTICAL);
        col2.setBackground(getDrawable(R.drawable.thick_border));

        //properties
        gParams = new GridLayout.LayoutParams(
                GridLayout.spec(1,2,ViewGroup.LayoutParams.MATCH_PARENT),
                GridLayout.spec(1)
        );
        TextView col2txt = new TextView(this);
        col2txt.setText("properties");
        col2txt.setGravity(Gravity.CENTER);
        col2txt.setBackground(getDrawable(R.drawable.thick_border));
        col2txt.setMinWidth(col2width);
        col2txt.setMinHeight(100);
        col2txt.setLayoutParams(gParams);
        root.addView(col2txt);

        //Rule
        col2txt = new TextView(this);
        col2txt.setText("Rule");
        col2txt.setGravity(Gravity.CENTER);
        col2txt.setBackground(getDrawable(R.drawable.thick_border_cyan));
        col2txt.setMinWidth(col2width);
        col2txt.setTypeface(null, Typeface.BOLD);
        root.addView(col2txt);

        //Empty Cells
        for (int i = 0;i<2;++i){
            col2txt = new TextView(this);
            col2txt.setBackground(getDrawable(R.drawable.thick_border_cyan));
            col2txt.setMinWidth(col2width);
            root.addView(col2txt);
        }

        //Rule 2
        col2txt = new TextView(this);
        col2txt.setText("Rule");
        col2txt.setPadding(10,0,0,0);
        col2txt.setBackground(getDrawable(R.drawable.thick_border));
        col2txt.setMinWidth(col2width);
        col2txt.setTypeface(null, Typeface.BOLD);
        root.addView(col2txt);

        //R10-40
        for (int i = 10;i<50;i= i+10){
            col2txt = new TextView(this);
            col2txt.setText("R" + i);
            col2txt.setPadding(10,0,0,0);
            col2txt.setBackground(getDrawable(R.drawable.thick_border));
            col2txt.setMinWidth(col2width);
            root.addView(col2txt);
        }

    //Column 3 + 4
        gParams = new GridLayout.LayoutParams(
                GridLayout.spec(1),
                GridLayout.spec(2,2)
        );
        TextView col3txt = new TextView(this);
        col3txt.setText("name");
        col3txt.setGravity(Gravity.CENTER);
        col3txt.setMinWidth(col3width);
        col3txt.setBackground(getDrawable(R.drawable.thick_border));
        col3txt.setLayoutParams(gParams);
        root.addView(col3txt);

        gParams = new GridLayout.LayoutParams(
                GridLayout.spec(2),
                GridLayout.spec(2,2)
        );
        col3txt = new TextView(this);
        col3txt.setText("category");
        col3txt.setGravity(Gravity.CENTER);
        col3txt.setMinWidth(col3width);
        col3txt.setBackground(getDrawable(R.drawable.thick_border));
        col3txt.setLayoutParams(gParams);
        root.addView(col3txt);

        gParams = new GridLayout.LayoutParams(
                GridLayout.spec(3),
                GridLayout.spec(2,2)
        );
        col3txt = new TextView(this);
        col3txt.setText("C1");
        col3txt.setGravity(Gravity.CENTER);
        col3txt.setMinWidth(col3width);
        col3txt.setTypeface(null, Typeface.BOLD);
        col3txt.setBackground(getDrawable(R.drawable.thick_border_cyan));
        col3txt.setLayoutParams(gParams);
        root.addView(col3txt);

        gParams = new GridLayout.LayoutParams(
                GridLayout.spec(4),
                GridLayout.spec(2,2)
        );
        col3txt = new TextView(this);
        col3txt.setText("min <= hour && hour <= max");
        col3txt.setGravity(Gravity.CENTER);
        col3txt.setMinWidth(col3width);
        col3txt.setBackground(getDrawable(R.drawable.thick_border_cyan));
        col3txt.setLayoutParams(gParams);
        root.addView(col3txt);

    //col 3
        gParams = new GridLayout.LayoutParams(
                GridLayout.spec(5),
                GridLayout.spec(2,1)
        );
        col3txt = new TextView(this);
        col3txt.setText("int min");
        col3txt.setGravity(Gravity.CENTER);
        col3txt.setMinWidth(col3width/2);
        col3txt.setBackground(getDrawable(R.drawable.thick_border_cyan));
        col3txt.setLayoutParams(gParams);
        root.addView(col3txt);

        col3txt = new TextView(this);
        col3txt.setText("From");
        col3txt.setPadding(10,0,0,0);
        col3txt.setMinWidth(col3width/2);
        col3txt.setTypeface(null, Typeface.BOLD);
        col3txt.setBackground(getDrawable(R.drawable.thick_border_yellow));
        root.addView(col3txt);

        //Array of str numbers to populate cells
        String[] nums = {"0","12","18","22","11","17","21","23"};
        for (int i=0;i<4;++i){
            col3txt = new TextView(this);
            col3txt.setText(nums[i]);
            col3txt.setGravity(Gravity.RIGHT);
            col3txt.setPadding(0,0,10,0);
            col3txt.setMinWidth(col3width/2);
            col3txt.setBackground(getDrawable(R.drawable.thick_border_yellow));
            root.addView(col3txt);
        }

        //col 4
        gParams = new GridLayout.LayoutParams(
                GridLayout.spec(5),
                GridLayout.spec(3)
        );
        col3txt = new TextView(this);
        col3txt.setText("int max");
        col3txt.setGravity(Gravity.CENTER);
        col3txt.setMinWidth(col3width/2);
        col3txt.setBackground(getDrawable(R.drawable.thick_border_cyan));
        col3txt.setLayoutParams(gParams);
        root.addView(col3txt);

        col3txt = new TextView(this);
        col3txt.setText("To");
        col3txt.setPadding(10,0,0,0);
        col3txt.setMinWidth(col3width/2);
        col3txt.setTypeface(null, Typeface.BOLD);
        col3txt.setBackground(getDrawable(R.drawable.thick_border_yellow));
        root.addView(col3txt);

        for (int i=4;i<8;++i){
            col3txt = new TextView(this);
            col3txt.setText(nums[i]);
            col3txt.setGravity(Gravity.RIGHT);
            col3txt.setPadding(0,0,10,0);
            col3txt.setMinWidth(col3width/2);
            col3txt.setBackground(getDrawable(R.drawable.thick_border_yellow));
            root.addView(col3txt);
        }

        //Column 5


        TextView col5txt = new TextView(this);
        col5txt.setText("Day Hour Classification");
        col5txt.setBackground(getDrawable(R.drawable.thick_border));
        col5txt.setPadding(10,0,0,0);
        col5txt.setMinWidth(col5width);
        root.addView(col5txt);

        col5txt = new TextView(this);
        col5txt.setText("Day and Time");
        col5txt.setBackground(getDrawable(R.drawable.thick_border));
        col5txt.setPadding(10,0,0,0);
        col5txt.setMinWidth(col5width);
        root.addView(col5txt);

        col5txt = new TextView(this);
        col5txt.setText("A1");
        col5txt.setBackground(getDrawable(R.drawable.thick_border_cyan));
        col5txt.setGravity(Gravity.CENTER);
        col5txt.setTypeface(null, Typeface.BOLD);
        col5txt.setMinWidth(col5width);
        root.addView(col5txt);

        col5txt = new TextView(this);
        col5txt.setText("System.out.println(greeting + \",World!\"");
        col5txt.setBackground(getDrawable(R.drawable.thick_border_cyan));
        col5txt.setGravity(Gravity.CENTER);
        col5txt.setMinWidth(col5width);
        root.addView(col5txt);

        col5txt = new TextView(this);
        col5txt.setText("String greeting");
        col5txt.setBackground(getDrawable(R.drawable.thick_border_cyan));
        col5txt.setGravity(Gravity.CENTER);
        col5txt.setMinWidth(col5width);
        root.addView(col5txt);

        col5txt = new TextView(this);
        col5txt.setText("Greeting");
        col5txt.setBackground(getDrawable(R.drawable.thick_border_orange));
        col5txt.setTypeface(null, Typeface.BOLD);
        col5txt.setPadding(10,0,0,0);
        col5txt.setMinWidth(col5width);
        root.addView(col5txt);

        String[] phrases = {"Good Morning","Good Afternoon","Good Evening","Good Night"};
        for (String x :phrases) {
            col5txt = new TextView(this);
            col5txt.setText(x);
            col5txt.setBackground(getDrawable(R.drawable.thick_border_orange));
            col5txt.setPadding(10, 0, 0, 0);
            col5txt.setMinWidth(col5width);
            root.addView(col5txt);
        }

        setContentView(root);
    }

}