(ns net.minecraft.client.gui.GuiPageButtonList$GuiButtonEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiPageButtonList$GuiButtonEntry]))

(defn ->gui-button-entry
  "Constructor.

  p-i-45535-1 - `int`
  p-i-45535-2 - `java.lang.String`
  p-i-45535-3 - `boolean`
  p-i-45535-4 - `boolean`"
  (^GuiPageButtonList$GuiButtonEntry [^Integer p-i-45535-1 ^java.lang.String p-i-45535-2 ^Boolean p-i-45535-3 ^Boolean p-i-45535-4]
    (new GuiPageButtonList$GuiButtonEntry p-i-45535-1 p-i-45535-2 p-i-45535-3 p-i-45535-4)))

(defn get-initial-value?
  "returns: `boolean`"
  (^Boolean [^GuiPageButtonList$GuiButtonEntry this]
    (-> this (.getInitialValue))))

