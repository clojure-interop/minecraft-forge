(ns net.minecraftforge.common.model.animation.Clips
  "Various implementations of IClip, and utility methods."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model.animation Clips]))

(defn ->clips
  "Constructor."
  (^Clips []
    (new Clips )))

(defn *get-model-clip-node
  "Retrieves the clip from the model.

  model-location - `net.minecraft.util.ResourceLocation`
  clip-name - `java.lang.String`

  returns: `net.minecraftforge.common.model.animation.IClip`"
  (^net.minecraftforge.common.model.animation.IClip [^net.minecraft.util.ResourceLocation model-location ^java.lang.String clip-name]
    (Clips/getModelClipNode model-location clip-name)))

(defn *apply
  "IModelState wrapper for a Clip, sampled at specified time.

  clip - `net.minecraftforge.common.model.animation.IClip`
  last-poll-time - `float`
  time - `float`

  returns: `org.apache.commons.lang3.tuple.Pair<net.minecraftforge.common.model.IModelState,java.lang.Iterable<net.minecraftforge.common.animation.Event>>`"
  (^org.apache.commons.lang3.tuple.Pair [^net.minecraftforge.common.model.animation.IClip clip ^Float last-poll-time ^Float time]
    (Clips/apply clip last-poll-time time)))

