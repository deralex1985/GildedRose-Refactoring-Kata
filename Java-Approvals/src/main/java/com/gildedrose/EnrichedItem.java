package com.gildedrose;

public class EnrichedItem extends Item {


    public EnrichedItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        if (quality > 0) {
            decreaseQualityByOne();
        }

        updateSellIn();

        if (sellIn < 0 && quality > 0) {
            decreaseQualityByOne();
        }
    }

    protected void updateSellIn() {
        sellIn = sellIn - 1;
    }

    protected void increaseQualityByOne() {
        quality = quality + 1;
    }

    protected void decreaseQualityByOne() {
        quality = quality - 1;
    }
}
