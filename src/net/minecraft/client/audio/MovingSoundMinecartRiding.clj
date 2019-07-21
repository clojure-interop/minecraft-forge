(ns net.minecraft.client.audio.MovingSoundMinecartRiding
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio MovingSoundMinecartRiding]))

(defn ->moving-sound-minecart-riding
  "Constructor.

  player-riding - `net.minecraft.entity.player.EntityPlayer`
  minecart - `net.minecraft.entity.item.EntityMinecart`"
  (^MovingSoundMinecartRiding [^net.minecraft.entity.player.EntityPlayer player-riding ^net.minecraft.entity.item.EntityMinecart minecart]
    (new MovingSoundMinecartRiding player-riding minecart)))

(defn update
  ""
  ([^MovingSoundMinecartRiding this]
    (-> this (.update))))

