package org.fenci.greeting.poc;

public class POC {

    private final String name;
    private final String rank;
    private final int rankIndex;

    public POC(String name, String rank, int rankIndex) {
        this.name = name;
        this.rank = rank;
        this.rankIndex = rankIndex;
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
}
