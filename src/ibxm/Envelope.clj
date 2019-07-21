(ns ibxm.Envelope
  (:refer-clojure :only [require comment defn ->])
  (:import [ibxm Envelope]))

(defn ->envelope
  "Constructor."
  (^Envelope []
    (new Envelope )))

(defn sustain
  "Instance Field.

  type: boolean"
  (^Boolean [^Envelope this]
    (-> this .-sustain)))

(defn looped
  "Instance Field.

  type: boolean"
  (^Boolean [^Envelope this]
    (-> this .-looped)))

(defn set-num-points
  "num-points - `int`"
  ([^Envelope this ^Integer num-points]
    (-> this (.set_num_points num-points))))

(defn set-point
  "point - `int`
  tick - `int`
  ampl - `int`
  delta - `boolean`"
  ([^Envelope this ^Integer point ^Integer tick ^Integer ampl ^Boolean delta]
    (-> this (.set_point point tick ampl delta))))

(defn set-sustain-point
  "point - `int`"
  ([^Envelope this ^Integer point]
    (-> this (.set_sustain_point point))))

(defn set-loop-points
  "start - `int`
  end - `int`"
  ([^Envelope this ^Integer start ^Integer end]
    (-> this (.set_loop_points start end))))

(defn next-tick
  "tick - `int`
  key-on - `boolean`

  returns: `int`"
  (^Integer [^Envelope this ^Integer tick ^Boolean key-on]
    (-> this (.next_tick tick key-on))))

(defn calculate-ampl
  "tick - `int`

  returns: `int`"
  (^Integer [^Envelope this ^Integer tick]
    (-> this (.calculate_ampl tick))))

(defn dump
  ""
  ([^Envelope this]
    (-> this (.dump))))

