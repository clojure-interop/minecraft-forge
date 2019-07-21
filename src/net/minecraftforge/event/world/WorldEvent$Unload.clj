(ns net.minecraftforge.event.world.WorldEvent$Unload
  "WorldEvent.Unload is fired when Minecraft unloads a world.
  This event is fired when a world is unloaded in
  Minecraft.loadWorld(WorldClient, String),
  MinecraftServer.stopServer(),
  DimensionManager#unloadWorlds(Hashtable),
  ForgeInternalHandler#onDimensionUnload(Unload).

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge#EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world WorldEvent$Unload]))

(defn ->unload
  "Constructor.

  world - `net.minecraft.world.World`"
  (^WorldEvent$Unload [^net.minecraft.world.World world]
    (new WorldEvent$Unload world)))

