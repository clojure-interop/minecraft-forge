(ns net.minecraftforge.client.model.b3d.B3DModel
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.b3d B3DModel]))

(defn ->b-3-d-model
  "Constructor.

  textures - `java.util.List`
  brushes - `java.util.List`
  root - `net.minecraftforge.client.model.b3d.B3DModel$Node`
  meshes - `com.google.common.collect.ImmutableMap`"
  (^B3DModel [^java.util.List textures ^java.util.List brushes ^net.minecraftforge.client.model.b3d.B3DModel$Node root ^com.google.common.collect.ImmutableMap meshes]
    (new B3DModel textures brushes root meshes)))

(defn get-textures
  "returns: `java.util.List<net.minecraftforge.client.model.b3d.B3DModel$Texture>`"
  (^java.util.List [^B3DModel this]
    (-> this (.getTextures))))

(defn get-brushes
  "returns: `java.util.List<net.minecraftforge.client.model.b3d.B3DModel$Brush>`"
  (^java.util.List [^B3DModel this]
    (-> this (.getBrushes))))

(defn get-root
  "returns: `net.minecraftforge.client.model.b3d.B3DModel$Node<?>`"
  (^net.minecraftforge.client.model.b3d.B3DModel$Node [^B3DModel this]
    (-> this (.getRoot))))

(defn get-meshes
  "returns: `com.google.common.collect.ImmutableMap<java.lang.String,net.minecraftforge.client.model.b3d.B3DModel$Node<net.minecraftforge.client.model.b3d.B3DModel$Mesh>>`"
  (^com.google.common.collect.ImmutableMap [^B3DModel this]
    (-> this (.getMeshes))))

