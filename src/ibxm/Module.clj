(ns ibxm.Module
  (:refer-clojure :only [require comment defn ->])
  (:import [ibxm Module]))

(defn ->module
  "Constructor."
  (^Module []
    (new Module )))

(defn song-title
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^Module this]
    (-> this .-song_title)))

(defn linear-periods
  "Instance Field.

  type: boolean"
  (^Boolean [^Module this]
    (-> this .-linear_periods)))

(defn fast-volume-slides
  "Instance Field.

  type: boolean"
  (^Boolean [^Module this]
    (-> this .-fast_volume_slides)))

(defn pal
  "Instance Field.

  type: boolean"
  (^Boolean [^Module this]
    (-> this .-pal)))

(defn global-volume
  "Instance Field.

  type: int"
  (^Integer [^Module this]
    (-> this .-global_volume)))

(defn channel-gain
  "Instance Field.

  type: int"
  (^Integer [^Module this]
    (-> this .-channel_gain)))

(defn default-speed
  "Instance Field.

  type: int"
  (^Integer [^Module this]
    (-> this .-default_speed)))

(defn default-tempo
  "Instance Field.

  type: int"
  (^Integer [^Module this]
    (-> this .-default_tempo)))

(defn restart-sequence-index
  "Instance Field.

  type: int"
  (^Integer [^Module this]
    (-> this .-restart_sequence_index)))

(defn set-instrument
  "instrument-index - `int`
  instrument - `ibxm.Instrument`"
  ([^Module this ^Integer instrument-index ^ibxm.Instrument instrument]
    (-> this (.set_instrument instrument-index instrument))))

(defn get-num-channels
  "returns: `int`"
  (^Integer [^Module this]
    (-> this (.get_num_channels))))

(defn set-sequence
  "sequence-index - `int`
  pattern-index - `int`"
  ([^Module this ^Integer sequence-index ^Integer pattern-index]
    (-> this (.set_sequence sequence-index pattern-index))))

(defn get-instrument
  "instrument-index - `int`

  returns: `ibxm.Instrument`"
  (^ibxm.Instrument [^Module this ^Integer instrument-index]
    (-> this (.get_instrument instrument-index))))

(defn set-num-patterns
  "num-patterns - `int`"
  ([^Module this ^Integer num-patterns]
    (-> this (.set_num_patterns num-patterns))))

(defn get-pattern-from-sequence
  "sequence-index - `int`

  returns: `ibxm.Pattern`"
  (^ibxm.Pattern [^Module this ^Integer sequence-index]
    (-> this (.get_pattern_from_sequence sequence-index))))

(defn set-sequence-length
  "sequence-length - `int`"
  ([^Module this ^Integer sequence-length]
    (-> this (.set_sequence_length sequence-length))))

(defn set-num-instruments
  "num-instruments - `int`"
  ([^Module this ^Integer num-instruments]
    (-> this (.set_num_instruments num-instruments))))

(defn get-num-instruments
  "returns: `int`"
  (^Integer [^Module this]
    (-> this (.get_num_instruments))))

(defn get-pattern
  "pattern-index - `int`

  returns: `ibxm.Pattern`"
  (^ibxm.Pattern [^Module this ^Integer pattern-index]
    (-> this (.get_pattern pattern-index))))

(defn get-num-patterns
  "returns: `int`"
  (^Integer [^Module this]
    (-> this (.get_num_patterns))))

(defn set-initial-panning
  "channel - `int`
  panning - `int`"
  ([^Module this ^Integer channel ^Integer panning]
    (-> this (.set_initial_panning channel panning))))

(defn get-sequence-length
  "returns: `int`"
  (^Integer [^Module this]
    (-> this (.get_sequence_length))))

(defn set-num-channels
  "num-channels - `int`"
  ([^Module this ^Integer num-channels]
    (-> this (.set_num_channels num-channels))))

(defn set-pattern
  "pattern-index - `int`
  pattern - `ibxm.Pattern`"
  ([^Module this ^Integer pattern-index ^ibxm.Pattern pattern]
    (-> this (.set_pattern pattern-index pattern))))

(defn get-initial-panning
  "channel - `int`

  returns: `int`"
  (^Integer [^Module this ^Integer channel]
    (-> this (.get_initial_panning channel))))

