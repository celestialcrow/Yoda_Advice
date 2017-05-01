package com.example.celestecrowder.yodaadvice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

import static java.net.Proxy.Type.HTTP;

public class Proverbs extends AppCompatActivity {
    public static int getRandom(int max) {
        return (int) (Math.random() * max);
    }

    public int numberofProverbs = 23;
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

    Random random = new Random();
    String randString = PROVERBS[random.nextInt(PROVERBS.length)];






    /*public void composeMmsMessage(String message, Uri attachment) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("smsto:"));  // This ensures only SMS apps respond
            intent.putExtra("sms_body", message);
            intent.putExtra(Intent.EXTRA_STREAM, attachment);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
        }*/
}

    /*PROVERBS(getRandom(numberofProverbs));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proverbs);*/


