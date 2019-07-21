(ns net.minecraft.client.audio.ISoundEventAccessor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio ISoundEventAccessor]))

(defn get-weight
  "returns: `int`"
  (^Integer [^ISoundEventAccessor this]
    (-> this (.getWeight))))

(defn clone-entry
  "returns: `T`"
  ([^ISoundEventAccessor this]
    (-> this (.cloneEntry))))

