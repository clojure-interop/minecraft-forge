(ns net.minecraftforge.event.terraingen.BiomeEvent$CreateDecorator
  "CreateDecorator is fired when a BiomeDecorator is created.
  This event is fired whenever a BiomeDecorator is created in
  DeferredBiomeDecorator.fireCreateEventAndReplace(Biome).

  originalBiomeDecorator contains the original BiomeDecorator that would be used in vanilla.
  newBiomeDecorator contains the new BiomeDecoration to be used by Minecraft.

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.TERRAIN_GEN_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen BiomeEvent$CreateDecorator]))

(defn ->create-decorator
  "Constructor.

  biome - `net.minecraft.world.biome.Biome`
  original - `net.minecraft.world.biome.BiomeDecorator`"
  (^BiomeEvent$CreateDecorator [^net.minecraft.world.biome.Biome biome ^net.minecraft.world.biome.BiomeDecorator original]
    (new BiomeEvent$CreateDecorator biome original)))

(defn get-original-biome-decorator
  "returns: `net.minecraft.world.biome.BiomeDecorator`"
  (^net.minecraft.world.biome.BiomeDecorator [^BiomeEvent$CreateDecorator this]
    (-> this (.getOriginalBiomeDecorator))))

(defn get-new-biome-decorator
  "returns: `net.minecraft.world.biome.BiomeDecorator`"
  (^net.minecraft.world.biome.BiomeDecorator [^BiomeEvent$CreateDecorator this]
    (-> this (.getNewBiomeDecorator))))

(defn set-new-biome-decorator
  "new-biome-decorator - `net.minecraft.world.biome.BiomeDecorator`"
  ([^BiomeEvent$CreateDecorator this ^net.minecraft.world.biome.BiomeDecorator new-biome-decorator]
    (-> this (.setNewBiomeDecorator new-biome-decorator))))

