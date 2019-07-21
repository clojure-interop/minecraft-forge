(ns net.minecraftforge.client.event.sound.PlayStreamingSourceEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event.sound PlayStreamingSourceEvent]))

(defn ->play-streaming-source-event
  "Constructor.

  manager - `net.minecraft.client.audio.SoundManager`
  sound - `net.minecraft.client.audio.ISound`
  uuid - `java.lang.String`"
  (^PlayStreamingSourceEvent [^net.minecraft.client.audio.SoundManager manager ^net.minecraft.client.audio.ISound sound ^java.lang.String uuid]
    (new PlayStreamingSourceEvent manager sound uuid)))

