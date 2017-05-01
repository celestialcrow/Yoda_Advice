package com.example.celestecrowder.yodaadvice;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Random;

import static android.R.attr.editTextBackground;
import static android.R.attr.phoneNumber;
import static android.R.id.message;


public class MainActivity extends AppCompatActivity {
    public int numberofProverbs = 22;
    private String[] PROVERBS = {"Train yourself to let go of everything you fear to lose.",
            "Miss them do not. Attachment leads to jealously.The shadow of greed, that is.",
            "If no mistake have you made, yet losing you are…a different game you should play.",
            "He who treads the path of love walks a thousand meters as if it were one.",
            "You will know the good from the bad when you are calm, at peace. Passive.",
            "The fear of loss is a path to the Dark Side.", "Train yourself to let go of everything you fear to lose.",
            "All cats love fish but fear to wet their paws.", "You must unlearn what you have learned.",
            "Many of the truths that we cling to depend on our point of view.",
            "A Jedi uses the Force for knowledge and defense, never for attack.",
            "East or west, home is best.", "Fear is the path to the dark side.",
            "Fear leads to anger. Anger leads to hate. Hate leads to suffering.",
            "Named must your fear be before banish it you can.",
            "To be Jedi is to face the truth, and choose. Give off light, or darkness, Padawan. Be a candle, or the night.",
            "When you look at the dark side, careful you must be. For the dark side looks back.",
            "PATIENCE YOU MUST HAVE, my young padawan.",
            "To be Jedi is to face the truth, and choose. Give off light, or darkness, Padawan. Be a candle, or the night.",
            "Death is a natural part of life. Rejoice for those around you who transform into the Force.",
            "Always pass on what you have learned.", "Always two there are, no more, no less. A master and an apprentice.",
            "To answer power with power, the Jedi way this is not. In this war, a danger there is, of losing who we are."};


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.select_issue);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.select_issue_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

    public void OnItemSelectedListener(AdapterView, View));{
        String emailStr[] = {"celestgc@uci.edu"};
        Random random = new Random();
        String randString = PROVERBS[random.nextInt(PROVERBS.length)];
        composeEmail(emailStr, String randString);
        
    }
    public void composeEmail(String[] addresses, String subject) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }




