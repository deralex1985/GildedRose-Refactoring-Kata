package com.gildedrose;

class GildedRose {
    private final Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item currentItem : items) {
            updateCurrentItemQuality(currentItem);
        }
    }

    private void updateCurrentItemQuality(Item currentItem) {
        if (isAgedBrie(currentItem) || isBackstagePass(currentItem)) {
            if (currentItem.quality < 50) {
                increaseQualityByOne(currentItem);

                if (isBackstagePass(currentItem) && currentItem.quality < 50) {
                    if (currentItem.sellIn < 11) {
                        increaseQualityByOne(currentItem);
                    }
                    if (currentItem.sellIn < 6) {
                        increaseQualityByOne(currentItem);
                    }
                }
            }
        } else if (currentItem.quality > 0 && !isSulfuras(currentItem)) {
            decreaseQualityByOne(currentItem);
        }

        if (!isSulfuras(currentItem)) {
            updateSellIn(currentItem);
        }

        if (currentItem.sellIn < 0) {
            if (isBackstagePass(currentItem)) {
                setQualityToZero(currentItem);
            } else if (!isAgedBrie(currentItem) && !isSulfuras(currentItem) && currentItem.quality > 0) {
                decreaseQualityByOne(currentItem);
            } else if (isAgedBrie(currentItem) && currentItem.quality < 50) {
                increaseQualityByOne(currentItem);
            }
        }
    }

    private void updateSellIn(Item currentItem) { //False Friend
        currentItem.sellIn = currentItem.sellIn - 1;
    }

    private void setQualityToZero(Item currentItem) { //False Friend
        currentItem.quality = 0;
    }

    private void increaseQualityByOne(Item currentItem) { //False Friend
        currentItem.quality = currentItem.quality + 1;
    }

    private void decreaseQualityByOne(Item currentItem) {  //False Friend
        currentItem.quality = currentItem.quality - 1;
    }

    private boolean isSulfuras(Item currentItem) { //False Friend
        return currentItem.name.equals("Sulfuras, Hand of Ragnaros");
    }

    private boolean isBackstagePass(Item currentItem) { //False Friend
        return currentItem.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private boolean isAgedBrie(Item currentItem) { //False Friend
        return currentItem.name.equals("Aged Brie");
    }
}
