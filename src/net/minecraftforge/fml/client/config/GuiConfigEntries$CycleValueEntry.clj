(ns net.minecraftforge.fml.client.config.GuiConfigEntries$CycleValueEntry
  "CycleValueEntry

  Provides a GuiButton that cycles through the prop's validValues array. If the current prop value is not a valid value, the first
  entry replaces the current value."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiConfigEntries$CycleValueEntry]))

(defn get-current-value
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `java.lang.String`"
  (^java.lang.String [^GuiConfigEntries$CycleValueEntry this]
    (-> this (.getCurrentValue))))

(defn save-config-element
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `boolean`"
  (^Boolean [^GuiConfigEntries$CycleValueEntry this]
    (-> this (.saveConfigElement))))

(defn changed?
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: true if changes have been made to this entry's value, false otherwise. - `boolean`"
  (^Boolean [^GuiConfigEntries$CycleValueEntry this]
    (-> this (.isChanged))))

(defn update-value-button-text
  "Description copied from class: GuiConfigEntries.ButtonEntry"
  ([^GuiConfigEntries$CycleValueEntry this]
    (-> this (.updateValueButtonText))))

(defn undo-changes
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$CycleValueEntry this]
    (-> this (.undoChanges))))

(defn value-button-pressed
  "Description copied from class: GuiConfigEntries.ButtonEntry

  slot-index - `int`"
  ([^GuiConfigEntries$CycleValueEntry this ^Integer slot-index]
    (-> this (.valueButtonPressed slot-index))))

(defn set-to-default
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$CycleValueEntry this]
    (-> this (.setToDefault))))

(defn default?
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: true if this entry's value is equal to this entry's default value. - `boolean`"
  (^Boolean [^GuiConfigEntries$CycleValueEntry this]
    (-> this (.isDefault))))

(defn get-current-values
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `java.lang.String[]`"
  ([^GuiConfigEntries$CycleValueEntry this]
    (-> this (.getCurrentValues))))

