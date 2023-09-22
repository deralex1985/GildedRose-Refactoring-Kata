package com.gildedrose;

public class BackstagePass extends EnrichedItem {
    public BackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

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
