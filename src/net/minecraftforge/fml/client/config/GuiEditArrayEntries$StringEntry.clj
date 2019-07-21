(ns net.minecraftforge.fml.client.config.GuiEditArrayEntries$StringEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiEditArrayEntries$StringEntry]))

(defn ->string-entry
  "Constructor.

  owning-screen - `net.minecraftforge.fml.client.config.GuiEditArray`
  owning-entry-list - `net.minecraftforge.fml.client.config.GuiEditArrayEntries`
  config-element - `net.minecraftforge.fml.client.config.IConfigElement`
  value - `java.lang.Object`"
  (^GuiEditArrayEntries$StringEntry [^net.minecraftforge.fml.client.config.GuiEditArray owning-screen ^net.minecraftforge.fml.client.config.GuiEditArrayEntries owning-entry-list ^net.minecraftforge.fml.client.config.IConfigElement config-element ^java.lang.Object value]
    (new GuiEditArrayEntries$StringEntry owning-screen owning-entry-list config-element value)))

(defn draw-entry
  "slot-index - `int`
  x - `int`
  y - `int`
  list-width - `int`
  slot-height - `int`
  mouse-x - `int`
  mouse-y - `int`
  is-selected - `boolean`"
  ([^GuiEditArrayEntries$StringEntry this ^Integer slot-index ^Integer x ^Integer y ^Integer list-width ^Integer slot-height ^Integer mouse-x ^Integer mouse-y ^Boolean is-selected]
    (-> this (.drawEntry slot-index x y list-width slot-height mouse-x mouse-y is-selected))))

(defn key-typed
  "event-char - `char`
  event-key - `int`"
  ([^GuiEditArrayEntries$StringEntry this ^Character event-char ^Integer event-key]
    (-> this (.keyTyped event-char event-key))))

(defn update-cursor-counter
  ""
  ([^GuiEditArrayEntries$StringEntry this]
    (-> this (.updateCursorCounter))))

(defn mouse-clicked
  "x - `int`
  y - `int`
  mouse-event - `int`"
  ([^GuiEditArrayEntries$StringEntry this ^Integer x ^Integer y ^Integer mouse-event]
    (-> this (.mouseClicked x y mouse-event))))

(defn get-value
  "returns: `java.lang.Object`"
  (^java.lang.Object [^GuiEditArrayEntries$StringEntry this]
    (-> this (.getValue))))

