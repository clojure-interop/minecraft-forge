(ns ibxm.IBXM
  (:refer-clojure :only [require comment defn ->])
  (:import [ibxm IBXM]))

(defn ->ibxm
  "Constructor.

  sample-rate - `int`"
  (^IBXM [^Integer sample-rate]
    (new IBXM sample-rate)))

(def *-version
  "Static Constant.

  type: java.lang.String"
  IBXM/VERSION)

(def *-fp-shift
  "Static Constant.

  type: int"
  IBXM/FP_SHIFT)

(def *-fp-one
  "Static Constant.

  type: int"
  IBXM/FP_ONE)

(def *-fp-mask
  "Static Constant.

  type: int"
  IBXM/FP_MASK)

(defn set-module
  "m - `ibxm.Module`"
  ([^IBXM this ^ibxm.Module m]
    (-> this (.set_module m))))

(defn set-resampling-quality
  "quality - `int`"
  ([^IBXM this ^Integer quality]
    (-> this (.set_resampling_quality quality))))

(defn calculate-song-duration
  "returns: `int`"
  (^Integer [^IBXM this]
    (-> this (.calculate_song_duration))))

(defn set-sequence-index
  "sequence-index - `int`
  row - `int`"
  ([^IBXM this ^Integer sequence-index ^Integer row]
    (-> this (.set_sequence_index sequence-index row))))

(defn seek
  "sample-position - `int`"
  ([^IBXM this ^Integer sample-position]
    (-> this (.seek sample-position))))

(defn get-audio
  "output-buffer - `byte[]`
  frames - `int`"
  ([^IBXM this output-buffer ^Integer frames]
    (-> this (.get_audio output-buffer frames))))

