(ns net.minecraftforge.fml.client.config.GuiEditArrayEntries$DoubleEntry
  "IGuiListEntry Inner Classes"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiEditArrayEntries$DoubleEntry]))

(defn ->double-entry
  "Constructor.

  owning-screen - `net.minecraftforge.fml.client.config.GuiEditArray`
  owning-entry-list - `net.minecraftforge.fml.client.config.GuiEditArrayEntries`
  config-element - `net.minecraftforge.fml.client.config.IConfigElement`
  value - `java.lang.Double`"
  (^GuiEditArrayEntries$DoubleEntry [^net.minecraftforge.fml.client.config.GuiEditArray owning-screen ^net.minecraftforge.fml.client.config.GuiEditArrayEntries owning-entry-list ^net.minecraftforge.fml.client.config.IConfigElement config-element ^java.lang.Double value]
    (new GuiEditArrayEntries$DoubleEntry owning-screen owning-entry-list config-element value)))

(defn key-typed
  "event-char - `char`
  event-key - `int`"
  ([^GuiEditArrayEntries$DoubleEntry this ^Character event-char ^Integer event-key]
    (-> this (.keyTyped event-char event-key))))

(defn get-value
  "returns: `java.lang.Double`"
  (^java.lang.Double [^GuiEditArrayEntries$DoubleEntry this]
    (-> this (.getValue))))

