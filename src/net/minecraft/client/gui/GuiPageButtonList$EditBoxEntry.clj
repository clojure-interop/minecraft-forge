(ns net.minecraft.client.gui.GuiPageButtonList$EditBoxEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiPageButtonList$EditBoxEntry]))

(defn ->edit-box-entry
  "Constructor.

  p-i-45534-1 - `int`
  p-i-45534-2 - `java.lang.String`
  p-i-45534-3 - `boolean`
  p-i-45534-4 - `com.google.common.base.Predicate`"
  (^GuiPageButtonList$EditBoxEntry [^Integer p-i-45534-1 ^java.lang.String p-i-45534-2 ^Boolean p-i-45534-3 ^com.google.common.base.Predicate p-i-45534-4]
    (new GuiPageButtonList$EditBoxEntry p-i-45534-1 p-i-45534-2 p-i-45534-3 p-i-45534-4)))

(defn get-filter
  "returns: `com.google.common.base.Predicate<java.lang.String>`"
  (^com.google.common.base.Predicate [^GuiPageButtonList$EditBoxEntry this]
    (-> this (.getFilter))))

