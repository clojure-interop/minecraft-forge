(ns net.minecraftforge.event.world.WorldEvent$Load
  "WorldEvent.Load is fired when Minecraft loads a world.
  This event is fired when a world is loaded in
  WorldClient.WorldClient(NetHandlerPlayClient, WorldSettings, int, EnumDifficulty, Profiler),
  MinecraftServer.loadAllWorlds(String, String, long, WorldType, String),
  IntegratedServer.loadAllWorlds(String, String, long, WorldType, String)
  DimensionManager#initDimension(int),
  and ForgeInternalHandler#onDimensionLoad(Load).

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge#EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world WorldEvent$Load]))

(defn ->load
  "Constructor.

  world - `net.minecraft.world.World`"
  (^WorldEvent$Load [^net.minecraft.world.World world]
    (new WorldEvent$Load world)))

