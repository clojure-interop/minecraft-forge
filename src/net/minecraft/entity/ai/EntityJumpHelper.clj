(ns net.minecraft.entity.ai.EntityJumpHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityJumpHelper]))

(defn ->entity-jump-helper
  "Constructor.

  entity-in - `net.minecraft.entity.EntityLiving`"
  (^EntityJumpHelper [^net.minecraft.entity.EntityLiving entity-in]
    (new EntityJumpHelper entity-in)))

(defn set-jumping
  ""
  ([^EntityJumpHelper this]
    (-> this (.setJumping))))

(defn do-jump
  ""
  ([^EntityJumpHelper this]
    (-> this (.doJump))))

