(ns net.minecraft.client.audio.MovingSound
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio MovingSound]))

(defn done-playing?
  "returns: `boolean`"
  (^Boolean [^MovingSound this]
    (-> this (.isDonePlaying))))

