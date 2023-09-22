package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            Item currentItem = items[i];
            if (!isAgedBrie(currentItem) && !isBackstagePass(currentItem)) {
                if (currentItem.quality > 0) {
                    if (!isSulfuras(currentItem)) {
                        decreaseQuality(currentItem, 1);
                    }
                }
            } else {
                if (currentItem.quality < 50) {
                    currentItem.quality = currentItem.quality + 1;

                    if (isBackstagePass(currentItem)) {
                        if (currentItem.sellIn < 11) {
                            if (currentItem.quality < 50) {
                                currentItem.quality = currentItem.quality + 1;
                            }
                        }

                        if (currentItem.sellIn < 6) {
                            if (currentItem.quality < 50) {
                                currentItem.quality = currentItem.quality + 1;
                            }
                        }
                    }
                }
            }

            if (!isSulfuras(currentItem)) {
                currentItem.sellIn = currentItem.sellIn - 1;
            }

            if (currentItem.sellIn < 0) {
                if (!isAgedBrie(currentItem)) {
                    if (!isBackstagePass(currentItem)) {
                        if (currentItem.quality > 0) {
                            if (!isSulfuras(currentItem)) {
                                decreaseQuality(currentItem, 1);
                            }
                        }
                    } else {
                        decreaseQuality(currentItem, currentItem.quality);
                    }
                } else {
                    if (currentItem.quality < 50) {
                        currentItem.quality = currentItem.quality + 1;
                    }
                }
            }
        }
    }

    private void decreaseQuality(Item currentItem, int qualityChangeAmount) {  //False Friend
        currentItem.quality = currentItem.quality - qualityChangeAmount;
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
