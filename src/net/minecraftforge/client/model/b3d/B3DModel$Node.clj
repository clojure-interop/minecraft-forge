(ns net.minecraftforge.client.model.b3d.B3DModel$Node
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.b3d B3DModel$Node]))

(defn ->node
  "Constructor.

  name - `java.lang.String`
  pos - `javax.vecmath.Vector3f`
  scale - `javax.vecmath.Vector3f`
  rot - `javax.vecmath.Quat4f`
  nodes - `java.util.List`
  kind - `K`"
  (^B3DModel$Node [^java.lang.String name ^javax.vecmath.Vector3f pos ^javax.vecmath.Vector3f scale ^javax.vecmath.Quat4f rot ^java.util.List nodes kind]
    (new B3DModel$Node name pos scale rot nodes kind)))

(defn *create
  "name - `java.lang.String`
  pos - `javax.vecmath.Vector3f`
  scale - `javax.vecmath.Vector3f`
  rot - `javax.vecmath.Quat4f`
  nodes - `java.util.List`
  kind - `K`

  returns: `<K extends net.minecraftforge.client.model.b3d.B3DModel$IKind<K>> net.minecraftforge.client.model.b3d.B3DModel$Node<K>`"
  ([^java.lang.String name ^javax.vecmath.Vector3f pos ^javax.vecmath.Vector3f scale ^javax.vecmath.Quat4f rot ^java.util.List nodes kind]
    (B3DModel$Node/create name pos scale rot nodes kind)))

(defn set-parent
  "parent - `net.minecraftforge.client.model.b3d.B3DModel$Node`"
  ([^B3DModel$Node this ^net.minecraftforge.client.model.b3d.B3DModel$Node parent]
    (-> this (.setParent parent))))

(defn get-kind
  "returns: `K`"
  ([^B3DModel$Node this]
    (-> this (.getKind))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^B3DModel$Node this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^B3DModel$Node this]
    (-> this (.getName))))

(defn get-nodes
  "returns: `com.google.common.collect.ImmutableMap<java.lang.String,net.minecraftforge.client.model.b3d.B3DModel$Node<?>>`"
  (^com.google.common.collect.ImmutableMap [^B3DModel$Node this]
    (-> this (.getNodes))))

(defn get-rot
  "returns: `javax.vecmath.Quat4f`"
  (^javax.vecmath.Quat4f [^B3DModel$Node this]
    (-> this (.getRot))))

(defn get-scale
  "returns: `javax.vecmath.Vector3f`"
  (^javax.vecmath.Vector3f [^B3DModel$Node this]
    (-> this (.getScale))))

(defn get-parent
  "returns: `net.minecraftforge.client.model.b3d.B3DModel$Node<? extends net.minecraftforge.client.model.b3d.B3DModel$IKind<?>>`"
  ([^B3DModel$Node this]
    (-> this (.getParent))))

(defn get-pos
  "returns: `javax.vecmath.Vector3f`"
  (^javax.vecmath.Vector3f [^B3DModel$Node this]
    (-> this (.getPos))))

(defn set-animation
  "anim-data - `org.apache.commons.lang3.tuple.Triple`
  key-data - `com.google.common.collect.Table`"
  ([^B3DModel$Node this ^org.apache.commons.lang3.tuple.Triple anim-data ^com.google.common.collect.Table key-data]
    (-> this (.setAnimation anim-data key-data)))
  ([^B3DModel$Node this ^net.minecraftforge.client.model.b3d.B3DModel$Animation animation]
    (-> this (.setAnimation animation))))

(defn get-animation
  "returns: `net.minecraftforge.client.model.b3d.B3DModel$Animation`"
  (^net.minecraftforge.client.model.b3d.B3DModel$Animation [^B3DModel$Node this]
    (-> this (.getAnimation))))

