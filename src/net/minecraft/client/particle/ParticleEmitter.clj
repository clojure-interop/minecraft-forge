(ns net.minecraft.client.particle.ParticleEmitter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleEmitter]))

(defn ->particle-emitter
  "Constructor.

  p-i-47219-1 - `net.minecraft.world.World`
  p-i-47219-2 - `net.minecraft.entity.Entity`
  p-i-47219-3 - `net.minecraft.util.EnumParticleTypes`
  p-i-47219-4 - `int`"
  (^ParticleEmitter [^net.minecraft.world.World p-i-47219-1 ^net.minecraft.entity.Entity p-i-47219-2 ^net.minecraft.util.EnumParticleTypes p-i-47219-3 ^Integer p-i-47219-4]
    (new ParticleEmitter p-i-47219-1 p-i-47219-2 p-i-47219-3 p-i-47219-4))
  (^ParticleEmitter [^net.minecraft.world.World world-in ^net.minecraft.entity.Entity p-i-46279-2 ^net.minecraft.util.EnumParticleTypes particle-types-in]
    (new ParticleEmitter world-in p-i-46279-2 particle-types-in)))

(defn render-particle
  "buffer - `net.minecraft.client.renderer.VertexBuffer`
  entity-in - `net.minecraft.entity.Entity`
  partial-ticks - `float`
  rotation-x - `float`
  rotation-z - `float`
  rotation-yz - `float`
  rotation-xy - `float`
  rotation-xz - `float`"
  ([^ParticleEmitter this ^net.minecraft.client.renderer.VertexBuffer buffer ^net.minecraft.entity.Entity entity-in ^Float partial-ticks ^Float rotation-x ^Float rotation-z ^Float rotation-yz ^Float rotation-xy ^Float rotation-xz]
    (-> this (.renderParticle buffer entity-in partial-ticks rotation-x rotation-z rotation-yz rotation-xy rotation-xz))))

(defn on-update
  ""
  ([^ParticleEmitter this]
    (-> this (.onUpdate))))

(defn get-fx-layer
  "returns: `int`"
  (^Integer [^ParticleEmitter this]
    (-> this (.getFXLayer))))

