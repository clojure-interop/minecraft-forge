(ns net.minecraft.block.material.MaterialLiquid
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.material MaterialLiquid]))

(defn ->material-liquid
  "Constructor.

  color - `net.minecraft.block.material.MapColor`"
  (^MaterialLiquid [^net.minecraft.block.material.MapColor color]
    (new MaterialLiquid color)))

(defn liquid?
  "returns: `boolean`"
  (^Boolean [^MaterialLiquid this]
    (-> this (.isLiquid))))

(defn blocks-movement
  "returns: `boolean`"
  (^Boolean [^MaterialLiquid this]
    (-> this (.blocksMovement))))

(defn solid?
  "returns: `boolean`"
  (^Boolean [^MaterialLiquid this]
    (-> this (.isSolid))))

