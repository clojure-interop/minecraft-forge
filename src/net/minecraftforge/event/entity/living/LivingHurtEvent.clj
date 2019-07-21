(ns net.minecraftforge.event.entity.living.LivingHurtEvent
  "LivingHurtEvent is fired when an Entity is set to be hurt.
  This event is fired whenever an Entity is hurt in
  EntityLivingBase.damageEntity(DamageSource, float) and
  EntityPlayer.damageEntity(DamageSource, float).

  This event is fired via the ForgeHooks.onLivingHurt(EntityLivingBase, DamageSource, float).

  source contains the DamageSource that caused this Entity to be hurt.
  amount contains the amount of damage dealt to the Entity that was hurt.

  This event is Cancelable.
  If this event is canceled, the Entity is not hurt.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingHurtEvent]))

(defn ->living-hurt-event
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`
  source - `net.minecraft.util.DamageSource`
  amount - `float`"
  (^LivingHurtEvent [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.util.DamageSource source ^Float amount]
    (new LivingHurtEvent entity source amount)))

(defn get-source
  "returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^LivingHurtEvent this]
    (-> this (.getSource))))

(defn get-amount
  "returns: `float`"
  (^Float [^LivingHurtEvent this]
    (-> this (.getAmount))))

(defn set-amount
  "amount - `float`"
  ([^LivingHurtEvent this ^Float amount]
    (-> this (.setAmount amount))))

