package com.higgsup.designpattern.deep;

/**
 * Created by anhvu on 21-Jun-18.
 */
public class TestDeep {
    public static void main(String[] args) throws CloneNotSupportedException {
        Campaign campaign1 = new Campaign();
        campaign1.setId(1L);
        campaign1.setName("Campaign deep 1");
        Adset adset = new Adset();
        adset.setId(1L);
        adset.setName("Adset deep 1");
        campaign1.setAdset(adset);

        Campaign campaign2 = campaign1.clone();
        campaign2.getAdset().setName("Adset deep 2");
        System.out.println("Adset of campaign 1 " + campaign1.getAdset());
        System.out.println("Adset of campaign 2 " + campaign2.getAdset());
    }

}
