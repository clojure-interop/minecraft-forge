(ns net.minecraft.client.audio.Sound
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio Sound]))

(defn ->sound
  "Constructor.

  name-in - `java.lang.String`
  volume-in - `float`
  pitch-in - `float`
  weight-in - `int`
  type-in - `net.minecraft.client.audio.Sound$Type`
  p-i-46526-6 - `boolean`"
  (^Sound [^java.lang.String name-in ^Float volume-in ^Float pitch-in ^Integer weight-in ^net.minecraft.client.audio.Sound$Type type-in ^Boolean p-i-46526-6]
    (new Sound name-in volume-in pitch-in weight-in type-in p-i-46526-6)))

(defn get-sound-location
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^Sound this]
    (-> this (.getSoundLocation))))

(defn get-sound-as-ogg-location
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^Sound this]
    (-> this (.getSoundAsOggLocation))))

(defn get-volume
  "returns: `float`"
  (^Float [^Sound this]
    (-> this (.getVolume))))

(defn get-pitch
  "returns: `float`"
  (^Float [^Sound this]
    (-> this (.getPitch))))

(defn get-weight
  "returns: `int`"
  (^Integer [^Sound this]
    (-> this (.getWeight))))

(defn clone-entry
  "returns: `net.minecraft.client.audio.Sound`"
  (^net.minecraft.client.audio.Sound [^Sound this]
    (-> this (.cloneEntry))))

(defn get-type
  "returns: `net.minecraft.client.audio.Sound$Type`"
  (^net.minecraft.client.audio.Sound$Type [^Sound this]
    (-> this (.getType))))

(defn streaming?
  "returns: `boolean`"
  (^Boolean [^Sound this]
    (-> this (.isStreaming))))

