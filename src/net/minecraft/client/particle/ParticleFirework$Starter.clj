(ns net.minecraft.client.particle.ParticleFirework$Starter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleFirework$Starter]))

(defn ->starter
  "Constructor.

  p-i-46464-1 - `net.minecraft.world.World`
  p-i-46464-2 - `double`
  p-i-46464-4 - `double`
  p-i-46464-6 - `double`
  p-i-46464-8 - `double`
  p-i-46464-10 - `double`
  p-i-46464-12 - `double`
  p-i-46464-14 - `net.minecraft.client.particle.ParticleManager`
  p-i-46464-15 - `net.minecraft.nbt.NBTTagCompound`"
  (^ParticleFirework$Starter [^net.minecraft.world.World p-i-46464-1 ^Double p-i-46464-2 ^Double p-i-46464-4 ^Double p-i-46464-6 ^Double p-i-46464-8 ^Double p-i-46464-10 ^Double p-i-46464-12 ^net.minecraft.client.particle.ParticleManager p-i-46464-14 ^net.minecraft.nbt.NBTTagCompound p-i-46464-15]
    (new ParticleFirework$Starter p-i-46464-1 p-i-46464-2 p-i-46464-4 p-i-46464-6 p-i-46464-8 p-i-46464-10 p-i-46464-12 p-i-46464-14 p-i-46464-15)))

(defn render-particle
  "buffer - `net.minecraft.client.renderer.VertexBuffer`
  entity-in - `net.minecraft.entity.Entity`
  partial-ticks - `float`
  rotation-x - `float`
  rotation-z - `float`
  rotation-yz - `float`
  rotation-xy - `float`
  rotation-xz - `float`"
  ([^ParticleFirework$Starter this ^net.minecraft.client.renderer.VertexBuffer buffer ^net.minecraft.entity.Entity entity-in ^Float partial-ticks ^Float rotation-x ^Float rotation-z ^Float rotation-yz ^Float rotation-xy ^Float rotation-xz]
    (-> this (.renderParticle buffer entity-in partial-ticks rotation-x rotation-z rotation-yz rotation-xy rotation-xz))))

(defn on-update
  ""
  ([^ParticleFirework$Starter this]
    (-> this (.onUpdate))))

(defn get-fx-layer
  "returns: `int`"
  (^Integer [^ParticleFirework$Starter this]
    (-> this (.getFXLayer))))

