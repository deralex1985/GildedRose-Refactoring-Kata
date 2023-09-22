package com.gildedrose;

public class Sulfuras extends EnrichedItem {

    static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

    public Sulfuras(int sellIn, int quality) {
        super(SULFURAS_HAND_OF_RAGNAROS, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        // Kein Update gemäss Anforderungen
    }

}
