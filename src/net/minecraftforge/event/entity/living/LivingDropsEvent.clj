(ns net.minecraftforge.event.entity.living.LivingDropsEvent
  "LivingDropsEvent is fired when an Entity's death causes dropped items to appear.
  This event is fired whenever an Entity dies and drops items in
  EntityLivingBase.onDeath(DamageSource).

  This event is fired via the ForgeHooks.onLivingDrops(EntityLivingBase, DamageSource, ArrayList, int, boolean).

  source contains the DamageSource that caused the drop to occur.
  drops contains the ArrayList of EntityItems that will be dropped.
  lootingLevel contains the amount of loot that will be dropped.
  recentlyHit determines whether the Entity doing the drop has recently been damaged.

  This event is Cancelable.
  If this event is canceled, the Entity does not drop anything.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingDropsEvent]))

(defn ->living-drops-event
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`
  source - `net.minecraft.util.DamageSource`
  drops - `java.util.List`
  looting-level - `int`
  recently-hit - `boolean`"
  (^LivingDropsEvent [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.util.DamageSource source ^java.util.List drops ^Integer looting-level ^Boolean recently-hit]
    (new LivingDropsEvent entity source drops looting-level recently-hit)))

(defn get-source
  "returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^LivingDropsEvent this]
    (-> this (.getSource))))

(defn get-drops
  "returns: `java.util.List<net.minecraft.entity.item.EntityItem>`"
  (^java.util.List [^LivingDropsEvent this]
    (-> this (.getDrops))))

(defn get-looting-level
  "returns: `int`"
  (^Integer [^LivingDropsEvent this]
    (-> this (.getLootingLevel))))

(defn recently-hit?
  "returns: `boolean`"
  (^Boolean [^LivingDropsEvent this]
    (-> this (.isRecentlyHit))))

