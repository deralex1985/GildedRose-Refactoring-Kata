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
    protected void updateSellIn() { //False Friend
        sellIn = sellIn - 1;
    }

    protected void setQualityToZero() { //False Friend
        quality = 0;
    }

    protected void increaseQualityByOne() { //False Friend
        quality = quality + 1;
    }

    protected void decreaseQualityByOne() {  //False Friend
        quality = quality - 1;
    }

    protected boolean isSulfuras() { //False Friend
        return name.equals("Sulfuras, Hand of Ragnaros");
    }

    protected boolean isBackstagePass() { //False Friend
        return name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    protected boolean isAgedBrie() { //False Friend
        return name.equals("Aged Brie");
    }
}
