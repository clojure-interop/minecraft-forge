(ns net.minecraft.client.particle.ParticleRain
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleRain]))

(defn on-update
  ""
  ([^ParticleRain this]
    (-> this (.onUpdate))))

