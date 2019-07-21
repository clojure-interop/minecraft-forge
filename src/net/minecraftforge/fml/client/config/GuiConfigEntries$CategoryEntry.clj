(ns net.minecraftforge.fml.client.config.GuiConfigEntries$CategoryEntry
  "CategoryEntry

  Provides an entry that consists of a GuiButton for navigating to the child category GuiConfig screen."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiConfigEntries$CategoryEntry]))

(defn ->category-entry
  "Constructor.

  owning-screen - `net.minecraftforge.fml.client.config.GuiConfig`
  owning-entry-list - `net.minecraftforge.fml.client.config.GuiConfigEntries`
  config-element - `net.minecraftforge.fml.client.config.IConfigElement`"
  (^GuiConfigEntries$CategoryEntry [^net.minecraftforge.fml.client.config.GuiConfig owning-screen ^net.minecraftforge.fml.client.config.GuiConfigEntries owning-entry-list ^net.minecraftforge.fml.client.config.IConfigElement config-element]
    (new GuiConfigEntries$CategoryEntry owning-screen owning-entry-list config-element)))

(defn get-current-value
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `java.lang.String`"
  (^java.lang.String [^GuiConfigEntries$CategoryEntry this]
    (-> this (.getCurrentValue))))

(defn save-config-element
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `boolean`"
  (^Boolean [^GuiConfigEntries$CategoryEntry this]
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
  ([^GuiConfigEntries$CategoryEntry this ^Integer slot-index ^Integer x ^Integer y ^Integer list-width ^Integer slot-height ^Integer mouse-x ^Integer mouse-y ^Boolean is-selected]
    (-> this (.drawEntry slot-index x y list-width slot-height mouse-x mouse-y is-selected))))

(defn changed?
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: true if changes have been made to this entry's value, false otherwise. - `boolean`"
  (^Boolean [^GuiConfigEntries$CategoryEntry this]
    (-> this (.isChanged))))

(defn key-typed
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  event-char - `char`
  event-key - `int`"
  ([^GuiConfigEntries$CategoryEntry this ^Character event-char ^Integer event-key]
    (-> this (.keyTyped event-char event-key))))

(defn enabled
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: true if this entry's controls should be enabled, false otherwise. - `boolean`"
  (^Boolean [^GuiConfigEntries$CategoryEntry this]
    (-> this (.enabled))))

(defn mouse-pressed
  "index - `int`
  x - `int`
  y - `int`
  mouse-event - `int`
  relative-x - `int`
  relative-y - `int`

  returns: `boolean`"
  (^Boolean [^GuiConfigEntries$CategoryEntry this ^Integer index ^Integer x ^Integer y ^Integer mouse-event ^Integer relative-x ^Integer relative-y]
    (-> this (.mousePressed index x y mouse-event relative-x relative-y))))

(defn mouse-released
  "index - `int`
  x - `int`
  y - `int`
  mouse-event - `int`
  relative-x - `int`
  relative-y - `int`"
  ([^GuiConfigEntries$CategoryEntry this ^Integer index ^Integer x ^Integer y ^Integer mouse-event ^Integer relative-x ^Integer relative-y]
    (-> this (.mouseReleased index x y mouse-event relative-x relative-y))))

(defn undo-changes
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$CategoryEntry this]
    (-> this (.undoChanges))))

(defn update-cursor-counter
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$CategoryEntry this]
    (-> this (.updateCursorCounter))))

(defn get-entry-right-bound
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `int`"
  (^Integer [^GuiConfigEntries$CategoryEntry this]
    (-> this (.getEntryRightBound))))

(defn set-to-default
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$CategoryEntry this]
    (-> this (.setToDefault))))

(defn default?
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: true if this entry's value is equal to this entry's default value. - `boolean`"
  (^Boolean [^GuiConfigEntries$CategoryEntry this]
    (-> this (.isDefault))))

(defn mouse-clicked
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  x - `int`
  y - `int`
  mouse-event - `int`"
  ([^GuiConfigEntries$CategoryEntry this ^Integer x ^Integer y ^Integer mouse-event]
    (-> this (.mouseClicked x y mouse-event))))

(defn draw-tool-tip
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  mouse-x - `int`
  mouse-y - `int`"
  ([^GuiConfigEntries$CategoryEntry this ^Integer mouse-x ^Integer mouse-y]
    (-> this (.drawToolTip mouse-x mouse-y))))

(defn get-label-width
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `int`"
  (^Integer [^GuiConfigEntries$CategoryEntry this]
    (-> this (.getLabelWidth))))

(defn get-current-values
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `java.lang.String[]`"
  ([^GuiConfigEntries$CategoryEntry this]
    (-> this (.getCurrentValues))))

