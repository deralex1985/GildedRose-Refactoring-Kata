package com.gildedrose;

public class ConjuredManaCake extends EnrichedItem {
    private static final String NAME = "Conjured Mana Cake";

    public ConjuredManaCake(int sellIn, int quality) {
        super(NAME, sellIn, quality);
        amountOfQualityChange = 2;
    }
}
