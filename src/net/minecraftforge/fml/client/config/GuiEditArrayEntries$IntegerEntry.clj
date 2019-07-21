(ns net.minecraftforge.fml.client.config.GuiEditArrayEntries$IntegerEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiEditArrayEntries$IntegerEntry]))

(defn ->integer-entry
  "Constructor.

  owning-screen - `net.minecraftforge.fml.client.config.GuiEditArray`
  owning-entry-list - `net.minecraftforge.fml.client.config.GuiEditArrayEntries`
  config-element - `net.minecraftforge.fml.client.config.IConfigElement`
  value - `java.lang.Integer`"
  (^GuiEditArrayEntries$IntegerEntry [^net.minecraftforge.fml.client.config.GuiEditArray owning-screen ^net.minecraftforge.fml.client.config.GuiEditArrayEntries owning-entry-list ^net.minecraftforge.fml.client.config.IConfigElement config-element ^java.lang.Integer value]
    (new GuiEditArrayEntries$IntegerEntry owning-screen owning-entry-list config-element value)))

(defn key-typed
  "event-char - `char`
  event-key - `int`"
  ([^GuiEditArrayEntries$IntegerEntry this ^Character event-char ^Integer event-key]
    (-> this (.keyTyped event-char event-key))))

(defn get-value
  "returns: `java.lang.Integer`"
  (^java.lang.Integer [^GuiEditArrayEntries$IntegerEntry this]
    (-> this (.getValue))))

