(ns ibxm.Instrument
  (:refer-clojure :only [require comment defn ->])
  (:import [ibxm Instrument]))

(defn ->instrument
  "Constructor."
  (^Instrument []
    (new Instrument )))

(defn name
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^Instrument this]
    (-> this .-name)))

(defn vibrato-type
  "Instance Field.

  type: int"
  (^Integer [^Instrument this]
    (-> this .-vibrato_type)))

(defn vibrato-sweep
  "Instance Field.

  type: int"
  (^Integer [^Instrument this]
    (-> this .-vibrato_sweep)))

(defn vibrato-depth
  "Instance Field.

  type: int"
  (^Integer [^Instrument this]
    (-> this .-vibrato_depth)))

(defn vibrato-rate
  "Instance Field.

  type: int"
  (^Integer [^Instrument this]
    (-> this .-vibrato_rate)))

(defn volume-envelope-active
  "Instance Field.

  type: boolean"
  (^Boolean [^Instrument this]
    (-> this .-volume_envelope_active)))

(defn panning-envelope-active
  "Instance Field.

  type: boolean"
  (^Boolean [^Instrument this]
    (-> this .-panning_envelope_active)))

(defn volume-fade-out
  "Instance Field.

  type: int"
  (^Integer [^Instrument this]
    (-> this .-volume_fade_out)))

(defn set-sample
  "sample-index - `int`
  sample - `ibxm.Sample`"
  ([^Instrument this ^Integer sample-index ^ibxm.Sample sample]
    (-> this (.set_sample sample-index sample))))

(defn get-num-samples
  "returns: `int`"
  (^Integer [^Instrument this]
    (-> this (.get_num_samples))))

(defn set-key-to-sample
  "key - `int`
  sample - `int`"
  ([^Instrument this ^Integer key ^Integer sample]
    (-> this (.set_key_to_sample key sample))))

(defn set-panning-envelope
  "envelope - `ibxm.Envelope`"
  ([^Instrument this ^ibxm.Envelope envelope]
    (-> this (.set_panning_envelope envelope))))

(defn set-volume-envelope
  "envelope - `ibxm.Envelope`"
  ([^Instrument this ^ibxm.Envelope envelope]
    (-> this (.set_volume_envelope envelope))))

(defn get-sample-from-key
  "key - `int`

  returns: `ibxm.Sample`"
  (^ibxm.Sample [^Instrument this ^Integer key]
    (-> this (.get_sample_from_key key))))

(defn set-num-samples
  "num-samples - `int`"
  ([^Instrument this ^Integer num-samples]
    (-> this (.set_num_samples num-samples))))

(defn get-panning-envelope
  "returns: `ibxm.Envelope`"
  (^ibxm.Envelope [^Instrument this]
    (-> this (.get_panning_envelope))))

(defn get-volume-envelope
  "returns: `ibxm.Envelope`"
  (^ibxm.Envelope [^Instrument this]
    (-> this (.get_volume_envelope))))

(defn get-sample
  "sample-index - `int`

  returns: `ibxm.Sample`"
  (^ibxm.Sample [^Instrument this ^Integer sample-index]
    (-> this (.get_sample sample-index))))

