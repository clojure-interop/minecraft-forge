(ns net.minecraft.entity.projectile.EntityEgg
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.projectile EntityEgg]))

(defn ->entity-egg
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntityEgg [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntityEgg world-in x y z))
  (^EntityEgg [^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase thrower-in]
    (new EntityEgg world-in thrower-in))
  (^EntityEgg [^net.minecraft.world.World world-in]
    (new EntityEgg world-in)))

(defn *register-fixes-egg
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityEgg/registerFixesEgg fixer)))

(defn handle-status-update
  "id - `byte`"
  ([^EntityEgg this ^Byte id]
    (-> this (.handleStatusUpdate id))))

