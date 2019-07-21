(ns net.minecraft.entity.ai.EntityAITarget
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAITarget]))

(defn ->entity-ai-target
  "Constructor.

  creature - `net.minecraft.entity.EntityCreature`
  check-sight - `boolean`
  only-nearby - `boolean`"
  (^EntityAITarget [^net.minecraft.entity.EntityCreature creature ^Boolean check-sight ^Boolean only-nearby]
    (new EntityAITarget creature check-sight only-nearby))
  (^EntityAITarget [^net.minecraft.entity.EntityCreature creature ^Boolean check-sight]
    (new EntityAITarget creature check-sight)))

(defn *suitable-target?
  "attacker - `net.minecraft.entity.EntityLiving`
  target - `net.minecraft.entity.EntityLivingBase`
  include-invincibles - `boolean`
  check-sight - `boolean`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.EntityLiving attacker ^net.minecraft.entity.EntityLivingBase target ^Boolean include-invincibles ^Boolean check-sight]
    (EntityAITarget/isSuitableTarget attacker target include-invincibles check-sight)))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAITarget this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAITarget this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAITarget this]
    (-> this (.resetTask))))

(defn set-unseen-memory-ticks
  "p-190882-1 - `int`

  returns: `net.minecraft.entity.ai.EntityAITarget`"
  (^net.minecraft.entity.ai.EntityAITarget [^EntityAITarget this ^Integer p-190882-1]
    (-> this (.setUnseenMemoryTicks p-190882-1))))

