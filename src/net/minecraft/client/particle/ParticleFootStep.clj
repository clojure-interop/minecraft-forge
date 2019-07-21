(ns net.minecraft.client.particle.ParticleFootStep
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleFootStep]))

(defn render-particle
  "buffer - `net.minecraft.client.renderer.VertexBuffer`
  entity-in - `net.minecraft.entity.Entity`
  partial-ticks - `float`
  rotation-x - `float`
  rotation-z - `float`
  rotation-yz - `float`
  rotation-xy - `float`
  rotation-xz - `float`"
  ([^ParticleFootStep this ^net.minecraft.client.renderer.VertexBuffer buffer ^net.minecraft.entity.Entity entity-in ^Float partial-ticks ^Float rotation-x ^Float rotation-z ^Float rotation-yz ^Float rotation-xy ^Float rotation-xz]
    (-> this (.renderParticle buffer entity-in partial-ticks rotation-x rotation-z rotation-yz rotation-xy rotation-xz))))

(defn on-update
  ""
  ([^ParticleFootStep this]
    (-> this (.onUpdate))))

(defn get-fx-layer
  "returns: `int`"
  (^Integer [^ParticleFootStep this]
    (-> this (.getFXLayer))))

