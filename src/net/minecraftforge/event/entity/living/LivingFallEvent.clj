(ns net.minecraftforge.event.entity.living.LivingFallEvent
  "LivingFallEvent is fired when an Entity is set to be falling.
  This event is fired whenever an Entity is set to fall in
  EntityLivingBase.fall(float, float).

  This event is fired via the ForgeHooks.onLivingFall(EntityLivingBase, float, float).

  distance contains the distance the Entity is to fall. If this event is canceled, this value is set to 0.0F.

  This event is Cancelable.
  If this event is canceled, the Entity does not fall.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingFallEvent]))

(defn ->living-fall-event
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`
  distance - `float`
  damage-multiplier - `float`"
  (^LivingFallEvent [^net.minecraft.entity.EntityLivingBase entity ^Float distance ^Float damage-multiplier]
    (new LivingFallEvent entity distance damage-multiplier)))

(defn get-distance
  "returns: `float`"
  (^Float [^LivingFallEvent this]
    (-> this (.getDistance))))

(defn set-distance
  "distance - `float`"
  ([^LivingFallEvent this ^Float distance]
    (-> this (.setDistance distance))))

(defn get-damage-multiplier
  "returns: `float`"
  (^Float [^LivingFallEvent this]
    (-> this (.getDamageMultiplier))))

(defn set-damage-multiplier
  "damage-multiplier - `float`"
  ([^LivingFallEvent this ^Float damage-multiplier]
    (-> this (.setDamageMultiplier damage-multiplier))))

