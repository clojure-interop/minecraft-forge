(ns net.minecraft.entity.boss.EntityDragonPart
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.boss EntityDragonPart]))

(defn ->entity-dragon-part
  "Constructor.

  parent - `net.minecraft.entity.IEntityMultiPart`
  part-name - `java.lang.String`
  base - `float`
  size-height - `float`"
  (^EntityDragonPart [^net.minecraft.entity.IEntityMultiPart parent ^java.lang.String part-name ^Float base ^Float size-height]
    (new EntityDragonPart parent part-name base size-height)))

(defn entity-dragon-obj
  "Instance Constant.

  type: net.minecraft.entity.IEntityMultiPart"
  (^net.minecraft.entity.IEntityMultiPart [^EntityDragonPart this]
    (-> this .-entityDragonObj)))

(defn part-name
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^EntityDragonPart this]
    (-> this .-partName)))

(defn can-be-collided-with?
  "returns: `boolean`"
  (^Boolean [^EntityDragonPart this]
    (-> this (.canBeCollidedWith))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityDragonPart this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn entity-equal?
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityDragonPart this ^net.minecraft.entity.Entity entity-in]
    (-> this (.isEntityEqual entity-in))))

