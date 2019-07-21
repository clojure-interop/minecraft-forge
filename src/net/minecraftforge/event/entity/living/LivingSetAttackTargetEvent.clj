(ns net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent
  "LivingSetAttackTargetEvent is fired when an Entity sets a target to attack.
  This event is fired whenever an Entity sets a target to attack in
  EntityLiving.setAttackTarget(EntityLivingBase) and
  EntityLivingBase.setRevengeTarget(EntityLivingBase).

  This event is fired via the ForgeHooks.onLivingSetAttackTarget(EntityLivingBase, EntityLivingBase).

  target contains the newly targeted Entity.

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingSetAttackTargetEvent]))

(defn ->living-set-attack-target-event
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`
  target - `net.minecraft.entity.EntityLivingBase`"
  (^LivingSetAttackTargetEvent [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.entity.EntityLivingBase target]
    (new LivingSetAttackTargetEvent entity target)))

(defn get-target
  "returns: `net.minecraft.entity.EntityLivingBase`"
  (^net.minecraft.entity.EntityLivingBase [^LivingSetAttackTargetEvent this]
    (-> this (.getTarget))))

