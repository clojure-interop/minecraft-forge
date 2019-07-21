(ns net.minecraftforge.event.terraingen.DecorateBiomeEvent$Pre
  "This event is fired before a chunk is decorated with a biome feature."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen DecorateBiomeEvent$Pre]))

(defn ->pre
  "Constructor.

  world - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  (^DecorateBiomeEvent$Pre [^net.minecraft.world.World world ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (new DecorateBiomeEvent$Pre world rand pos)))

