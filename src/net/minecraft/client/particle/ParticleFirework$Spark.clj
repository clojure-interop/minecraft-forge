(ns net.minecraft.client.particle.ParticleFirework$Spark
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleFirework$Spark]))

(defn ->spark
  "Constructor.

  p-i-46465-1 - `net.minecraft.world.World`
  p-i-46465-2 - `double`
  p-i-46465-4 - `double`
  p-i-46465-6 - `double`
  p-i-46465-8 - `double`
  p-i-46465-10 - `double`
  p-i-46465-12 - `double`
  p-i-46465-14 - `net.minecraft.client.particle.ParticleManager`"
  (^ParticleFirework$Spark [^net.minecraft.world.World p-i-46465-1 ^Double p-i-46465-2 ^Double p-i-46465-4 ^Double p-i-46465-6 ^Double p-i-46465-8 ^Double p-i-46465-10 ^Double p-i-46465-12 ^net.minecraft.client.particle.ParticleManager p-i-46465-14]
    (new ParticleFirework$Spark p-i-46465-1 p-i-46465-2 p-i-46465-4 p-i-46465-6 p-i-46465-8 p-i-46465-10 p-i-46465-12 p-i-46465-14)))

(defn set-trail
  "trail-in - `boolean`"
  ([^ParticleFirework$Spark this ^Boolean trail-in]
    (-> this (.setTrail trail-in))))

(defn set-twinkle
  "twinkle-in - `boolean`"
  ([^ParticleFirework$Spark this ^Boolean twinkle-in]
    (-> this (.setTwinkle twinkle-in))))

(defn transparent?
  "returns: `boolean`"
  (^Boolean [^ParticleFirework$Spark this]
    (-> this (.isTransparent))))

(defn render-particle
  "buffer - `net.minecraft.client.renderer.VertexBuffer`
  entity-in - `net.minecraft.entity.Entity`
  partial-ticks - `float`
  rotation-x - `float`
  rotation-z - `float`
  rotation-yz - `float`
  rotation-xy - `float`
  rotation-xz - `float`"
  ([^ParticleFirework$Spark this ^net.minecraft.client.renderer.VertexBuffer buffer ^net.minecraft.entity.Entity entity-in ^Float partial-ticks ^Float rotation-x ^Float rotation-z ^Float rotation-yz ^Float rotation-xy ^Float rotation-xz]
    (-> this (.renderParticle buffer entity-in partial-ticks rotation-x rotation-z rotation-yz rotation-xy rotation-xz))))

(defn on-update
  ""
  ([^ParticleFirework$Spark this]
    (-> this (.onUpdate))))

