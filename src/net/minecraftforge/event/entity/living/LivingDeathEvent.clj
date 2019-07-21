(ns net.minecraftforge.event.entity.living.LivingDeathEvent
  "LivingDeathEvent is fired when an Entity dies.
  This event is fired whenever an Entity dies in
  EntityLivingBase.onDeath(DamageSource),
  EntityPlayer.onDeath(DamageSource), and
  EntityPlayerMP.onDeath(DamageSource).

  This event is fired via the ForgeHooks.onLivingDeath(EntityLivingBase, DamageSource).

  source contains the DamageSource that caused the entity to die.

  This event is Cancelable.
  If this event is canceled, the Entity does not die.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingDeathEvent]))

(defn ->living-death-event
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`
  source - `net.minecraft.util.DamageSource`"
  (^LivingDeathEvent [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.util.DamageSource source]
    (new LivingDeathEvent entity source)))

(defn get-source
  "returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^LivingDeathEvent this]
    (-> this (.getSource))))

