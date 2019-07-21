(ns net.minecraft.client.gui.GuiIngame
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiIngame]))

(defn ->gui-ingame
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`"
  (^GuiIngame [^net.minecraft.client.Minecraft mc-in]
    (new GuiIngame mc-in)))

(defn prev-vignette-brightness
  "Instance Field.

  type: float"
  (^Float [^GuiIngame this]
    (-> this .-prevVignetteBrightness)))

(defn render-exp-bar
  "scaled-res - `net.minecraft.client.gui.ScaledResolution`
  x - `int`"
  ([^GuiIngame this ^net.minecraft.client.gui.ScaledResolution scaled-res ^Integer x]
    (-> this (.renderExpBar scaled-res x))))

(defn update-tick
  ""
  ([^GuiIngame this]
    (-> this (.updateTick))))

(defn get-boss-overlay
  "returns: `net.minecraft.client.gui.GuiBossOverlay`"
  (^net.minecraft.client.gui.GuiBossOverlay [^GuiIngame this]
    (-> this (.getBossOverlay))))

(defn render-horse-jump-bar
  "scaled-res - `net.minecraft.client.gui.ScaledResolution`
  x - `int`"
  ([^GuiIngame this ^net.minecraft.client.gui.ScaledResolution scaled-res ^Integer x]
    (-> this (.renderHorseJumpBar scaled-res x))))

(defn get-spectator-gui
  "returns: `net.minecraft.client.gui.GuiSpectator`"
  (^net.minecraft.client.gui.GuiSpectator [^GuiIngame this]
    (-> this (.getSpectatorGui))))

(defn render-game-overlay
  "partial-ticks - `float`"
  ([^GuiIngame this ^Float partial-ticks]
    (-> this (.renderGameOverlay partial-ticks))))

(defn set-default-titles-times
  ""
  ([^GuiIngame this]
    (-> this (.setDefaultTitlesTimes))))

(defn set-overlay-message
  "message - `java.lang.String`
  animate-color - `boolean`"
  ([^GuiIngame this ^java.lang.String message ^Boolean animate-color]
    (-> this (.setOverlayMessage message animate-color))))

(defn set-record-playing-message
  "record-name - `java.lang.String`"
  ([^GuiIngame this ^java.lang.String record-name]
    (-> this (.setRecordPlayingMessage record-name))))

(defn get-update-counter
  "returns: `int`"
  (^Integer [^GuiIngame this]
    (-> this (.getUpdateCounter))))

(defn display-title
  "title - `java.lang.String`
  sub-title - `java.lang.String`
  time-fade-in - `int`
  display-time - `int`
  time-fade-out - `int`"
  ([^GuiIngame this ^java.lang.String title ^java.lang.String sub-title ^Integer time-fade-in ^Integer display-time ^Integer time-fade-out]
    (-> this (.displayTitle title sub-title time-fade-in display-time time-fade-out))))

(defn get-tab-list
  "returns: `net.minecraft.client.gui.GuiPlayerTabOverlay`"
  (^net.minecraft.client.gui.GuiPlayerTabOverlay [^GuiIngame this]
    (-> this (.getTabList))))

(defn render-selected-item
  "scaled-res - `net.minecraft.client.gui.ScaledResolution`"
  ([^GuiIngame this ^net.minecraft.client.gui.ScaledResolution scaled-res]
    (-> this (.renderSelectedItem scaled-res))))

(defn get-font-renderer
  "returns: `net.minecraft.client.gui.FontRenderer`"
  (^net.minecraft.client.gui.FontRenderer [^GuiIngame this]
    (-> this (.getFontRenderer))))

(defn render-demo
  "scaled-res - `net.minecraft.client.gui.ScaledResolution`"
  ([^GuiIngame this ^net.minecraft.client.gui.ScaledResolution scaled-res]
    (-> this (.renderDemo scaled-res))))

(defn get-chat-gui
  "returns: `net.minecraft.client.gui.GuiNewChat`"
  (^net.minecraft.client.gui.GuiNewChat [^GuiIngame this]
    (-> this (.getChatGUI))))

(defn reset-players-overlay-footer-header
  ""
  ([^GuiIngame this]
    (-> this (.resetPlayersOverlayFooterHeader))))

