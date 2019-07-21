(ns net.minecraftforge.client.model.obj.OBJModel$Vertex
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.obj OBJModel$Vertex]))

(defn ->vertex
  "Constructor.

  position - `javax.vecmath.Vector4f`
  material - `net.minecraftforge.client.model.obj.OBJModel$Material`"
  (^OBJModel$Vertex [^javax.vecmath.Vector4f position ^net.minecraftforge.client.model.obj.OBJModel$Material material]
    (new OBJModel$Vertex position material)))

(defn set-pos
  "position - `javax.vecmath.Vector4f`"
  ([^OBJModel$Vertex this ^javax.vecmath.Vector4f position]
    (-> this (.setPos position))))

(defn get-pos-3
  "returns: `javax.vecmath.Vector3f`"
  (^javax.vecmath.Vector3f [^OBJModel$Vertex this]
    (-> this (.getPos3))))

(defn set-material
  "material - `net.minecraftforge.client.model.obj.OBJModel$Material`"
  ([^OBJModel$Vertex this ^net.minecraftforge.client.model.obj.OBJModel$Material material]
    (-> this (.setMaterial material))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^OBJModel$Vertex this]
    (-> this (.toString))))

(defn set-normal
  "normal - `net.minecraftforge.client.model.obj.OBJModel$Normal`"
  ([^OBJModel$Vertex this ^net.minecraftforge.client.model.obj.OBJModel$Normal normal]
    (-> this (.setNormal normal))))

(defn get-material
  "returns: `net.minecraftforge.client.model.obj.OBJModel$Material`"
  (^net.minecraftforge.client.model.obj.OBJModel$Material [^OBJModel$Vertex this]
    (-> this (.getMaterial))))

(defn get-normal
  "returns: `net.minecraftforge.client.model.obj.OBJModel$Normal`"
  (^net.minecraftforge.client.model.obj.OBJModel$Normal [^OBJModel$Vertex this]
    (-> this (.getNormal))))

(defn has-normal?
  "returns: `boolean`"
  (^Boolean [^OBJModel$Vertex this]
    (-> this (.hasNormal))))

(defn set-texture-coordinate
  "tex-coord - `net.minecraftforge.client.model.obj.OBJModel$TextureCoordinate`"
  ([^OBJModel$Vertex this ^net.minecraftforge.client.model.obj.OBJModel$TextureCoordinate tex-coord]
    (-> this (.setTextureCoordinate tex-coord))))

(defn get-pos
  "returns: `javax.vecmath.Vector4f`"
  (^javax.vecmath.Vector4f [^OBJModel$Vertex this]
    (-> this (.getPos))))

(defn has-texture-coordinate?
  "returns: `boolean`"
  (^Boolean [^OBJModel$Vertex this]
    (-> this (.hasTextureCoordinate))))

(defn get-texture-coordinate
  "returns: `net.minecraftforge.client.model.obj.OBJModel$TextureCoordinate`"
  (^net.minecraftforge.client.model.obj.OBJModel$TextureCoordinate [^OBJModel$Vertex this]
    (-> this (.getTextureCoordinate))))

