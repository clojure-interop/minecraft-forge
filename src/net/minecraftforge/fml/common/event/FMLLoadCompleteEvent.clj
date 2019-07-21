(ns net.minecraftforge.fml.common.event.FMLLoadCompleteEvent
  "This is a mostly internal event fired to mod containers that indicates that loading is complete. Mods should not
  in general override or otherwise attempt to implement this event."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLLoadCompleteEvent]))

(defn ->fml-load-complete-event
  "Constructor.

  data - `java.lang.Object`"
  (^FMLLoadCompleteEvent [^java.lang.Object data]
    (new FMLLoadCompleteEvent data)))

(defn get-mod-state
  "Description copied from class: FMLStateEvent

  returns: The current state of the mod - `net.minecraftforge.fml.common.LoaderState$ModState`"
  (^net.minecraftforge.fml.common.LoaderState$ModState [^FMLLoadCompleteEvent this]
    (-> this (.getModState))))

