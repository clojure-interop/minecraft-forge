(ns net.minecraftforge.client.event.sound.PlaySoundSourceEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event.sound PlaySoundSourceEvent]))

(defn ->play-sound-source-event
  "Constructor.

  manager - `net.minecraft.client.audio.SoundManager`
  sound - `net.minecraft.client.audio.ISound`
  uuid - `java.lang.String`"
  (^PlaySoundSourceEvent [^net.minecraft.client.audio.SoundManager manager ^net.minecraft.client.audio.ISound sound ^java.lang.String uuid]
    (new PlaySoundSourceEvent manager sound uuid)))

