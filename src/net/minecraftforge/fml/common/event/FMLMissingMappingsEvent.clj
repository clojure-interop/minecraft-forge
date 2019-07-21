(ns net.minecraftforge.fml.common.event.FMLMissingMappingsEvent
  "This event is fired if a world is loaded that has block and item mappings referring the mod that are not
  in existence.
  These can be remapped to other existing objects, or simply discarded.
  Use get() and getAll() to process this event."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLMissingMappingsEvent]))

(defn ->fml-missing-mappings-event
  "Constructor.

  missing-mappings - `com.google.common.collect.ListMultimap`"
  (^FMLMissingMappingsEvent [^com.google.common.collect.ListMultimap missing-mappings]
    (new FMLMissingMappingsEvent missing-mappings)))

(defn apply-mod-container
  "active-container - `net.minecraftforge.fml.common.ModContainer`"
  ([^FMLMissingMappingsEvent this ^net.minecraftforge.fml.common.ModContainer active-container]
    (-> this (.applyModContainer active-container))))

(defn get
  "Get the list of missing mappings for the active mod.

   Process the list entries by calling ignore(), warn(), fail() or remap() on each entry.

  returns: list of missing mappings - `java.util.List<net.minecraftforge.fml.common.event.FMLMissingMappingsEvent$MissingMapping>`"
  (^java.util.List [^FMLMissingMappingsEvent this]
    (-> this (.get))))

(defn get-all
  "Get the list of missing mappings for all mods.

   Only use this if you need to handle mod id changes, e.g. if you renamed your mod or
   split/merge into/from multiple mods.

   Process the list entries by calling ignore(), warn(), fail() or remap() on each entry you
   want to handle.

  returns: list of missing mappings - `java.util.List<net.minecraftforge.fml.common.event.FMLMissingMappingsEvent$MissingMapping>`"
  (^java.util.List [^FMLMissingMappingsEvent this]
    (-> this (.getAll))))

