(ns net.minecraft.init.Biomes
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.init Biomes]))

(defn ->biomes
  "Constructor."
  (^Biomes []
    (new Biomes )))

(def *-ocean
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/OCEAN)

(def *-default
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/DEFAULT)

(def *-plains
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/PLAINS)

(def *-desert
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/DESERT)

(def *-extreme-hills
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/EXTREME_HILLS)

(def *-forest
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/FOREST)

(def *-taiga
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/TAIGA)

(def *-swampland
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/SWAMPLAND)

(def *-river
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/RIVER)

(def *-hell
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/HELL)

(def *-sky
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/SKY)

(def *-frozen-ocean
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/FROZEN_OCEAN)

(def *-frozen-river
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/FROZEN_RIVER)

(def *-ice-plains
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/ICE_PLAINS)

(def *-ice-mountains
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/ICE_MOUNTAINS)

(def *-mushroom-island
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUSHROOM_ISLAND)

(def *-mushroom-island-shore
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUSHROOM_ISLAND_SHORE)

(def *-beach
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/BEACH)

(def *-desert-hills
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/DESERT_HILLS)

(def *-forest-hills
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/FOREST_HILLS)

(def *-taiga-hills
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/TAIGA_HILLS)

(def *-extreme-hills-edge
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/EXTREME_HILLS_EDGE)

(def *-jungle
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/JUNGLE)

(def *-jungle-hills
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/JUNGLE_HILLS)

(def *-jungle-edge
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/JUNGLE_EDGE)

(def *-deep-ocean
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/DEEP_OCEAN)

(def *-stone-beach
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/STONE_BEACH)

(def *-cold-beach
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/COLD_BEACH)

(def *-birch-forest
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/BIRCH_FOREST)

(def *-birch-forest-hills
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/BIRCH_FOREST_HILLS)

(def *-roofed-forest
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/ROOFED_FOREST)

(def *-cold-taiga
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/COLD_TAIGA)

(def *-cold-taiga-hills
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/COLD_TAIGA_HILLS)

(def *-redwood-taiga
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/REDWOOD_TAIGA)

(def *-redwood-taiga-hills
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/REDWOOD_TAIGA_HILLS)

(def *-extreme-hills-with-trees
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/EXTREME_HILLS_WITH_TREES)

(def *-savanna
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/SAVANNA)

(def *-savanna-plateau
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/SAVANNA_PLATEAU)

(def *-mesa
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MESA)

(def *-mesa-rock
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MESA_ROCK)

(def *-mesa-clear-rock
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MESA_CLEAR_ROCK)

(def *-void
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/VOID)

(def *-mutated-plains
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_PLAINS)

(def *-mutated-desert
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_DESERT)

(def *-mutated-extreme-hills
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_EXTREME_HILLS)

(def *-mutated-forest
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_FOREST)

(def *-mutated-taiga
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_TAIGA)

(def *-mutated-swampland
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_SWAMPLAND)

(def *-mutated-ice-flats
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_ICE_FLATS)

(def *-mutated-jungle
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_JUNGLE)

(def *-mutated-jungle-edge
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_JUNGLE_EDGE)

(def *-mutated-birch-forest
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_BIRCH_FOREST)

(def *-mutated-birch-forest-hills
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_BIRCH_FOREST_HILLS)

(def *-mutated-roofed-forest
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_ROOFED_FOREST)

(def *-mutated-taiga-cold
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_TAIGA_COLD)

(def *-mutated-redwood-taiga
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_REDWOOD_TAIGA)

(def *-mutated-redwood-taiga-hills
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_REDWOOD_TAIGA_HILLS)

(def *-mutated-extreme-hills-with-trees
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_EXTREME_HILLS_WITH_TREES)

(def *-mutated-savanna
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_SAVANNA)

(def *-mutated-savanna-rock
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_SAVANNA_ROCK)

(def *-mutated-mesa
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_MESA)

(def *-mutated-mesa-rock
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_MESA_ROCK)

(def *-mutated-mesa-clear-rock
  "Static Constant.

  type: net.minecraft.world.biome.Biome"
  Biomes/MUTATED_MESA_CLEAR_ROCK)

