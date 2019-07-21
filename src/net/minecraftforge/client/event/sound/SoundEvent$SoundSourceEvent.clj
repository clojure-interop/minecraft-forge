(ns net.minecraftforge.client.event.sound.SoundEvent$SoundSourceEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event.sound SoundEvent$SoundSourceEvent]))

(defn ->sound-source-event
  "Constructor.

  manager - `net.minecraft.client.audio.SoundManager`
  sound - `net.minecraft.client.audio.ISound`
  uuid - `java.lang.String`"
  (^SoundEvent$SoundSourceEvent [^net.minecraft.client.audio.SoundManager manager ^net.minecraft.client.audio.ISound sound ^java.lang.String uuid]
    (new SoundEvent$SoundSourceEvent manager sound uuid)))

(defn get-sound
  "returns: `net.minecraft.client.audio.ISound`"
  (^net.minecraft.client.audio.ISound [^SoundEvent$SoundSourceEvent this]
    (-> this (.getSound))))

(defn get-uuid
  "returns: `java.lang.String`"
  (^java.lang.String [^SoundEvent$SoundSourceEvent this]
    (-> this (.getUuid))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^SoundEvent$SoundSourceEvent this]
    (-> this (.getName))))

