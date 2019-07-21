(ns net.minecraft.client.gui.GuiPageButtonList$GuiListEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiPageButtonList$GuiListEntry]))

(defn ->gui-list-entry
  "Constructor.

  p-i-45531-1 - `int`
  p-i-45531-2 - `java.lang.String`
  p-i-45531-3 - `boolean`"
  (^GuiPageButtonList$GuiListEntry [^Integer p-i-45531-1 ^java.lang.String p-i-45531-2 ^Boolean p-i-45531-3]
    (new GuiPageButtonList$GuiListEntry p-i-45531-1 p-i-45531-2 p-i-45531-3)))

(defn get-id
  "returns: `int`"
  (^Integer [^GuiPageButtonList$GuiListEntry this]
    (-> this (.getId))))

(defn get-caption
  "returns: `java.lang.String`"
  (^java.lang.String [^GuiPageButtonList$GuiListEntry this]
    (-> this (.getCaption))))

(defn should-start-visible?
  "returns: `boolean`"
  (^Boolean [^GuiPageButtonList$GuiListEntry this]
    (-> this (.shouldStartVisible))))

