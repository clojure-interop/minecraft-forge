(ns net.minecraftforge.event.entity.player.PlayerFlyableFallEvent
  "Occurs when a player falls, but is able to fly.  Doesn't need to be cancelable, this is mainly for notification purposes."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerFlyableFallEvent]))

(defn ->player-flyable-fall-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  distance - `float`
  multiplier - `float`"
  (^PlayerFlyableFallEvent [^net.minecraft.entity.player.EntityPlayer player ^Float distance ^Float multiplier]
    (new PlayerFlyableFallEvent player distance multiplier)))

(defn get-distance
  "returns: `float`"
  (^Float [^PlayerFlyableFallEvent this]
    (-> this (.getDistance))))

(defn set-distance
  "distance - `float`"
  ([^PlayerFlyableFallEvent this ^Float distance]
    (-> this (.setDistance distance))))

(defn get-multiplier
  "returns: `float`"
  (^Float [^PlayerFlyableFallEvent this]
    (-> this (.getMultiplier))))

(defn set-multiplier
  "multiplier - `float`"
  ([^PlayerFlyableFallEvent this ^Float multiplier]
    (-> this (.setMultiplier multiplier))))

