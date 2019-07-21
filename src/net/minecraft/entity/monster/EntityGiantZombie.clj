(ns net.minecraft.entity.monster.EntityGiantZombie
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityGiantZombie]))

(defn ->entity-giant-zombie
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityGiantZombie [^net.minecraft.world.World world-in]
    (new EntityGiantZombie world-in)))

(defn *register-fixes-giant-zombie
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityGiantZombie/registerFixesGiantZombie fixer)))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntityGiantZombie this]
    (-> this (.getEyeHeight))))

(defn get-block-path-weight
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^EntityGiantZombie this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBlockPathWeight pos))))

