(ns net.minecraftforge.fml.common.event.FMLServerStartingEvent
  "Called after FMLServerAboutToStartEvent and before FMLServerStartedEvent.
  This event allows for customizations of the server, such as loading custom commands, perhaps customizing recipes or
  other activities."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLServerStartingEvent]))

(defn ->fml-server-starting-event
  "Constructor.

  data - `java.lang.Object`"
  (^FMLServerStartingEvent [^java.lang.Object data]
    (new FMLServerStartingEvent data)))

(defn get-mod-state
  "Description copied from class: FMLStateEvent

  returns: The current state of the mod - `net.minecraftforge.fml.common.LoaderState$ModState`"
  (^net.minecraftforge.fml.common.LoaderState$ModState [^FMLServerStartingEvent this]
    (-> this (.getModState))))

(defn get-server
  "returns: `net.minecraft.server.MinecraftServer`"
  (^net.minecraft.server.MinecraftServer [^FMLServerStartingEvent this]
    (-> this (.getServer))))

(defn register-server-command
  "command - `net.minecraft.command.ICommand`"
  ([^FMLServerStartingEvent this ^net.minecraft.command.ICommand command]
    (-> this (.registerServerCommand command))))

