package com.mistale;

public class Bider {
    public char id;
    public int[] bids;
    public int highestBid;

    public Bider(char id, int[] bids) {
        this.id = id;
        this.bids = bids;
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

    public int[] getBids() {
        return bids;
    }

    public void setBids(int[] bids) {
        this.bids = bids;
    }

    public int getHighestBid() {
        return highestBid;
    }

    public void setHighestBid(int highestBid) {
        this.highestBid = highestBid;
    }
}
