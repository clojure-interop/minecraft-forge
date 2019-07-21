(ns net.minecraftforge.client.model.b3d.B3DModel$Animation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.b3d B3DModel$Animation]))

(defn ->animation
  "Constructor.

  flags - `int`
  frames - `int`
  fps - `float`
  keys - `com.google.common.collect.ImmutableTable`"
  (^B3DModel$Animation [^Integer flags ^Integer frames ^Float fps ^com.google.common.collect.ImmutableTable keys]
    (new B3DModel$Animation flags frames fps keys)))

(defn get-flags
  "returns: `int`"
  (^Integer [^B3DModel$Animation this]
    (-> this (.getFlags))))

(defn get-frames
  "returns: `int`"
  (^Integer [^B3DModel$Animation this]
    (-> this (.getFrames))))

(defn get-fps
  "returns: `float`"
  (^Float [^B3DModel$Animation this]
    (-> this (.getFps))))

(defn get-keys
  "returns: `com.google.common.collect.ImmutableTable<java.lang.Integer,net.minecraftforge.client.model.b3d.B3DModel$Node<?>,net.minecraftforge.client.model.b3d.B3DModel$Key>`"
  (^com.google.common.collect.ImmutableTable [^B3DModel$Animation this]
    (-> this (.getKeys))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^B3DModel$Animation this]
    (-> this (.toString))))

