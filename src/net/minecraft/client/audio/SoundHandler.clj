(ns net.minecraft.client.audio.SoundHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio SoundHandler]))

(defn ->sound-handler
  "Constructor.

  manager - `net.minecraft.client.resources.IResourceManager`
  game-settings-in - `net.minecraft.client.settings.GameSettings`"
  (^SoundHandler [^net.minecraft.client.resources.IResourceManager manager ^net.minecraft.client.settings.GameSettings game-settings-in]
    (new SoundHandler manager game-settings-in)))

(def *-missing-sound
  "Static Constant.

  type: net.minecraft.client.audio.Sound"
  SoundHandler/MISSING_SOUND)

(defn stop
  "p-189520-1 - `java.lang.String`
  p-189520-2 - `net.minecraft.util.SoundCategory`"
  ([^SoundHandler this ^java.lang.String p-189520-1 ^net.minecraft.util.SoundCategory p-189520-2]
    (-> this (.stop p-189520-1 p-189520-2))))

(defn on-resource-manager-reload
  "resource-manager - `net.minecraft.client.resources.IResourceManager`"
  ([^SoundHandler this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.onResourceManagerReload resource-manager))))

(defn play-delayed-sound
  "sound - `net.minecraft.client.audio.ISound`
  delay - `int`"
  ([^SoundHandler this ^net.minecraft.client.audio.ISound sound ^Integer delay]
    (-> this (.playDelayedSound sound delay))))

(defn unload-sounds
  ""
  ([^SoundHandler this]
    (-> this (.unloadSounds))))

(defn pause-sounds
  ""
  ([^SoundHandler this]
    (-> this (.pauseSounds))))

(defn update
  ""
  ([^SoundHandler this]
    (-> this (.update))))

(defn stop-sounds
  ""
  ([^SoundHandler this]
    (-> this (.stopSounds))))

(defn set-listener
  "player - `net.minecraft.entity.player.EntityPlayer`
  p-147691-2 - `float`"
  ([^SoundHandler this ^net.minecraft.entity.player.EntityPlayer player ^Float p-147691-2]
    (-> this (.setListener player p-147691-2))))

(defn stop-sound
  "sound-in - `net.minecraft.client.audio.ISound`"
  ([^SoundHandler this ^net.minecraft.client.audio.ISound sound-in]
    (-> this (.stopSound sound-in))))

(defn remove-listener
  "listener - `net.minecraft.client.audio.ISoundEventListener`"
  ([^SoundHandler this ^net.minecraft.client.audio.ISoundEventListener listener]
    (-> this (.removeListener listener))))

(defn add-listener
  "listener - `net.minecraft.client.audio.ISoundEventListener`"
  ([^SoundHandler this ^net.minecraft.client.audio.ISoundEventListener listener]
    (-> this (.addListener listener))))

(defn sound-playing?
  "sound - `net.minecraft.client.audio.ISound`

  returns: `boolean`"
  (^Boolean [^SoundHandler this ^net.minecraft.client.audio.ISound sound]
    (-> this (.isSoundPlaying sound))))

(defn get-accessor
  "location - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraft.client.audio.SoundEventAccessor`"
  (^net.minecraft.client.audio.SoundEventAccessor [^SoundHandler this ^net.minecraft.util.ResourceLocation location]
    (-> this (.getAccessor location))))

(defn set-sound-level
  "category - `net.minecraft.util.SoundCategory`
  volume - `float`"
  ([^SoundHandler this ^net.minecraft.util.SoundCategory category ^Float volume]
    (-> this (.setSoundLevel category volume))))

(defn play-sound
  "sound - `net.minecraft.client.audio.ISound`"
  ([^SoundHandler this ^net.minecraft.client.audio.ISound sound]
    (-> this (.playSound sound))))

(defn resume-sounds
  ""
  ([^SoundHandler this]
    (-> this (.resumeSounds))))

