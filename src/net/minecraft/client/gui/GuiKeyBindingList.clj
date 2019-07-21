(ns net.minecraft.client.gui.GuiKeyBindingList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiKeyBindingList]))

(defn ->gui-key-binding-list
  "Constructor.

  controls - `net.minecraft.client.gui.GuiControls`
  mc-in - `net.minecraft.client.Minecraft`"
  (^GuiKeyBindingList [^net.minecraft.client.gui.GuiControls controls ^net.minecraft.client.Minecraft mc-in]
    (new GuiKeyBindingList controls mc-in)))

(defn get-list-entry
  "index - `int`

  returns: `net.minecraft.client.gui.GuiListExtended$IGuiListEntry`"
  (^net.minecraft.client.gui.GuiListExtended$IGuiListEntry [^GuiKeyBindingList this ^Integer index]
    (-> this (.getListEntry index))))

(defn get-list-width
  "returns: `int`"
  (^Integer [^GuiKeyBindingList this]
    (-> this (.getListWidth))))

