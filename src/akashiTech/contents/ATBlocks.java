package akashiTech.contents;

import arc.graphics.Color;
import mindustry.content.Blocks;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.draw.DrawDefault;
import mindustry.world.draw.DrawFlame;
import mindustry.world.draw.DrawMulti;

import static akashiTech.contents.ATItems.titanium_alloy;
import static mindustry.type.ItemStack.with;

public class ATBlocks extends Blocks {

    public static Block unit_wall;
    /**System Wall*/
    public static Block titanium_a_wall, titanium_a_wall_l, titanium_a_smelter;
    /**Serpulo Blocks*/
    public static Block ym_wall, ym_wall_l, yunametal_generator;
    /**Main Blocks*/

    public static void load() {
        int BHP = 120;
        int wallHPMultiplier = 4;
        int armorHPMultiplier = 8;
        /*----------Region Wall----------*/
        //serpulo
        titanium_a_wall = new Wall("titanium-a-wall") {{
            size = 1;
            health = size * size * (BHP + 50) * wallHPMultiplier;

            requirements(Category.defense, with(titanium_alloy, 8));
        }};//Done
        titanium_a_wall_l = new Wall("titanium-a-wall-large") {{
            size = 2;
            health = size * size * (BHP + 50) * wallHPMultiplier;

            requirements(Category.defense, with(titanium_alloy, 32));
        }};//Done
        /*-----End Region-----*/

        /*----------Region Production----------*/
        //serpulo
        titanium_a_smelter = new GenericCrafter("titanium-a-smelter") {{
            size = 2;
            health = size * size * BHP;

            hasItems = hasPower = true;
            itemCapacity = 16;
            craftTime = 1.43f * 60f;

            consumePower(0.50f);
            consumeItems(with(Items.titanium, 2, Items.copper, 1, Items.lead, 1));
            outputItems = with(titanium_alloy, 1);

            drawer = new DrawMulti(
                    new DrawDefault(), new DrawFlame(Color.valueOf("ffc099"))
            );
            craftEffect = Fx.smeltsmoke;
            ambientSound = Sounds.smelter;

            requirements(Category.crafting, with(Items.copper, 16, Items.lead, 10));
        }};
        /*-----End Region-----*/
    }
}
