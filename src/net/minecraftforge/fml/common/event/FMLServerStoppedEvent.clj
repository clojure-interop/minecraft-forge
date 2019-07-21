(ns net.minecraftforge.fml.common.event.FMLServerStoppedEvent
  "Called after FMLServerStoppingEvent when the server has completely shut down.
  Called immediately before shutting down, on the dedicated server, and before returning
  to the main menu on the client."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLServerStoppedEvent]))

(defn ->fml-server-stopped-event
  "Constructor.

  data - `java.lang.Object`"
  (^FMLServerStoppedEvent [^java.lang.Object data]
    (new FMLServerStoppedEvent data)))

(defn get-mod-state
  "Description copied from class: FMLStateEvent

  returns: The current state of the mod - `net.minecraftforge.fml.common.LoaderState$ModState`"
  (^net.minecraftforge.fml.common.LoaderState$ModState [^FMLServerStoppedEvent this]
    (-> this (.getModState))))

