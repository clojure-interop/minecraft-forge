(ns net.minecraft.client.particle.ParticleSpit
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleSpit]))

(defn on-update
  ""
  ([^ParticleSpit this]
    (-> this (.onUpdate))))

