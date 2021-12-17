package com.bb.polantassigap_new;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.qhutch.bottomsheetlayout.BottomSheetLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomSheetLayout layout = findViewById(R.id.bottom_sheet_layout);
//        layout.toggle(); //collapses or expands the view according to the current state
//        layout.collapse(); //collapses the view
//        layout.expand(); //expands the view
        layout.isExpended(); //return true if the view is expanded
        layout.isHovered();

        layout.setOnProgressListener(this::rotateArrow);
    }

    private void rotateArrow(float progress) {
    }

}