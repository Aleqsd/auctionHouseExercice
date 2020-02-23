package com.mistale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Bider> biders = new ArrayList<Bider>();
        biders.add(new Bider('A', new int[]{100, 130}));
        biders.add(new Bider('B', new int[0]));
        biders.add(new Bider('C', new int[]{125}));
        biders.add(new Bider('D', new int[]{105, 115, 90}));
        biders.add(new Bider('E', new int[]{132, 135, 140}));

        Bider highestBider = getHighestBider(biders);
        biders.remove(highestBider);
        Bider secondHighestBider = getHighestBider(biders);

        if (secondHighestBider.getHighestBid() < 100)
            System.out.println("Bid didn't reach the reserve price of 100");
        else {
            System.out.println("The Buyer " + secondHighestBider.getId() + " won the auction with a bid of " + secondHighestBider.getHighestBid());
        }
    }

    public static Bider getHighestBider(List<Bider> biders) {
        Bider highestBider = biders.get(0);
        for (Bider bider : biders) {
            if (bider.getBids().length > 0)
                bider.setHighestBid(Arrays.stream(bider.getBids()).max().getAsInt());
            if (bider.getHighestBid() > highestBider.getHighestBid())
                highestBider = bider;
        }
        return highestBider;
    }
}