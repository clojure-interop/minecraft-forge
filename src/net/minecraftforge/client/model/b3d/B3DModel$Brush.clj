(ns net.minecraftforge.client.model.b3d.B3DModel$Brush
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.b3d B3DModel$Brush]))

(defn ->brush
  "Constructor.

  name - `java.lang.String`
  color - `javax.vecmath.Vector4f`
  shininess - `float`
  blend - `int`
  fx - `int`
  textures - `java.util.List`"
  (^B3DModel$Brush [^java.lang.String name ^javax.vecmath.Vector4f color ^Float shininess ^Integer blend ^Integer fx ^java.util.List textures]
    (new B3DModel$Brush name color shininess blend fx textures)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^B3DModel$Brush this]
    (-> this (.getName))))

(defn get-color
  "returns: `javax.vecmath.Vector4f`"
  (^javax.vecmath.Vector4f [^B3DModel$Brush this]
    (-> this (.getColor))))

(defn get-shininess
  "returns: `float`"
  (^Float [^B3DModel$Brush this]
    (-> this (.getShininess))))

(defn get-blend
  "returns: `int`"
  (^Integer [^B3DModel$Brush this]
    (-> this (.getBlend))))

(defn get-fx
  "returns: `int`"
  (^Integer [^B3DModel$Brush this]
    (-> this (.getFx))))

(defn get-textures
  "returns: `java.util.List<net.minecraftforge.client.model.b3d.B3DModel$Texture>`"
  (^java.util.List [^B3DModel$Brush this]
    (-> this (.getTextures))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^B3DModel$Brush this]
    (-> this (.toString))))

