(ns net.minecraftforge.fml.client.config.GuiConfigEntries$IConfigEntry
  "Provides an interface for defining GuiConfigEntry.listEntry objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiConfigEntries$IConfigEntry]))

(defn get-current-value
  "Gets the current value of this entry.

  returns: `java.lang.Object`"
  (^java.lang.Object [^GuiConfigEntries$IConfigEntry this]
    (-> this (.getCurrentValue))))

(defn save-config-element
  "Handles saving any changes that have been made to this entry back to the underlying object. It is a good practice to check
   isChanged() before performing the save action. This method should return true if the element has changed AND REQUIRES A RESTART.

  returns: `boolean`"
  (^Boolean [^GuiConfigEntries$IConfigEntry this]
    (-> this (.saveConfigElement))))

(defn changed?
  "Has the value of this entry changed?

  returns: true if changes have been made to this entry's value, false otherwise. - `boolean`"
  (^Boolean [^GuiConfigEntries$IConfigEntry this]
    (-> this (.isChanged))))

(defn key-typed
  "Handles user keystrokes for any GuiTextField objects in this entry. Call GuiTextField.textboxKeyTyped(char, int) for any GuiTextField
   objects that should receive the input provided.

  event-char - `char`
  event-key - `int`"
  ([^GuiConfigEntries$IConfigEntry this ^Character event-char ^Integer event-key]
    (-> this (.keyTyped event-char event-key))))

(defn get-config-element
  "Gets the IConfigElement object owned by this entry.

  returns: `net.minecraftforge.fml.client.config.IConfigElement`"
  (^net.minecraftforge.fml.client.config.IConfigElement [^GuiConfigEntries$IConfigEntry this]
    (-> this (.getConfigElement))))

(defn enabled
  "Is this list entry enabled?

  returns: true if this entry's controls should be enabled, false otherwise. - `boolean`"
  (^Boolean [^GuiConfigEntries$IConfigEntry this]
    (-> this (.enabled))))

(defn on-gui-closed
  "This method is called when the parent GUI is closed. Most handlers won't need this; it is provided for special cases."
  ([^GuiConfigEntries$IConfigEntry this]
    (-> this (.onGuiClosed))))

(defn undo-changes
  "Handles reverting any changes that have occurred to this entry."
  ([^GuiConfigEntries$IConfigEntry this]
    (-> this (.undoChanges))))

(defn get-name
  "Gets the name of the ConfigElement owned by this entry.

  returns: `java.lang.String`"
  (^java.lang.String [^GuiConfigEntries$IConfigEntry this]
    (-> this (.getName))))

(defn update-cursor-counter
  "Call GuiTextField.updateCursorCounter() for any GuiTextField objects in this entry."
  ([^GuiConfigEntries$IConfigEntry this]
    (-> this (.updateCursorCounter))))

(defn get-entry-right-bound
  "Gets this entry's right-hand x boundary. This value is used to control where the scroll bar is placed.

  returns: `int`"
  (^Integer [^GuiConfigEntries$IConfigEntry this]
    (-> this (.getEntryRightBound))))

(defn set-to-default
  "Sets this entry's value to the default value."
  ([^GuiConfigEntries$IConfigEntry this]
    (-> this (.setToDefault))))

(defn default?
  "Is this entry's value equal to the default value? Generally true should be returned if this entry is not a property or category
   entry.

  returns: true if this entry's value is equal to this entry's default value. - `boolean`"
  (^Boolean [^GuiConfigEntries$IConfigEntry this]
    (-> this (.isDefault))))

(defn mouse-clicked
  "Call GuiTextField.mouseClicked(int, int, int) for and GuiTextField objects in this entry.

  x - `int`
  y - `int`
  mouse-event - `int`"
  ([^GuiConfigEntries$IConfigEntry this ^Integer x ^Integer y ^Integer mouse-event]
    (-> this (.mouseClicked x y mouse-event))))

(defn draw-tool-tip
  "Handles drawing any tooltips that apply to this entry. This method is called after all other GUI elements have been drawn to the
   screen, so it could also be used to draw any GUI element that needs to be drawn after all entries have had drawEntry() called.

  mouse-x - `int`
  mouse-y - `int`"
  ([^GuiConfigEntries$IConfigEntry this ^Integer mouse-x ^Integer mouse-y]
    (-> this (.drawToolTip mouse-x mouse-y))))

(defn get-label-width
  "Gets this entry's label width.

  returns: `int`"
  (^Integer [^GuiConfigEntries$IConfigEntry this]
    (-> this (.getLabelWidth))))

(defn get-current-values
  "Gets the current values of this list entry.

  returns: `java.lang.Object[]`"
  ([^GuiConfigEntries$IConfigEntry this]
    (-> this (.getCurrentValues))))

