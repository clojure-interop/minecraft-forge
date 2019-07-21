(ns net.minecraftforge.event.terraingen.OreGenEvent$Post
  "OreGenEvent.Post is fired just after a chunk is populated with ores.
  This event is fired just after ore generation in
  BiomeDecorator.generateOres(World, Random).

  This event is not Cancelable.

  This event does not have a result. Event.HasResult

  This event is fired on the MinecraftForge.ORE_GEN_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen OreGenEvent$Post]))

(defn ->post
  "Constructor.

  world - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  (^OreGenEvent$Post [^net.minecraft.world.World world ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (new OreGenEvent$Post world rand pos)))

