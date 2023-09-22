package com.gildedrose;

public class Program {

	public static void main(String... args) {
		System.out.println("OMGHAI!");

        EnrichedItem[] items = new EnrichedItem[] {
				new EnrichedItem("+5 Dexterity Vest", 10, 20),
				new AgedBrie("Aged Brie", 2, 0),
				new EnrichedItem("Elixir of the Mongoose", 5, 7),
				new EnrichedItem("Sulfuras, Hand of Ragnaros", 0, 80),
				new EnrichedItem("Sulfuras, Hand of Ragnaros", -1, 80),
				new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 15, 20),
				new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 10, 49),
				new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 5, 49),
				// this conjured item does not work properly yet
				new EnrichedItem("Conjured Mana Cake", 3, 6) };

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
