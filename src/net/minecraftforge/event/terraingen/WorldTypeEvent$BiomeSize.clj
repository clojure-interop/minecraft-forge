(ns net.minecraftforge.event.terraingen.WorldTypeEvent$BiomeSize
  "BiomeSize is fired when vanilla Minecraft attempts to generate biomes.
  This event is fired during biome generation in
  GenLayer.initializeAllBiomeGenerators(long, WorldType, ChunkProviderSettings).

  originalSize the original size of the Biome.
  newSize the new size of the biome. Initially set to the originalSize.
  If newSize is set to a new value, that value will be used for the Biome size.

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.TERRAIN_GEN_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen WorldTypeEvent$BiomeSize]))

(defn ->biome-size
  "Constructor.

  world-type - `net.minecraft.world.WorldType`
  original - `int`"
  (^WorldTypeEvent$BiomeSize [^net.minecraft.world.WorldType world-type ^Integer original]
    (new WorldTypeEvent$BiomeSize world-type original)))

(defn get-original-size
  "returns: `int`"
  (^Integer [^WorldTypeEvent$BiomeSize this]
    (-> this (.getOriginalSize))))

(defn get-new-size
  "returns: `int`"
  (^Integer [^WorldTypeEvent$BiomeSize this]
    (-> this (.getNewSize))))

(defn set-new-size
  "new-size - `int`"
  ([^WorldTypeEvent$BiomeSize this ^Integer new-size]
    (-> this (.setNewSize new-size))))

