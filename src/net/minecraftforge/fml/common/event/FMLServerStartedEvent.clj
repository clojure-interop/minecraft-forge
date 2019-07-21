(ns net.minecraftforge.fml.common.event.FMLServerStartedEvent
  "Called after FMLServerStartingEvent when the server is available and ready to play."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLServerStartedEvent]))

(defn ->fml-server-started-event
  "Constructor.

  data - `java.lang.Object`"
  (^FMLServerStartedEvent [^java.lang.Object data]
    (new FMLServerStartedEvent data)))

(defn get-mod-state
  "Description copied from class: FMLStateEvent

  returns: The current state of the mod - `net.minecraftforge.fml.common.LoaderState$ModState`"
  (^net.minecraftforge.fml.common.LoaderState$ModState [^FMLServerStartedEvent this]
    (-> this (.getModState))))

