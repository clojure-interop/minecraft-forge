(ns net.minecraft.client.particle.ParticleSuspend
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleSuspend]))

(defn on-update
  ""
  ([^ParticleSuspend this]
    (-> this (.onUpdate))))

