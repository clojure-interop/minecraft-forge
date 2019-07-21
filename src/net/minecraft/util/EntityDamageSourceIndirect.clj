(ns net.minecraft.util.EntityDamageSourceIndirect
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util EntityDamageSourceIndirect]))

(defn ->entity-damage-source-indirect
  "Constructor.

  damage-type-in - `java.lang.String`
  source - `net.minecraft.entity.Entity`
  indirect-entity-in - `net.minecraft.entity.Entity`"
  (^EntityDamageSourceIndirect [^java.lang.String damage-type-in ^net.minecraft.entity.Entity source ^net.minecraft.entity.Entity indirect-entity-in]
    (new EntityDamageSourceIndirect damage-type-in source indirect-entity-in)))

(defn get-source-of-damage
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^EntityDamageSourceIndirect this]
    (-> this (.getSourceOfDamage))))

(defn get-entity
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^EntityDamageSourceIndirect this]
    (-> this (.getEntity))))

(defn get-death-message
  "entity-living-base-in - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^EntityDamageSourceIndirect this ^net.minecraft.entity.EntityLivingBase entity-living-base-in]
    (-> this (.getDeathMessage entity-living-base-in))))

