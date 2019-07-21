(ns net.minecraft.client.gui.GuiPageButtonList$GuiResponder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiPageButtonList$GuiResponder]))

(defn set-entry-value
  "id - `int`
  value - `boolean`"
  ([^GuiPageButtonList$GuiResponder this ^Integer id ^Boolean value]
    (-> this (.setEntryValue id value))))

