(ns net.minecraft.client.audio.MovingSoundMinecart
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio MovingSoundMinecart]))

(defn ->moving-sound-minecart
  "Constructor.

  minecart-in - `net.minecraft.entity.item.EntityMinecart`"
  (^MovingSoundMinecart [^net.minecraft.entity.item.EntityMinecart minecart-in]
    (new MovingSoundMinecart minecart-in)))

(defn update
  ""
  ([^MovingSoundMinecart this]
    (-> this (.update))))

