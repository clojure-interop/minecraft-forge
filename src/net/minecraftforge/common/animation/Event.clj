(ns net.minecraftforge.common.animation.Event
  "Event stored in the clip"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.animation Event]))

(defn ->event
  "Constructor.

  event - `java.lang.String`
  offset - `float`"
  (^Event [^java.lang.String event ^Float offset]
    (new Event event offset)))

(defn event
  "returns: the name of the event. - `java.lang.String`"
  (^java.lang.String [^Event this]
    (-> this (.event))))

(defn offset
  "returns: how long ago the event happened, relative to the next event / first query time - `float`"
  (^Float [^Event this]
    (-> this (.offset))))

(defn compare-to
  "event - `net.minecraftforge.common.animation.Event`

  returns: `int`"
  (^Integer [^Event this ^net.minecraftforge.common.animation.Event event]
    (-> this (.compareTo event))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Event this]
    (-> this (.toString))))

