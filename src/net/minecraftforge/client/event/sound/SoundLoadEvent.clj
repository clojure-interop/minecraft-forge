(ns net.minecraftforge.client.event.sound.SoundLoadEvent
  "Raised by the SoundManager.loadSoundSettings, this would be a good place for
  adding your custom sounds to the SoundPool."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event.sound SoundLoadEvent]))

(defn ->sound-load-event
  "Constructor.

  manager - `net.minecraft.client.audio.SoundManager`"
  (^SoundLoadEvent [^net.minecraft.client.audio.SoundManager manager]
    (new SoundLoadEvent manager)))

