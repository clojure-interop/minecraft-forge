(ns net.minecraftforge.fml.client.config.GuiConfigEntries$StringEntry
  "StringEntry

  Provides a GuiTextField for user input."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiConfigEntries$StringEntry]))

(defn ->string-entry
  "Constructor.

  owning-screen - `net.minecraftforge.fml.client.config.GuiConfig`
  owning-entry-list - `net.minecraftforge.fml.client.config.GuiConfigEntries`
  config-element - `net.minecraftforge.fml.client.config.IConfigElement`"
  (^GuiConfigEntries$StringEntry [^net.minecraftforge.fml.client.config.GuiConfig owning-screen ^net.minecraftforge.fml.client.config.GuiConfigEntries owning-entry-list ^net.minecraftforge.fml.client.config.IConfigElement config-element]
    (new GuiConfigEntries$StringEntry owning-screen owning-entry-list config-element)))

(defn get-current-value
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `java.lang.Object`"
  (^java.lang.Object [^GuiConfigEntries$StringEntry this]
    (-> this (.getCurrentValue))))

(defn save-config-element
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `boolean`"
  (^Boolean [^GuiConfigEntries$StringEntry this]
    (-> this (.saveConfigElement))))

(defn draw-entry
  "slot-index - `int`
  x - `int`
  y - `int`
  list-width - `int`
  slot-height - `int`
  mouse-x - `int`
  mouse-y - `int`
  is-selected - `boolean`"
  ([^GuiConfigEntries$StringEntry this ^Integer slot-index ^Integer x ^Integer y ^Integer list-width ^Integer slot-height ^Integer mouse-x ^Integer mouse-y ^Boolean is-selected]
    (-> this (.drawEntry slot-index x y list-width slot-height mouse-x mouse-y is-selected))))

(defn changed?
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: true if changes have been made to this entry's value, false otherwise. - `boolean`"
  (^Boolean [^GuiConfigEntries$StringEntry this]
    (-> this (.isChanged))))

(defn key-typed
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  event-char - `char`
  event-key - `int`"
  ([^GuiConfigEntries$StringEntry this ^Character event-char ^Integer event-key]
    (-> this (.keyTyped event-char event-key))))

(defn undo-changes
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$StringEntry this]
    (-> this (.undoChanges))))

(defn update-cursor-counter
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$StringEntry this]
    (-> this (.updateCursorCounter))))

(defn set-to-default
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$StringEntry this]
    (-> this (.setToDefault))))

(defn default?
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: true if this entry's value is equal to this entry's default value. - `boolean`"
  (^Boolean [^GuiConfigEntries$StringEntry this]
    (-> this (.isDefault))))

(defn mouse-clicked
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  x - `int`
  y - `int`
  mouse-event - `int`"
  ([^GuiConfigEntries$StringEntry this ^Integer x ^Integer y ^Integer mouse-event]
    (-> this (.mouseClicked x y mouse-event))))

(defn get-current-values
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `java.lang.Object[]`"
  ([^GuiConfigEntries$StringEntry this]
    (-> this (.getCurrentValues))))

