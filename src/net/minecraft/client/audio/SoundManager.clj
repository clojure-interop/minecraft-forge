(ns net.minecraft.client.audio.SoundManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio SoundManager]))

(defn ->sound-manager
  "Constructor.

  p-i-45119-1 - `net.minecraft.client.audio.SoundHandler`
  p-i-45119-2 - `net.minecraft.client.settings.GameSettings`"
  (^SoundManager [^net.minecraft.client.audio.SoundHandler p-i-45119-1 ^net.minecraft.client.settings.GameSettings p-i-45119-2]
    (new SoundManager p-i-45119-1 p-i-45119-2)))

(defn snd-handler
  "Instance Constant.

  type: net.minecraft.client.audio.SoundHandler"
  (^net.minecraft.client.audio.SoundHandler [^SoundManager this]
    (-> this .-sndHandler)))

(defn stop
  "p-189567-1 - `java.lang.String`
  p-189567-2 - `net.minecraft.util.SoundCategory`"
  ([^SoundManager this ^java.lang.String p-189567-1 ^net.minecraft.util.SoundCategory p-189567-2]
    (-> this (.stop p-189567-1 p-189567-2))))

(defn play-delayed-sound
  "sound - `net.minecraft.client.audio.ISound`
  delay - `int`"
  ([^SoundManager this ^net.minecraft.client.audio.ISound sound ^Integer delay]
    (-> this (.playDelayedSound sound delay))))

(defn unload-sound-system
  ""
  ([^SoundManager this]
    (-> this (.unloadSoundSystem))))

(defn set-listener
  "player - `net.minecraft.entity.player.EntityPlayer`
  p-148615-2 - `float`"
  ([^SoundManager this ^net.minecraft.entity.player.EntityPlayer player ^Float p-148615-2]
    (-> this (.setListener player p-148615-2))))

(defn stop-sound
  "sound - `net.minecraft.client.audio.ISound`"
  ([^SoundManager this ^net.minecraft.client.audio.ISound sound]
    (-> this (.stopSound sound))))

(defn remove-listener
  "listener - `net.minecraft.client.audio.ISoundEventListener`"
  ([^SoundManager this ^net.minecraft.client.audio.ISoundEventListener listener]
    (-> this (.removeListener listener))))

(defn add-listener
  "listener - `net.minecraft.client.audio.ISoundEventListener`"
  ([^SoundManager this ^net.minecraft.client.audio.ISoundEventListener listener]
    (-> this (.addListener listener))))

(defn sound-playing?
  "sound - `net.minecraft.client.audio.ISound`

  returns: `boolean`"
  (^Boolean [^SoundManager this ^net.minecraft.client.audio.ISound sound]
    (-> this (.isSoundPlaying sound))))

(defn resume-all-sounds
  ""
  ([^SoundManager this]
    (-> this (.resumeAllSounds))))

(defn reload-sound-system
  ""
  ([^SoundManager this]
    (-> this (.reloadSoundSystem))))

(defn pause-all-sounds
  ""
  ([^SoundManager this]
    (-> this (.pauseAllSounds))))

(defn stop-all-sounds
  ""
  ([^SoundManager this]
    (-> this (.stopAllSounds))))

(defn play-sound
  "p-sound - `net.minecraft.client.audio.ISound`"
  ([^SoundManager this ^net.minecraft.client.audio.ISound p-sound]
    (-> this (.playSound p-sound))))

(defn update-all-sounds
  ""
  ([^SoundManager this]
    (-> this (.updateAllSounds))))

(defn set-volume
  "category - `net.minecraft.util.SoundCategory`
  volume - `float`"
  ([^SoundManager this ^net.minecraft.util.SoundCategory category ^Float volume]
    (-> this (.setVolume category volume))))

