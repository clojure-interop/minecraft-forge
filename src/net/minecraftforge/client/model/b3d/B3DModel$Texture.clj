(ns net.minecraftforge.client.model.b3d.B3DModel$Texture
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.b3d B3DModel$Texture]))

(defn ->texture
  "Constructor.

  path - `java.lang.String`
  flags - `int`
  blend - `int`
  pos - `javax.vecmath.Vector2f`
  scale - `javax.vecmath.Vector2f`
  rot - `float`"
  (^B3DModel$Texture [^java.lang.String path ^Integer flags ^Integer blend ^javax.vecmath.Vector2f pos ^javax.vecmath.Vector2f scale ^Float rot]
    (new B3DModel$Texture path flags blend pos scale rot)))

(def *-white
  "Static Constant.

  type: net.minecraftforge.client.model.b3d.B3DModel$Texture"
  B3DModel$Texture/White)

(defn get-path
  "returns: `java.lang.String`"
  (^java.lang.String [^B3DModel$Texture this]
    (-> this (.getPath))))

(defn get-flags
  "returns: `int`"
  (^Integer [^B3DModel$Texture this]
    (-> this (.getFlags))))

(defn get-blend
  "returns: `int`"
  (^Integer [^B3DModel$Texture this]
    (-> this (.getBlend))))

(defn get-pos
  "returns: `javax.vecmath.Vector2f`"
  (^javax.vecmath.Vector2f [^B3DModel$Texture this]
    (-> this (.getPos))))

(defn get-scale
  "returns: `javax.vecmath.Vector2f`"
  (^javax.vecmath.Vector2f [^B3DModel$Texture this]
    (-> this (.getScale))))

(defn get-rot
  "returns: `float`"
  (^Float [^B3DModel$Texture this]
    (-> this (.getRot))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^B3DModel$Texture this]
    (-> this (.toString))))

