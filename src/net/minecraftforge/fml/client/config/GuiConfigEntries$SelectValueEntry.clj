(ns net.minecraftforge.fml.client.config.GuiConfigEntries$SelectValueEntry
  "SelectValueEntry

  Provides a GuiButton with the current value as the displayString. Accepts a Map of selectable values with the signature  where the key is the Object to be selected and the value is the String that will show on the selection list. EG: a map of Mod
  ID values where the key is the Mod ID and the value is the Mod Name."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiConfigEntries$SelectValueEntry]))

(defn ->select-value-entry
  "Constructor.

  owning-screen - `net.minecraftforge.fml.client.config.GuiConfig`
  owning-entry-list - `net.minecraftforge.fml.client.config.GuiConfigEntries`
  config-element - `net.minecraftforge.fml.client.config.IConfigElement`
  selectable-values - `java.util.Map`"
  (^GuiConfigEntries$SelectValueEntry [^net.minecraftforge.fml.client.config.GuiConfig owning-screen ^net.minecraftforge.fml.client.config.GuiConfigEntries owning-entry-list ^net.minecraftforge.fml.client.config.IConfigElement config-element ^java.util.Map selectable-values]
    (new GuiConfigEntries$SelectValueEntry owning-screen owning-entry-list config-element selectable-values)))

(defn get-current-value
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `java.lang.String`"
  (^java.lang.String [^GuiConfigEntries$SelectValueEntry this]
    (-> this (.getCurrentValue))))

(defn save-config-element
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `boolean`"
  (^Boolean [^GuiConfigEntries$SelectValueEntry this]
    (-> this (.saveConfigElement))))

(defn set-value-from-child-screen
  "new-value - `java.lang.Object`"
  ([^GuiConfigEntries$SelectValueEntry this ^java.lang.Object new-value]
    (-> this (.setValueFromChildScreen new-value))))

(defn changed?
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: true if changes have been made to this entry's value, false otherwise. - `boolean`"
  (^Boolean [^GuiConfigEntries$SelectValueEntry this]
    (-> this (.isChanged))))

(defn update-value-button-text
  "Description copied from class: GuiConfigEntries.ButtonEntry"
  ([^GuiConfigEntries$SelectValueEntry this]
    (-> this (.updateValueButtonText))))

(defn undo-changes
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$SelectValueEntry this]
    (-> this (.undoChanges))))

(defn value-button-pressed
  "Description copied from class: GuiConfigEntries.ButtonEntry

  slot-index - `int`"
  ([^GuiConfigEntries$SelectValueEntry this ^Integer slot-index]
    (-> this (.valueButtonPressed slot-index))))

(defn set-to-default
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$SelectValueEntry this]
    (-> this (.setToDefault))))

(defn default?
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: true if this entry's value is equal to this entry's default value. - `boolean`"
  (^Boolean [^GuiConfigEntries$SelectValueEntry this]
    (-> this (.isDefault))))

(defn get-current-values
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `java.lang.String[]`"
  ([^GuiConfigEntries$SelectValueEntry this]
    (-> this (.getCurrentValues))))

