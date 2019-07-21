(ns net.minecraftforge.common.model.animation.Clips$TimeClip
  "Clip with custom parameterization of the time."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model.animation Clips$TimeClip]))

(defn ->time-clip
  "Constructor.

  child-clip - `net.minecraftforge.common.model.animation.IClip`
  time - `net.minecraftforge.common.animation.ITimeValue`"
  (^Clips$TimeClip [^net.minecraftforge.common.model.animation.IClip child-clip ^net.minecraftforge.common.animation.ITimeValue time]
    (new Clips$TimeClip child-clip time)))

(defn apply
  "joint - `net.minecraftforge.common.model.animation.IJoint`

  returns: `net.minecraftforge.common.model.animation.IJointClip`"
  (^net.minecraftforge.common.model.animation.IJointClip [^Clips$TimeClip this ^net.minecraftforge.common.model.animation.IJoint joint]
    (-> this (.apply joint))))

(defn past-events
  "last-poll-time - `float`
  time - `float`

  returns: `java.lang.Iterable<net.minecraftforge.common.animation.Event>`"
  (^java.lang.Iterable [^Clips$TimeClip this ^Float last-poll-time ^Float time]
    (-> this (.pastEvents last-poll-time time))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Clips$TimeClip this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Clips$TimeClip this ^java.lang.Object obj]
    (-> this (.equals obj))))

