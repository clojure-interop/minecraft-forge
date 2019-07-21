(ns net.minecraft.client.particle.ParticleWaterWake
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleWaterWake]))

(defn on-update
  ""
  ([^ParticleWaterWake this]
    (-> this (.onUpdate))))

