(ns net.minecraft.client.renderer.Vector3d
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer Vector3d]))

(defn ->vector-3d
  "Constructor."
  (^Vector3d []
    (new Vector3d )))

(defn x
  "Instance Field.

  type: double"
  (^Double [^Vector3d this]
    (-> this .-x)))

(defn y
  "Instance Field.

  type: double"
  (^Double [^Vector3d this]
    (-> this .-y)))

(defn z
  "Instance Field.

  type: double"
  (^Double [^Vector3d this]
    (-> this .-z)))

