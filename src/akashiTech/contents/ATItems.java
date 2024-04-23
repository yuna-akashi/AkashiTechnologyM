package akashiTech.contents;

import arc.graphics.Color;
import arc.struct.Seq;
import mindustry.content.Items;
import mindustry.type.Item;

public class ATItems extends Items {
    public static Item
            titanium_alloy;
    /**
     * For Serpulo
     */

    public static Item tungastano;
    /**
     * For Erekir
     */

    public static Item
            yunametal;
    /**
     * Main
     */

    public static final Seq<Item> proty_items_serpulo = new Seq<>();
    public static final Seq<Item> proty_items_main = new Seq<>();

    public static void load() {
        /*----------serpulo----------*/
        titanium_alloy = new Item("titanium-alloy", Color.valueOf("84a2d4")) {{
            cost = 2.5f;
        }};//Done
        /*--------------------*/
        /*----------main----------*/
        yunametal = new Item("yunametal", ATColorPalette.baseMainColor) {{
            cost = 4;
            healthScaling = 1.32f;
        }};//TODO オリジナル金属と関連アイテムを設定する
        /*--------------------*/



        proty_items_serpulo.addAll(
                titanium_alloy
        );
        proty_items_main.addAll(
                yunametal
        );
        erekirOnlyItems.removeAll(proty_items_serpulo);
    }
}
