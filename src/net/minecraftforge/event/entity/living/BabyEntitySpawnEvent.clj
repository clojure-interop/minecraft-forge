(ns net.minecraftforge.event.entity.living.BabyEntitySpawnEvent
  "BabyEntitySpawnEvent is fired just before a baby entity is about to be spawned.
  Parents will have disengaged their relationship. @Cancelable
  It is possible to change the child completely by using setChild(EntityAgeable)
  This event is fired from EntityAIMate.spawnBaby() and EntityAIVillagerMate.giveBirth()

  parentA contains the initiating parent entity.
  parentB contains the secondary parent entity.
  causedByPlayer contains the player responsible for the breading (if applicable).
  child contains the child that will be spawned.

  This event is Cancelable.
  If this event is canceled, the child Entity is not added to the world, and the parents
  will no longer attempt to mate.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living BabyEntitySpawnEvent]))

(defn ->baby-entity-spawn-event
  "Constructor.

  parent-a - `net.minecraft.entity.EntityLiving`
  parent-b - `net.minecraft.entity.EntityLiving`
  proposed-child - `net.minecraft.entity.EntityAgeable`"
  (^BabyEntitySpawnEvent [^net.minecraft.entity.EntityLiving parent-a ^net.minecraft.entity.EntityLiving parent-b ^net.minecraft.entity.EntityAgeable proposed-child]
    (new BabyEntitySpawnEvent parent-a parent-b proposed-child)))

(defn get-parent-a
  "returns: `net.minecraft.entity.EntityLiving`"
  (^net.minecraft.entity.EntityLiving [^BabyEntitySpawnEvent this]
    (-> this (.getParentA))))

(defn get-parent-b
  "returns: `net.minecraft.entity.EntityLiving`"
  (^net.minecraft.entity.EntityLiving [^BabyEntitySpawnEvent this]
    (-> this (.getParentB))))

(defn get-caused-by-player
  "returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^BabyEntitySpawnEvent this]
    (-> this (.getCausedByPlayer))))

(defn get-child
  "returns: `net.minecraft.entity.EntityAgeable`"
  (^net.minecraft.entity.EntityAgeable [^BabyEntitySpawnEvent this]
    (-> this (.getChild))))

(defn set-child
  "proposed-child - `net.minecraft.entity.EntityAgeable`"
  ([^BabyEntitySpawnEvent this ^net.minecraft.entity.EntityAgeable proposed-child]
    (-> this (.setChild proposed-child))))

