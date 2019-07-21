(ns net.minecraftforge.fml.client.config.GuiSelectStringEntries$IGuiSelectStringListEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiSelectStringEntries$IGuiSelectStringListEntry]))

(defn get-value
  "returns: `java.lang.Object`"
  (^java.lang.Object [^GuiSelectStringEntries$IGuiSelectStringListEntry this]
    (-> this (.getValue))))

