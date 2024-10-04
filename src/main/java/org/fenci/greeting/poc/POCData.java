package org.fenci.greeting.poc;

import java.util.HashMap;

public interface POCData {

    //rank 5 = Colonel
    //rank 4 = Lt Colonel
    //rank 3 = Major
    //rank 2 = Captain
    //rank 1 = Lt

    HashMap<POC, String> POCList = new HashMap<>();
    String directory = "src\\main\\resources\\";

    default void iniList() {
        POCList.put(new POC("Alcisto", "2nd Lt", 1), directory + "cadet2ndltalcisto.png");
        POCList.put(new POC("Escamilla", "2nd Lt", 1), directory + "cadet2ndltescamilla.jpg");
        POCList.put(new POC("Kimura", "2nd Lt", 1), directory + "cadet2ndltkimura.jpeg");

        POCList.put(new POC("Anderson", "Captain", 2), directory + "cadetcaptainanderson.jpg");
        POCList.put(new POC("Dimatteo", "Captain", 2), directory + "cadetcaptaindimatteo.png");
        POCList.put(new POC("Kinkead", "Captain", 2), directory + "cadetcaptainkinkead.jpg");
        POCList.put(new POC("River", "Captain", 2), directory + "cadetcaptainriver.png");
        POCList.put(new POC("Untalan", "Captain", 2), directory + "cadetcaptainuntalan.png");

        POCList.put(new POC("Celentano", "Colonel", 5), directory + "cadetcolonelcelentano.png");
        POCList.put(new POC("Dallmer", "Colonel", 5), directory + "cadetcoloneldallmer.png");

        POCList.put(new POC("Laravia", "Lt Colonel", 4), directory + "cadetltcollaravia.jpg");
        POCList.put(new POC("Martinez", "Lt Colonel", 4), directory + "cadetltcolmartinez.jpg");
        POCList.put(new POC("Turney", "Lt Colonel", 4), directory + "cadetltcolturney.png");

        POCList.put(new POC("Argueta", "Major", 3), directory + "cadetmajorargueta.png");
        POCList.put(new POC("Becker", "Major", 3), directory + "cadetmajorbecker.jpg");
        POCList.put(new POC("Childs", "Major", 3), directory + "cadetmajorchilds.png");
        POCList.put(new POC("Herrera", "Major", 3), directory + "cadetmajorherrera.jpeg");
        POCList.put(new POC("Mireles", "Major", 3), directory + "cadetmajormireles.png");
        POCList.put(new POC("Nam", "Major", 3), directory + "cadetmajornam.jpg");
        POCList.put(new POC("Sir", "Major", 3), directory + "cadetmajorsir.jpg");
        POCList.put(new POC("Yi", "Major", 3), directory + "cadetmajoryi.jpg");
        POCList.put(new POC("Zhivaga", "Major", 3), directory + "cadetmajorzhivaga.jpg");

    }

    default POC createPOC(String name, String rank, int rankIndex) {
        return new POC(name, rank, rankIndex);
    }
}
