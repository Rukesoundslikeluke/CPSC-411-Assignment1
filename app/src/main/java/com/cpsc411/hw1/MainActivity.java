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
        ViewGroup.LayoutParams MW = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        ViewGroup.LayoutParams WW = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        //Main wrapping grid
        GridLayout root = new GridLayout(this);
        root.setOrientation(GridLayout.VERTICAL);
        root.setLayoutParams(WW);
        root.setColumnCount(5);
        root.setRowCount(11);



        //Column 1
        for (int i=1;i<12;i++){
            TextView x = new TextView(this);
            x.setText(java.lang.Integer.toString(i));
            x.setBackgroundColor(Color.GRAY);
            x.setGravity(Gravity.CENTER);
            x.setMinWidth(70);
            x.setBackground(getDrawable(R.drawable.thin_border));
            root.addView(x);
        }
    //Title bar
        GridLayout.LayoutParams gParams = new GridLayout.LayoutParams(
                GridLayout.spec(0),
                GridLayout.spec(1,4,ViewGroup.LayoutParams.MATCH_PARENT)
        );
        TextView title = new TextView(this);
        title.setBackgroundColor(Color.BLACK);
        title.setTextColor(Color.WHITE);
        title.setText("Rules void hello1(int hour)");
        title.setGravity(Gravity.CENTER);
        title.setLayoutParams(gParams);
        root.addView(title);

    //Column 2
        int col2width = 250;

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

    //Column 3
        int col3width = 500;
        
        TextView col3txt = new TextView(this);
        col3txt.setText("name");
        col3txt.setGravity(Gravity.CENTER);
        col3txt.setMinWidth(col3width);
        col3txt.setBackground(getDrawable(R.drawable.thick_border));
        col3txt.setLayoutParams(gParams);
        root.addView(col3txt);





        //Adding to main grid view group "root" in order of column

        setContentView(root);


    }

}
