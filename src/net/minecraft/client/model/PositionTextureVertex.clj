(ns net.minecraft.client.model.PositionTextureVertex
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model PositionTextureVertex]))

(defn ->position-texture-vertex
  "Constructor.

  p-i-1158-1 - `float`
  p-i-1158-2 - `float`
  p-i-1158-3 - `float`
  p-i-1158-4 - `float`
  p-i-1158-5 - `float`"
  (^PositionTextureVertex [^Float p-i-1158-1 ^Float p-i-1158-2 ^Float p-i-1158-3 ^Float p-i-1158-4 ^Float p-i-1158-5]
    (new PositionTextureVertex p-i-1158-1 p-i-1158-2 p-i-1158-3 p-i-1158-4 p-i-1158-5))
  (^PositionTextureVertex [^net.minecraft.client.model.PositionTextureVertex texture-vertex ^Float texture-position-x-in ^Float texture-position-y-in]
    (new PositionTextureVertex texture-vertex texture-position-x-in texture-position-y-in)))

(defn vector-3-d
  "Instance Field.

  type: net.minecraft.util.math.Vec3d"
  (^net.minecraft.util.math.Vec3d [^PositionTextureVertex this]
    (-> this .-vector3D)))

(defn texture-position-x
  "Instance Field.

  type: float"
  (^Float [^PositionTextureVertex this]
    (-> this .-texturePositionX)))

(defn texture-position-y
  "Instance Field.

  type: float"
  (^Float [^PositionTextureVertex this]
    (-> this .-texturePositionY)))

(defn set-texture-position
  "p-78240-1 - `float`
  p-78240-2 - `float`

  returns: `net.minecraft.client.model.PositionTextureVertex`"
  (^net.minecraft.client.model.PositionTextureVertex [^PositionTextureVertex this ^Float p-78240-1 ^Float p-78240-2]
    (-> this (.setTexturePosition p-78240-1 p-78240-2))))

