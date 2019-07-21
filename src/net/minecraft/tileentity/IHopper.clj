(ns net.minecraft.tileentity.IHopper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity IHopper]))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^IHopper this]
    (-> this (.getWorld))))

(defn get-x-pos
  "returns: `double`"
  (^Double [^IHopper this]
    (-> this (.getXPos))))

(defn get-y-pos
  "returns: `double`"
  (^Double [^IHopper this]
    (-> this (.getYPos))))

(defn get-z-pos
  "returns: `double`"
  (^Double [^IHopper this]
    (-> this (.getZPos))))

