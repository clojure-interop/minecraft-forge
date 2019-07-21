(ns net.minecraftforge.fml.client.config.GuiConfigEntries$BooleanEntry
  "BooleanPropEntry

  Provides a GuiButton that toggles between true and false."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiConfigEntries$BooleanEntry]))

(defn get-current-value?
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^GuiConfigEntries$BooleanEntry this]
    (-> this (.getCurrentValue))))

(defn save-config-element
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `boolean`"
  (^Boolean [^GuiConfigEntries$BooleanEntry this]
    (-> this (.saveConfigElement))))

(defn changed?
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: true if changes have been made to this entry's value, false otherwise. - `boolean`"
  (^Boolean [^GuiConfigEntries$BooleanEntry this]
    (-> this (.isChanged))))

(defn update-value-button-text
  "Description copied from class: GuiConfigEntries.ButtonEntry"
  ([^GuiConfigEntries$BooleanEntry this]
    (-> this (.updateValueButtonText))))

(defn undo-changes
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$BooleanEntry this]
    (-> this (.undoChanges))))

(defn value-button-pressed
  "Description copied from class: GuiConfigEntries.ButtonEntry

  slot-index - `int`"
  ([^GuiConfigEntries$BooleanEntry this ^Integer slot-index]
    (-> this (.valueButtonPressed slot-index))))

(defn set-to-default
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$BooleanEntry this]
    (-> this (.setToDefault))))

(defn default?
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: true if this entry's value is equal to this entry's default value. - `boolean`"
  (^Boolean [^GuiConfigEntries$BooleanEntry this]
    (-> this (.isDefault))))

(defn get-current-values
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `java.lang.Boolean[]`"
  ([^GuiConfigEntries$BooleanEntry this]
    (-> this (.getCurrentValues))))

