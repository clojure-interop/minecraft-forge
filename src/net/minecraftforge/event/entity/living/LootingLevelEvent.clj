(ns net.minecraftforge.event.entity.living.LootingLevelEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LootingLevelEvent]))

(defn ->looting-level-event
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`
  damage-source - `net.minecraft.util.DamageSource`
  looting-level - `int`"
  (^LootingLevelEvent [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.util.DamageSource damage-source ^Integer looting-level]
    (new LootingLevelEvent entity damage-source looting-level)))

(defn get-damage-source
  "returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^LootingLevelEvent this]
    (-> this (.getDamageSource))))

(defn get-looting-level
  "returns: `int`"
  (^Integer [^LootingLevelEvent this]
    (-> this (.getLootingLevel))))

(defn set-looting-level
  "looting-level - `int`"
  ([^LootingLevelEvent this ^Integer looting-level]
    (-> this (.setLootingLevel looting-level))))

