(ns net.minecraft.client.audio.SoundEventAccessor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio SoundEventAccessor]))

(defn ->sound-event-accessor
  "Constructor.

  location-in - `net.minecraft.util.ResourceLocation`
  subtitle-in - `java.lang.String`"
  (^SoundEventAccessor [^net.minecraft.util.ResourceLocation location-in ^java.lang.String subtitle-in]
    (new SoundEventAccessor location-in subtitle-in)))

(defn get-weight
  "returns: `int`"
  (^Integer [^SoundEventAccessor this]
    (-> this (.getWeight))))

(defn clone-entry
  "returns: `net.minecraft.client.audio.Sound`"
  (^net.minecraft.client.audio.Sound [^SoundEventAccessor this]
    (-> this (.cloneEntry))))

(defn add-sound
  "p-188715-1 - `net.minecraft.client.audio.ISoundEventAccessor`"
  ([^SoundEventAccessor this ^net.minecraft.client.audio.ISoundEventAccessor p-188715-1]
    (-> this (.addSound p-188715-1))))

(defn get-location
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^SoundEventAccessor this]
    (-> this (.getLocation))))

(defn get-subtitle
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^SoundEventAccessor this]
    (-> this (.getSubtitle))))

