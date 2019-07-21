(ns net.minecraftforge.event.terraingen.WorldTypeEvent$InitBiomeGens
  "InitBiomeGens is fired when vanilla Minecraft attempts to initialize the biome providers.
  This event is fired just during biome provider initialization in
  BiomeProvider.BiomeProvider(long, WorldType, String).

  seed the seed of the world.
  originalBiomeGens the array of GenLayers original intended for this Biome generation.
  newBiomeGens the array of GenLayers that will now be used for this Biome generation.
  If newBiomeGens is set to a new value, that value will be used for the Biome generator.

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.TERRAIN_GEN_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen WorldTypeEvent$InitBiomeGens]))

(defn ->init-biome-gens
  "Constructor.

  world-type - `net.minecraft.world.WorldType`
  seed - `long`
  original - `net.minecraft.world.gen.layer.GenLayer[]`"
  (^WorldTypeEvent$InitBiomeGens [^net.minecraft.world.WorldType world-type ^Long seed original]
    (new WorldTypeEvent$InitBiomeGens world-type seed original)))

(defn get-seed
  "returns: `long`"
  (^Long [^WorldTypeEvent$InitBiomeGens this]
    (-> this (.getSeed))))

(defn get-original-biome-gens
  "returns: `net.minecraft.world.gen.layer.GenLayer[]`"
  ([^WorldTypeEvent$InitBiomeGens this]
    (-> this (.getOriginalBiomeGens))))

(defn get-new-biome-gens
  "returns: `net.minecraft.world.gen.layer.GenLayer[]`"
  ([^WorldTypeEvent$InitBiomeGens this]
    (-> this (.getNewBiomeGens))))

(defn set-new-biome-gens
  "new-biome-gens - `net.minecraft.world.gen.layer.GenLayer[]`"
  ([^WorldTypeEvent$InitBiomeGens this new-biome-gens]
    (-> this (.setNewBiomeGens new-biome-gens))))

