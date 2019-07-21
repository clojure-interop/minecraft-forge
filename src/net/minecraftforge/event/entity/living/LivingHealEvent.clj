(ns net.minecraftforge.event.entity.living.LivingHealEvent
  "LivingHealEvent is fired when an Entity is set to be healed.
  This event is fired whenever an Entity is healed in EntityLivingBase.heal(float)

  This event is fired via the ForgeEventFactory.onLivingHeal(EntityLivingBase, float).

  amount contains the amount of healing done to the Entity that was healed.

  This event is Cancelable.
  If this event is canceled, the Entity is not healed.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingHealEvent]))

(defn ->living-heal-event
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`
  amount - `float`"
  (^LivingHealEvent [^net.minecraft.entity.EntityLivingBase entity ^Float amount]
    (new LivingHealEvent entity amount)))

(defn get-amount
  "returns: `float`"
  (^Float [^LivingHealEvent this]
    (-> this (.getAmount))))

(defn set-amount
  "amount - `float`"
  ([^LivingHealEvent this ^Float amount]
    (-> this (.setAmount amount))))

