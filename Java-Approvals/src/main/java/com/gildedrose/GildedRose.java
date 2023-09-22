package com.gildedrose;

class GildedRose {
    private final EnrichedItem[] items;

    public GildedRose(EnrichedItem[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (EnrichedItem item : items) {
            item.updateQuality();
        }
    }


}
