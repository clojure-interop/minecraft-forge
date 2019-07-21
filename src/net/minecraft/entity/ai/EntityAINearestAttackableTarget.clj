(ns net.minecraft.entity.ai.EntityAINearestAttackableTarget
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAINearestAttackableTarget]))

(defn ->entity-ai-nearest-attackable-target
  "Constructor.

  creature - `net.minecraft.entity.EntityCreature`
  class-target - `java.lang.Class`
  chance - `int`
  check-sight - `boolean`
  only-nearby - `boolean`
  target-selector - `com.google.common.base.Predicate`"
  (^EntityAINearestAttackableTarget [^net.minecraft.entity.EntityCreature creature ^java.lang.Class class-target ^Integer chance ^Boolean check-sight ^Boolean only-nearby ^com.google.common.base.Predicate target-selector]
    (new EntityAINearestAttackableTarget creature class-target chance check-sight only-nearby target-selector))
  (^EntityAINearestAttackableTarget [^net.minecraft.entity.EntityCreature creature ^java.lang.Class class-target ^Boolean check-sight ^Boolean only-nearby]
    (new EntityAINearestAttackableTarget creature class-target check-sight only-nearby))
  (^EntityAINearestAttackableTarget [^net.minecraft.entity.EntityCreature creature ^java.lang.Class class-target ^Boolean check-sight]
    (new EntityAINearestAttackableTarget creature class-target check-sight)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAINearestAttackableTarget this]
    (-> this (.shouldExecute))))

(defn start-executing
  ""
  ([^EntityAINearestAttackableTarget this]
    (-> this (.startExecuting))))

