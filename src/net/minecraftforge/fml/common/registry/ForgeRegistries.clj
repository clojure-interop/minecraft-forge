(ns net.minecraftforge.fml.common.registry.ForgeRegistries
  "A class that exposes static references to all vanilla and Forge registries.
  Created to have a central place to access the registries directly if modders need.
  It is still advised that if you are registering things to go through GameRegistry register methods, but queries and iterations can use this."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry ForgeRegistries]))

(defn ->forge-registries
  "Constructor."
  (^ForgeRegistries []
    (new ForgeRegistries )))

(def *-blocks
  "Static Constant.

  type: net.minecraftforge.fml.common.registry.IForgeRegistry<net.minecraft.block.Block>"
  ForgeRegistries/BLOCKS)

(def *-items
  "Static Constant.

  type: net.minecraftforge.fml.common.registry.IForgeRegistry<net.minecraft.item.Item>"
  ForgeRegistries/ITEMS)

(def *-potions
  "Static Constant.

  type: net.minecraftforge.fml.common.registry.IForgeRegistry<net.minecraft.potion.Potion>"
  ForgeRegistries/POTIONS)

(def *-biomes
  "Static Constant.

  type: net.minecraftforge.fml.common.registry.IForgeRegistry<net.minecraft.world.biome.Biome>"
  ForgeRegistries/BIOMES)

(def *-sound-events
  "Static Constant.

  type: net.minecraftforge.fml.common.registry.IForgeRegistry<net.minecraft.util.SoundEvent>"
  ForgeRegistries/SOUND_EVENTS)

(def *-potion-types
  "Static Constant.

  type: net.minecraftforge.fml.common.registry.IForgeRegistry<net.minecraft.potion.PotionType>"
  ForgeRegistries/POTION_TYPES)

(def *-enchantments
  "Static Constant.

  type: net.minecraftforge.fml.common.registry.IForgeRegistry<net.minecraft.enchantment.Enchantment>"
  ForgeRegistries/ENCHANTMENTS)

(def *-villager-professions
  "Static Constant.

  type: net.minecraftforge.fml.common.registry.IForgeRegistry<net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerProfession>"
  ForgeRegistries/VILLAGER_PROFESSIONS)

(def *-entities
  "Static Constant.

  type: net.minecraftforge.fml.common.registry.IForgeRegistry<net.minecraftforge.fml.common.registry.EntityEntry>"
  ForgeRegistries/ENTITIES)

