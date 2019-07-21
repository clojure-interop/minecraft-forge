(ns net.minecraftforge.common.ForgeChunkManager$LoadingCallback
  "All mods requiring chunkloading need to implement this to handle the
  re-registration of chunk tickets at world loading time"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common ForgeChunkManager$LoadingCallback]))

(defn tickets-loaded
  "Called back when tickets are loaded from the world to allow the
   mod to re-register the chunks associated with those tickets. The list supplied
   here is truncated to length prior to use. Tickets unwanted by the
   mod must be disposed of manually unless the mod is an OrderedLoadingCallback instance
   in which case, they will have been disposed of by the earlier callback.

  tickets - The tickets to re-register. The list is immutable and cannot be manipulated directly. Copy it first. - `java.util.List`
  world - the world - `net.minecraft.world.World`"
  ([^ForgeChunkManager$LoadingCallback this ^java.util.List tickets ^net.minecraft.world.World world]
    (-> this (.ticketsLoaded tickets world))))

