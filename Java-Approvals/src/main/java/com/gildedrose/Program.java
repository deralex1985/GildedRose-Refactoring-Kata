package com.gildedrose;

public class Program {

    public static void main(String... args) {
        System.out.println("OMGHAI!");

        EnrichedItem[] items = new EnrichedItem[]{
            new EnrichedItem("+5 Dexterity Vest", 10, 20),
            new AgedBrie(2, 0),
            new EnrichedItem("Elixir of the Mongoose", 5, 7),
            new Sulfuras(0, 80),
            new Sulfuras(-1, 80),
            new BackstagePass(15, 20),
            new BackstagePass(10, 49),
            new BackstagePass(5, 49),
            // this conjured item does not work properly yet
            new EnrichedItem("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(items);

        for (int i = 0; i < 31; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (int j = 0; j < items.length; j++) {
                System.out.println(items[j]);
            }
            System.out.println("");
            app.updateQuality();
        }
    }
}
