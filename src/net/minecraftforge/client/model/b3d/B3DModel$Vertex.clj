(ns net.minecraftforge.client.model.b3d.B3DModel$Vertex
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.b3d B3DModel$Vertex]))

(defn ->vertex
  "Constructor.

  pos - `javax.vecmath.Vector3f`
  normal - `javax.vecmath.Vector3f`
  color - `javax.vecmath.Vector4f`
  tex-coords - `javax.vecmath.Vector4f[]`"
  (^B3DModel$Vertex [^javax.vecmath.Vector3f pos ^javax.vecmath.Vector3f normal ^javax.vecmath.Vector4f color tex-coords]
    (new B3DModel$Vertex pos normal color tex-coords)))

(defn bake
  "mesh - `net.minecraftforge.client.model.b3d.B3DModel$Mesh`
  animator - `com.google.common.base.Function`

  returns: `net.minecraftforge.client.model.b3d.B3DModel$Vertex`"
  (^net.minecraftforge.client.model.b3d.B3DModel$Vertex [^B3DModel$Vertex this ^net.minecraftforge.client.model.b3d.B3DModel$Mesh mesh ^com.google.common.base.Function animator]
    (-> this (.bake mesh animator))))

(defn get-pos
  "returns: `javax.vecmath.Vector3f`"
  (^javax.vecmath.Vector3f [^B3DModel$Vertex this]
    (-> this (.getPos))))

(defn get-normal
  "returns: `javax.vecmath.Vector3f`"
  (^javax.vecmath.Vector3f [^B3DModel$Vertex this]
    (-> this (.getNormal))))

(defn get-color
  "returns: `javax.vecmath.Vector4f`"
  (^javax.vecmath.Vector4f [^B3DModel$Vertex this]
    (-> this (.getColor))))

(defn get-tex-coords
  "returns: `javax.vecmath.Vector4f[]`"
  ([^B3DModel$Vertex this]
    (-> this (.getTexCoords))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^B3DModel$Vertex this]
    (-> this (.toString))))

