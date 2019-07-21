(ns net.minecraft.client.particle.ParticleDigging
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleDigging]))

(defn set-block-pos
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.client.particle.ParticleDigging`"
  (^net.minecraft.client.particle.ParticleDigging [^ParticleDigging this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.setBlockPos pos))))

(defn init
  "returns: `net.minecraft.client.particle.ParticleDigging`"
  (^net.minecraft.client.particle.ParticleDigging [^ParticleDigging this]
    (-> this (.init))))

(defn get-fx-layer
  "returns: `int`"
  (^Integer [^ParticleDigging this]
    (-> this (.getFXLayer))))

(defn render-particle
  "buffer - `net.minecraft.client.renderer.VertexBuffer`
  entity-in - `net.minecraft.entity.Entity`
  partial-ticks - `float`
  rotation-x - `float`
  rotation-z - `float`
  rotation-yz - `float`
  rotation-xy - `float`
  rotation-xz - `float`"
  ([^ParticleDigging this ^net.minecraft.client.renderer.VertexBuffer buffer ^net.minecraft.entity.Entity entity-in ^Float partial-ticks ^Float rotation-x ^Float rotation-z ^Float rotation-yz ^Float rotation-xy ^Float rotation-xz]
    (-> this (.renderParticle buffer entity-in partial-ticks rotation-x rotation-z rotation-yz rotation-xy rotation-xz))))

(defn get-brightness-for-render
  "p-189214-1 - `float`

  returns: `int`"
  (^Integer [^ParticleDigging this ^Float p-189214-1]
    (-> this (.getBrightnessForRender p-189214-1))))

