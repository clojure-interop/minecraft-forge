(ns net.minecraft.entity.projectile.EntityDragonFireball
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.projectile EntityDragonFireball]))

(defn ->entity-dragon-fireball
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`
  accel-x - `double`
  accel-y - `double`
  accel-z - `double`"
  (^EntityDragonFireball [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z ^Double accel-x ^Double accel-y ^Double accel-z]
    (new EntityDragonFireball world-in x y z accel-x accel-y accel-z))
  (^EntityDragonFireball [^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase shooter ^Double accel-x ^Double accel-y ^Double accel-z]
    (new EntityDragonFireball world-in shooter accel-x accel-y accel-z))
  (^EntityDragonFireball [^net.minecraft.world.World world-in]
    (new EntityDragonFireball world-in)))

(defn *register-fixes-dragon-fireball
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityDragonFireball/registerFixesDragonFireball fixer)))

(defn can-be-collided-with?
  "returns: `boolean`"
  (^Boolean [^EntityDragonFireball this]
    (-> this (.canBeCollidedWith))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityDragonFireball this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

