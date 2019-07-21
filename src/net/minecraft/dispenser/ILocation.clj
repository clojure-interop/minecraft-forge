(ns net.minecraft.dispenser.ILocation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.dispenser ILocation]))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^ILocation this]
    (-> this (.getWorld))))

