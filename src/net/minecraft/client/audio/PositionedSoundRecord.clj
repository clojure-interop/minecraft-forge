(ns net.minecraft.client.audio.PositionedSoundRecord
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio PositionedSoundRecord]))

(defn ->positioned-sound-record
  "Constructor.

  sound-id - `net.minecraft.util.ResourceLocation`
  category-in - `net.minecraft.util.SoundCategory`
  volume-in - `float`
  pitch-in - `float`
  repeat-in - `boolean`
  repeat-delay-in - `int`
  attenuation-type-in - `net.minecraft.client.audio.ISound$AttenuationType`
  x-in - `float`
  y-in - `float`
  z-in - `float`"
  (^PositionedSoundRecord [^net.minecraft.util.ResourceLocation sound-id ^net.minecraft.util.SoundCategory category-in ^Float volume-in ^Float pitch-in ^Boolean repeat-in ^Integer repeat-delay-in ^net.minecraft.client.audio.ISound$AttenuationType attenuation-type-in ^Float x-in ^Float y-in ^Float z-in]
    (new PositionedSoundRecord sound-id category-in volume-in pitch-in repeat-in repeat-delay-in attenuation-type-in x-in y-in z-in))
  (^PositionedSoundRecord [^net.minecraft.util.SoundEvent sound-in ^net.minecraft.util.SoundCategory category-in ^Float volume-in ^Float pitch-in ^Float x-in ^Float y-in ^Float z-in]
    (new PositionedSoundRecord sound-in category-in volume-in pitch-in x-in y-in z-in))
  (^PositionedSoundRecord [^net.minecraft.util.SoundEvent sound-in ^net.minecraft.util.SoundCategory category-in ^Float volume-in ^Float pitch-in ^net.minecraft.util.math.BlockPos pos]
    (new PositionedSoundRecord sound-in category-in volume-in pitch-in pos)))

(defn *get-master-record
  "sound-in - `net.minecraft.util.SoundEvent`
  pitch-in - `float`

  returns: `net.minecraft.client.audio.PositionedSoundRecord`"
  (^net.minecraft.client.audio.PositionedSoundRecord [^net.minecraft.util.SoundEvent sound-in ^Float pitch-in]
    (PositionedSoundRecord/getMasterRecord sound-in pitch-in)))

(defn *get-music-record
  "sound-in - `net.minecraft.util.SoundEvent`

  returns: `net.minecraft.client.audio.PositionedSoundRecord`"
  (^net.minecraft.client.audio.PositionedSoundRecord [^net.minecraft.util.SoundEvent sound-in]
    (PositionedSoundRecord/getMusicRecord sound-in)))

(defn *get-record-sound-record
  "sound-in - `net.minecraft.util.SoundEvent`
  x-in - `float`
  y-in - `float`
  z-in - `float`

  returns: `net.minecraft.client.audio.PositionedSoundRecord`"
  (^net.minecraft.client.audio.PositionedSoundRecord [^net.minecraft.util.SoundEvent sound-in ^Float x-in ^Float y-in ^Float z-in]
    (PositionedSoundRecord/getRecordSoundRecord sound-in x-in y-in z-in)))

