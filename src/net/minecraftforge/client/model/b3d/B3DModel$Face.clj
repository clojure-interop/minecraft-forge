(ns net.minecraftforge.client.model.b3d.B3DModel$Face
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.b3d B3DModel$Face]))

(defn ->face
  "Constructor.

  v-1 - `net.minecraftforge.client.model.b3d.B3DModel$Vertex`
  v-2 - `net.minecraftforge.client.model.b3d.B3DModel$Vertex`
  v-3 - `net.minecraftforge.client.model.b3d.B3DModel$Vertex`
  brush - `net.minecraftforge.client.model.b3d.B3DModel$Brush`
  normal - `javax.vecmath.Vector3f`"
  (^B3DModel$Face [^net.minecraftforge.client.model.b3d.B3DModel$Vertex v-1 ^net.minecraftforge.client.model.b3d.B3DModel$Vertex v-2 ^net.minecraftforge.client.model.b3d.B3DModel$Vertex v-3 ^net.minecraftforge.client.model.b3d.B3DModel$Brush brush ^javax.vecmath.Vector3f normal]
    (new B3DModel$Face v-1 v-2 v-3 brush normal))
  (^B3DModel$Face [^net.minecraftforge.client.model.b3d.B3DModel$Vertex v-1 ^net.minecraftforge.client.model.b3d.B3DModel$Vertex v-2 ^net.minecraftforge.client.model.b3d.B3DModel$Vertex v-3 ^net.minecraftforge.client.model.b3d.B3DModel$Brush brush]
    (new B3DModel$Face v-1 v-2 v-3 brush)))

(defn *get-normal
  "v-1 - `net.minecraftforge.client.model.b3d.B3DModel$Vertex`
  v-2 - `net.minecraftforge.client.model.b3d.B3DModel$Vertex`
  v-3 - `net.minecraftforge.client.model.b3d.B3DModel$Vertex`

  returns: `javax.vecmath.Vector3f`"
  (^javax.vecmath.Vector3f [^net.minecraftforge.client.model.b3d.B3DModel$Vertex v-1 ^net.minecraftforge.client.model.b3d.B3DModel$Vertex v-2 ^net.minecraftforge.client.model.b3d.B3DModel$Vertex v-3]
    (B3DModel$Face/getNormal v-1 v-2 v-3)))

(defn get-v-1
  "returns: `net.minecraftforge.client.model.b3d.B3DModel$Vertex`"
  (^net.minecraftforge.client.model.b3d.B3DModel$Vertex [^B3DModel$Face this]
    (-> this (.getV1))))

(defn get-v-2
  "returns: `net.minecraftforge.client.model.b3d.B3DModel$Vertex`"
  (^net.minecraftforge.client.model.b3d.B3DModel$Vertex [^B3DModel$Face this]
    (-> this (.getV2))))

(defn get-v-3
  "returns: `net.minecraftforge.client.model.b3d.B3DModel$Vertex`"
  (^net.minecraftforge.client.model.b3d.B3DModel$Vertex [^B3DModel$Face this]
    (-> this (.getV3))))

(defn get-brush
  "returns: `net.minecraftforge.client.model.b3d.B3DModel$Brush`"
  (^net.minecraftforge.client.model.b3d.B3DModel$Brush [^B3DModel$Face this]
    (-> this (.getBrush))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^B3DModel$Face this]
    (-> this (.toString))))

(defn get-normal
  "returns: `javax.vecmath.Vector3f`"
  (^javax.vecmath.Vector3f [^B3DModel$Face this]
    (-> this (.getNormal))))

