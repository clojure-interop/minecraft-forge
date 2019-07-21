(ns net.minecraftforge.fml.common.event.FMLInitializationEvent
  "Called after FMLPreInitializationEvent and before FMLPostInitializationEvent during mod
  startup.

  This is the second of three commonly called events during mod initialization.

  Recommended activities: Register your recipes and Ore Dictionary entries in the
  GameRegistry and OreDictionary
  Dispatch requests through FMLInterModComms to other mods, to tell them what you wish them to do."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLInitializationEvent]))

(defn ->fml-initialization-event
  "Constructor.

  data - `java.lang.Object`"
  (^FMLInitializationEvent [^java.lang.Object data]
    (new FMLInitializationEvent data)))

(defn get-mod-state
  "Description copied from class: FMLStateEvent

  returns: The current state of the mod - `net.minecraftforge.fml.common.LoaderState$ModState`"
  (^net.minecraftforge.fml.common.LoaderState$ModState [^FMLInitializationEvent this]
    (-> this (.getModState))))

