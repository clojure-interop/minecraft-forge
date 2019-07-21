(ns net.minecraft.block.material.MaterialTransparent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.material MaterialTransparent]))

(defn ->material-transparent
  "Constructor.

  color - `net.minecraft.block.material.MapColor`"
  (^MaterialTransparent [^net.minecraft.block.material.MapColor color]
    (new MaterialTransparent color)))

(defn solid?
  "returns: `boolean`"
  (^Boolean [^MaterialTransparent this]
    (-> this (.isSolid))))

(defn blocks-light
  "returns: `boolean`"
  (^Boolean [^MaterialTransparent this]
    (-> this (.blocksLight))))

(defn blocks-movement
  "returns: `boolean`"
  (^Boolean [^MaterialTransparent this]
    (-> this (.blocksMovement))))

