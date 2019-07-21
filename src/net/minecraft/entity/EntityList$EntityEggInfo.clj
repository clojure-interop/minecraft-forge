(ns net.minecraft.entity.EntityList$EntityEggInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity EntityList$EntityEggInfo]))

(defn ->entity-egg-info
  "Constructor.

  id-in - `net.minecraft.util.ResourceLocation`
  primary-color-in - `int`
  secondary-color-in - `int`"
  (^EntityList$EntityEggInfo [^net.minecraft.util.ResourceLocation id-in ^Integer primary-color-in ^Integer secondary-color-in]
    (new EntityList$EntityEggInfo id-in primary-color-in secondary-color-in)))

(defn spawned-id
  "Instance Constant.

  type: net.minecraft.util.ResourceLocation"
  (^net.minecraft.util.ResourceLocation [^EntityList$EntityEggInfo this]
    (-> this .-spawnedID)))

(defn primary-color
  "Instance Constant.

  type: int"
  (^Integer [^EntityList$EntityEggInfo this]
    (-> this .-primaryColor)))

(defn secondary-color
  "Instance Constant.

  type: int"
  (^Integer [^EntityList$EntityEggInfo this]
    (-> this .-secondaryColor)))

(defn kill-entity-stat
  "Instance Constant.

  type: net.minecraft.stats.StatBase"
  (^net.minecraft.stats.StatBase [^EntityList$EntityEggInfo this]
    (-> this .-killEntityStat)))

(defn entity-killed-by-stat
  "Instance Constant.

  type: net.minecraft.stats.StatBase"
  (^net.minecraft.stats.StatBase [^EntityList$EntityEggInfo this]
    (-> this .-entityKilledByStat)))

