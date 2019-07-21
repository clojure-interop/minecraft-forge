(ns net.minecraft.entity.IEntityMultiPart
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity IEntityMultiPart]))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^IEntityMultiPart this]
    (-> this (.getWorld))))

(defn attack-entity-from-part
  "dragon-part - `net.minecraft.entity.boss.EntityDragonPart`
  source - `net.minecraft.util.DamageSource`
  damage - `float`

  returns: `boolean`"
  (^Boolean [^IEntityMultiPart this ^net.minecraft.entity.boss.EntityDragonPart dragon-part ^net.minecraft.util.DamageSource source ^Float damage]
    (-> this (.attackEntityFromPart dragon-part source damage))))

