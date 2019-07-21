(ns net.minecraft.client.particle.ParticleEndRod
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleEndRod]))

(defn ->particle-end-rod
  "Constructor.

  p-i-46580-1 - `net.minecraft.world.World`
  p-i-46580-2 - `double`
  p-i-46580-4 - `double`
  p-i-46580-6 - `double`
  p-i-46580-8 - `double`
  p-i-46580-10 - `double`
  p-i-46580-12 - `double`"
  (^ParticleEndRod [^net.minecraft.world.World p-i-46580-1 ^Double p-i-46580-2 ^Double p-i-46580-4 ^Double p-i-46580-6 ^Double p-i-46580-8 ^Double p-i-46580-10 ^Double p-i-46580-12]
    (new ParticleEndRod p-i-46580-1 p-i-46580-2 p-i-46580-4 p-i-46580-6 p-i-46580-8 p-i-46580-10 p-i-46580-12)))

(defn move
  "x - `double`
  y - `double`
  z - `double`"
  ([^ParticleEndRod this ^Double x ^Double y ^Double z]
    (-> this (.move x y z))))

