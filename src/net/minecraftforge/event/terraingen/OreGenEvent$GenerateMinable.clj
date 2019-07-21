(ns net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable
  "GenerateMinable is fired when a mineable block is generated in a chunk.
  This event is fired just after ore generation in
  BiomeDecorator.generateOres(World, Random).

  type contains the enum value for the Ore attempting to be generated.
  generator contains the WorldGenerator generating this ore.

  This event is not Cancelable.

  This event has a result. Event.HasResult
  This result determines whether the ore is allowed to be generated.

  This event is fired on the MinecraftForge.ORE_GEN_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen OreGenEvent$GenerateMinable]))

(defn ->generate-minable
  "Constructor.

  world - `net.minecraft.world.World`
  rand - `java.util.Random`
  generator - `net.minecraft.world.gen.feature.WorldGenerator`
  pos - `net.minecraft.util.math.BlockPos`
  type - `net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType`"
  (^OreGenEvent$GenerateMinable [^net.minecraft.world.World world ^java.util.Random rand ^net.minecraft.world.gen.feature.WorldGenerator generator ^net.minecraft.util.math.BlockPos pos ^net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType type]
    (new OreGenEvent$GenerateMinable world rand generator pos type)))

(defn get-type
  "returns: `net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType`"
  (^net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType [^OreGenEvent$GenerateMinable this]
    (-> this (.getType))))

(defn get-generator
  "returns: `net.minecraft.world.gen.feature.WorldGenerator`"
  (^net.minecraft.world.gen.feature.WorldGenerator [^OreGenEvent$GenerateMinable this]
    (-> this (.getGenerator))))

