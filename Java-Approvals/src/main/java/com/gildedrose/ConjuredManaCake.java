package com.gildedrose;

public class ConjuredManaCake extends EnrichedItem {
    public static final String CONJURED_MANA_CAKE = "Conjured Mana Cake";

    public ConjuredManaCake(int sellIn, int quality) {
        super(CONJURED_MANA_CAKE, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        super.updateQuality(2);
    }
}
