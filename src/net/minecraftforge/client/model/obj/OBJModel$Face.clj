(ns net.minecraftforge.client.model.obj.OBJModel$Face
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.obj OBJModel$Face]))

(defn ->face
  "Constructor.

  verts - `net.minecraftforge.client.model.obj.OBJModel$Vertex[]`
  material-name - `java.lang.String`"
  (^OBJModel$Face [verts ^java.lang.String material-name]
    (new OBJModel$Face verts material-name))
  (^OBJModel$Face [verts]
    (new OBJModel$Face verts)))

(defn set-material-name
  "material-name - `java.lang.String`"
  ([^OBJModel$Face this ^java.lang.String material-name]
    (-> this (.setMaterialName material-name))))

(defn get-material-name
  "returns: `java.lang.String`"
  (^java.lang.String [^OBJModel$Face this]
    (-> this (.getMaterialName))))

(defn triangles?
  "returns: `boolean`"
  (^Boolean [^OBJModel$Face this]
    (-> this (.isTriangles))))

(defn set-vertices
  "verts - `net.minecraftforge.client.model.obj.OBJModel$Vertex[]`

  returns: `boolean`"
  (^Boolean [^OBJModel$Face this verts]
    (-> this (.setVertices verts))))

(defn get-vertices
  "returns: `net.minecraftforge.client.model.obj.OBJModel$Vertex[]`"
  ([^OBJModel$Face this]
    (-> this (.getVertices))))

(defn bake
  "transform - `net.minecraftforge.common.model.TRSRTransformation`

  returns: `net.minecraftforge.client.model.obj.OBJModel$Face`"
  (^net.minecraftforge.client.model.obj.OBJModel$Face [^OBJModel$Face this ^net.minecraftforge.common.model.TRSRTransformation transform]
    (-> this (.bake transform))))

(defn get-normal
  "returns: `net.minecraftforge.client.model.obj.OBJModel$Normal`"
  (^net.minecraftforge.client.model.obj.OBJModel$Normal [^OBJModel$Face this]
    (-> this (.getNormal))))

