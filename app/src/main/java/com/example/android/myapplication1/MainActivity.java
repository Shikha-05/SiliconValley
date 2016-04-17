package com.example.android.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //global variable to store information of companies
    String info = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //displays info of Apple
    public void APPLE(View view) {
        info = "Industry :\tComputer hardware , Computer software , Consumer electronics , Digital distribution\n";
        info += "Founded :\tApril 1, 1976\n";
        info += "Founders :\t" + "Steve Jobs , " + "Steve Wozniak , " + "Ronald Wayne\n";
        info += "Headquarters :\tApple Campus, Cupertino, California, U.S.";
        info += "Products :\t" + "Mac , iPod , iPhone , iPad , Apple Watch , Apple TV , OS X , iOS , watchOS , iLife , iWork\n";
        info += "Website :\twww.apple.com";
        TextView apple_info = (TextView) findViewById(R.id.appleInfo);
        apple_info.setText(info);
    }

    //displays info of Google
    public void GOOGLE(View view) {
        info = "Industry :\t" + "Internet , " + "Computer software\n";
        info += "Founded :\tSeptember 4, 1998\n";
        info += "Founders :\t" + "Larry Page , " + "Sergey Brin\n";
        info += "Headquarters :\tGoogleplex, Mountain View, California, U.S.\n";
        info += "Products :\tGoogle search , Google AdSense , Google Hangouts , Google App Engine\n";
        info += "Website :\twww.google.com";
        TextView google_info = (TextView) findViewById(R.id.googleInfo);
        google_info.setText(info);
    }

    //displays info of Facebook
    public void FACEBOOK(View view) {
        info = "Industry :\tInternet\n";
        info += "Founded :\tFebruary 4, 2004\n";
        info += "Founder(s) :\t" + "Mark Zuckerberg , " +
                "Eduardo Saverin , " +
                "Andrew McCollum , " +
                "Dustin Moskovitz , " +
                "Chris Hughes\n";
        info += "Headquarters\tMenlo Park, California, U.S.\n";
        info += "Type of site :\tSocial networking service\n";
        info += "Website :\twww.facebook.com";
        TextView facebook_info = (TextView) findViewById(R.id.facebookInfo);
        facebook_info.setText(info);
    }

    //displays info of Hewlett packard
    public void HEWLETT_PACKARD(View view) {
        info = "Industry :\tComputer hardware , " +
                "Computer software , " +
                "IT services , " +
                "IT consulting\n";
        info += "Founded :\tJanuary 1, 1939\n";
        info += "Founders :\tWilliam Redington Hewlett , Dave Packard\n";
        info += "Headquarters :\tPalo Alto, California, United States\n";
        info += "Products :\tPrinters , Scanners , Digital cameras\n ";
        info += "Website :\twww.hp.com";
        TextView hp_info = (TextView) findViewById(R.id.hpInfo);
        hp_info.setText(info);
    }

    //displays info of Intel
    public void INTEL(View view) {
        info = "Industry :\tSemiconductors\n";
        info += "Founded :\tJuly 18, 1968\n";
        info += "Founders :\tGordon Moore , " +
                "Robert Noyce\n";
        info += "Headquarters :\tSanta Clara, California, United States\n";
        info += "Products :\tBluetooth chipsets , " +
                "flash memory , " +
                "microprocessors , " +
                "motherboard chipsets , " +
                "Network interface controllers\n";
        info += "Website :\twww.intel.com";
        TextView intel_info = (TextView) findViewById(R.id.IntelInfo);
        intel_info.setText(info);
    }
}
