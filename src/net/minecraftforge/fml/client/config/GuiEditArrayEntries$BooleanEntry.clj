(ns net.minecraftforge.fml.client.config.GuiEditArrayEntries$BooleanEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiEditArrayEntries$BooleanEntry]))

(defn ->boolean-entry
  "Constructor.

  owning-screen - `net.minecraftforge.fml.client.config.GuiEditArray`
  owning-entry-list - `net.minecraftforge.fml.client.config.GuiEditArrayEntries`
  config-element - `net.minecraftforge.fml.client.config.IConfigElement`
  value - `boolean`"
  (^GuiEditArrayEntries$BooleanEntry [^net.minecraftforge.fml.client.config.GuiEditArray owning-screen ^net.minecraftforge.fml.client.config.GuiEditArrayEntries owning-entry-list ^net.minecraftforge.fml.client.config.IConfigElement config-element ^Boolean value]
    (new GuiEditArrayEntries$BooleanEntry owning-screen owning-entry-list config-element value)))

(defn draw-entry
  "slot-index - `int`
  x - `int`
  y - `int`
  list-width - `int`
  slot-height - `int`
  mouse-x - `int`
  mouse-y - `int`
  is-selected - `boolean`"
  ([^GuiEditArrayEntries$BooleanEntry this ^Integer slot-index ^Integer x ^Integer y ^Integer list-width ^Integer slot-height ^Integer mouse-x ^Integer mouse-y ^Boolean is-selected]
    (-> this (.drawEntry slot-index x y list-width slot-height mouse-x mouse-y is-selected))))

(defn mouse-pressed
  "index - `int`
  x - `int`
  y - `int`
  mouse-event - `int`
  relative-x - `int`
  relative-y - `int`

  returns: `boolean`"
  (^Boolean [^GuiEditArrayEntries$BooleanEntry this ^Integer index ^Integer x ^Integer y ^Integer mouse-event ^Integer relative-x ^Integer relative-y]
    (-> this (.mousePressed index x y mouse-event relative-x relative-y))))

(defn mouse-released
  "index - `int`
  x - `int`
  y - `int`
  mouse-event - `int`
  relative-x - `int`
  relative-y - `int`"
  ([^GuiEditArrayEntries$BooleanEntry this ^Integer index ^Integer x ^Integer y ^Integer mouse-event ^Integer relative-x ^Integer relative-y]
    (-> this (.mouseReleased index x y mouse-event relative-x relative-y))))

(defn get-value
  "returns: `java.lang.Object`"
  (^java.lang.Object [^GuiEditArrayEntries$BooleanEntry this]
    (-> this (.getValue))))

