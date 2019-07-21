(ns net.minecraftforge.event.terraingen.InitNoiseGensEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen InitNoiseGensEvent]))

(defn ->init-noise-gens-event
  "Constructor.

  world - `net.minecraft.world.World`
  rand - `java.util.Random`
  original - `T`"
  (^InitNoiseGensEvent [^net.minecraft.world.World world ^java.util.Random rand original]
    (new InitNoiseGensEvent world rand original)))

(defn get-random
  "returns: `java.util.Random`"
  (^java.util.Random [^InitNoiseGensEvent this]
    (-> this (.getRandom))))

(defn get-original
  "returns: `T`"
  ([^InitNoiseGensEvent this]
    (-> this (.getOriginal))))

(defn get-new-values
  "returns: `T`"
  ([^InitNoiseGensEvent this]
    (-> this (.getNewValues))))

