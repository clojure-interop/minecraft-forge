(ns net.minecraftforge.client.model.b3d.B3DModel$Bone
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.b3d B3DModel$Bone]))

(defn ->bone
  "Constructor.

  data - `java.util.List`"
  (^B3DModel$Bone [^java.util.List data]
    (new B3DModel$Bone data)))

(defn get-data
  "returns: `java.util.List<org.apache.commons.lang3.tuple.Pair<net.minecraftforge.client.model.b3d.B3DModel$Vertex,java.lang.Float>>`"
  (^java.util.List [^B3DModel$Bone this]
    (-> this (.getData))))

(defn set-parent
  "parent - `net.minecraftforge.client.model.b3d.B3DModel$Node`"
  ([^B3DModel$Bone this ^net.minecraftforge.client.model.b3d.B3DModel$Node parent]
    (-> this (.setParent parent))))

(defn get-parent
  "returns: `net.minecraftforge.client.model.b3d.B3DModel$Node<net.minecraftforge.client.model.b3d.B3DModel$Bone>`"
  (^net.minecraftforge.client.model.b3d.B3DModel$Node [^B3DModel$Bone this]
    (-> this (.getParent))))

