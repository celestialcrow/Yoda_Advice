package com.example.celestecrowder.yodaadvice;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.duration;
import static com.example.celestecrowder.yodaadvice.R.id.select_issue;

public class Spinner extends Activity implements AdapterView.OnItemSelectedListener {


public void onItemSelected(AdapterView<?> parent, View view,
                              int pos, long id) {
    // An item was selected. You can retrieve the selected item using
        //parent.OnItemSelectedListener(pos));

        long var = parent.getSelectedItemId();
       
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}
