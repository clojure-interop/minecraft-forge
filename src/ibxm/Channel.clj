(ns ibxm.Channel
  (:refer-clojure :only [require comment defn ->])
  (:import [ibxm Channel]))

(defn ->channel
  "Constructor.

  mod - `ibxm.Module`
  sampling-rate - `int`
  global-vol - `int[]`"
  (^Channel [^ibxm.Module mod ^Integer sampling-rate global-vol]
    (new Channel mod sampling-rate global-vol)))

(defn pattern-loop-row
  "Instance Field.

  type: int"
  (^Integer [^Channel this]
    (-> this .-pattern_loop_row)))

(defn reset
  ""
  ([^Channel this]
    (-> this (.reset))))

(defn resample
  "mixing-buffer - `int[]`
  frame-offset - `int`
  frames - `int`
  quality - `int`"
  ([^Channel this mixing-buffer ^Integer frame-offset ^Integer frames ^Integer quality]
    (-> this (.resample mixing-buffer frame-offset frames quality))))

(defn update-sample-idx
  "samples - `int`"
  ([^Channel this ^Integer samples]
    (-> this (.update_sample_idx samples))))

(defn set-volume
  "vol - `int`"
  ([^Channel this ^Integer vol]
    (-> this (.set_volume vol))))

(defn set-panning
  "pan - `int`"
  ([^Channel this ^Integer pan]
    (-> this (.set_panning pan))))

(defn row
  "key - `int`
  inst-idx - `int`
  volume-column - `int`
  effect - `int`
  effect-param - `int`"
  ([^Channel this ^Integer key ^Integer inst-idx ^Integer volume-column ^Integer effect ^Integer effect-param]
    (-> this (.row key inst-idx volume-column effect effect-param))))

(defn tick
  ""
  ([^Channel this]
    (-> this (.tick))))

