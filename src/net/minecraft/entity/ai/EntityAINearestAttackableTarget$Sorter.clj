(ns net.minecraft.entity.ai.EntityAINearestAttackableTarget$Sorter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAINearestAttackableTarget$Sorter]))

(defn ->sorter
  "Constructor.

  the-entity-in - `net.minecraft.entity.Entity`"
  (^EntityAINearestAttackableTarget$Sorter [^net.minecraft.entity.Entity the-entity-in]
    (new EntityAINearestAttackableTarget$Sorter the-entity-in)))

(defn compare
  "p-compare-1 - `net.minecraft.entity.Entity`
  p-compare-2 - `net.minecraft.entity.Entity`

  returns: `int`"
  (^Integer [^EntityAINearestAttackableTarget$Sorter this ^net.minecraft.entity.Entity p-compare-1 ^net.minecraft.entity.Entity p-compare-2]
    (-> this (.compare p-compare-1 p-compare-2))))

