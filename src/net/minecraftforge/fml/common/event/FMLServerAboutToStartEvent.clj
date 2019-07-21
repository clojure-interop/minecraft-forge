(ns net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent
  "Called before the server begins loading anything. Called after FMLPostInitializationEvent on the dedicated
  server, and after the player has hit \"Play Selected World\" in the client. Called before FMLServerStartingEvent.

  You can obtain a reference to the server with this event."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLServerAboutToStartEvent]))

(defn ->fml-server-about-to-start-event
  "Constructor.

  data - `java.lang.Object`"
  (^FMLServerAboutToStartEvent [^java.lang.Object data]
    (new FMLServerAboutToStartEvent data)))

(defn get-mod-state
  "Description copied from class: FMLStateEvent

  returns: The current state of the mod - `net.minecraftforge.fml.common.LoaderState$ModState`"
  (^net.minecraftforge.fml.common.LoaderState$ModState [^FMLServerAboutToStartEvent this]
    (-> this (.getModState))))

(defn get-server
  "returns: `net.minecraft.server.MinecraftServer`"
  (^net.minecraft.server.MinecraftServer [^FMLServerAboutToStartEvent this]
    (-> this (.getServer))))

