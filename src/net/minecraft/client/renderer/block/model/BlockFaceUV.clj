(ns net.minecraft.client.renderer.block.model.BlockFaceUV
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model BlockFaceUV]))

(defn ->block-face-uv
  "Constructor.

  uvs-in - `float[]`
  rotation-in - `int`"
  (^BlockFaceUV [uvs-in ^Integer rotation-in]
    (new BlockFaceUV uvs-in rotation-in)))

(defn uvs
  "Instance Field.

  type: float[]"
  ([^BlockFaceUV this]
    (-> this .-uvs)))

(defn rotation
  "Instance Constant.

  type: int"
  (^Integer [^BlockFaceUV this]
    (-> this .-rotation)))

(defn get-vertex-u
  "p-178348-1 - `int`

  returns: `float`"
  (^Float [^BlockFaceUV this ^Integer p-178348-1]
    (-> this (.getVertexU p-178348-1))))

(defn get-vertex-v
  "p-178346-1 - `int`

  returns: `float`"
  (^Float [^BlockFaceUV this ^Integer p-178346-1]
    (-> this (.getVertexV p-178346-1))))

(defn get-vertex-rotated-rev
  "p-178345-1 - `int`

  returns: `int`"
  (^Integer [^BlockFaceUV this ^Integer p-178345-1]
    (-> this (.getVertexRotatedRev p-178345-1))))

(defn set-uvs
  "uvs-in - `float[]`"
  ([^BlockFaceUV this uvs-in]
    (-> this (.setUvs uvs-in))))

