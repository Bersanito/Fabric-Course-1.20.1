package net.bersanito.mccourse;

import net.bersanito.mccourse.entity.ModEntities;
import net.bersanito.mccourse.world.gen.ModWorldGeneration;
import net.bersanito.mccourse.world.tree.ModTrunkPlacerTypes;
import net.fabricmc.api.ModInitializer;

import net.bersanito.mccourse.block.ModBlocks;
import net.bersanito.mccourse.block.entity.ModBlockEntities;
import net.bersanito.mccourse.effect.ModEffects;
import net.bersanito.mccourse.enchantment.ModEnchantments;
import net.bersanito.mccourse.fluid.ModFluids;
import net.bersanito.mccourse.item.ModItemGroup;
import net.bersanito.mccourse.item.ModItems;
import net.bersanito.mccourse.painting.ModPaintings;
import net.bersanito.mccourse.particle.ModParticles;
import net.bersanito.mccourse.potion.ModPotions;
import net.bersanito.mccourse.recipe.ModRecipes;
import net.bersanito.mccourse.screen.ModScreenHandlers;
import net.bersanito.mccourse.sound.ModSounds;
import net.bersanito.mccourse.util.ModLootTableModifiers;
import net.bersanito.mccourse.util.ModRegistries;
import net.bersanito.mccourse.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();
		ModEnchantments.registerModEnchantments();

		ModSounds.registerSounds();
		ModLootTableModifiers.modifyLootTables();

		ModPaintings.registerPaintings();
		ModEffects.registerEffects();

		ModPotions.registerPotions();
		ModParticles.registerParticles();

		ModVillagers.registerVillagers();
		ModFluids.registerFluids();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandler();

		ModRecipes.registerRecipes();
		ModWorldGeneration.generateModWorldGeneration();

		ModEntities.registerModEntities();

		ModTrunkPlacerTypes.register();
	}
}