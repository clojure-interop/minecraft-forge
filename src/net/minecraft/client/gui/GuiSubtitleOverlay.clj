(ns net.minecraft.client.gui.GuiSubtitleOverlay
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiSubtitleOverlay]))

(defn ->gui-subtitle-overlay
  "Constructor.

  client-in - `net.minecraft.client.Minecraft`"
  (^GuiSubtitleOverlay [^net.minecraft.client.Minecraft client-in]
    (new GuiSubtitleOverlay client-in)))

(defn render-subtitles
  "resolution - `net.minecraft.client.gui.ScaledResolution`"
  ([^GuiSubtitleOverlay this ^net.minecraft.client.gui.ScaledResolution resolution]
    (-> this (.renderSubtitles resolution))))

(defn sound-play
  "sound-in - `net.minecraft.client.audio.ISound`
  accessor - `net.minecraft.client.audio.SoundEventAccessor`"
  ([^GuiSubtitleOverlay this ^net.minecraft.client.audio.ISound sound-in ^net.minecraft.client.audio.SoundEventAccessor accessor]
    (-> this (.soundPlay sound-in accessor))))

