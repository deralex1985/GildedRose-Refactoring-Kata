package com.gildedrose;

public class Sulfuras extends EnrichedItem {

    private static final String NAME = "Sulfuras, Hand of Ragnaros";

    public Sulfuras(int sellIn, int quality) {
        super(NAME, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        // Kein Update gemäss Anforderungen
    }

}
