(ns net.minecraft.entity.projectile.EntityEvokerFangs
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.projectile EntityEvokerFangs]))

(defn ->entity-evoker-fangs
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`
  p-i-47276-8 - `float`
  p-i-47276-9 - `int`
  caster-in - `net.minecraft.entity.EntityLivingBase`"
  (^EntityEvokerFangs [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z ^Float p-i-47276-8 ^Integer p-i-47276-9 ^net.minecraft.entity.EntityLivingBase caster-in]
    (new EntityEvokerFangs world-in x y z p-i-47276-8 p-i-47276-9 caster-in))
  (^EntityEvokerFangs [^net.minecraft.world.World world-in]
    (new EntityEvokerFangs world-in)))

(defn set-caster
  "p-190549-1 - `net.minecraft.entity.EntityLivingBase`"
  ([^EntityEvokerFangs this ^net.minecraft.entity.EntityLivingBase p-190549-1]
    (-> this (.setCaster p-190549-1))))

(defn get-caster
  "returns: `net.minecraft.entity.EntityLivingBase`"
  (^net.minecraft.entity.EntityLivingBase [^EntityEvokerFangs this]
    (-> this (.getCaster))))

(defn on-update
  ""
  ([^EntityEvokerFangs this]
    (-> this (.onUpdate))))

(defn handle-status-update
  "id - `byte`"
  ([^EntityEvokerFangs this ^Byte id]
    (-> this (.handleStatusUpdate id))))

(defn get-animation-progress
  "p-190550-1 - `float`

  returns: `float`"
  (^Float [^EntityEvokerFangs this ^Float p-190550-1]
    (-> this (.getAnimationProgress p-190550-1))))

