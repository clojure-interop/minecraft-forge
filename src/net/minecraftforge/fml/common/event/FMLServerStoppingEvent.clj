(ns net.minecraftforge.fml.common.event.FMLServerStoppingEvent
  "Called when the server begins an orderly shutdown, before FMLServerStoppedEvent."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLServerStoppingEvent]))

(defn ->fml-server-stopping-event
  "Constructor.

  data - `java.lang.Object`"
  (^FMLServerStoppingEvent [^java.lang.Object data]
    (new FMLServerStoppingEvent data)))

(defn get-mod-state
  "Description copied from class: FMLStateEvent

  returns: The current state of the mod - `net.minecraftforge.fml.common.LoaderState$ModState`"
  (^net.minecraftforge.fml.common.LoaderState$ModState [^FMLServerStoppingEvent this]
    (-> this (.getModState))))

