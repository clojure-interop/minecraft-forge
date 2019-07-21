(ns net.minecraftforge.event.entity.living.LivingAttackEvent
  "LivingAttackEvent is fired when a living Entity is attacked.
  This event is fired whenever an Entity is attacked in
  EntityLivingBase.attackEntityFrom(DamageSource, float) and
  EntityPlayer.attackEntityFrom(DamageSource, float).

  This event is fired via the ForgeHooks.onLivingAttack(EntityLivingBase, DamageSource, float).

  source contains the DamageSource of the attack.
  amount contains the amount of damage dealt to the entity.

  This event is Cancelable.
  If this event is canceled, the Entity does not take attack damage.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingAttackEvent]))

(defn ->living-attack-event
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`
  source - `net.minecraft.util.DamageSource`
  amount - `float`"
  (^LivingAttackEvent [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.util.DamageSource source ^Float amount]
    (new LivingAttackEvent entity source amount)))

(defn get-source
  "returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^LivingAttackEvent this]
    (-> this (.getSource))))

(defn get-amount
  "returns: `float`"
  (^Float [^LivingAttackEvent this]
    (-> this (.getAmount))))

