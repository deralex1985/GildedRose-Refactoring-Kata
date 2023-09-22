package com.gildedrose;

public class EnrichedItem extends Item {


    public EnrichedItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        if (isAgedBrie() || isBackstagePass()) {
            if (quality < 50) {
                increaseQualityByOne();

                if (isBackstagePass() && quality < 50) {
                    if (sellIn < 11) {
                        increaseQualityByOne();
                    }
                    if (sellIn < 6) {
                        increaseQualityByOne();
                    }
                }
            }
        } else if (quality > 0 && !isSulfuras()) {
            decreaseQualityByOne();
        }

        if (!isSulfuras()) {
            updateSellIn();
        }

        if (sellIn < 0) {
            if (isBackstagePass()) {
                setQualityToZero();
            } else if (!isAgedBrie() && !isSulfuras() && quality > 0) {
                decreaseQualityByOne();
            } else if (isAgedBrie() && quality < 50) {
                increaseQualityByOne();
            }
        }
    }
    private void updateSellIn() { //False Friend
        sellIn = sellIn - 1;
    }

    private void setQualityToZero() { //False Friend
        quality = 0;
    }

    private void increaseQualityByOne() { //False Friend
        quality = quality + 1;
    }

    private void decreaseQualityByOne() {  //False Friend
        quality = quality - 1;
    }

    private boolean isSulfuras() { //False Friend
        return name.equals("Sulfuras, Hand of Ragnaros");
    }

    private boolean isBackstagePass() { //False Friend
        return name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private boolean isAgedBrie() { //False Friend
        return name.equals("Aged Brie");
    }
}
