(ns net.minecraft.util.text.event.ClickEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.text.event ClickEvent]))

(defn ->click-event
  "Constructor.

  the-action - `net.minecraft.util.text.event.ClickEvent$Action`
  the-value - `java.lang.String`"
  (^ClickEvent [^net.minecraft.util.text.event.ClickEvent$Action the-action ^java.lang.String the-value]
    (new ClickEvent the-action the-value)))

(defn get-action
  "returns: `net.minecraft.util.text.event.ClickEvent$Action`"
  (^net.minecraft.util.text.event.ClickEvent$Action [^ClickEvent this]
    (-> this (.getAction))))

(defn get-value
  "returns: `java.lang.String`"
  (^java.lang.String [^ClickEvent this]
    (-> this (.getValue))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ClickEvent this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ClickEvent this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ClickEvent this]
    (-> this (.hashCode))))

