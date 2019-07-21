(ns net.minecraftforge.event.terraingen.DecorateBiomeEvent$Post
  "This event is fired after a chunk is decorated with a biome feature."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen DecorateBiomeEvent$Post]))

(defn ->post
  "Constructor.

  world - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  (^DecorateBiomeEvent$Post [^net.minecraft.world.World world ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (new DecorateBiomeEvent$Post world rand pos)))

