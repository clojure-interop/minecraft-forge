(ns net.minecraftforge.client.model.b3d.B3DModel$Mesh
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.b3d B3DModel$Mesh]))

(defn ->mesh
  "Constructor.

  data - `org.apache.commons.lang3.tuple.Pair`"
  (^B3DModel$Mesh [^org.apache.commons.lang3.tuple.Pair data]
    (new B3DModel$Mesh data)))

(defn get-weight-map
  "returns: `com.google.common.collect.ImmutableMultimap<net.minecraftforge.client.model.b3d.B3DModel$Vertex,org.apache.commons.lang3.tuple.Pair<java.lang.Float,net.minecraftforge.client.model.b3d.B3DModel$Node<net.minecraftforge.client.model.b3d.B3DModel$Bone>>>`"
  (^com.google.common.collect.ImmutableMultimap [^B3DModel$Mesh this]
    (-> this (.getWeightMap))))

(defn bake
  "animator - `com.google.common.base.Function`

  returns: `com.google.common.collect.ImmutableList<net.minecraftforge.client.model.b3d.B3DModel$Face>`"
  (^com.google.common.collect.ImmutableList [^B3DModel$Mesh this ^com.google.common.base.Function animator]
    (-> this (.bake animator))))

(defn get-brush
  "returns: `net.minecraftforge.client.model.b3d.B3DModel$Brush`"
  (^net.minecraftforge.client.model.b3d.B3DModel$Brush [^B3DModel$Mesh this]
    (-> this (.getBrush))))

(defn get-faces
  "returns: `com.google.common.collect.ImmutableList<net.minecraftforge.client.model.b3d.B3DModel$Face>`"
  (^com.google.common.collect.ImmutableList [^B3DModel$Mesh this]
    (-> this (.getFaces))))

(defn get-bones
  "returns: `com.google.common.collect.ImmutableSet<net.minecraftforge.client.model.b3d.B3DModel$Node<net.minecraftforge.client.model.b3d.B3DModel$Bone>>`"
  (^com.google.common.collect.ImmutableSet [^B3DModel$Mesh this]
    (-> this (.getBones))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^B3DModel$Mesh this]
    (-> this (.toString))))

(defn set-parent
  "parent - `net.minecraftforge.client.model.b3d.B3DModel$Node`"
  ([^B3DModel$Mesh this ^net.minecraftforge.client.model.b3d.B3DModel$Node parent]
    (-> this (.setParent parent))))

(defn get-parent
  "returns: `net.minecraftforge.client.model.b3d.B3DModel$Node<net.minecraftforge.client.model.b3d.B3DModel$Mesh>`"
  (^net.minecraftforge.client.model.b3d.B3DModel$Node [^B3DModel$Mesh this]
    (-> this (.getParent))))

