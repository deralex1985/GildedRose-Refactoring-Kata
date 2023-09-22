package com.gildedrose;

public class AgedBrie extends EnrichedItem {
    private static final String NAME = "Aged Brie";

    public AgedBrie(int sellIn, int quality) {
        super(NAME, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (quality < 50) {
            increaseQualityByOne();
        }

        updateSellIn();

        if (sellIn < 0 && quality < 50) {
            increaseQualityByOne();
        }
    }


}
