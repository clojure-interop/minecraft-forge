(ns net.minecraftforge.fml.client.config.GuiConfigEntries$NumberSliderEntry
  "NumberSliderEntry

  Provides a slider for numeric properties."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiConfigEntries$NumberSliderEntry]))

(defn ->number-slider-entry
  "Constructor.

  owning-screen - `net.minecraftforge.fml.client.config.GuiConfig`
  owning-entry-list - `net.minecraftforge.fml.client.config.GuiConfigEntries`
  config-element - `net.minecraftforge.fml.client.config.IConfigElement`"
  (^GuiConfigEntries$NumberSliderEntry [^net.minecraftforge.fml.client.config.GuiConfig owning-screen ^net.minecraftforge.fml.client.config.GuiConfigEntries owning-entry-list ^net.minecraftforge.fml.client.config.IConfigElement config-element]
    (new GuiConfigEntries$NumberSliderEntry owning-screen owning-entry-list config-element)))

(defn get-current-value
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `java.lang.Object`"
  (^java.lang.Object [^GuiConfigEntries$NumberSliderEntry this]
    (-> this (.getCurrentValue))))

(defn save-config-element
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `boolean`"
  (^Boolean [^GuiConfigEntries$NumberSliderEntry this]
    (-> this (.saveConfigElement))))

(defn changed?
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: true if changes have been made to this entry's value, false otherwise. - `boolean`"
  (^Boolean [^GuiConfigEntries$NumberSliderEntry this]
    (-> this (.isChanged))))

(defn update-value-button-text
  "Description copied from class: GuiConfigEntries.ButtonEntry"
  ([^GuiConfigEntries$NumberSliderEntry this]
    (-> this (.updateValueButtonText))))

(defn undo-changes
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$NumberSliderEntry this]
    (-> this (.undoChanges))))

(defn value-button-pressed
  "Description copied from class: GuiConfigEntries.ButtonEntry

  slot-index - `int`"
  ([^GuiConfigEntries$NumberSliderEntry this ^Integer slot-index]
    (-> this (.valueButtonPressed slot-index))))

(defn set-to-default
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$NumberSliderEntry this]
    (-> this (.setToDefault))))

(defn default?
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: true if this entry's value is equal to this entry's default value. - `boolean`"
  (^Boolean [^GuiConfigEntries$NumberSliderEntry this]
    (-> this (.isDefault))))

(defn get-current-values
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `java.lang.Object[]`"
  ([^GuiConfigEntries$NumberSliderEntry this]
    (-> this (.getCurrentValues))))

