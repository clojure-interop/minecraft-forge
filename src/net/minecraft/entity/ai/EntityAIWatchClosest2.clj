(ns net.minecraft.entity.ai.EntityAIWatchClosest2
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIWatchClosest2]))

(defn ->entity-ai-watch-closest-2
  "Constructor.

  entityliving-in - `net.minecraft.entity.EntityLiving`
  watch-target-class - `java.lang.Class`
  max-distance - `float`
  chance-in - `float`"
  (^EntityAIWatchClosest2 [^net.minecraft.entity.EntityLiving entityliving-in ^java.lang.Class watch-target-class ^Float max-distance ^Float chance-in]
    (new EntityAIWatchClosest2 entityliving-in watch-target-class max-distance chance-in)))

