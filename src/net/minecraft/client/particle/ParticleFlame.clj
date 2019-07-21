(ns net.minecraft.client.particle.ParticleFlame
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleFlame]))

(defn move
  "x - `double`
  y - `double`
  z - `double`"
  ([^ParticleFlame this ^Double x ^Double y ^Double z]
    (-> this (.move x y z))))

(defn render-particle
  "buffer - `net.minecraft.client.renderer.VertexBuffer`
  entity-in - `net.minecraft.entity.Entity`
  partial-ticks - `float`
  rotation-x - `float`
  rotation-z - `float`
  rotation-yz - `float`
  rotation-xy - `float`
  rotation-xz - `float`"
  ([^ParticleFlame this ^net.minecraft.client.renderer.VertexBuffer buffer ^net.minecraft.entity.Entity entity-in ^Float partial-ticks ^Float rotation-x ^Float rotation-z ^Float rotation-yz ^Float rotation-xy ^Float rotation-xz]
    (-> this (.renderParticle buffer entity-in partial-ticks rotation-x rotation-z rotation-yz rotation-xy rotation-xz))))

(defn get-brightness-for-render
  "p-189214-1 - `float`

  returns: `int`"
  (^Integer [^ParticleFlame this ^Float p-189214-1]
    (-> this (.getBrightnessForRender p-189214-1))))

(defn on-update
  ""
  ([^ParticleFlame this]
    (-> this (.onUpdate))))

