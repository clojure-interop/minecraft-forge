(ns net.minecraftforge.client.model.obj.OBJModel$Material
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.obj OBJModel$Material]))

(defn ->material
  "Constructor.

  color - `javax.vecmath.Vector4f`
  texture - `net.minecraftforge.client.model.obj.OBJModel$Texture`
  name - `java.lang.String`"
  (^OBJModel$Material [^javax.vecmath.Vector4f color ^net.minecraftforge.client.model.obj.OBJModel$Texture texture ^java.lang.String name]
    (new OBJModel$Material color texture name))
  (^OBJModel$Material [^javax.vecmath.Vector4f color]
    (new OBJModel$Material color))
  (^OBJModel$Material []
    (new OBJModel$Material )))

(def *-white-name
  "Static Constant.

  type: java.lang.String"
  OBJModel$Material/WHITE_NAME)

(def *-default-name
  "Static Constant.

  type: java.lang.String"
  OBJModel$Material/DEFAULT_NAME)

(defn set-name
  "name - `java.lang.String`"
  ([^OBJModel$Material this ^java.lang.String name]
    (-> this (.setName name))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^OBJModel$Material this]
    (-> this (.getName))))

(defn set-color
  "color - `javax.vecmath.Vector4f`"
  ([^OBJModel$Material this ^javax.vecmath.Vector4f color]
    (-> this (.setColor color))))

(defn get-color
  "returns: `javax.vecmath.Vector4f`"
  (^javax.vecmath.Vector4f [^OBJModel$Material this]
    (-> this (.getColor))))

(defn set-texture
  "texture - `net.minecraftforge.client.model.obj.OBJModel$Texture`"
  ([^OBJModel$Material this ^net.minecraftforge.client.model.obj.OBJModel$Texture texture]
    (-> this (.setTexture texture))))

(defn get-texture
  "returns: `net.minecraftforge.client.model.obj.OBJModel$Texture`"
  (^net.minecraftforge.client.model.obj.OBJModel$Texture [^OBJModel$Material this]
    (-> this (.getTexture))))

(defn white?
  "returns: `boolean`"
  (^Boolean [^OBJModel$Material this]
    (-> this (.isWhite))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^OBJModel$Material this]
    (-> this (.toString))))

