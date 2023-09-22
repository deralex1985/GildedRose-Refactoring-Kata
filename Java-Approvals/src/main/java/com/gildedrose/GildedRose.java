package com.gildedrose;

class GildedRose {
    private final ExtendedItem[] items;

    public GildedRose(ExtendedItem[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (ExtendedItem currentItem : items) {
            currentItem.updateCurrentItemQuality();
        }
    }


}
