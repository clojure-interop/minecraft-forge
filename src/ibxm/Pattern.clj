(ns ibxm.Pattern
  (:refer-clojure :only [require comment defn ->])
  (:import [ibxm Pattern]))

(defn ->pattern
  "Constructor."
  (^Pattern []
    (new Pattern )))

(defn num-rows
  "Instance Field.

  type: int"
  (^Integer [^Pattern this]
    (-> this .-num_rows)))

(defn set-pattern-data
  "data - `byte[]`"
  ([^Pattern this data]
    (-> this (.set_pattern_data data))))

(defn get-note
  "note - `int[]`
  index - `int`"
  ([^Pattern this note ^Integer index]
    (-> this (.get_note note index))))

(defn next-note
  "data-offset - `int`
  note - `int[]`

  returns: `int`"
  (^Integer [^Pattern this ^Integer data-offset note]
    (-> this (.next_note data-offset note))))

