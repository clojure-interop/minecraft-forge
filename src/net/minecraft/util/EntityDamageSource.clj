(ns net.minecraft.util.EntityDamageSource
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util EntityDamageSource]))

(defn ->entity-damage-source
  "Constructor.

  damage-type-in - `java.lang.String`
  damage-source-entity-in - `net.minecraft.entity.Entity`"
  (^EntityDamageSource [^java.lang.String damage-type-in ^net.minecraft.entity.Entity damage-source-entity-in]
    (new EntityDamageSource damage-type-in damage-source-entity-in)))

(defn set-is-thorns-damage
  "returns: `net.minecraft.util.EntityDamageSource`"
  (^net.minecraft.util.EntityDamageSource [^EntityDamageSource this]
    (-> this (.setIsThornsDamage))))

(defn get-is-thorns-damage?
  "returns: `boolean`"
  (^Boolean [^EntityDamageSource this]
    (-> this (.getIsThornsDamage))))

(defn get-entity
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^EntityDamageSource this]
    (-> this (.getEntity))))

(defn get-death-message
  "entity-living-base-in - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^EntityDamageSource this ^net.minecraft.entity.EntityLivingBase entity-living-base-in]
    (-> this (.getDeathMessage entity-living-base-in))))

(defn difficulty-scaled?
  "returns: `boolean`"
  (^Boolean [^EntityDamageSource this]
    (-> this (.isDifficultyScaled))))

(defn get-damage-location
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^EntityDamageSource this]
    (-> this (.getDamageLocation))))

