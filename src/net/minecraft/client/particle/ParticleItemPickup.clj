(ns net.minecraft.client.particle.ParticleItemPickup
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleItemPickup]))

(defn ->particle-item-pickup
  "Constructor.

  world-in - `net.minecraft.world.World`
  p-i-1233-2 - `net.minecraft.entity.Entity`
  p-i-1233-3 - `net.minecraft.entity.Entity`
  p-i-1233-4 - `float`"
  (^ParticleItemPickup [^net.minecraft.world.World world-in ^net.minecraft.entity.Entity p-i-1233-2 ^net.minecraft.entity.Entity p-i-1233-3 ^Float p-i-1233-4]
    (new ParticleItemPickup world-in p-i-1233-2 p-i-1233-3 p-i-1233-4)))

(defn render-particle
  "buffer - `net.minecraft.client.renderer.VertexBuffer`
  entity-in - `net.minecraft.entity.Entity`
  partial-ticks - `float`
  rotation-x - `float`
  rotation-z - `float`
  rotation-yz - `float`
  rotation-xy - `float`
  rotation-xz - `float`"
  ([^ParticleItemPickup this ^net.minecraft.client.renderer.VertexBuffer buffer ^net.minecraft.entity.Entity entity-in ^Float partial-ticks ^Float rotation-x ^Float rotation-z ^Float rotation-yz ^Float rotation-xy ^Float rotation-xz]
    (-> this (.renderParticle buffer entity-in partial-ticks rotation-x rotation-z rotation-yz rotation-xy rotation-xz))))

(defn on-update
  ""
  ([^ParticleItemPickup this]
    (-> this (.onUpdate))))

(defn get-fx-layer
  "returns: `int`"
  (^Integer [^ParticleItemPickup this]
    (-> this (.getFXLayer))))

