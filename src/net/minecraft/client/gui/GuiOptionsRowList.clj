(ns net.minecraft.client.gui.GuiOptionsRowList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiOptionsRowList]))

(defn ->gui-options-row-list
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`
  p-i-45015-2 - `int`
  p-i-45015-3 - `int`
  p-i-45015-4 - `int`
  p-i-45015-5 - `int`
  p-i-45015-6 - `int`
  p-i-45015-7 - `net.minecraft.client.settings.GameSettings$Options`"
  (^GuiOptionsRowList [^net.minecraft.client.Minecraft mc-in ^Integer p-i-45015-2 ^Integer p-i-45015-3 ^Integer p-i-45015-4 ^Integer p-i-45015-5 ^Integer p-i-45015-6 ^net.minecraft.client.settings.GameSettings$Options p-i-45015-7]
    (new GuiOptionsRowList mc-in p-i-45015-2 p-i-45015-3 p-i-45015-4 p-i-45015-5 p-i-45015-6 p-i-45015-7)))

(defn get-list-entry
  "index - `int`

  returns: `net.minecraft.client.gui.GuiOptionsRowList$Row`"
  (^net.minecraft.client.gui.GuiOptionsRowList$Row [^GuiOptionsRowList this ^Integer index]
    (-> this (.getListEntry index))))

(defn get-list-width
  "returns: `int`"
  (^Integer [^GuiOptionsRowList this]
    (-> this (.getListWidth))))

