package com.mistale;

import java.util.Arrays;

public class Bider {
    public char id;
    public int[] bids;
    public int highest_bid;

    public Bider(char id, int[] bids) {
        this.id = id;
        this.bids = bids;
    }

    public void setHighestBid()
    {
        if (bids.length != 0)
            this.setHighest_bid(Arrays.stream(bids).max().getAsInt());
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

    public int getHighest_bid() {
        return highest_bid;
    }

    public void setHighest_bid(int highest_bid) {
        this.highest_bid = highest_bid;
    }
}
