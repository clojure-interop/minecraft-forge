(ns net.minecraft.block.material.MaterialLogic
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.material MaterialLogic]))

(defn ->material-logic
  "Constructor.

  color - `net.minecraft.block.material.MapColor`"
  (^MaterialLogic [^net.minecraft.block.material.MapColor color]
    (new MaterialLogic color)))

(defn solid?
  "returns: `boolean`"
  (^Boolean [^MaterialLogic this]
    (-> this (.isSolid))))

(defn blocks-light
  "returns: `boolean`"
  (^Boolean [^MaterialLogic this]
    (-> this (.blocksLight))))

(defn blocks-movement
  "returns: `boolean`"
  (^Boolean [^MaterialLogic this]
    (-> this (.blocksMovement))))

