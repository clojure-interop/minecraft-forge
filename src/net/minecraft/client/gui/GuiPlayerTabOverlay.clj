(ns net.minecraft.client.gui.GuiPlayerTabOverlay
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiPlayerTabOverlay]))

(defn ->gui-player-tab-overlay
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`
  gui-ingame-in - `net.minecraft.client.gui.GuiIngame`"
  (^GuiPlayerTabOverlay [^net.minecraft.client.Minecraft mc-in ^net.minecraft.client.gui.GuiIngame gui-ingame-in]
    (new GuiPlayerTabOverlay mc-in gui-ingame-in)))

(defn get-player-name
  "network-player-info-in - `net.minecraft.client.network.NetworkPlayerInfo`

  returns: `java.lang.String`"
  (^java.lang.String [^GuiPlayerTabOverlay this ^net.minecraft.client.network.NetworkPlayerInfo network-player-info-in]
    (-> this (.getPlayerName network-player-info-in))))

(defn update-player-list
  "will-be-rendered - `boolean`"
  ([^GuiPlayerTabOverlay this ^Boolean will-be-rendered]
    (-> this (.updatePlayerList will-be-rendered))))

(defn render-playerlist
  "width - `int`
  scoreboard-in - `net.minecraft.scoreboard.Scoreboard`
  score-objective-in - `net.minecraft.scoreboard.ScoreObjective`"
  ([^GuiPlayerTabOverlay this ^Integer width ^net.minecraft.scoreboard.Scoreboard scoreboard-in ^net.minecraft.scoreboard.ScoreObjective score-objective-in]
    (-> this (.renderPlayerlist width scoreboard-in score-objective-in))))

(defn set-footer
  "footer-in - `net.minecraft.util.text.ITextComponent`"
  ([^GuiPlayerTabOverlay this ^net.minecraft.util.text.ITextComponent footer-in]
    (-> this (.setFooter footer-in))))

(defn set-header
  "header-in - `net.minecraft.util.text.ITextComponent`"
  ([^GuiPlayerTabOverlay this ^net.minecraft.util.text.ITextComponent header-in]
    (-> this (.setHeader header-in))))

(defn reset-footer-header
  ""
  ([^GuiPlayerTabOverlay this]
    (-> this (.resetFooterHeader))))

