(ns net.minecraftforge.common.model.animation.Clips$ClipReference
  "Reference to another clip.
  Should only exist during debugging."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model.animation Clips$ClipReference]))

(defn ->clip-reference
  "Constructor.

  clip-name - `java.lang.String`
  clip-resolver - `com.google.common.base.Function`"
  (^Clips$ClipReference [^java.lang.String clip-name ^com.google.common.base.Function clip-resolver]
    (new Clips$ClipReference clip-name clip-resolver)))

(defn apply
  "joint - `net.minecraftforge.common.model.animation.IJoint`

  returns: `net.minecraftforge.common.model.animation.IJointClip`"
  (^net.minecraftforge.common.model.animation.IJointClip [^Clips$ClipReference this ^net.minecraftforge.common.model.animation.IJoint joint]
    (-> this (.apply joint))))

(defn past-events
  "last-poll-time - `float`
  time - `float`

  returns: `java.lang.Iterable<net.minecraftforge.common.animation.Event>`"
  (^java.lang.Iterable [^Clips$ClipReference this ^Float last-poll-time ^Float time]
    (-> this (.pastEvents last-poll-time time))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^Clips$ClipReference this]
    (-> this (.getName))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Clips$ClipReference this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Clips$ClipReference this ^java.lang.Object obj]
    (-> this (.equals obj))))

