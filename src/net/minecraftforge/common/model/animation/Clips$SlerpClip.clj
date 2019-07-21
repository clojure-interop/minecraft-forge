(ns net.minecraftforge.common.model.animation.Clips$SlerpClip
  "Spherical linear blend between 2 clips."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model.animation Clips$SlerpClip]))

(defn ->slerp-clip
  "Constructor.

  from - `net.minecraftforge.common.model.animation.IClip`
  to - `net.minecraftforge.common.model.animation.IClip`
  input - `net.minecraftforge.common.animation.ITimeValue`
  progress - `net.minecraftforge.common.animation.ITimeValue`"
  (^Clips$SlerpClip [^net.minecraftforge.common.model.animation.IClip from ^net.minecraftforge.common.model.animation.IClip to ^net.minecraftforge.common.animation.ITimeValue input ^net.minecraftforge.common.animation.ITimeValue progress]
    (new Clips$SlerpClip from to input progress)))

(defn apply
  "joint - `net.minecraftforge.common.model.animation.IJoint`

  returns: `net.minecraftforge.common.model.animation.IJointClip`"
  (^net.minecraftforge.common.model.animation.IJointClip [^Clips$SlerpClip this ^net.minecraftforge.common.model.animation.IJoint joint]
    (-> this (.apply joint))))

(defn past-events
  "last-poll-time - `float`
  time - `float`

  returns: `java.lang.Iterable<net.minecraftforge.common.animation.Event>`"
  (^java.lang.Iterable [^Clips$SlerpClip this ^Float last-poll-time ^Float time]
    (-> this (.pastEvents last-poll-time time))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Clips$SlerpClip this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Clips$SlerpClip this ^java.lang.Object obj]
    (-> this (.equals obj))))

