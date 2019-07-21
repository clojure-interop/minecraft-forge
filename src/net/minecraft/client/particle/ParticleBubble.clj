(ns net.minecraft.client.particle.ParticleBubble
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleBubble]))

(defn on-update
  ""
  ([^ParticleBubble this]
    (-> this (.onUpdate))))

