(ns net.minecraftforge.fml.client.config.GuiEditArrayEntries$BaseEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiEditArrayEntries$BaseEntry]))

(defn ->base-entry
  "Constructor.

  owning-screen - `net.minecraftforge.fml.client.config.GuiEditArray`
  owning-entry-list - `net.minecraftforge.fml.client.config.GuiEditArrayEntries`
  config-element - `net.minecraftforge.fml.client.config.IConfigElement`"
  (^GuiEditArrayEntries$BaseEntry [^net.minecraftforge.fml.client.config.GuiEditArray owning-screen ^net.minecraftforge.fml.client.config.GuiEditArrayEntries owning-entry-list ^net.minecraftforge.fml.client.config.IConfigElement config-element]
    (new GuiEditArrayEntries$BaseEntry owning-screen owning-entry-list config-element)))

(defn draw-entry
  "slot-index - `int`
  x - `int`
  y - `int`
  list-width - `int`
  slot-height - `int`
  mouse-x - `int`
  mouse-y - `int`
  is-selected - `boolean`"
  ([^GuiEditArrayEntries$BaseEntry this ^Integer slot-index ^Integer x ^Integer y ^Integer list-width ^Integer slot-height ^Integer mouse-x ^Integer mouse-y ^Boolean is-selected]
    (-> this (.drawEntry slot-index x y list-width slot-height mouse-x mouse-y is-selected))))

(defn value-savable?
  "returns: `boolean`"
  (^Boolean [^GuiEditArrayEntries$BaseEntry this]
    (-> this (.isValueSavable))))

(defn key-typed
  "event-char - `char`
  event-key - `int`"
  ([^GuiEditArrayEntries$BaseEntry this ^Character event-char ^Integer event-key]
    (-> this (.keyTyped event-char event-key))))

(defn set-selected
  "p-178011-1 - `int`
  p-178011-2 - `int`
  p-178011-3 - `int`"
  ([^GuiEditArrayEntries$BaseEntry this ^Integer p-178011-1 ^Integer p-178011-2 ^Integer p-178011-3]
    (-> this (.setSelected p-178011-1 p-178011-2 p-178011-3))))

(defn mouse-pressed
  "index - `int`
  x - `int`
  y - `int`
  mouse-event - `int`
  relative-x - `int`
  relative-y - `int`

  returns: `boolean`"
  (^Boolean [^GuiEditArrayEntries$BaseEntry this ^Integer index ^Integer x ^Integer y ^Integer mouse-event ^Integer relative-x ^Integer relative-y]
    (-> this (.mousePressed index x y mouse-event relative-x relative-y))))

(defn get-value
  "returns: `java.lang.Object`"
  (^java.lang.Object [^GuiEditArrayEntries$BaseEntry this]
    (-> this (.getValue))))

(defn mouse-released
  "index - `int`
  x - `int`
  y - `int`
  mouse-event - `int`
  relative-x - `int`
  relative-y - `int`"
  ([^GuiEditArrayEntries$BaseEntry this ^Integer index ^Integer x ^Integer y ^Integer mouse-event ^Integer relative-x ^Integer relative-y]
    (-> this (.mouseReleased index x y mouse-event relative-x relative-y))))

(defn update-cursor-counter
  ""
  ([^GuiEditArrayEntries$BaseEntry this]
    (-> this (.updateCursorCounter))))

(defn mouse-clicked
  "x - `int`
  y - `int`
  mouse-event - `int`"
  ([^GuiEditArrayEntries$BaseEntry this ^Integer x ^Integer y ^Integer mouse-event]
    (-> this (.mouseClicked x y mouse-event))))

(defn draw-tool-tip
  "mouse-x - `int`
  mouse-y - `int`"
  ([^GuiEditArrayEntries$BaseEntry this ^Integer mouse-x ^Integer mouse-y]
    (-> this (.drawToolTip mouse-x mouse-y))))

