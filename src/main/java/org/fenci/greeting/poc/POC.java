package org.fenci.greeting.poc;

public class POC {

    private final String name;
    private final String rank;
    private final int rankIndex;
    private final String gender;

    public POC(String name, String rank, int rankIndex, String gender) {
        this.name = name;
        this.rank = rank;
        this.rankIndex = rankIndex;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public int getRankIndex() {
        return rankIndex;
    }

    public String getGender() {
        return gender;
    }
}
