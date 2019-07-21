(ns net.minecraft.client.particle.ParticleDrip
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleDrip]))

(defn get-brightness-for-render
  "p-189214-1 - `float`

  returns: `int`"
  (^Integer [^ParticleDrip this ^Float p-189214-1]
    (-> this (.getBrightnessForRender p-189214-1))))

(defn on-update
  ""
  ([^ParticleDrip this]
    (-> this (.onUpdate))))

