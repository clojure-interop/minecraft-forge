(ns net.minecraftforge.fml.client.config.GuiConfigEntries$ArrayEntry
  "ArrayEntry

  Provides a GuiButton with the list contents as the displayString. Clicking the button navigates to a screen where the list can be
  edited."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiConfigEntries$ArrayEntry]))

(defn ->array-entry
  "Constructor.

  owning-screen - `net.minecraftforge.fml.client.config.GuiConfig`
  owning-entry-list - `net.minecraftforge.fml.client.config.GuiConfigEntries`
  config-element - `net.minecraftforge.fml.client.config.IConfigElement`"
  (^GuiConfigEntries$ArrayEntry [^net.minecraftforge.fml.client.config.GuiConfig owning-screen ^net.minecraftforge.fml.client.config.GuiConfigEntries owning-entry-list ^net.minecraftforge.fml.client.config.IConfigElement config-element]
    (new GuiConfigEntries$ArrayEntry owning-screen owning-entry-list config-element)))

(defn get-current-value
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `java.lang.Object`"
  (^java.lang.Object [^GuiConfigEntries$ArrayEntry this]
    (-> this (.getCurrentValue))))

(defn save-config-element
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `boolean`"
  (^Boolean [^GuiConfigEntries$ArrayEntry this]
    (-> this (.saveConfigElement))))

(defn changed?
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: true if changes have been made to this entry's value, false otherwise. - `boolean`"
  (^Boolean [^GuiConfigEntries$ArrayEntry this]
    (-> this (.isChanged))))

(defn set-list-from-child-screen
  "new-list - `java.lang.Object[]`"
  ([^GuiConfigEntries$ArrayEntry this new-list]
    (-> this (.setListFromChildScreen new-list))))

(defn update-value-button-text
  "Description copied from class: GuiConfigEntries.ButtonEntry"
  ([^GuiConfigEntries$ArrayEntry this]
    (-> this (.updateValueButtonText))))

(defn undo-changes
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$ArrayEntry this]
    (-> this (.undoChanges))))

(defn value-button-pressed
  "Description copied from class: GuiConfigEntries.ButtonEntry

  slot-index - `int`"
  ([^GuiConfigEntries$ArrayEntry this ^Integer slot-index]
    (-> this (.valueButtonPressed slot-index))))

(defn set-to-default
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$ArrayEntry this]
    (-> this (.setToDefault))))

(defn default?
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: true if this entry's value is equal to this entry's default value. - `boolean`"
  (^Boolean [^GuiConfigEntries$ArrayEntry this]
    (-> this (.isDefault))))

(defn get-current-values
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `java.lang.Object[]`"
  ([^GuiConfigEntries$ArrayEntry this]
    (-> this (.getCurrentValues))))

