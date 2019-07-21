(ns net.minecraft.village.VillageSiege
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.village VillageSiege]))

(defn ->village-siege
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^VillageSiege [^net.minecraft.world.World world-in]
    (new VillageSiege world-in)))

(defn tick
  ""
  ([^VillageSiege this]
    (-> this (.tick))))

