(ns net.minecraft.entity.item.EntityEnderPearl
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityEnderPearl]))

(defn ->entity-ender-pearl
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntityEnderPearl [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntityEnderPearl world-in x y z))
  (^EntityEnderPearl [^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase thrower-in]
    (new EntityEnderPearl world-in thrower-in))
  (^EntityEnderPearl [^net.minecraft.world.World world-in]
    (new EntityEnderPearl world-in)))

(defn *register-fixes-ender-pearl
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityEnderPearl/registerFixesEnderPearl fixer)))

(defn on-update
  ""
  ([^EntityEnderPearl this]
    (-> this (.onUpdate))))

