(ns net.minecraftforge.fml.client.config.GuiConfigEntries$ChatColorEntry
  "ChatColorEntry

  Provides a GuiButton that cycles through the list of chat color codes."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiConfigEntries$ChatColorEntry]))

(defn draw-entry
  "slot-index - `int`
  x - `int`
  y - `int`
  list-width - `int`
  slot-height - `int`
  mouse-x - `int`
  mouse-y - `int`
  is-selected - `boolean`"
  ([^GuiConfigEntries$ChatColorEntry this ^Integer slot-index ^Integer x ^Integer y ^Integer list-width ^Integer slot-height ^Integer mouse-x ^Integer mouse-y ^Boolean is-selected]
    (-> this (.drawEntry slot-index x y list-width slot-height mouse-x mouse-y is-selected))))

(defn update-value-button-text
  "Description copied from class: GuiConfigEntries.ButtonEntry"
  ([^GuiConfigEntries$ChatColorEntry this]
    (-> this (.updateValueButtonText))))

