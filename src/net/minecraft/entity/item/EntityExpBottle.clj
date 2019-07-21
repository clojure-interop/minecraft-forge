(ns net.minecraft.entity.item.EntityExpBottle
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityExpBottle]))

(defn ->entity-exp-bottle
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntityExpBottle [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntityExpBottle world-in x y z))
  (^EntityExpBottle [^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase thrower-in]
    (new EntityExpBottle world-in thrower-in))
  (^EntityExpBottle [^net.minecraft.world.World world-in]
    (new EntityExpBottle world-in)))

(defn *register-fixes-exp-bottle
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityExpBottle/registerFixesExpBottle fixer)))

