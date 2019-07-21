(ns net.minecraftforge.fml.client.config.GuiSelectStringEntries$ListEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiSelectStringEntries$ListEntry]))

(defn ->list-entry
  "Constructor.

  owning-list - `net.minecraftforge.fml.client.config.GuiSelectStringEntries`
  value - `java.util.Map.Entry`"
  (^GuiSelectStringEntries$ListEntry [^net.minecraftforge.fml.client.config.GuiSelectStringEntries owning-list ^java.util.Map.Entry value]
    (new GuiSelectStringEntries$ListEntry owning-list value)))

(defn draw-entry
  "slot-index - `int`
  x - `int`
  y - `int`
  list-width - `int`
  slot-height - `int`
  mouse-x - `int`
  mouse-y - `int`
  is-selected - `boolean`"
  ([^GuiSelectStringEntries$ListEntry this ^Integer slot-index ^Integer x ^Integer y ^Integer list-width ^Integer slot-height ^Integer mouse-x ^Integer mouse-y ^Boolean is-selected]
    (-> this (.drawEntry slot-index x y list-width slot-height mouse-x mouse-y is-selected))))

(defn mouse-pressed
  "index - `int`
  x - `int`
  y - `int`
  mouse-event - `int`
  relative-x - `int`
  relative-y - `int`

  returns: `boolean`"
  (^Boolean [^GuiSelectStringEntries$ListEntry this ^Integer index ^Integer x ^Integer y ^Integer mouse-event ^Integer relative-x ^Integer relative-y]
    (-> this (.mousePressed index x y mouse-event relative-x relative-y))))

(defn mouse-released
  "index - `int`
  x - `int`
  y - `int`
  mouse-event - `int`
  relative-x - `int`
  relative-y - `int`"
  ([^GuiSelectStringEntries$ListEntry this ^Integer index ^Integer x ^Integer y ^Integer mouse-event ^Integer relative-x ^Integer relative-y]
    (-> this (.mouseReleased index x y mouse-event relative-x relative-y))))

(defn get-value
  "returns: `java.lang.Object`"
  (^java.lang.Object [^GuiSelectStringEntries$ListEntry this]
    (-> this (.getValue))))

(defn set-selected
  "p-178011-1 - `int`
  p-178011-2 - `int`
  p-178011-3 - `int`"
  ([^GuiSelectStringEntries$ListEntry this ^Integer p-178011-1 ^Integer p-178011-2 ^Integer p-178011-3]
    (-> this (.setSelected p-178011-1 p-178011-2 p-178011-3))))

