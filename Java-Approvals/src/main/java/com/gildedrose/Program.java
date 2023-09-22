package com.gildedrose;

import java.util.stream.IntStream;

public class Program {

    public static void main(String... args) {
        System.out.println("OMGHAI!");

        EnrichedItem[] items = createEnrichedItems();
        GildedRose app = new GildedRose(items);

        for (int dayNr = 0; dayNr < 31; dayNr++) {
            printHeader(items, dayNr);
            app.updateQuality();
        }
    }

    private static EnrichedItem[] createEnrichedItems() {
        return new EnrichedItem[]{
            new EnrichedItem("+5 Dexterity Vest", 10, 20),
            new AgedBrie(2, 0),
            new EnrichedItem("Elixir of the Mongoose", 5, 7),
            new Sulfuras(0, 80),
            new Sulfuras(-1, 80),
            new BackstagePass(15, 20),
            new BackstagePass(10, 49),
            new BackstagePass(5, 49),
            new ConjuredManaCake(3, 6)
        };
    }

    private static void printHeader(EnrichedItem[] items, int dayNr) {
        System.out.println("-------- day " + dayNr + " --------");
        System.out.println("name, sellIn, quality");
        for (EnrichedItem item : items) {
            System.out.println(item);
        }
        System.out.println("");
    }
}
