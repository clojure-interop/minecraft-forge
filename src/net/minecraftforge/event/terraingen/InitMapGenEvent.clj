(ns net.minecraftforge.event.terraingen.InitMapGenEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen InitMapGenEvent]))

(defn get-type
  "returns: `net.minecraftforge.event.terraingen.InitMapGenEvent$EventType`"
  (^net.minecraftforge.event.terraingen.InitMapGenEvent$EventType [^InitMapGenEvent this]
    (-> this (.getType))))

(defn get-original-gen
  "returns: `net.minecraft.world.gen.MapGenBase`"
  (^net.minecraft.world.gen.MapGenBase [^InitMapGenEvent this]
    (-> this (.getOriginalGen))))

(defn get-new-gen
  "returns: `net.minecraft.world.gen.MapGenBase`"
  (^net.minecraft.world.gen.MapGenBase [^InitMapGenEvent this]
    (-> this (.getNewGen))))

(defn set-new-gen
  "new-gen - `net.minecraft.world.gen.MapGenBase`"
  ([^InitMapGenEvent this ^net.minecraft.world.gen.MapGenBase new-gen]
    (-> this (.setNewGen new-gen))))

