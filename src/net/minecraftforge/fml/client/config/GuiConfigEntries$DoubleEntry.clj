(ns net.minecraftforge.fml.client.config.GuiConfigEntries$DoubleEntry
  "DoubleEntry

  Provides a GuiTextField for user input. Input is restricted to ensure the value can be parsed using Double.parseDouble()."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiConfigEntries$DoubleEntry]))

(defn ->double-entry
  "Constructor.

  owning-screen - `net.minecraftforge.fml.client.config.GuiConfig`
  owning-entry-list - `net.minecraftforge.fml.client.config.GuiConfigEntries`
  config-element - `net.minecraftforge.fml.client.config.IConfigElement`"
  (^GuiConfigEntries$DoubleEntry [^net.minecraftforge.fml.client.config.GuiConfig owning-screen ^net.minecraftforge.fml.client.config.GuiConfigEntries owning-entry-list ^net.minecraftforge.fml.client.config.IConfigElement config-element]
    (new GuiConfigEntries$DoubleEntry owning-screen owning-entry-list config-element)))

(defn key-typed
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  event-char - `char`
  event-key - `int`"
  ([^GuiConfigEntries$DoubleEntry this ^Character event-char ^Integer event-key]
    (-> this (.keyTyped event-char event-key))))

(defn changed?
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: true if changes have been made to this entry's value, false otherwise. - `boolean`"
  (^Boolean [^GuiConfigEntries$DoubleEntry this]
    (-> this (.isChanged))))

(defn undo-changes
  "Description copied from interface: GuiConfigEntries.IConfigEntry"
  ([^GuiConfigEntries$DoubleEntry this]
    (-> this (.undoChanges))))

(defn save-config-element
  "Description copied from interface: GuiConfigEntries.IConfigEntry

  returns: `boolean`"
  (^Boolean [^GuiConfigEntries$DoubleEntry this]
    (-> this (.saveConfigElement))))

