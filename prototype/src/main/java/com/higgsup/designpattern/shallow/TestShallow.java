package com.higgsup.designpattern.shallow;

/**
 * Created by anhvu on 21-Jun-18.
 */
public class TestShallow {
    public static void main(String[] args) throws CloneNotSupportedException {
        Campaign campaign1 = new Campaign();
        campaign1.setId(1L);
        campaign1.setName("Campaign shallow 1");
        Adset adset = new Adset();
        adset.setId(1L);
        adset.setName("Adset shallow 1");
        campaign1.setAdset(adset);

        Campaign campaign2 = campaign1.clone();
        campaign2.getAdset().setName("Adset shallow 2");
        System.out.println("Adset of campaign 1 " + campaign1.getAdset());
        System.out.println("Adset of campaign 2 " + campaign2.getAdset());
    }

}
