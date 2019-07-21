(ns net.minecraft.client.audio.ITickableSound
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio ITickableSound]))

(defn done-playing?
  "returns: `boolean`"
  (^Boolean [^ITickableSound this]
    (-> this (.isDonePlaying))))

