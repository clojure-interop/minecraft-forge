(ns net.minecraft.entity.ai.EntityAITasks
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAITasks]))

(defn ->entity-ai-tasks
  "Constructor.

  profiler-in - `net.minecraft.profiler.Profiler`"
  (^EntityAITasks [^net.minecraft.profiler.Profiler profiler-in]
    (new EntityAITasks profiler-in)))

(defn task-entries
  "Instance Constant.

  type: java.util.Set<net.minecraft.entity.ai.EntityAITasks$EntityAITaskEntry>"
  (^java.util.Set [^EntityAITasks this]
    (-> this .-taskEntries)))

(defn add-task
  "priority - `int`
  task - `net.minecraft.entity.ai.EntityAIBase`"
  ([^EntityAITasks this ^Integer priority ^net.minecraft.entity.ai.EntityAIBase task]
    (-> this (.addTask priority task))))

(defn remove-task
  "task - `net.minecraft.entity.ai.EntityAIBase`"
  ([^EntityAITasks this ^net.minecraft.entity.ai.EntityAIBase task]
    (-> this (.removeTask task))))

(defn on-update-tasks
  ""
  ([^EntityAITasks this]
    (-> this (.onUpdateTasks))))

(defn control-flag-disabled?
  "p-188528-1 - `int`

  returns: `boolean`"
  (^Boolean [^EntityAITasks this ^Integer p-188528-1]
    (-> this (.isControlFlagDisabled p-188528-1))))

(defn disable-control-flag
  "p-188526-1 - `int`"
  ([^EntityAITasks this ^Integer p-188526-1]
    (-> this (.disableControlFlag p-188526-1))))

(defn enable-control-flag
  "p-188525-1 - `int`"
  ([^EntityAITasks this ^Integer p-188525-1]
    (-> this (.enableControlFlag p-188525-1))))

(defn set-control-flag
  "p-188527-1 - `int`
  p-188527-2 - `boolean`"
  ([^EntityAITasks this ^Integer p-188527-1 ^Boolean p-188527-2]
    (-> this (.setControlFlag p-188527-1 p-188527-2))))

