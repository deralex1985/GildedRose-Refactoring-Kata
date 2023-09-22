package com.gildedrose;

public class AgedBrie extends EnrichedItem {
    public static final String AGED_BRIE = "Aged Brie";

    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
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
