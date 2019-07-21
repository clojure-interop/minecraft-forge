(ns net.minecraftforge.event.terraingen.DecorateBiomeEvent
  "DecorateBiomeEvent is fired when a BiomeDecorator is created.

  This event is fired whenever a BiomeDecorator is created in
  DeferredBiomeDecorator.fireCreateEventAndReplace(Biome).

  world contains the world that is being decorated.
  rand contains an instance of Random to be used.
  pos contains the coordinates of the Chunk being decorated.

  This event is not Cancelable.

  This event does not have a result. Event.HasResult

  This event is fired on the MinecraftForge.TERRAIN_GEN_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen DecorateBiomeEvent]))

(defn ->decorate-biome-event
  "Constructor.

  world - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  (^DecorateBiomeEvent [^net.minecraft.world.World world ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (new DecorateBiomeEvent world rand pos)))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^DecorateBiomeEvent this]
    (-> this (.getWorld))))

(defn get-rand
  "returns: `java.util.Random`"
  (^java.util.Random [^DecorateBiomeEvent this]
    (-> this (.getRand))))

(defn get-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^DecorateBiomeEvent this]
    (-> this (.getPos))))

