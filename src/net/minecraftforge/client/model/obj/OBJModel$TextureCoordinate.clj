(ns net.minecraftforge.client.model.obj.OBJModel$TextureCoordinate
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.obj OBJModel$TextureCoordinate]))

(defn ->texture-coordinate
  "Constructor.

  u - `float`
  v - `float`
  w - `float`"
  (^OBJModel$TextureCoordinate [^Float u ^Float v ^Float w]
    (new OBJModel$TextureCoordinate u v w))
  (^OBJModel$TextureCoordinate [data]
    (new OBJModel$TextureCoordinate data))
  (^OBJModel$TextureCoordinate []
    (new OBJModel$TextureCoordinate )))

(defn u
  "Instance Field.

  type: float"
  (^Float [^OBJModel$TextureCoordinate this]
    (-> this .-u)))

(defn v
  "Instance Field.

  type: float"
  (^Float [^OBJModel$TextureCoordinate this]
    (-> this .-v)))

(defn w
  "Instance Field.

  type: float"
  (^Float [^OBJModel$TextureCoordinate this]
    (-> this .-w)))

(defn *get-default-u-vs
  "returns: `net.minecraftforge.client.model.obj.OBJModel$TextureCoordinate[]`"
  ([]
    (OBJModel$TextureCoordinate/getDefaultUVs )))

(defn get-data
  "returns: `javax.vecmath.Vector3f`"
  (^javax.vecmath.Vector3f [^OBJModel$TextureCoordinate this]
    (-> this (.getData))))

