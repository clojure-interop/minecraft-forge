(ns ibxm.LogTable
  (:refer-clojure :only [require comment defn ->])
  (:import [ibxm LogTable]))

(defn ->log-table
  "Constructor."
  (^LogTable []
    (new LogTable )))

(defn *log-2
  "x - `int`

  returns: `int`"
  (^Integer [^Integer x]
    (LogTable/log_2 x)))

(defn *raise-2
  "x - `int`

  returns: `int`"
  (^Integer [^Integer x]
    (LogTable/raise_2 x)))

