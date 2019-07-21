(ns net.minecraft.client.audio.ISoundEventListener
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio ISoundEventListener]))

(defn sound-play
  "sound-in - `net.minecraft.client.audio.ISound`
  accessor - `net.minecraft.client.audio.SoundEventAccessor`"
  ([^ISoundEventListener this ^net.minecraft.client.audio.ISound sound-in ^net.minecraft.client.audio.SoundEventAccessor accessor]
    (-> this (.soundPlay sound-in accessor))))

