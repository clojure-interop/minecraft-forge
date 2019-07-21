(ns net.minecraftforge.fml.client.config.GuiConfigEntries$ListEntryBase
  "ListEntryBase

  Provides a base entry for others to extend. Handles drawing the prop label (if drawLabel == true) and the Undo/Default buttons."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiConfigEntries$ListEntryBase]))

(defn ->list-entry-base
  "Constructor.

  owning-screen - `net.minecraftforge.fml.client.config.GuiConfig`
  owning-entry-list - `net.minecraftforge.fml.client.config.GuiConfigEntries`
  config-element - `net.minecraftforge.fml.client.config.IConfigElement`"
  (^GuiConfigEntries$ListEntryBase [^net.minecraftforge.fml.client.config.GuiConfig owning-screen ^net.minecraftforge.fml.client.config.GuiConfigEntries owning-entry-list ^net.minecraftforge.fml.client.config.IConfigElement config-element]
    (new GuiConfigEntries$ListEntryBase owning-screen owning-entry-list config-element)))

(defn get-current-value
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `java.lang.Object`"
  (^java.lang.Object [^GuiConfigEntries$ListEntryBase this]
    (-> this (.getCurrentValue))))

(defn save-config-element
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `boolean`"
  (^Boolean [^GuiConfigEntries$ListEntryBase this]
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
  ([^GuiConfigEntries$ListEntryBase this ^Integer slot-index ^Integer x ^Integer y ^Integer list-width ^Integer slot-height ^Integer mouse-x ^Integer mouse-y ^Boolean is-selected]
    (-> this (.drawEntry slot-index x y list-width slot-height mouse-x mouse-y is-selected))))

(defn changed?
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: true if changes have been made to this entry's value, false otherwise. - `boolean`"
  (^Boolean [^GuiConfigEntries$ListEntryBase this]
    (-> this (.isChanged))))

(defn key-typed
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  event-char - `char`
  event-key - `int`"
  ([^GuiConfigEntries$ListEntryBase this ^Character event-char ^Integer event-key]
    (-> this (.keyTyped event-char event-key))))

(defn get-config-element
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `net.minecraftforge.fml.client.config.IConfigElement`"
  (^net.minecraftforge.fml.client.config.IConfigElement [^GuiConfigEntries$ListEntryBase this]
    (-> this (.getConfigElement))))

(defn set-selected
  "p-178011-1 - `int`
  p-178011-2 - `int`
  p-178011-3 - `int`"
  ([^GuiConfigEntries$ListEntryBase this ^Integer p-178011-1 ^Integer p-178011-2 ^Integer p-178011-3]
    (-> this (.setSelected p-178011-1 p-178011-2 p-178011-3))))

(defn enabled
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: true if this entry's controls should be enabled, false otherwise. - `boolean`"
  (^Boolean [^GuiConfigEntries$ListEntryBase this]
    (-> this (.enabled))))

(defn on-gui-closed
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$ListEntryBase this]
    (-> this (.onGuiClosed))))

(defn mouse-pressed
  "index - `int`
  x - `int`
  y - `int`
  mouse-event - `int`
  relative-x - `int`
  relative-y - `int`

  returns: `boolean`"
  (^Boolean [^GuiConfigEntries$ListEntryBase this ^Integer index ^Integer x ^Integer y ^Integer mouse-event ^Integer relative-x ^Integer relative-y]
    (-> this (.mousePressed index x y mouse-event relative-x relative-y))))

(defn mouse-released
  "index - `int`
  x - `int`
  y - `int`
  mouse-event - `int`
  relative-x - `int`
  relative-y - `int`"
  ([^GuiConfigEntries$ListEntryBase this ^Integer index ^Integer x ^Integer y ^Integer mouse-event ^Integer relative-x ^Integer relative-y]
    (-> this (.mouseReleased index x y mouse-event relative-x relative-y))))

(defn undo-changes
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$ListEntryBase this]
    (-> this (.undoChanges))))

(defn get-name
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `java.lang.String`"
  (^java.lang.String [^GuiConfigEntries$ListEntryBase this]
    (-> this (.getName))))

(defn update-cursor-counter
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$ListEntryBase this]
    (-> this (.updateCursorCounter))))

(defn get-entry-right-bound
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `int`"
  (^Integer [^GuiConfigEntries$ListEntryBase this]
    (-> this (.getEntryRightBound))))

(defn set-to-default
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$ListEntryBase this]
    (-> this (.setToDefault))))

(defn default?
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: true if this entry's value is equal to this entry's default value. - `boolean`"
  (^Boolean [^GuiConfigEntries$ListEntryBase this]
    (-> this (.isDefault))))

(defn mouse-clicked
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  x - `int`
  y - `int`
  mouse-event - `int`"
  ([^GuiConfigEntries$ListEntryBase this ^Integer x ^Integer y ^Integer mouse-event]
    (-> this (.mouseClicked x y mouse-event))))

(defn draw-tool-tip
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  mouse-x - `int`
  mouse-y - `int`"
  ([^GuiConfigEntries$ListEntryBase this ^Integer mouse-x ^Integer mouse-y]
    (-> this (.drawToolTip mouse-x mouse-y))))

(defn get-label-width
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `int`"
  (^Integer [^GuiConfigEntries$ListEntryBase this]
    (-> this (.getLabelWidth))))

(defn get-current-values
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `java.lang.Object[]`"
  ([^GuiConfigEntries$ListEntryBase this]
    (-> this (.getCurrentValues))))

