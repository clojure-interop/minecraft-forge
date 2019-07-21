(ns net.minecraftforge.client.model.obj.OBJModel$Normal
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.obj OBJModel$Normal]))

(defn ->normal
  "Constructor.

  x - `float`
  y - `float`
  z - `float`"
  (^OBJModel$Normal [^Float x ^Float y ^Float z]
    (new OBJModel$Normal x y z))
  (^OBJModel$Normal [data]
    (new OBJModel$Normal data))
  (^OBJModel$Normal []
    (new OBJModel$Normal )))

(defn x
  "Instance Field.

  type: float"
  (^Float [^OBJModel$Normal this]
    (-> this .-x)))

(defn y
  "Instance Field.

  type: float"
  (^Float [^OBJModel$Normal this]
    (-> this .-y)))

(defn z
  "Instance Field.

  type: float"
  (^Float [^OBJModel$Normal this]
    (-> this .-z)))

(defn get-data
  "returns: `javax.vecmath.Vector3f`"
  (^javax.vecmath.Vector3f [^OBJModel$Normal this]
    (-> this (.getData))))

