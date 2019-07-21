(ns net.minecraft.entity.projectile.EntitySnowball
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.projectile EntitySnowball]))

(defn ->entity-snowball
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntitySnowball [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntitySnowball world-in x y z))
  (^EntitySnowball [^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase thrower-in]
    (new EntitySnowball world-in thrower-in))
  (^EntitySnowball [^net.minecraft.world.World world-in]
    (new EntitySnowball world-in)))

(defn *register-fixes-snowball
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntitySnowball/registerFixesSnowball fixer)))

(defn handle-status-update
  "id - `byte`"
  ([^EntitySnowball this ^Byte id]
    (-> this (.handleStatusUpdate id))))

