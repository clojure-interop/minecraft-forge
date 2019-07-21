(ns ibxm.Sample
  (:refer-clojure :only [require comment defn ->])
  (:import [ibxm Sample]))

(defn ->sample
  "Constructor."
  (^Sample []
    (new Sample )))

(defn name
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^Sample this]
    (-> this .-name)))

(defn set-panning
  "Instance Field.

  type: boolean"
  (^Boolean [^Sample this]
    (-> this .-set_panning)))

(defn volume
  "Instance Field.

  type: int"
  (^Integer [^Sample this]
    (-> this .-volume)))

(defn panning
  "Instance Field.

  type: int"
  (^Integer [^Sample this]
    (-> this .-panning)))

(defn transpose
  "Instance Field.

  type: int"
  (^Integer [^Sample this]
    (-> this .-transpose)))

(defn set-sample-data
  "data - `short[]`
  loop-start - `int`
  loop-length - `int`
  ping-pong - `boolean`"
  ([^Sample this data ^Integer loop-start ^Integer loop-length ^Boolean ping-pong]
    (-> this (.set_sample_data data loop-start loop-length ping-pong))))

(defn resample-nearest
  "sample-idx - `int`
  sample-frac - `int`
  step - `int`
  left-gain - `int`
  right-gain - `int`
  mix-buffer - `int[]`
  frame-offset - `int`
  frames - `int`"
  ([^Sample this ^Integer sample-idx ^Integer sample-frac ^Integer step ^Integer left-gain ^Integer right-gain mix-buffer ^Integer frame-offset ^Integer frames]
    (-> this (.resample_nearest sample-idx sample-frac step left-gain right-gain mix-buffer frame-offset frames))))

(defn resample-linear
  "sample-idx - `int`
  sample-frac - `int`
  step - `int`
  left-gain - `int`
  right-gain - `int`
  mix-buffer - `int[]`
  frame-offset - `int`
  frames - `int`"
  ([^Sample this ^Integer sample-idx ^Integer sample-frac ^Integer step ^Integer left-gain ^Integer right-gain mix-buffer ^Integer frame-offset ^Integer frames]
    (-> this (.resample_linear sample-idx sample-frac step left-gain right-gain mix-buffer frame-offset frames))))

(defn resample-sinc
  "sample-idx - `int`
  sample-frac - `int`
  step - `int`
  left-gain - `int`
  right-gain - `int`
  mix-buffer - `int[]`
  frame-offset - `int`
  frames - `int`"
  ([^Sample this ^Integer sample-idx ^Integer sample-frac ^Integer step ^Integer left-gain ^Integer right-gain mix-buffer ^Integer frame-offset ^Integer frames]
    (-> this (.resample_sinc sample-idx sample-frac step left-gain right-gain mix-buffer frame-offset frames))))

(defn has-finished?
  "sample-idx - `int`

  returns: `boolean`"
  (^Boolean [^Sample this ^Integer sample-idx]
    (-> this (.has_finished sample-idx))))

