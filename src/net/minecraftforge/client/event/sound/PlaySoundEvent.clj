(ns net.minecraftforge.client.event.sound.PlaySoundEvent
  "Raised when the SoundManager tries to play a normal sound.

  If you return null from this function it will prevent the sound from being played,
  you can return a different entry if you want to change the sound being played."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event.sound PlaySoundEvent]))

(defn ->play-sound-event
  "Constructor.

  manager - `net.minecraft.client.audio.SoundManager`
  sound - `net.minecraft.client.audio.ISound`"
  (^PlaySoundEvent [^net.minecraft.client.audio.SoundManager manager ^net.minecraft.client.audio.ISound sound]
    (new PlaySoundEvent manager sound)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^PlaySoundEvent this]
    (-> this (.getName))))

(defn get-sound
  "returns: `net.minecraft.client.audio.ISound`"
  (^net.minecraft.client.audio.ISound [^PlaySoundEvent this]
    (-> this (.getSound))))

(defn get-result-sound
  "returns: `net.minecraft.client.audio.ISound`"
  (^net.minecraft.client.audio.ISound [^PlaySoundEvent this]
    (-> this (.getResultSound))))

(defn set-result-sound
  "result - `net.minecraft.client.audio.ISound`"
  ([^PlaySoundEvent this ^net.minecraft.client.audio.ISound result]
    (-> this (.setResultSound result))))

