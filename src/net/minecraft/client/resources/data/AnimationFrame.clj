(ns net.minecraft.client.resources.data.AnimationFrame
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources.data AnimationFrame]))

(defn ->animation-frame
  "Constructor.

  frame-index-in - `int`
  frame-time-in - `int`"
  (^AnimationFrame [^Integer frame-index-in ^Integer frame-time-in]
    (new AnimationFrame frame-index-in frame-time-in))
  (^AnimationFrame [^Integer frame-index-in]
    (new AnimationFrame frame-index-in)))

(defn has-no-time?
  "returns: `boolean`"
  (^Boolean [^AnimationFrame this]
    (-> this (.hasNoTime))))

(defn get-frame-time
  "returns: `int`"
  (^Integer [^AnimationFrame this]
    (-> this (.getFrameTime))))

(defn get-frame-index
  "returns: `int`"
  (^Integer [^AnimationFrame this]
    (-> this (.getFrameIndex))))

