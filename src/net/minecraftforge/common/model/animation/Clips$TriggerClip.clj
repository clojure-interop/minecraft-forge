(ns net.minecraftforge.common.model.animation.Clips$TriggerClip
  "Clip  Event, triggers when parameter becomes non-negative."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model.animation Clips$TriggerClip]))

(defn ->trigger-clip
  "Constructor.

  clip - `net.minecraftforge.common.model.animation.IClip`
  parameter - `net.minecraftforge.common.animation.ITimeValue`
  event - `java.lang.String`"
  (^Clips$TriggerClip [^net.minecraftforge.common.model.animation.IClip clip ^net.minecraftforge.common.animation.ITimeValue parameter ^java.lang.String event]
    (new Clips$TriggerClip clip parameter event)))

(defn apply
  "joint - `net.minecraftforge.common.model.animation.IJoint`

  returns: `net.minecraftforge.common.model.animation.IJointClip`"
  (^net.minecraftforge.common.model.animation.IJointClip [^Clips$TriggerClip this ^net.minecraftforge.common.model.animation.IJoint joint]
    (-> this (.apply joint))))

(defn past-events
  "last-poll-time - `float`
  time - `float`

  returns: `java.lang.Iterable<net.minecraftforge.common.animation.Event>`"
  (^java.lang.Iterable [^Clips$TriggerClip this ^Float last-poll-time ^Float time]
    (-> this (.pastEvents last-poll-time time))))

