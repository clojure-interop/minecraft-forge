(ns net.minecraftforge.client.model.BlockStateLoader$Marker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model BlockStateLoader$Marker]))

(defn ->marker
  "Constructor."
  (^BlockStateLoader$Marker []
    (new BlockStateLoader$Marker )))

(defn forge-marker
  "Instance Field.

  type: int"
  (^Integer [^BlockStateLoader$Marker this]
    (-> this .-forge_marker)))

