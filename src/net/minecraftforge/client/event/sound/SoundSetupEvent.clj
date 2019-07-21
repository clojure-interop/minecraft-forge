(ns net.minecraftforge.client.event.sound.SoundSetupEvent
  "This event is raised by the SoundManager when it does its first setup of the
  SoundSystemConfig's codecs, use this function to add your own codecs."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event.sound SoundSetupEvent]))

(defn ->sound-setup-event
  "Constructor.

  manager - `net.minecraft.client.audio.SoundManager`"
  (^SoundSetupEvent [^net.minecraft.client.audio.SoundManager manager]
    (new SoundSetupEvent manager)))

