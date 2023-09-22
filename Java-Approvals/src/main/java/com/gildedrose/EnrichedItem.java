package com.gildedrose;

public class EnrichedItem extends Item {

    public EnrichedItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        updateQuality(1);
    }

    protected void updateQuality(int multiplier) {
        if (quality > 0) {
            decreaseQualityBy(multiplier);
        }
        if (sellIn < 1 && quality > 0) {
            decreaseQualityBy(multiplier);
        }

        updateSellIn();
    }

    protected void updateSellIn() {
        sellIn = sellIn - 1;
    }

    protected void increaseQualityByOne() {
        quality = quality + 1;
    }

    protected void decreaseQualityBy(int amount) {
        quality = quality - amount;
    }
}
