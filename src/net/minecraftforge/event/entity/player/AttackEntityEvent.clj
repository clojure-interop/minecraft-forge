(ns net.minecraftforge.event.entity.player.AttackEntityEvent
  "AttackEntityEvent is fired when a player attacks an Entity.
  This event is fired whenever a player attacks an Entity in
  EntityPlayer.attackTargetEntityWithCurrentItem(Entity).

  target contains the Entity that was damaged by the player.

  This event is Cancelable.
  If this event is canceled, the player does not attack the Entity.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player AttackEntityEvent]))

(defn ->attack-entity-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  target - `net.minecraft.entity.Entity`"
  (^AttackEntityEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.entity.Entity target]
    (new AttackEntityEvent player target)))

(defn get-target
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^AttackEntityEvent this]
    (-> this (.getTarget))))

