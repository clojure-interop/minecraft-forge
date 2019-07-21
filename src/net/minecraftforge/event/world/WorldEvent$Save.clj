(ns net.minecraftforge.event.world.WorldEvent$Save
  "WorldEvent.Save is fired when Minecraft saves a world.
  This event is fired when a world is saved in
  WorldServer.saveAllChunks(boolean, IProgressUpdate),
  ForgeInternalHandler#onDimensionSave(Save).

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge#EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world WorldEvent$Save]))

(defn ->save
  "Constructor.

  world - `net.minecraft.world.World`"
  (^WorldEvent$Save [^net.minecraft.world.World world]
    (new WorldEvent$Save world)))

