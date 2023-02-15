
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gabrieldja.trickupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.gabrieldja.trickupdate.block.StructureBlockBlock;
import net.gabrieldja.trickupdate.block.StrippedBlockOfBambooBlock;
import net.gabrieldja.trickupdate.block.RepeatingCommandBlockBlock;
import net.gabrieldja.trickupdate.block.PressurePlateCherryBlock;
import net.gabrieldja.trickupdate.block.HangingSignWarpedBlock;
import net.gabrieldja.trickupdate.block.HangingSignSpruceBlock;
import net.gabrieldja.trickupdate.block.HangingSignOakBlock;
import net.gabrieldja.trickupdate.block.HangingSignMangroveBlock;
import net.gabrieldja.trickupdate.block.HangingSignJungleBlock;
import net.gabrieldja.trickupdate.block.HangingSignDarkOakBlock;
import net.gabrieldja.trickupdate.block.HangingSignCrimsonBlock;
import net.gabrieldja.trickupdate.block.HangingSignCherryBlock;
import net.gabrieldja.trickupdate.block.HangingSignBirchBlock;
import net.gabrieldja.trickupdate.block.HangingSignBambooBlock;
import net.gabrieldja.trickupdate.block.HangingSignAcaciaBlock;
import net.gabrieldja.trickupdate.block.FenceGateCherryBlock;
import net.gabrieldja.trickupdate.block.FenceCherryBlock;
import net.gabrieldja.trickupdate.block.DoorCherryBlock;
import net.gabrieldja.trickupdate.block.CommandBlockBlock;
import net.gabrieldja.trickupdate.block.ChiseledBookshelfBlock;
import net.gabrieldja.trickupdate.block.CherryWoodBlock;
import net.gabrieldja.trickupdate.block.CherryTrapdoorBlock;
import net.gabrieldja.trickupdate.block.CherryStairsBlock;
import net.gabrieldja.trickupdate.block.CherrySlabBlock;
import net.gabrieldja.trickupdate.block.CherrySaplingBlock;
import net.gabrieldja.trickupdate.block.CherryPlanksBlock;
import net.gabrieldja.trickupdate.block.CherryLogBlock;
import net.gabrieldja.trickupdate.block.CherryLeavesBlock;
import net.gabrieldja.trickupdate.block.CherryButtonsBlock;
import net.gabrieldja.trickupdate.block.ChainCommandBlockBlock;
import net.gabrieldja.trickupdate.block.BlockOfBambooBlock;
import net.gabrieldja.trickupdate.block.BambooTrapdoorBlock;
import net.gabrieldja.trickupdate.block.BambooStairBlock;
import net.gabrieldja.trickupdate.block.BambooSlabBlock;
import net.gabrieldja.trickupdate.block.BambooPressurePlateBlock;
import net.gabrieldja.trickupdate.block.BambooPlanksBlock;
import net.gabrieldja.trickupdate.block.BambooMosaicStairBlock;
import net.gabrieldja.trickupdate.block.BambooMosaicSlabBlock;
import net.gabrieldja.trickupdate.block.BambooMosaicBlock;
import net.gabrieldja.trickupdate.block.BambooFenceGateBlock;
import net.gabrieldja.trickupdate.block.BambooFenceBlock;
import net.gabrieldja.trickupdate.block.BambooDoorBlock;
import net.gabrieldja.trickupdate.block.BambooButtonBlock;
import net.gabrieldja.trickupdate.TrickUpdate120Mod;

public class TrickUpdate120ModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TrickUpdate120Mod.MODID);
	public static final RegistryObject<Block> BAMBOO_DOOR = REGISTRY.register("bamboo_door", () -> new BambooDoorBlock());
	public static final RegistryObject<Block> BLOCK_OF_BAMBOO = REGISTRY.register("block_of_bamboo", () -> new BlockOfBambooBlock());
	public static final RegistryObject<Block> STRIPPED_BLOCK_OF_BAMBOO = REGISTRY.register("stripped_block_of_bamboo", () -> new StrippedBlockOfBambooBlock());
	public static final RegistryObject<Block> BAMBOO_PLANKS = REGISTRY.register("bamboo_planks", () -> new BambooPlanksBlock());
	public static final RegistryObject<Block> BAMBOO_MOSAIC = REGISTRY.register("bamboo_mosaic", () -> new BambooMosaicBlock());
	public static final RegistryObject<Block> BAMBOO_STAIR = REGISTRY.register("bamboo_stair", () -> new BambooStairBlock());
	public static final RegistryObject<Block> BAMBOO_MOSAIC_STAIR = REGISTRY.register("bamboo_mosaic_stair", () -> new BambooMosaicStairBlock());
	public static final RegistryObject<Block> BAMBOO_SLAB = REGISTRY.register("bamboo_slab", () -> new BambooSlabBlock());
	public static final RegistryObject<Block> BAMBOO_MOSAIC_SLAB = REGISTRY.register("bamboo_mosaic_slab", () -> new BambooMosaicSlabBlock());
	public static final RegistryObject<Block> BAMBOO_TRAPDOOR = REGISTRY.register("bamboo_trapdoor", () -> new BambooTrapdoorBlock());
	public static final RegistryObject<Block> BAMBOO_FENCE = REGISTRY.register("bamboo_fence", () -> new BambooFenceBlock());
	public static final RegistryObject<Block> BAMBOO_FENCE_GATE = REGISTRY.register("bamboo_fence_gate", () -> new BambooFenceGateBlock());
	public static final RegistryObject<Block> BAMBOO_PRESSURE_PLATE = REGISTRY.register("bamboo_pressure_plate", () -> new BambooPressurePlateBlock());
	public static final RegistryObject<Block> BAMBOO_BUTTON = REGISTRY.register("bamboo_button", () -> new BambooButtonBlock());
	public static final RegistryObject<Block> HANGING_SIGN_OAK = REGISTRY.register("hanging_sign_oak", () -> new HangingSignOakBlock());
	public static final RegistryObject<Block> HANGING_SIGN_SPRUCE = REGISTRY.register("hanging_sign_spruce", () -> new HangingSignSpruceBlock());
	public static final RegistryObject<Block> HANGING_SIGN_DARK_OAK = REGISTRY.register("hanging_sign_dark_oak", () -> new HangingSignDarkOakBlock());
	public static final RegistryObject<Block> HANGING_SIGN_MANGROVE = REGISTRY.register("hanging_sign_mangrove", () -> new HangingSignMangroveBlock());
	public static final RegistryObject<Block> HANGING_SIGN_ACACIA = REGISTRY.register("hanging_sign_acacia", () -> new HangingSignAcaciaBlock());
	public static final RegistryObject<Block> HANGING_SIGN_BAMBOO = REGISTRY.register("hanging_sign_bamboo", () -> new HangingSignBambooBlock());
	public static final RegistryObject<Block> HANGING_SIGN_BIRCH = REGISTRY.register("hanging_sign_birch", () -> new HangingSignBirchBlock());
	public static final RegistryObject<Block> HANGING_SIGN_JUNGLE = REGISTRY.register("hanging_sign_jungle", () -> new HangingSignJungleBlock());
	public static final RegistryObject<Block> HANGING_SIGN_CRIMSON = REGISTRY.register("hanging_sign_crimson", () -> new HangingSignCrimsonBlock());
	public static final RegistryObject<Block> HANGING_SIGN_WARPED = REGISTRY.register("hanging_sign_warped", () -> new HangingSignWarpedBlock());
	public static final RegistryObject<Block> COMMAND_BLOCK = REGISTRY.register("command_block", () -> new CommandBlockBlock());
	public static final RegistryObject<Block> CHAIN_COMMAND_BLOCK = REGISTRY.register("chain_command_block", () -> new ChainCommandBlockBlock());
	public static final RegistryObject<Block> REPEATING_COMMAND_BLOCK = REGISTRY.register("repeating_command_block", () -> new RepeatingCommandBlockBlock());
	public static final RegistryObject<Block> STRUCTURE_BLOCK = REGISTRY.register("structure_block", () -> new StructureBlockBlock());
	public static final RegistryObject<Block> CHISELED_BOOKSHELF = REGISTRY.register("chiseled_bookshelf", () -> new ChiseledBookshelfBlock());
	public static final RegistryObject<Block> CHERRY_LOG = REGISTRY.register("cherry_log", () -> new CherryLogBlock());
	public static final RegistryObject<Block> CHERRY_PLANKS = REGISTRY.register("cherry_planks", () -> new CherryPlanksBlock());
	public static final RegistryObject<Block> CHERRY_LEAVES = REGISTRY.register("cherry_leaves", () -> new CherryLeavesBlock());
	public static final RegistryObject<Block> CHERRY_SAPLING = REGISTRY.register("cherry_sapling", () -> new CherrySaplingBlock());
	public static final RegistryObject<Block> CHERRY_WOOD = REGISTRY.register("cherry_wood", () -> new CherryWoodBlock());
	public static final RegistryObject<Block> HANGING_SIGN_CHERRY = REGISTRY.register("hanging_sign_cherry", () -> new HangingSignCherryBlock());
	public static final RegistryObject<Block> DOOR_CHERRY = REGISTRY.register("door_cherry", () -> new DoorCherryBlock());
	public static final RegistryObject<Block> CHERRY_TRAPDOOR = REGISTRY.register("cherry_trapdoor", () -> new CherryTrapdoorBlock());
	public static final RegistryObject<Block> CHERRY_BUTTONS = REGISTRY.register("cherry_buttons", () -> new CherryButtonsBlock());
	public static final RegistryObject<Block> FENCE_CHERRY = REGISTRY.register("fence_cherry", () -> new FenceCherryBlock());
	public static final RegistryObject<Block> FENCE_GATE_CHERRY = REGISTRY.register("fence_gate_cherry", () -> new FenceGateCherryBlock());
	public static final RegistryObject<Block> PRESSURE_PLATE_CHERRY = REGISTRY.register("pressure_plate_cherry", () -> new PressurePlateCherryBlock());
	public static final RegistryObject<Block> CHERRY_SLAB = REGISTRY.register("cherry_slab", () -> new CherrySlabBlock());
	public static final RegistryObject<Block> CHERRY_STAIRS = REGISTRY.register("cherry_stairs", () -> new CherryStairsBlock());
}
