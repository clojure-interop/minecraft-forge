(ns net.minecraftforge.common.model.animation.IClip
  "Clip for a rigged model."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model.animation IClip]))

(defn apply
  "joint - `net.minecraftforge.common.model.animation.IJoint`

  returns: `net.minecraftforge.common.model.animation.IJointClip`"
  (^net.minecraftforge.common.model.animation.IJointClip [^IClip this ^net.minecraftforge.common.model.animation.IJoint joint]
    (-> this (.apply joint))))

(defn past-events
  "last-poll-time - `float`
  time - `float`

  returns: `java.lang.Iterable<net.minecraftforge.common.animation.Event>`"
  (^java.lang.Iterable [^IClip this ^Float last-poll-time ^Float time]
    (-> this (.pastEvents last-poll-time time))))

