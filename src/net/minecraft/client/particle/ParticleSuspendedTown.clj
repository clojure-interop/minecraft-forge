(ns net.minecraft.client.particle.ParticleSuspendedTown
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleSuspendedTown]))

(defn move
  "x - `double`
  y - `double`
  z - `double`"
  ([^ParticleSuspendedTown this ^Double x ^Double y ^Double z]
    (-> this (.move x y z))))

(defn on-update
  ""
  ([^ParticleSuspendedTown this]
    (-> this (.onUpdate))))

