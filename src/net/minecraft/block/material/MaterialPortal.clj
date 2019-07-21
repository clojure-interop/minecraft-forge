(ns net.minecraft.block.material.MaterialPortal
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.material MaterialPortal]))

(defn ->material-portal
  "Constructor.

  color - `net.minecraft.block.material.MapColor`"
  (^MaterialPortal [^net.minecraft.block.material.MapColor color]
    (new MaterialPortal color)))

(defn solid?
  "returns: `boolean`"
  (^Boolean [^MaterialPortal this]
    (-> this (.isSolid))))

(defn blocks-light
  "returns: `boolean`"
  (^Boolean [^MaterialPortal this]
    (-> this (.blocksLight))))

(defn blocks-movement
  "returns: `boolean`"
  (^Boolean [^MaterialPortal this]
    (-> this (.blocksMovement))))

