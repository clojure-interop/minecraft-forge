(ns net.minecraft.client.gui.ServerSelectionList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui ServerSelectionList]))

(defn ->server-selection-list
  "Constructor.

  owner-in - `net.minecraft.client.gui.GuiMultiplayer`
  mc-in - `net.minecraft.client.Minecraft`
  width-in - `int`
  height-in - `int`
  top-in - `int`
  bottom-in - `int`
  slot-height-in - `int`"
  (^ServerSelectionList [^net.minecraft.client.gui.GuiMultiplayer owner-in ^net.minecraft.client.Minecraft mc-in ^Integer width-in ^Integer height-in ^Integer top-in ^Integer bottom-in ^Integer slot-height-in]
    (new ServerSelectionList owner-in mc-in width-in height-in top-in bottom-in slot-height-in)))

(defn get-list-entry
  "index - `int`

  returns: `net.minecraft.client.gui.GuiListExtended$IGuiListEntry`"
  (^net.minecraft.client.gui.GuiListExtended$IGuiListEntry [^ServerSelectionList this ^Integer index]
    (-> this (.getListEntry index))))

(defn set-selected-slot-index
  "selected-slot-index-in - `int`"
  ([^ServerSelectionList this ^Integer selected-slot-index-in]
    (-> this (.setSelectedSlotIndex selected-slot-index-in))))

(defn get-selected
  "returns: `int`"
  (^Integer [^ServerSelectionList this]
    (-> this (.getSelected))))

(defn update-online-servers
  "p-148195-1 - `net.minecraft.client.multiplayer.ServerList`"
  ([^ServerSelectionList this ^net.minecraft.client.multiplayer.ServerList p-148195-1]
    (-> this (.updateOnlineServers p-148195-1))))

(defn update-network-servers
  "p-148194-1 - `java.util.List`"
  ([^ServerSelectionList this ^java.util.List p-148194-1]
    (-> this (.updateNetworkServers p-148194-1))))

(defn get-list-width
  "returns: `int`"
  (^Integer [^ServerSelectionList this]
    (-> this (.getListWidth))))

