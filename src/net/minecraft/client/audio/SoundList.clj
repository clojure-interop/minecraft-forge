(ns net.minecraft.client.audio.SoundList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio SoundList]))

(defn ->sound-list
  "Constructor.

  sounds-in - `java.util.List`
  replce-in - `boolean`
  subtitle-in - `java.lang.String`"
  (^SoundList [^java.util.List sounds-in ^Boolean replce-in ^java.lang.String subtitle-in]
    (new SoundList sounds-in replce-in subtitle-in)))

(defn get-sounds
  "returns: `java.util.List<net.minecraft.client.audio.Sound>`"
  (^java.util.List [^SoundList this]
    (-> this (.getSounds))))

(defn can-replace-existing?
  "returns: `boolean`"
  (^Boolean [^SoundList this]
    (-> this (.canReplaceExisting))))

(defn get-subtitle
  "returns: `java.lang.String`"
  (^java.lang.String [^SoundList this]
    (-> this (.getSubtitle))))

