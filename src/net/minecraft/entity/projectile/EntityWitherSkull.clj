(ns net.minecraft.entity.projectile.EntityWitherSkull
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.projectile EntityWitherSkull]))

(defn ->entity-wither-skull
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`
  accel-x - `double`
  accel-y - `double`
  accel-z - `double`"
  (^EntityWitherSkull [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z ^Double accel-x ^Double accel-y ^Double accel-z]
    (new EntityWitherSkull world-in x y z accel-x accel-y accel-z))
  (^EntityWitherSkull [^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase shooter ^Double accel-x ^Double accel-y ^Double accel-z]
    (new EntityWitherSkull world-in shooter accel-x accel-y accel-z))
  (^EntityWitherSkull [^net.minecraft.world.World world-in]
    (new EntityWitherSkull world-in)))

(defn *register-fixes-wither-skull
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityWitherSkull/registerFixesWitherSkull fixer)))

(defn burning?
  "returns: `boolean`"
  (^Boolean [^EntityWitherSkull this]
    (-> this (.isBurning))))

(defn get-explosion-resistance
  "explosion-in - `net.minecraft.world.Explosion`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  block-state-in - `net.minecraft.block.state.IBlockState`

  returns: `float`"
  (^Float [^EntityWitherSkull this ^net.minecraft.world.Explosion explosion-in ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState block-state-in]
    (-> this (.getExplosionResistance explosion-in world-in pos block-state-in))))

(defn can-be-collided-with?
  "returns: `boolean`"
  (^Boolean [^EntityWitherSkull this]
    (-> this (.canBeCollidedWith))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityWitherSkull this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn invulnerable?
  "returns: `boolean`"
  (^Boolean [^EntityWitherSkull this]
    (-> this (.isInvulnerable))))

(defn set-invulnerable
  "invulnerable - `boolean`"
  ([^EntityWitherSkull this ^Boolean invulnerable]
    (-> this (.setInvulnerable invulnerable))))

