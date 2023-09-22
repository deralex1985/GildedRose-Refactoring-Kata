package com.gildedrose;

public class EnrichedItem extends Item {


    public EnrichedItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        if (quality > 0 && !isSulfuras()) {
            decreaseQualityByOne();
        }

        if (!isSulfuras()) {
            updateSellIn();
        }

        if (sellIn < 0) {
            if (!isSulfuras() && quality > 0) {
                decreaseQualityByOne();
            }
        }
    }
    protected void updateSellIn() { //False Friend
        sellIn = sellIn - 1;
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

}
