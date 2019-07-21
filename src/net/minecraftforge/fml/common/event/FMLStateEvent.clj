(ns net.minecraftforge.fml.common.event.FMLStateEvent
  "The parent of all mod-state changing events"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLStateEvent]))

(defn ->fml-state-event
  "Constructor.

  data - `java.lang.Object`"
  (^FMLStateEvent [^java.lang.Object data]
    (new FMLStateEvent data)))

(defn get-mod-state
  "The current state of the mod

  returns: The current state of the mod - `net.minecraftforge.fml.common.LoaderState$ModState`"
  (^net.minecraftforge.fml.common.LoaderState$ModState [^FMLStateEvent this]
    (-> this (.getModState))))

(defn get-side
  "The side we're loading on. Side.CLIENT means we're loading in the client, Side.SERVER means
   we're loading in the dedicated server.

  returns: Return which side we're loading on. - `net.minecraftforge.fml.relauncher.Side`"
  (^net.minecraftforge.fml.relauncher.Side [^FMLStateEvent this]
    (-> this (.getSide))))

