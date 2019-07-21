(ns net.minecraftforge.client.model.b3d.B3DModel$Key
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.b3d B3DModel$Key]))

(defn ->key
  "Constructor.

  pos - `javax.vecmath.Vector3f`
  scale - `javax.vecmath.Vector3f`
  rot - `javax.vecmath.Quat4f`"
  (^B3DModel$Key [^javax.vecmath.Vector3f pos ^javax.vecmath.Vector3f scale ^javax.vecmath.Quat4f rot]
    (new B3DModel$Key pos scale rot)))

(defn get-pos
  "returns: `javax.vecmath.Vector3f`"
  (^javax.vecmath.Vector3f [^B3DModel$Key this]
    (-> this (.getPos))))

(defn get-scale
  "returns: `javax.vecmath.Vector3f`"
  (^javax.vecmath.Vector3f [^B3DModel$Key this]
    (-> this (.getScale))))

(defn get-rot
  "returns: `javax.vecmath.Quat4f`"
  (^javax.vecmath.Quat4f [^B3DModel$Key this]
    (-> this (.getRot))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^B3DModel$Key this]
    (-> this (.toString))))

