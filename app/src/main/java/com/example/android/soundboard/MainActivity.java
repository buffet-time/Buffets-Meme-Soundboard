package com.buffetTime.android.dankSoundBoard;

// Necessary Imports of course
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.example.android.soundBoard.R;
// End of Imports

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /// Sets the default volume control to effect media not ringtone
        setVolumeControlStream(AudioManager.STREAM_MUSIC);

        //////////////////////////////////////////////////////////////////////////////////////////////
        ///     Start of Button sound programming                                                   //
        ///                                                                                         //
        ///     The first line assigns a variable to be a specific sound file                       //
        ///     The second line assigns a button to a variable                                      //
        ///     The third line creates a on click listener                                          //
        ///     The fourth line finishes off the third line making the button press play the sound. //
        ///                                                                                         //
        ///     it's condensed so it's easier to read                                               //
        ///                                                                                         //
        ///     Buttons are arranged left to right in terms of number and row.                      //
        //////////////////////////////////////////////////////////////////////////////////////////////

        ///Row 1
        /// Ethan Bradberry
        final MediaPlayer ethanBradberryMP3 = MediaPlayer.create(this, R.raw.ethan_bradberry);
        Button playEthanBradberry = (Button) this.findViewById(R.id.button_ethanBradberry);
        assert playEthanBradberry != null;
        playEthanBradberry.setOnClickListener(new View.OnClickListener(){@Override
                public void onClick(View v){ethanBradberryMP3.start();}});

        /// Shut the fuck up
        final MediaPlayer stfuMP3 = MediaPlayer.create(this, R.raw.stfu);
        Button playSTFU = (Button) this.findViewById(R.id.button_stfu);
        assert playSTFU != null;
        playSTFU.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){stfuMP3.start();}});

        /// haha
        final MediaPlayer hahaMP3 = MediaPlayer.create(this, R.raw.haha);
        Button playHaha = (Button) this.findViewById(R.id.button_haha);
        assert playHaha != null;
        playHaha.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){hahaMP3.start();}});

        ///Row 2
        /// oh now i get it
        final MediaPlayer ohMP3 = MediaPlayer.create(this, R.raw.ohnowigetit);
        Button playOh = (Button) this.findViewById(R.id.button_ohNowIGetIt);
        assert playOh != null;
        playOh.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){ohMP3.start();}});

        /// what, what the fuck?
        final MediaPlayer wtfMP3 = MediaPlayer.create(this, R.raw.wtf);
        Button playWTF = (Button) this.findViewById(R.id.button_whatTheFuck);
        assert playWTF != null;
        playWTF.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){wtfMP3.start();}});

        /// why the fuck you lying
        final MediaPlayer lyingMP3 = MediaPlayer.create(this, R.raw.wtfulyin);
        Button playLying = (Button) this.findViewById(R.id.button_whyTheFuckULyin);
        assert playLying != null;
        playLying.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){lyingMP3.start();}});

        ///Row 3
        /// why you haff to be mad, it's only game
        final MediaPlayer madMP3 = MediaPlayer.create(this, R.raw.yumad);
        Button playMad = (Button) this.findViewById(R.id.button_whyYouHeffBeMad);
        assert playMad != null;
        playMad.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){madMP3.start();}});

        ///Nigga You Gay - Riley Freeman
        final MediaPlayer nUGayMP3 = MediaPlayer.create(this, R.raw.nigga_you_gay);
        Button playNuGay = (Button) this.findViewById(R.id.button_niggaYouGay);
        assert playNuGay != null;
        playNuGay.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){nUGayMP3.start();}});

        ///Hitmarker
        final MediaPlayer hitmarkerMP3 = MediaPlayer.create(this, R.raw.hitmarker);
        Button playHitmarker = (Button) this.findViewById(R.id.button_hitMarker);
        assert playHitmarker != null;
        playHitmarker.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){hitmarkerMP3.start();}});

        ///Row 4
        /// It's a trap!
        final MediaPlayer itsaTrapMP3 = MediaPlayer.create(this, R.raw.its_a_trap);
        Button playItsaTrap = (Button) this.findViewById(R.id.button_itsATrap);
        assert playItsaTrap != null;
        playItsaTrap.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){itsaTrapMP3.start();}});

        ///Shut up and take my money
        final MediaPlayer takeMyMoneyMP3 = MediaPlayer.create(this, R.raw.shut_up_and_take_my_money);
        Button playTakeMyMoney = (Button) this.findViewById(R.id.button_shutUpAndTakeMyMoney);
        assert playTakeMyMoney != null;
        playTakeMyMoney.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){takeMyMoneyMP3.start();}});

        ///smoke weed everyday
        final MediaPlayer smokeWeedMP3 = MediaPlayer.create(this, R.raw.smoke_weed_everyday);
        Button playSmokeWeed = (Button) this.findViewById(R.id.button_smokeWeedEveryDay);
        assert playSmokeWeed != null;
        playSmokeWeed.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){smokeWeedMP3.start();}});

        ///Row 5
        /// Stop! - Jontron
        final MediaPlayer stopMP3 = MediaPlayer.create(this, R.raw.stop);
        Button playStop = (Button) this.findViewById(R.id.button_stop);
        assert playStop != null;
        playStop.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){stopMP3.start();}});

        /// Wow - memes
        final MediaPlayer wowMP3 = MediaPlayer.create(this, R.raw.wow);
        Button playWow = (Button) this.findViewById(R.id.button_wow);
        assert playWow != null;
        playWow.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){wowMP3.start();}});

        /// Twenty One
        final MediaPlayer twentyOneOGG = MediaPlayer.create(this, R.raw.twenty_one);
        Button play21 = (Button) this.findViewById(R.id.button_twentyOne);
        assert play21 != null;
        play21.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){twentyOneOGG.start();}});

        ///Row 6
        ///Surprise mother Fucker
        final MediaPlayer surpriseMogoOGG = MediaPlayer.create(this, R.raw.surprise_mother_fucker);
        Button playSurpriseMOFO = (Button) this.findViewById(R.id.button_surpriseMotherFucker);
        assert playSurpriseMOFO != null;
        playSurpriseMOFO.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){surpriseMogoOGG.start();}});

        ///DJ Khaled - Another One
        final MediaPlayer anotherOneOGG = MediaPlayer.create(this, R.raw.another_one);
        Button playAnotherOne = (Button) this.findViewById(R.id.button_anotherOne);
        assert playAnotherOne != null;
        playAnotherOne.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){anotherOneOGG.start();}});

        ///daaaaaaaaaaaaaaaaamn
        final MediaPlayer daaamnOGG = MediaPlayer.create(this, R.raw.daaamn);
        Button playDaaamn = (Button) this.findViewById(R.id.button_daaamn);
        assert playDaaamn != null;
        playDaaamn.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){daaamnOGG.start();}});

        ///Row 7
        ///HOOPLA
        final MediaPlayer hooplaOGG = MediaPlayer.create(this, R.raw.hoopla);
        Button playHoopla = (Button) this.findViewById(R.id.button_hoopla);
        assert playHoopla != null;
        playHoopla.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){hooplaOGG.start();}});

        ///i dont get it
        final MediaPlayer dontGetItOGG = MediaPlayer.create(this, R.raw.i_dont_get_it);
        Button playDontGetIt = (Button) this.findViewById(R.id.button_i_dont_get_it);
        assert playDontGetIt != null;
        playDontGetIt.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){dontGetItOGG.start();}});

        ///i dont need it
        final MediaPlayer dontNeedItOGG = MediaPlayer.create(this, R.raw.i_dont_need_it);
        Button playDontNeedIt = (Button) this.findViewById(R.id.button_i_dont_need_it);
        assert playDontNeedIt != null;
        playDontNeedIt.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){dontNeedItOGG.start();}});

        ///Row 8
        ///my leg
        final MediaPlayer myLegOGG = MediaPlayer.create(this, R.raw.my_leg);
        Button playMyLeg = (Button) this.findViewById(R.id.button_my_leg);
        assert playMyLeg != null;
        playMyLeg.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){myLegOGG.start();}});

        ///nigga hush
        final MediaPlayer niggaHushOGG = MediaPlayer.create(this, R.raw.nigga_hush);
        Button playNiggaHush = (Button) this.findViewById(R.id.button_nigga_hush);
        assert playNiggaHush != null;
        playNiggaHush.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){niggaHushOGG.start();}});

        ///soiled it
        final MediaPlayer soiledItOGG = MediaPlayer.create(this, R.raw.soiled_it);
        Button playSoiledIt = (Button) this.findViewById(R.id.button_soiled_it);
        assert playSoiledIt != null;
        playSoiledIt.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){soiledItOGG.start();}});

        ///Row 9
        ///this is a load of barnacles
        final MediaPlayer loadOfBarnaclesOGG = MediaPlayer.create(this, R.raw.this_is_a_load_of_barnacles);
        Button playLoadOfBarnacles = (Button) this.findViewById(R.id.button_loadOfBarnacles);
        assert playLoadOfBarnacles != null;
        playLoadOfBarnacles.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){loadOfBarnaclesOGG.start();}});

        ///tight tight tight
        final MediaPlayer tightOGG = MediaPlayer.create(this, R.raw.tight_tight_tight);
        Button playTight = (Button) this.findViewById(R.id.button_tight);
        assert playTight != null;
        playTight.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){tightOGG.start();}});

        ///well we're waiting
        final MediaPlayer wereWaitingOGG = MediaPlayer.create(this, R.raw.well_were_waiting);
        Button playWereWaiting = (Button) this.findViewById(R.id.button_wereWaiting);
        assert playWereWaiting != null;
        playWereWaiting.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){wereWaitingOGG.start();}});

        ///Row 10
        ///who you callin pinhead
        final MediaPlayer pinheadOGG = MediaPlayer.create(this, R.raw.who_you_callin_pinhead);
        Button playPinhead = (Button) this.findViewById(R.id.button_pinhead);
        assert playPinhead != null;
        playPinhead.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){pinheadOGG.start();}});

        /// Lil Jon - okaaay
        final MediaPlayer okaaayOGG = MediaPlayer.create(this, R.raw.okaaay);
        Button playOkaaay = (Button) this.findViewById(R.id.button_okay);
        assert playOkaaay != null;
        playOkaaay.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){okaaayOGG.start();}});

        /// Lil Jon - yeaaah
        final MediaPlayer yeaaahOGG = MediaPlayer.create(this, R.raw.yeaaah);
        Button playYeaaah = (Button) this.findViewById(R.id.button_yeaaah);
        assert playYeaaah != null;
        playYeaaah.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){yeaaahOGG.start();}});

        ///Row 11
        /// Lil Jon - Whaaat
        final MediaPlayer whaaatOGG = MediaPlayer.create(this, R.raw.whaaaaat);
        Button playWhaaat = (Button) this.findViewById(R.id.button_whaaat);
        assert playWhaaat != null;
        playWhaaat.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){whaaatOGG.start();}});

        /// Ding
        final MediaPlayer dingOGG = MediaPlayer.create(this, R.raw.ding);
        Button playDing = (Button) this.findViewById(R.id.button_ding);
        assert playDing != null;
        playDing.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v){dingOGG.start();}});

    }

}
