(ns net.minecraft.client.particle.ParticleEnchantmentTable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleEnchantmentTable]))

(defn move
  "x - `double`
  y - `double`
  z - `double`"
  ([^ParticleEnchantmentTable this ^Double x ^Double y ^Double z]
    (-> this (.move x y z))))

(defn get-brightness-for-render
  "p-189214-1 - `float`

  returns: `int`"
  (^Integer [^ParticleEnchantmentTable this ^Float p-189214-1]
    (-> this (.getBrightnessForRender p-189214-1))))

(defn on-update
  ""
  ([^ParticleEnchantmentTable this]
    (-> this (.onUpdate))))

