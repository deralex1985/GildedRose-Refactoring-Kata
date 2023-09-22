package com.gildedrose;

public class BackstagePass extends EnrichedItem {
    private static final String NAME = "Backstage passes to a TAFKAL80ETC concert";

    public BackstagePass(int sellIn, int quality) {
        super(NAME, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (quality < 50) {
            increaseQualityByOne();

            if (quality < 50) {
                if (sellIn < 11) {
                    increaseQualityByOne();
                }
                if (sellIn < 6) {
                    increaseQualityByOne();
                }
            }
        }
        updateSellIn();

        if (sellIn < 0) {
            quality = 0;
        }
    }

}
