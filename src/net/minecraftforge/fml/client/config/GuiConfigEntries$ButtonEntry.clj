(ns net.minecraftforge.fml.client.config.GuiConfigEntries$ButtonEntry
  "ButtonEntry

  Provides a basic GuiButton entry to be used as a base for other entries that require a button for the value."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiConfigEntries$ButtonEntry]))

(defn ->button-entry
  "Constructor.

  owning-screen - `net.minecraftforge.fml.client.config.GuiConfig`
  owning-entry-list - `net.minecraftforge.fml.client.config.GuiConfigEntries`
  config-element - `net.minecraftforge.fml.client.config.IConfigElement`
  button - `net.minecraftforge.fml.client.config.GuiButtonExt`"
  (^GuiConfigEntries$ButtonEntry [^net.minecraftforge.fml.client.config.GuiConfig owning-screen ^net.minecraftforge.fml.client.config.GuiConfigEntries owning-entry-list ^net.minecraftforge.fml.client.config.IConfigElement config-element ^net.minecraftforge.fml.client.config.GuiButtonExt button]
    (new GuiConfigEntries$ButtonEntry owning-screen owning-entry-list config-element button))
  (^GuiConfigEntries$ButtonEntry [^net.minecraftforge.fml.client.config.GuiConfig owning-screen ^net.minecraftforge.fml.client.config.GuiConfigEntries owning-entry-list ^net.minecraftforge.fml.client.config.IConfigElement config-element]
    (new GuiConfigEntries$ButtonEntry owning-screen owning-entry-list config-element)))

(defn update-value-button-text
  "Updates the displayString of the value button."
  ([^GuiConfigEntries$ButtonEntry this]
    (-> this (.updateValueButtonText))))

(defn value-button-pressed
  "Called when the value button has been clicked.

  slot-index - `int`"
  ([^GuiConfigEntries$ButtonEntry this ^Integer slot-index]
    (-> this (.valueButtonPressed slot-index))))

(defn draw-entry
  "slot-index - `int`
  x - `int`
  y - `int`
  list-width - `int`
  slot-height - `int`
  mouse-x - `int`
  mouse-y - `int`
  is-selected - `boolean`"
  ([^GuiConfigEntries$ButtonEntry this ^Integer slot-index ^Integer x ^Integer y ^Integer list-width ^Integer slot-height ^Integer mouse-x ^Integer mouse-y ^Boolean is-selected]
    (-> this (.drawEntry slot-index x y list-width slot-height mouse-x mouse-y is-selected))))

(defn mouse-pressed
  "Returns true if the mouse has been pressed on this control.

  index - `int`
  x - `int`
  y - `int`
  mouse-event - `int`
  relative-x - `int`
  relative-y - `int`

  returns: `boolean`"
  (^Boolean [^GuiConfigEntries$ButtonEntry this ^Integer index ^Integer x ^Integer y ^Integer mouse-event ^Integer relative-x ^Integer relative-y]
    (-> this (.mousePressed index x y mouse-event relative-x relative-y))))

(defn mouse-released
  "Fired when the mouse button is released. Arguments: index, x, y, mouseEvent, relativeX, relativeY

  index - `int`
  x - `int`
  y - `int`
  mouse-event - `int`
  relative-x - `int`
  relative-y - `int`"
  ([^GuiConfigEntries$ButtonEntry this ^Integer index ^Integer x ^Integer y ^Integer mouse-event ^Integer relative-x ^Integer relative-y]
    (-> this (.mouseReleased index x y mouse-event relative-x relative-y))))

(defn key-typed
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  event-char - `char`
  event-key - `int`"
  ([^GuiConfigEntries$ButtonEntry this ^Character event-char ^Integer event-key]
    (-> this (.keyTyped event-char event-key))))

(defn update-cursor-counter
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$ButtonEntry this]
    (-> this (.updateCursorCounter))))

(defn mouse-clicked
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  x - `int`
  y - `int`
  mouse-event - `int`"
  ([^GuiConfigEntries$ButtonEntry this ^Integer x ^Integer y ^Integer mouse-event]
    (-> this (.mouseClicked x y mouse-event))))

