(ns net.minecraftforge.client.model.b3d.B3DLoader$B3DState
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.b3d B3DLoader$B3DState]))

(defn ->b-3-d-state
  "Constructor.

  animation - `net.minecraftforge.client.model.b3d.B3DModel$Animation`
  frame - `int`
  next-frame - `int`
  progress - `float`
  parent - `net.minecraftforge.common.model.IModelState`"
  (^B3DLoader$B3DState [^net.minecraftforge.client.model.b3d.B3DModel$Animation animation ^Integer frame ^Integer next-frame ^Float progress ^net.minecraftforge.common.model.IModelState parent]
    (new B3DLoader$B3DState animation frame next-frame progress parent))
  (^B3DLoader$B3DState [^net.minecraftforge.client.model.b3d.B3DModel$Animation animation ^Integer frame ^Integer next-frame ^Float progress]
    (new B3DLoader$B3DState animation frame next-frame progress))
  (^B3DLoader$B3DState [^net.minecraftforge.client.model.b3d.B3DModel$Animation animation ^Integer frame ^net.minecraftforge.common.model.IModelState parent]
    (new B3DLoader$B3DState animation frame parent))
  (^B3DLoader$B3DState [^net.minecraftforge.client.model.b3d.B3DModel$Animation animation ^Integer frame]
    (new B3DLoader$B3DState animation frame)))

(defn *get-node-matrix
  "animation - `net.minecraftforge.client.model.b3d.B3DModel$Animation`
  node - `net.minecraftforge.client.model.b3d.B3DModel$Node`
  frame - `int`

  returns: `net.minecraftforge.common.model.TRSRTransformation`"
  (^net.minecraftforge.common.model.TRSRTransformation [^net.minecraftforge.client.model.b3d.B3DModel$Animation animation ^net.minecraftforge.client.model.b3d.B3DModel$Node node ^Integer frame]
    (B3DLoader$B3DState/getNodeMatrix animation node frame)))

(defn get-animation
  "returns: `net.minecraftforge.client.model.b3d.B3DModel$Animation`"
  (^net.minecraftforge.client.model.b3d.B3DModel$Animation [^B3DLoader$B3DState this]
    (-> this (.getAnimation))))

(defn get-frame
  "returns: `int`"
  (^Integer [^B3DLoader$B3DState this]
    (-> this (.getFrame))))

(defn get-next-frame
  "returns: `int`"
  (^Integer [^B3DLoader$B3DState this]
    (-> this (.getNextFrame))))

(defn get-progress
  "returns: `float`"
  (^Float [^B3DLoader$B3DState this]
    (-> this (.getProgress))))

(defn get-parent
  "returns: `net.minecraftforge.common.model.IModelState`"
  (^net.minecraftforge.common.model.IModelState [^B3DLoader$B3DState this]
    (-> this (.getParent))))

(defn apply
  "part - `com.google.common.base.Optional`

  returns: `com.google.common.base.Optional<net.minecraftforge.common.model.TRSRTransformation>`"
  (^com.google.common.base.Optional [^B3DLoader$B3DState this ^com.google.common.base.Optional part]
    (-> this (.apply part))))

(defn get-node-matrix
  "node - `net.minecraftforge.client.model.b3d.B3DModel$Node`
  frame - `int`

  returns: `net.minecraftforge.common.model.TRSRTransformation`"
  (^net.minecraftforge.common.model.TRSRTransformation [^B3DLoader$B3DState this ^net.minecraftforge.client.model.b3d.B3DModel$Node node ^Integer frame]
    (-> this (.getNodeMatrix node frame)))
  (^net.minecraftforge.common.model.TRSRTransformation [^B3DLoader$B3DState this ^net.minecraftforge.client.model.b3d.B3DModel$Node node]
    (-> this (.getNodeMatrix node))))

