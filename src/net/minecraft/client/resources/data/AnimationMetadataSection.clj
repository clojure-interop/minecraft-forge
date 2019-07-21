(ns net.minecraft.client.resources.data.AnimationMetadataSection
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources.data AnimationMetadataSection]))

(defn ->animation-metadata-section
  "Constructor.

  animation-frames-in - `java.util.List`
  frame-width-in - `int`
  frame-height-in - `int`
  frame-time-in - `int`
  interpolate-in - `boolean`"
  (^AnimationMetadataSection [^java.util.List animation-frames-in ^Integer frame-width-in ^Integer frame-height-in ^Integer frame-time-in ^Boolean interpolate-in]
    (new AnimationMetadataSection animation-frames-in frame-width-in frame-height-in frame-time-in interpolate-in)))

(defn interpolate?
  "returns: `boolean`"
  (^Boolean [^AnimationMetadataSection this]
    (-> this (.isInterpolate))))

(defn get-frame-height
  "returns: `int`"
  (^Integer [^AnimationMetadataSection this]
    (-> this (.getFrameHeight))))

(defn get-frame-width
  "returns: `int`"
  (^Integer [^AnimationMetadataSection this]
    (-> this (.getFrameWidth))))

(defn get-frame-index
  "frame - `int`

  returns: `int`"
  (^Integer [^AnimationMetadataSection this ^Integer frame]
    (-> this (.getFrameIndex frame))))

(defn frame-has-time
  "frame - `int`

  returns: `boolean`"
  (^Boolean [^AnimationMetadataSection this ^Integer frame]
    (-> this (.frameHasTime frame))))

(defn get-frame-index-set
  "returns: `java.util.Set<java.lang.Integer>`"
  (^java.util.Set [^AnimationMetadataSection this]
    (-> this (.getFrameIndexSet))))

(defn get-frame-time-single
  "frame - `int`

  returns: `int`"
  (^Integer [^AnimationMetadataSection this ^Integer frame]
    (-> this (.getFrameTimeSingle frame))))

(defn get-frame-count
  "returns: `int`"
  (^Integer [^AnimationMetadataSection this]
    (-> this (.getFrameCount))))

(defn get-frame-time
  "returns: `int`"
  (^Integer [^AnimationMetadataSection this]
    (-> this (.getFrameTime))))

