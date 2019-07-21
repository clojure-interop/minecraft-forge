(ns net.minecraftforge.event.entity.player.PlayerEvent$Clone
  "Fired when the EntityPlayer is cloned, typically caused by the network sending a RESPAWN_PLAYER event.
  Either caused by death, or by traveling from the End to the overworld."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerEvent$Clone]))

(defn ->clone
  "Constructor.

  new - `net.minecraft.entity.player.EntityPlayer`
  old-player - `net.minecraft.entity.player.EntityPlayer`
  was-death - `boolean`"
  (^PlayerEvent$Clone [^net.minecraft.entity.player.EntityPlayer new ^net.minecraft.entity.player.EntityPlayer old-player ^Boolean was-death]
    (new PlayerEvent$Clone new old-player was-death)))

(defn get-original
  "The old EntityPlayer that this new entity is a clone of.

  returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^PlayerEvent$Clone this]
    (-> this (.getOriginal))))

(defn was-death?
  "True if this event was fired because the player died.
   False if it was fired because the entity switched dimensions.

  returns: `boolean`"
  (^Boolean [^PlayerEvent$Clone this]
    (-> this (.isWasDeath))))

