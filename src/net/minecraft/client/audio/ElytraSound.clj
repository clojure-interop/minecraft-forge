(ns net.minecraft.client.audio.ElytraSound
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio ElytraSound]))

(defn ->elytra-sound
  "Constructor.

  p-i-47113-1 - `net.minecraft.client.entity.EntityPlayerSP`"
  (^ElytraSound [^net.minecraft.client.entity.EntityPlayerSP p-i-47113-1]
    (new ElytraSound p-i-47113-1)))

(defn update
  ""
  ([^ElytraSound this]
    (-> this (.update))))

