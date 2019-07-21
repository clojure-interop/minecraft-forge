(ns net.minecraft.entity.projectile.EntityLlamaSpit
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.projectile EntityLlamaSpit]))

(defn ->entity-llama-spit
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`
  p-i-47274-8 - `double`
  p-i-47274-10 - `double`
  p-i-47274-12 - `double`"
  (^EntityLlamaSpit [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z ^Double p-i-47274-8 ^Double p-i-47274-10 ^Double p-i-47274-12]
    (new EntityLlamaSpit world-in x y z p-i-47274-8 p-i-47274-10 p-i-47274-12))
  (^EntityLlamaSpit [^net.minecraft.world.World world-in ^net.minecraft.entity.passive.EntityLlama p-i-47273-2]
    (new EntityLlamaSpit world-in p-i-47273-2))
  (^EntityLlamaSpit [^net.minecraft.world.World world-in]
    (new EntityLlamaSpit world-in)))

(defn owner
  "Instance Field.

  type: net.minecraft.entity.passive.EntityLlama"
  (^net.minecraft.entity.passive.EntityLlama [^EntityLlamaSpit this]
    (-> this .-owner)))

(defn on-update
  ""
  ([^EntityLlamaSpit this]
    (-> this (.onUpdate))))

(defn set-velocity
  "x - `double`
  y - `double`
  z - `double`"
  ([^EntityLlamaSpit this ^Double x ^Double y ^Double z]
    (-> this (.setVelocity x y z))))

(defn set-throwable-heading
  "x - `double`
  y - `double`
  z - `double`
  velocity - `float`
  inaccuracy - `float`"
  ([^EntityLlamaSpit this ^Double x ^Double y ^Double z ^Float velocity ^Float inaccuracy]
    (-> this (.setThrowableHeading x y z velocity inaccuracy))))

(defn on-hit
  "p-190536-1 - `net.minecraft.util.math.RayTraceResult`"
  ([^EntityLlamaSpit this ^net.minecraft.util.math.RayTraceResult p-190536-1]
    (-> this (.onHit p-190536-1))))

