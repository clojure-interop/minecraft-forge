(ns net.minecraft.client.gui.GuiMultiplayer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiMultiplayer]))

(defn ->gui-multiplayer
  "Constructor.

  parent-screen - `net.minecraft.client.gui.GuiScreen`"
  (^GuiMultiplayer [^net.minecraft.client.gui.GuiScreen parent-screen]
    (new GuiMultiplayer parent-screen)))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiMultiplayer this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn move-server-down
  "p-175393-1 - `net.minecraft.client.gui.ServerListEntryNormal`
  p-175393-2 - `int`
  p-175393-3 - `boolean`"
  ([^GuiMultiplayer this ^net.minecraft.client.gui.ServerListEntryNormal p-175393-1 ^Integer p-175393-2 ^Boolean p-175393-3]
    (-> this (.moveServerDown p-175393-1 p-175393-2 p-175393-3))))

(defn create-buttons
  ""
  ([^GuiMultiplayer this]
    (-> this (.createButtons))))

(defn confirm-clicked
  "result - `boolean`
  id - `int`"
  ([^GuiMultiplayer this ^Boolean result ^Integer id]
    (-> this (.confirmClicked result id))))

(defn get-server-list
  "returns: `net.minecraft.client.multiplayer.ServerList`"
  (^net.minecraft.client.multiplayer.ServerList [^GuiMultiplayer this]
    (-> this (.getServerList))))

(defn update-screen
  ""
  ([^GuiMultiplayer this]
    (-> this (.updateScreen))))

(defn handle-mouse-input
  "throws: java.io.IOException"
  ([^GuiMultiplayer this]
    (-> this (.handleMouseInput))))

(defn on-gui-closed
  ""
  ([^GuiMultiplayer this]
    (-> this (.onGuiClosed))))

(defn select-server
  "index - `int`"
  ([^GuiMultiplayer this ^Integer index]
    (-> this (.selectServer index))))

(defn set-hovering-text
  "p-146793-1 - `java.lang.String`"
  ([^GuiMultiplayer this ^java.lang.String p-146793-1]
    (-> this (.setHoveringText p-146793-1))))

(defn connect-to-selected
  ""
  ([^GuiMultiplayer this]
    (-> this (.connectToSelected))))

(defn init-gui
  ""
  ([^GuiMultiplayer this]
    (-> this (.initGui))))

(defn can-move-down?
  "p-175394-1 - `net.minecraft.client.gui.ServerListEntryNormal`
  p-175394-2 - `int`

  returns: `boolean`"
  (^Boolean [^GuiMultiplayer this ^net.minecraft.client.gui.ServerListEntryNormal p-175394-1 ^Integer p-175394-2]
    (-> this (.canMoveDown p-175394-1 p-175394-2))))

(defn get-old-server-pinger
  "returns: `net.minecraft.client.network.ServerPinger`"
  (^net.minecraft.client.network.ServerPinger [^GuiMultiplayer this]
    (-> this (.getOldServerPinger))))

(defn can-move-up?
  "p-175392-1 - `net.minecraft.client.gui.ServerListEntryNormal`
  p-175392-2 - `int`

  returns: `boolean`"
  (^Boolean [^GuiMultiplayer this ^net.minecraft.client.gui.ServerListEntryNormal p-175392-1 ^Integer p-175392-2]
    (-> this (.canMoveUp p-175392-1 p-175392-2))))

(defn move-server-up
  "p-175391-1 - `net.minecraft.client.gui.ServerListEntryNormal`
  p-175391-2 - `int`
  p-175391-3 - `boolean`"
  ([^GuiMultiplayer this ^net.minecraft.client.gui.ServerListEntryNormal p-175391-1 ^Integer p-175391-2 ^Boolean p-175391-3]
    (-> this (.moveServerUp p-175391-1 p-175391-2 p-175391-3))))

