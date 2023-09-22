package com.gildedrose;

public class EnrichedItem extends Item {

    int amountOfQualityChange;

    public EnrichedItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        amountOfQualityChange = 1;
    }

    protected void updateQuality() {
        if (quality > 0) {
            decreaseQuality();
        }
        if (sellIn < 1 && quality > 0) {
            decreaseQuality();
        }

        updateSellIn();
    }

    protected void updateSellIn() {
        sellIn = sellIn - 1;
    }

    protected void increaseQualityByOne() {
        quality = quality + 1;
    }

    protected void decreaseQuality() {
        quality = quality - amountOfQualityChange;
    }
}
