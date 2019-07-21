(ns net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate
  "This event is fired when a chunk is decorated with a biome feature.

  You can set the result to DENY to prevent the default biome decoration."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen DecorateBiomeEvent$Decorate]))

(defn ->decorate
  "Constructor.

  world - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`
  type - `net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType`"
  (^DecorateBiomeEvent$Decorate [^net.minecraft.world.World world ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos ^net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType type]
    (new DecorateBiomeEvent$Decorate world rand pos type)))

(defn get-type
  "returns: `net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType`"
  (^net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType [^DecorateBiomeEvent$Decorate this]
    (-> this (.getType))))

