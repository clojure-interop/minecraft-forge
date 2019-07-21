(ns net.minecraft.client.model.TextureOffset
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model TextureOffset]))

(defn ->texture-offset
  "Constructor.

  texture-offset-x-in - `int`
  texture-offset-y-in - `int`"
  (^TextureOffset [^Integer texture-offset-x-in ^Integer texture-offset-y-in]
    (new TextureOffset texture-offset-x-in texture-offset-y-in)))

(defn texture-offset-x
  "Instance Constant.

  type: int"
  (^Integer [^TextureOffset this]
    (-> this .-textureOffsetX)))

(defn texture-offset-y
  "Instance Constant.

  type: int"
  (^Integer [^TextureOffset this]
    (-> this .-textureOffsetY)))

