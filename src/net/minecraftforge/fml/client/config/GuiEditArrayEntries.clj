(ns net.minecraftforge.fml.client.config.GuiEditArrayEntries
  "This class implements the scrolling list functionality of the GuiEditList screen. It also provides all the default controls
  for editing array-type properties."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiEditArrayEntries]))

(defn ->gui-edit-array-entries
  "Constructor.

  parent - `net.minecraftforge.fml.client.config.GuiEditArray`
  mc - `net.minecraft.client.Minecraft`
  config-element - `net.minecraftforge.fml.client.config.IConfigElement`
  before-values - `java.lang.Object[]`
  current-values - `java.lang.Object[]`"
  (^GuiEditArrayEntries [^net.minecraftforge.fml.client.config.GuiEditArray parent ^net.minecraft.client.Minecraft mc ^net.minecraftforge.fml.client.config.IConfigElement config-element before-values current-values]
    (new GuiEditArrayEntries parent mc config-element before-values current-values)))

(defn config-element
  "Instance Field.

  type: net.minecraftforge.fml.client.config.IConfigElement"
  (^net.minecraftforge.fml.client.config.IConfigElement [^GuiEditArrayEntries this]
    (-> this .-configElement)))

(defn list-entries
  "Instance Field.

  type: java.util.List<net.minecraftforge.fml.client.config.GuiEditArrayEntries$IArrayEntry>"
  (^java.util.List [^GuiEditArrayEntries this]
    (-> this .-listEntries)))

(defn is-default
  "Instance Field.

  type: boolean"
  (^Boolean [^GuiEditArrayEntries this]
    (-> this .-isDefault)))

(defn is-changed
  "Instance Field.

  type: boolean"
  (^Boolean [^GuiEditArrayEntries this]
    (-> this .-isChanged)))

(defn can-add-more-entries
  "Instance Field.

  type: boolean"
  (^Boolean [^GuiEditArrayEntries this]
    (-> this .-canAddMoreEntries)))

(defn control-width
  "Instance Constant.

  type: int"
  (^Integer [^GuiEditArrayEntries this]
    (-> this .-controlWidth)))

(defn before-values
  "Instance Constant.

  type: java.lang.Object[]"
  ([^GuiEditArrayEntries this]
    (-> this .-beforeValues)))

(defn current-values
  "Instance Field.

  type: java.lang.Object[]"
  ([^GuiEditArrayEntries this]
    (-> this .-currentValues)))

(defn get-list-width
  "Gets the width of the list

  returns: `int`"
  (^Integer [^GuiEditArrayEntries this]
    (-> this (.getListWidth))))

(defn get-list-entry
  "index - `int`

  returns: `net.minecraftforge.fml.client.config.GuiEditArrayEntries$IArrayEntry`"
  (^net.minecraftforge.fml.client.config.GuiEditArrayEntries$IArrayEntry [^GuiEditArrayEntries this ^Integer index]
    (-> this (.getListEntry index))))

(defn add-new-entry
  "index - `int`"
  ([^GuiEditArrayEntries this ^Integer index]
    (-> this (.addNewEntry index))))

(defn remove-entry
  "index - `int`"
  ([^GuiEditArrayEntries this ^Integer index]
    (-> this (.removeEntry index))))

(defn changed?
  "returns: `boolean`"
  (^Boolean [^GuiEditArrayEntries this]
    (-> this (.isChanged))))

(defn default?
  "returns: `boolean`"
  (^Boolean [^GuiEditArrayEntries this]
    (-> this (.isDefault))))

(defn recalculate-state
  ""
  ([^GuiEditArrayEntries this]
    (-> this (.recalculateState))))

(defn get-mc
  "returns: `net.minecraft.client.Minecraft`"
  (^net.minecraft.client.Minecraft [^GuiEditArrayEntries this]
    (-> this (.getMC))))

