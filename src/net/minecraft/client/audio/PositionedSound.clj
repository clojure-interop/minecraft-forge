(ns net.minecraft.client.audio.PositionedSound
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio PositionedSound]))

(defn get-volume
  "returns: `float`"
  (^Float [^PositionedSound this]
    (-> this (.getVolume))))

(defn get-repeat-delay
  "returns: `int`"
  (^Integer [^PositionedSound this]
    (-> this (.getRepeatDelay))))

(defn get-pitch
  "returns: `float`"
  (^Float [^PositionedSound this]
    (-> this (.getPitch))))

(defn get-x-pos-f
  "returns: `float`"
  (^Float [^PositionedSound this]
    (-> this (.getXPosF))))

(defn get-sound-location
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^PositionedSound this]
    (-> this (.getSoundLocation))))

(defn get-z-pos-f
  "returns: `float`"
  (^Float [^PositionedSound this]
    (-> this (.getZPosF))))

(defn get-category
  "returns: `net.minecraft.util.SoundCategory`"
  (^net.minecraft.util.SoundCategory [^PositionedSound this]
    (-> this (.getCategory))))

(defn can-repeat?
  "returns: `boolean`"
  (^Boolean [^PositionedSound this]
    (-> this (.canRepeat))))

(defn get-y-pos-f
  "returns: `float`"
  (^Float [^PositionedSound this]
    (-> this (.getYPosF))))

(defn get-sound
  "returns: `net.minecraft.client.audio.Sound`"
  (^net.minecraft.client.audio.Sound [^PositionedSound this]
    (-> this (.getSound))))

(defn create-accessor
  "handler - `net.minecraft.client.audio.SoundHandler`

  returns: `net.minecraft.client.audio.SoundEventAccessor`"
  (^net.minecraft.client.audio.SoundEventAccessor [^PositionedSound this ^net.minecraft.client.audio.SoundHandler handler]
    (-> this (.createAccessor handler))))

(defn get-attenuation-type
  "returns: `net.minecraft.client.audio.ISound$AttenuationType`"
  (^net.minecraft.client.audio.ISound$AttenuationType [^PositionedSound this]
    (-> this (.getAttenuationType))))

