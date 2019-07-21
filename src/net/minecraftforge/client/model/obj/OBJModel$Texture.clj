(ns net.minecraftforge.client.model.obj.OBJModel$Texture
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.obj OBJModel$Texture]))

(defn ->texture
  "Constructor.

  path - `java.lang.String`
  position - `javax.vecmath.Vector2f`
  scale - `javax.vecmath.Vector2f`
  rotation - `float`"
  (^OBJModel$Texture [^java.lang.String path ^javax.vecmath.Vector2f position ^javax.vecmath.Vector2f scale ^Float rotation]
    (new OBJModel$Texture path position scale rotation))
  (^OBJModel$Texture [^java.lang.String path]
    (new OBJModel$Texture path)))

(defn *-white
  "Static Field.

  type: net.minecraftforge.client.model.obj.OBJModel$Texture"
  []
  OBJModel$Texture/WHITE)

(defn set-position
  "position - `javax.vecmath.Vector2f`"
  ([^OBJModel$Texture this ^javax.vecmath.Vector2f position]
    (-> this (.setPosition position))))

(defn set-path
  "path - `java.lang.String`"
  ([^OBJModel$Texture this ^java.lang.String path]
    (-> this (.setPath path))))

(defn get-position
  "returns: `javax.vecmath.Vector2f`"
  (^javax.vecmath.Vector2f [^OBJModel$Texture this]
    (-> this (.getPosition))))

(defn get-texture-location
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^OBJModel$Texture this]
    (-> this (.getTextureLocation))))

(defn get-path
  "returns: `java.lang.String`"
  (^java.lang.String [^OBJModel$Texture this]
    (-> this (.getPath))))

(defn set-rotation
  "rotation - `float`"
  ([^OBJModel$Texture this ^Float rotation]
    (-> this (.setRotation rotation))))

(defn get-scale
  "returns: `javax.vecmath.Vector2f`"
  (^javax.vecmath.Vector2f [^OBJModel$Texture this]
    (-> this (.getScale))))

(defn get-rotation
  "returns: `float`"
  (^Float [^OBJModel$Texture this]
    (-> this (.getRotation))))

(defn set-scale
  "scale - `javax.vecmath.Vector2f`"
  ([^OBJModel$Texture this ^javax.vecmath.Vector2f scale]
    (-> this (.setScale scale))))

