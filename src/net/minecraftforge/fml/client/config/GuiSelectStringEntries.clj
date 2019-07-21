(ns net.minecraftforge.fml.client.config.GuiSelectStringEntries
  "This class implements the scrolling list functionality of the GuiSelectString screen."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiSelectStringEntries]))

(defn ->gui-select-string-entries
  "Constructor.

  owning-screen - `net.minecraftforge.fml.client.config.GuiSelectString`
  mc - `net.minecraft.client.Minecraft`
  config-element - `net.minecraftforge.fml.client.config.IConfigElement`
  selectable-values - `java.util.Map`"
  (^GuiSelectStringEntries [^net.minecraftforge.fml.client.config.GuiSelectString owning-screen ^net.minecraft.client.Minecraft mc ^net.minecraftforge.fml.client.config.IConfigElement config-element ^java.util.Map selectable-values]
    (new GuiSelectStringEntries owning-screen mc config-element selectable-values)))

(defn owning-screen
  "Instance Field.

  type: net.minecraftforge.fml.client.config.GuiSelectString"
  (^net.minecraftforge.fml.client.config.GuiSelectString [^GuiSelectStringEntries this]
    (-> this .-owningScreen)))

(defn mc
  "Instance Field.

  type: net.minecraft.client.Minecraft"
  (^net.minecraft.client.Minecraft [^GuiSelectStringEntries this]
    (-> this .-mc)))

(defn config-element
  "Instance Field.

  type: net.minecraftforge.fml.client.config.IConfigElement"
  (^net.minecraftforge.fml.client.config.IConfigElement [^GuiSelectStringEntries this]
    (-> this .-configElement)))

(defn list-entries
  "Instance Field.

  type: java.util.List<net.minecraftforge.fml.client.config.GuiSelectStringEntries$IGuiSelectStringListEntry>"
  (^java.util.List [^GuiSelectStringEntries this]
    (-> this .-listEntries)))

(defn selectable-values
  "Instance Constant.

  type: java.util.Map<java.lang.Object,java.lang.String>"
  (^java.util.Map [^GuiSelectStringEntries this]
    (-> this .-selectableValues)))

(defn selected-index
  "Instance Field.

  type: int"
  (^Integer [^GuiSelectStringEntries this]
    (-> this .-selectedIndex)))

(defn max-entry-width
  "Instance Field.

  type: int"
  (^Integer [^GuiSelectStringEntries this]
    (-> this .-maxEntryWidth)))

(defn get-list-width
  "Gets the width of the list

  returns: `int`"
  (^Integer [^GuiSelectStringEntries this]
    (-> this (.getListWidth))))

(defn get-list-entry
  "index - `int`

  returns: `net.minecraftforge.fml.client.config.GuiSelectStringEntries$IGuiSelectStringListEntry`"
  (^net.minecraftforge.fml.client.config.GuiSelectStringEntries$IGuiSelectStringListEntry [^GuiSelectStringEntries this ^Integer index]
    (-> this (.getListEntry index))))

(defn changed?
  "returns: `boolean`"
  (^Boolean [^GuiSelectStringEntries this]
    (-> this (.isChanged))))

(defn default?
  "returns: `boolean`"
  (^Boolean [^GuiSelectStringEntries this]
    (-> this (.isDefault))))

(defn save-changes
  ""
  ([^GuiSelectStringEntries this]
    (-> this (.saveChanges))))

