(ns net.minecraft.client.particle.ParticleExplosion
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleExplosion]))

(defn on-update
  ""
  ([^ParticleExplosion this]
    (-> this (.onUpdate))))

