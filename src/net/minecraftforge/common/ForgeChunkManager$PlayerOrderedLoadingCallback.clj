(ns net.minecraftforge.common.ForgeChunkManager$PlayerOrderedLoadingCallback
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common ForgeChunkManager$PlayerOrderedLoadingCallback]))

(defn player-tickets-loaded
  "Called back when tickets are loaded from the world to allow the
   mod to decide if it wants the ticket still.
   This is for player bound tickets rather than mod bound tickets. It is here so mods can
   decide they want to dump all player tickets

   WARNING: You cannot force chunks in this callback, it is strictly for allowing the mod
   to be more selective in which tickets it wishes to preserve

  tickets - The tickets that you will want to select from. The list is immutable and cannot be manipulated directly. Copy it first. - `com.google.common.collect.ListMultimap`
  world - The world - `net.minecraft.world.World`

  returns: A list of the tickets this mod wishes to use. This list will subsequently be offered
   to the main callback for action - `com.google.common.collect.ListMultimap<java.lang.String,net.minecraftforge.common.ForgeChunkManager$Ticket>`"
  (^com.google.common.collect.ListMultimap [^ForgeChunkManager$PlayerOrderedLoadingCallback this ^com.google.common.collect.ListMultimap tickets ^net.minecraft.world.World world]
    (-> this (.playerTicketsLoaded tickets world))))

