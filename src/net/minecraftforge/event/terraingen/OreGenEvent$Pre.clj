(ns net.minecraftforge.event.terraingen.OreGenEvent$Pre
  "OreGenEvent.Pre is fired just before a chunk is populated with ores.
  This event is fired just before ore generation in
  BiomeDecorator.generateOres(World, Random).

  This event is not Cancelable.

  This event does not have a result. Event.HasResult

  This event is fired on the MinecraftForge.ORE_GEN_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen OreGenEvent$Pre]))

(defn ->pre
  "Constructor.

  world - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  (^OreGenEvent$Pre [^net.minecraft.world.World world ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (new OreGenEvent$Pre world rand pos)))

