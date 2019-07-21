(ns net.minecraftforge.client.model.animation.ModelBlockAnimation$MBClip
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.animation ModelBlockAnimation$MBClip]))

(defn ->mb-clip
  "Constructor.

  loop - `boolean`
  clips - `com.google.common.collect.ImmutableMap`
  events - `com.google.common.collect.ImmutableMap`"
  (^ModelBlockAnimation$MBClip [^Boolean loop ^com.google.common.collect.ImmutableMap clips ^com.google.common.collect.ImmutableMap events]
    (new ModelBlockAnimation$MBClip loop clips events)))

(defn apply
  "joint - `net.minecraftforge.common.model.animation.IJoint`

  returns: `net.minecraftforge.common.model.animation.IJointClip`"
  (^net.minecraftforge.common.model.animation.IJointClip [^ModelBlockAnimation$MBClip this ^net.minecraftforge.common.model.animation.IJoint joint]
    (-> this (.apply joint))))

(defn past-events
  "last-poll-time - `float`
  time - `float`

  returns: `java.lang.Iterable<net.minecraftforge.common.animation.Event>`"
  (^java.lang.Iterable [^ModelBlockAnimation$MBClip this ^Float last-poll-time ^Float time]
    (-> this (.pastEvents last-poll-time time))))

