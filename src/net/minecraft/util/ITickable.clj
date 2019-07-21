(ns net.minecraft.util.ITickable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util ITickable]))

(defn update
  ""
  ([^ITickable this]
    (-> this (.update))))

