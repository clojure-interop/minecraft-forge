(ns net.minecraft.entity.projectile.EntitySmallFireball
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.projectile EntitySmallFireball]))

(defn ->entity-small-fireball
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`
  accel-x - `double`
  accel-y - `double`
  accel-z - `double`"
  (^EntitySmallFireball [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z ^Double accel-x ^Double accel-y ^Double accel-z]
    (new EntitySmallFireball world-in x y z accel-x accel-y accel-z))
  (^EntitySmallFireball [^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase shooter ^Double accel-x ^Double accel-y ^Double accel-z]
    (new EntitySmallFireball world-in shooter accel-x accel-y accel-z))
  (^EntitySmallFireball [^net.minecraft.world.World world-in]
    (new EntitySmallFireball world-in)))

(defn *register-fixes-small-fireball
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntitySmallFireball/registerFixesSmallFireball fixer)))

(defn can-be-collided-with?
  "returns: `boolean`"
  (^Boolean [^EntitySmallFireball this]
    (-> this (.canBeCollidedWith))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntitySmallFireball this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

