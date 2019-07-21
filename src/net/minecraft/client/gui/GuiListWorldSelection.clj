(ns net.minecraft.client.gui.GuiListWorldSelection
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiListWorldSelection]))

(defn ->gui-list-world-selection
  "Constructor.

  p-i-46590-1 - `net.minecraft.client.gui.GuiWorldSelection`
  client-in - `net.minecraft.client.Minecraft`
  width-in - `int`
  height-in - `int`
  top-in - `int`
  bottom-in - `int`
  slot-height-in - `int`"
  (^GuiListWorldSelection [^net.minecraft.client.gui.GuiWorldSelection p-i-46590-1 ^net.minecraft.client.Minecraft client-in ^Integer width-in ^Integer height-in ^Integer top-in ^Integer bottom-in ^Integer slot-height-in]
    (new GuiListWorldSelection p-i-46590-1 client-in width-in height-in top-in bottom-in slot-height-in)))

(defn refresh-list
  ""
  ([^GuiListWorldSelection this]
    (-> this (.refreshList))))

(defn get-list-entry
  "index - `int`

  returns: `net.minecraft.client.gui.GuiListWorldSelectionEntry`"
  (^net.minecraft.client.gui.GuiListWorldSelectionEntry [^GuiListWorldSelection this ^Integer index]
    (-> this (.getListEntry index))))

(defn get-list-width
  "returns: `int`"
  (^Integer [^GuiListWorldSelection this]
    (-> this (.getListWidth))))

(defn select-world
  "idx - `int`"
  ([^GuiListWorldSelection this ^Integer idx]
    (-> this (.selectWorld idx))))

(defn get-selected-world
  "returns: `net.minecraft.client.gui.GuiListWorldSelectionEntry`"
  (^net.minecraft.client.gui.GuiListWorldSelectionEntry [^GuiListWorldSelection this]
    (-> this (.getSelectedWorld))))

(defn get-gui-world-selection
  "returns: `net.minecraft.client.gui.GuiWorldSelection`"
  (^net.minecraft.client.gui.GuiWorldSelection [^GuiListWorldSelection this]
    (-> this (.getGuiWorldSelection))))

