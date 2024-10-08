package org.fenci.greeting.poc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface POCData {

    //rank 5 = Colonel
    //rank 4 = Lt Colonel
    //rank 3 = Major
    //rank 2 = Captain
    //rank 1 = Lt

    HashMap<POC, String> POCList = new HashMap<>();
    String directory = "src\\main\\resources\\";

    default void iniList() {
        POCList.put(new POC("Alcisto", "2nd Lt", 1, "gentlemen"), directory + "cadet2ndltalcisto.png");
        POCList.put(new POC("Escamilla", "2nd Lt", 1, "gentlemen"), directory + "cadet2ndltescamilla.jpg");
        POCList.put(new POC("Kimura", "2nd Lt", 1, "gentlemen"), directory + "cadet2ndltkimura.jpeg");

        POCList.put(new POC("Anderson", "Captain", 2, "gentlemen"), directory + "cadetcaptainanderson.jpg");
        POCList.put(new POC("Dimatteo", "Captain", 2, "gentlemen"), directory + "cadetcaptaindimatteo.png");
        POCList.put(new POC("Kinkead", "Captain", 2, "gentlemen"), directory + "cadetcaptainkinkead.jpg");
        POCList.put(new POC("River", "Captain", 2, "gentlemen"), directory + "cadetcaptainriver.png");
        POCList.put(new POC("Untalan", "Captain", 2, "ladies"), directory + "cadetcaptainuntalan.png");

        POCList.put(new POC("Celentano", "Colonel", 5, "ladies"), directory + "cadetcolonelcelentano.png");
        POCList.put(new POC("Dallmer", "Colonel", 5, "ladies"), directory + "cadetcoloneldallmer.png");

        POCList.put(new POC("Laravia", "Lt Colonel", 4, "gentlemen"), directory + "cadetltcollaravia.jpg");
        POCList.put(new POC("Martinez", "Lt Colonel", 4, "gentlemen"), directory + "cadetltcolmartinez.jpg");
        POCList.put(new POC("Turney", "Lt Colonel", 4, "gentlemen"), directory + "cadetltcolturney.png");

        POCList.put(new POC("Argueta", "Major", 3, "ladies"), directory + "cadetmajorargueta.png");
        POCList.put(new POC("Becker", "Major", 3, "gentlemen"), directory + "cadetmajorbecker.jpg");
        POCList.put(new POC("Childs", "Major", 3, "gentlemen"), directory + "cadetmajorchilds.png");
        POCList.put(new POC("Herrera", "Major", 3, "ladies"), directory + "cadetmajorherrera.jpeg");
        POCList.put(new POC("Mireles", "Major", 3, "gentlemen"), directory + "cadetmajormireles.png");
        POCList.put(new POC("Nam", "Major", 3, "gentlemen"), directory + "cadetmajornam.jpg");
        POCList.put(new POC("Sir", "Major", 3, "gentlemen"), directory + "cadetmajorsir.jpg");
        POCList.put(new POC("Yi", "Major", 3, "gentlemen"), directory + "cadetmajoryi.jpg");
        POCList.put(new POC("Zhivaga", "Major", 3, "gentlemen"), directory + "cadetmajorzhivaga.jpg");

    }
}
