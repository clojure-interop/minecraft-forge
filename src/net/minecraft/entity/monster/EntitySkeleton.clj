(ns net.minecraft.entity.monster.EntitySkeleton
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntitySkeleton]))

(defn ->entity-skeleton
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntitySkeleton [^net.minecraft.world.World world-in]
    (new EntitySkeleton world-in)))

(defn *register-fixes-skeleton
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntitySkeleton/registerFixesSkeleton fixer)))

(defn on-death
  "cause - `net.minecraft.util.DamageSource`"
  ([^EntitySkeleton this ^net.minecraft.util.DamageSource cause]
    (-> this (.onDeath cause))))

