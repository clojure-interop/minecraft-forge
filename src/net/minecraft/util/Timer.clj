(ns net.minecraft.util.Timer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util Timer]))

(defn ->timer
  "Constructor.

  tps - `float`"
  (^Timer [^Float tps]
    (new Timer tps)))

(defn elapsed-ticks
  "Instance Field.

  type: int"
  (^Integer [^Timer this]
    (-> this .-elapsedTicks)))

(defn render-partial-ticks
  "Instance Field.

  type: float"
  (^Float [^Timer this]
    (-> this .-renderPartialTicks)))

(defn timer-speed
  "Instance Field.

  type: float"
  (^Float [^Timer this]
    (-> this .-timerSpeed)))

(defn elapsed-partial-ticks
  "Instance Field.

  type: float"
  (^Float [^Timer this]
    (-> this .-elapsedPartialTicks)))

(defn update-timer
  ""
  ([^Timer this]
    (-> this (.updateTimer))))

