(ns net.minecraft.client.particle.ParticleManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleManager]))

(defn ->particle-manager
  "Constructor.

  world-in - `net.minecraft.world.World`
  renderer-in - `net.minecraft.client.renderer.texture.TextureManager`"
  (^ParticleManager [^net.minecraft.world.World world-in ^net.minecraft.client.renderer.texture.TextureManager renderer-in]
    (new ParticleManager world-in renderer-in)))

(defn spawn-effect-particle
  "particle-id - `int`
  x-coord - `double`
  y-coord - `double`
  z-coord - `double`
  x-speed - `double`
  y-speed - `double`
  z-speed - `double`
  parameters - `int`

  returns: `net.minecraft.client.particle.Particle`"
  (^net.minecraft.client.particle.Particle [^ParticleManager this ^Integer particle-id ^Double x-coord ^Double y-coord ^Double z-coord ^Double x-speed ^Double y-speed ^Double z-speed ^Integer parameters]
    (-> this (.spawnEffectParticle particle-id x-coord y-coord z-coord x-speed y-speed z-speed parameters))))

(defn add-effect
  "effect - `net.minecraft.client.particle.Particle`"
  ([^ParticleManager this ^net.minecraft.client.particle.Particle effect]
    (-> this (.addEffect effect))))

(defn add-block-hit-effects
  "pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`"
  ([^ParticleManager this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.addBlockHitEffects pos side))))

(defn update-effects
  ""
  ([^ParticleManager this]
    (-> this (.updateEffects))))

(defn clear-effects
  "world-in - `net.minecraft.world.World`"
  ([^ParticleManager this ^net.minecraft.world.World world-in]
    (-> this (.clearEffects world-in))))

(defn emit-particle-at-entity
  "p-191271-1 - `net.minecraft.entity.Entity`
  p-191271-2 - `net.minecraft.util.EnumParticleTypes`
  p-191271-3 - `int`"
  ([^ParticleManager this ^net.minecraft.entity.Entity p-191271-1 ^net.minecraft.util.EnumParticleTypes p-191271-2 ^Integer p-191271-3]
    (-> this (.emitParticleAtEntity p-191271-1 p-191271-2 p-191271-3)))
  ([^ParticleManager this ^net.minecraft.entity.Entity entity-in ^net.minecraft.util.EnumParticleTypes particle-types]
    (-> this (.emitParticleAtEntity entity-in particle-types))))

(defn get-statistics
  "returns: `java.lang.String`"
  (^java.lang.String [^ParticleManager this]
    (-> this (.getStatistics))))

(defn render-lit-particles
  "entity-in - `net.minecraft.entity.Entity`
  partial-tick - `float`"
  ([^ParticleManager this ^net.minecraft.entity.Entity entity-in ^Float partial-tick]
    (-> this (.renderLitParticles entity-in partial-tick))))

(defn add-block-destroy-effects
  "pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^ParticleManager this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.addBlockDestroyEffects pos state))))

(defn render-particles
  "entity-in - `net.minecraft.entity.Entity`
  partial-ticks - `float`"
  ([^ParticleManager this ^net.minecraft.entity.Entity entity-in ^Float partial-ticks]
    (-> this (.renderParticles entity-in partial-ticks))))

(defn register-particle
  "id - `int`
  particle-factory - `net.minecraft.client.particle.IParticleFactory`"
  ([^ParticleManager this ^Integer id ^net.minecraft.client.particle.IParticleFactory particle-factory]
    (-> this (.registerParticle id particle-factory))))

