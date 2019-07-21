(ns net.minecraftforge.event.terraingen.BiomeEvent$BiomeColor
  "BiomeColor is fired whenever an event involving biome colors occurs.
  If a method utilizes this Event as its parameter, the method will
  receive every child event of this class.

  All children of this event are fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen BiomeEvent$BiomeColor]))

(defn ->biome-color
  "Constructor.

  biome - `net.minecraft.world.biome.Biome`
  original - `int`"
  (^BiomeEvent$BiomeColor [^net.minecraft.world.biome.Biome biome ^Integer original]
    (new BiomeEvent$BiomeColor biome original)))

(defn get-original-color
  "returns: `int`"
  (^Integer [^BiomeEvent$BiomeColor this]
    (-> this (.getOriginalColor))))

(defn get-new-color
  "returns: `int`"
  (^Integer [^BiomeEvent$BiomeColor this]
    (-> this (.getNewColor))))

(defn set-new-color
  "new-color - `int`"
  ([^BiomeEvent$BiomeColor this ^Integer new-color]
    (-> this (.setNewColor new-color))))

