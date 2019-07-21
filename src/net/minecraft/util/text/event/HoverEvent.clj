(ns net.minecraft.util.text.event.HoverEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.text.event HoverEvent]))

(defn ->hover-event
  "Constructor.

  action-in - `net.minecraft.util.text.event.HoverEvent$Action`
  value-in - `net.minecraft.util.text.ITextComponent`"
  (^HoverEvent [^net.minecraft.util.text.event.HoverEvent$Action action-in ^net.minecraft.util.text.ITextComponent value-in]
    (new HoverEvent action-in value-in)))

(defn get-action
  "returns: `net.minecraft.util.text.event.HoverEvent$Action`"
  (^net.minecraft.util.text.event.HoverEvent$Action [^HoverEvent this]
    (-> this (.getAction))))

(defn get-value
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^HoverEvent this]
    (-> this (.getValue))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^HoverEvent this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^HoverEvent this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^HoverEvent this]
    (-> this (.hashCode))))

