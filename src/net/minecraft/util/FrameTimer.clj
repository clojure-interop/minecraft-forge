(ns net.minecraft.util.FrameTimer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util FrameTimer]))

(defn ->frame-timer
  "Constructor."
  (^FrameTimer []
    (new FrameTimer )))

(defn add-frame
  "running-time - `long`"
  ([^FrameTimer this ^Long running-time]
    (-> this (.addFrame running-time))))

(defn get-lagometer-value
  "time - `long`
  multiplier - `int`

  returns: `int`"
  (^Integer [^FrameTimer this ^Long time ^Integer multiplier]
    (-> this (.getLagometerValue time multiplier))))

(defn get-last-index
  "returns: `int`"
  (^Integer [^FrameTimer this]
    (-> this (.getLastIndex))))

(defn get-index
  "returns: `int`"
  (^Integer [^FrameTimer this]
    (-> this (.getIndex))))

(defn parse-index
  "raw-index - `int`

  returns: `int`"
  (^Integer [^FrameTimer this ^Integer raw-index]
    (-> this (.parseIndex raw-index))))

(defn get-frames
  "returns: `long[]`"
  ([^FrameTimer this]
    (-> this (.getFrames))))

