(ns net.minecraftforge.fml.common.event.FMLConstructionEvent
  "An internal FML event used to signal the construction of mods. Should not be used by mods."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLConstructionEvent]))

(defn ->fml-construction-event
  "Constructor.

  event-data - `java.lang.Object`"
  (^FMLConstructionEvent [^java.lang.Object event-data]
    (new FMLConstructionEvent event-data)))

(defn get-mod-class-loader
  "returns: `net.minecraftforge.fml.common.ModClassLoader`"
  (^net.minecraftforge.fml.common.ModClassLoader [^FMLConstructionEvent this]
    (-> this (.getModClassLoader))))

(defn get-mod-state
  "Description copied from class: FMLStateEvent

  returns: The current state of the mod - `net.minecraftforge.fml.common.LoaderState$ModState`"
  (^net.minecraftforge.fml.common.LoaderState$ModState [^FMLConstructionEvent this]
    (-> this (.getModState))))

(defn get-asm-harvested-data
  "returns: `net.minecraftforge.fml.common.discovery.ASMDataTable`"
  (^net.minecraftforge.fml.common.discovery.ASMDataTable [^FMLConstructionEvent this]
    (-> this (.getASMHarvestedData))))

(defn get-reverse-dependencies
  "returns: `com.google.common.collect.ListMultimap<java.lang.String,java.lang.String>`"
  (^com.google.common.collect.ListMultimap [^FMLConstructionEvent this]
    (-> this (.getReverseDependencies))))

