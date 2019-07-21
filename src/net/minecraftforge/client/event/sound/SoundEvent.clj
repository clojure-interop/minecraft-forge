(ns net.minecraftforge.client.event.sound.SoundEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event.sound SoundEvent]))

(defn ->sound-event
  "Constructor.

  manager - `net.minecraft.client.audio.SoundManager`"
  (^SoundEvent [^net.minecraft.client.audio.SoundManager manager]
    (new SoundEvent manager)))

(defn get-manager
  "returns: `net.minecraft.client.audio.SoundManager`"
  (^net.minecraft.client.audio.SoundManager [^SoundEvent this]
    (-> this (.getManager))))

