(ns net.minecraft.client.audio.MusicTicker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio MusicTicker]))

(defn ->music-ticker
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`"
  (^MusicTicker [^net.minecraft.client.Minecraft mc-in]
    (new MusicTicker mc-in)))

(defn update
  ""
  ([^MusicTicker this]
    (-> this (.update))))

(defn play-music
  "requested-music-type - `net.minecraft.client.audio.MusicTicker$MusicType`"
  ([^MusicTicker this ^net.minecraft.client.audio.MusicTicker$MusicType requested-music-type]
    (-> this (.playMusic requested-music-type))))

(defn stop-music
  ""
  ([^MusicTicker this]
    (-> this (.stopMusic))))

