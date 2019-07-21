(ns net.minecraftforge.fml.client.config.GuiEditArrayEntries$IArrayEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiEditArrayEntries$IArrayEntry]))

(defn key-typed
  "event-char - `char`
  event-key - `int`"
  ([^GuiEditArrayEntries$IArrayEntry this ^Character event-char ^Integer event-key]
    (-> this (.keyTyped event-char event-key))))

(defn update-cursor-counter
  ""
  ([^GuiEditArrayEntries$IArrayEntry this]
    (-> this (.updateCursorCounter))))

(defn mouse-clicked
  "x - `int`
  y - `int`
  mouse-event - `int`"
  ([^GuiEditArrayEntries$IArrayEntry this ^Integer x ^Integer y ^Integer mouse-event]
    (-> this (.mouseClicked x y mouse-event))))

(defn draw-tool-tip
  "mouse-x - `int`
  mouse-y - `int`"
  ([^GuiEditArrayEntries$IArrayEntry this ^Integer mouse-x ^Integer mouse-y]
    (-> this (.drawToolTip mouse-x mouse-y))))

(defn value-savable?
  "returns: `boolean`"
  (^Boolean [^GuiEditArrayEntries$IArrayEntry this]
    (-> this (.isValueSavable))))

(defn get-value
  "returns: `java.lang.Object`"
  (^java.lang.Object [^GuiEditArrayEntries$IArrayEntry this]
    (-> this (.getValue))))

