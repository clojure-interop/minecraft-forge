(ns net.minecraft.client.particle.ParticleEnchantmentTable$EnchantmentTable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleEnchantmentTable$EnchantmentTable]))

(defn ->enchantment-table
  "Constructor."
  (^ParticleEnchantmentTable$EnchantmentTable []
    (new ParticleEnchantmentTable$EnchantmentTable )))

(defn create-particle
  "particle-id - `int`
  world-in - `net.minecraft.world.World`
  x-coord-in - `double`
  y-coord-in - `double`
  z-coord-in - `double`
  x-speed-in - `double`
  y-speed-in - `double`
  z-speed-in - `double`
  p-178902-15 - `int`

  returns: `net.minecraft.client.particle.Particle`"
  (^net.minecraft.client.particle.Particle [^ParticleEnchantmentTable$EnchantmentTable this ^Integer particle-id ^net.minecraft.world.World world-in ^Double x-coord-in ^Double y-coord-in ^Double z-coord-in ^Double x-speed-in ^Double y-speed-in ^Double z-speed-in ^Integer p-178902-15]
    (-> this (.createParticle particle-id world-in x-coord-in y-coord-in z-coord-in x-speed-in y-speed-in z-speed-in p-178902-15))))

