(ns net.minecraftforge.common.model.animation.Clips$ModelClip
  "Wrapper for model clips; useful for debugging and serialization;"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model.animation Clips$ModelClip]))

(defn ->model-clip
  "Constructor.

  child-clip - `net.minecraftforge.common.model.animation.IClip`
  model-location - `net.minecraft.util.ResourceLocation`
  clip-name - `java.lang.String`"
  (^Clips$ModelClip [^net.minecraftforge.common.model.animation.IClip child-clip ^net.minecraft.util.ResourceLocation model-location ^java.lang.String clip-name]
    (new Clips$ModelClip child-clip model-location clip-name)))

(defn apply
  "joint - `net.minecraftforge.common.model.animation.IJoint`

  returns: `net.minecraftforge.common.model.animation.IJointClip`"
  (^net.minecraftforge.common.model.animation.IJointClip [^Clips$ModelClip this ^net.minecraftforge.common.model.animation.IJoint joint]
    (-> this (.apply joint))))

(defn past-events
  "last-poll-time - `float`
  time - `float`

  returns: `java.lang.Iterable<net.minecraftforge.common.animation.Event>`"
  (^java.lang.Iterable [^Clips$ModelClip this ^Float last-poll-time ^Float time]
    (-> this (.pastEvents last-poll-time time))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Clips$ModelClip this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Clips$ModelClip this ^java.lang.Object obj]
    (-> this (.equals obj))))

