(ns net.minecraftforge.common.ForgeChunkManager
  "Manages chunkloading for mods.

  The basic principle is a ticket based system.
  1. Mods register a callback setForcedChunkLoadingCallback(Object, LoadingCallback)
  2. Mods ask for a ticket requestTicket(Object, World, Type) and then hold on to that ticket.
  3. Mods request chunks to stay loaded forceChunk(Ticket, ChunkPos) or remove chunks from force loading unforceChunk(Ticket, ChunkPos).
  4. When a world unloads, the tickets associated with that world are saved by the chunk manager.
  5. When a world loads, saved tickets are offered to the mods associated with the tickets. The ForgeChunkManager.Ticket.getModData() that is set by the mod should be used to re-register
  chunks to stay loaded (and maybe take other actions).

  The chunkloading is configurable at runtime. The file \"config/forgeChunkLoading.cfg\" contains both default configuration for chunkloading, and a sample individual mod
  specific override section."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common ForgeChunkManager]))

(defn ->forge-chunk-manager
  "Constructor."
  (^ForgeChunkManager []
    (new ForgeChunkManager )))

(def *-mod-prop-order
  "Static Constant.

  type: java.util.List<java.lang.String>"
  ForgeChunkManager/MOD_PROP_ORDER)

(defn *set-forced-chunk-loading-callback
  "Set a chunkloading callback for the supplied mod object

  mod - The mod instance registering the callback - `java.lang.Object`
  callback - The code to call back when forced chunks are loaded - `net.minecraftforge.common.ForgeChunkManager$LoadingCallback`"
  ([^java.lang.Object mod ^net.minecraftforge.common.ForgeChunkManager$LoadingCallback callback]
    (ForgeChunkManager/setForcedChunkLoadingCallback mod callback)))

(defn *sync-config-defaults
  "Synchronizes the local fields with the values in the Configuration object."
  ([]
    (ForgeChunkManager/syncConfigDefaults )))

(defn *request-player-ticket
  "mod - `java.lang.Object`
  player - `java.lang.String`
  world - `net.minecraft.world.World`
  type - `net.minecraftforge.common.ForgeChunkManager$Type`

  returns: `net.minecraftforge.common.ForgeChunkManager$Ticket`"
  (^net.minecraftforge.common.ForgeChunkManager$Ticket [^java.lang.Object mod ^java.lang.String player ^net.minecraft.world.World world ^net.minecraftforge.common.ForgeChunkManager$Type type]
    (ForgeChunkManager/requestPlayerTicket mod player world type)))

(defn *get-max-chunk-depth-for
  "mod-id - `java.lang.String`

  returns: `int`"
  (^Integer [^java.lang.String mod-id]
    (ForgeChunkManager/getMaxChunkDepthFor mod-id)))

(defn *get-mod-categories
  "returns: `java.util.List<net.minecraftforge.common.config.ConfigCategory>`"
  (^java.util.List []
    (ForgeChunkManager/getModCategories )))

(defn *add-config-property
  "mod - `java.lang.Object`
  property-name - `java.lang.String`
  value - `java.lang.String`
  type - `net.minecraftforge.common.config.Property$Type`"
  ([^java.lang.Object mod ^java.lang.String property-name ^java.lang.String value ^net.minecraftforge.common.config.Property$Type type]
    (ForgeChunkManager/addConfigProperty mod property-name value type)))

(defn *get-persistent-chunks-iterable-for
  "world - `net.minecraft.world.World`
  chunk-iterator - `java.util.Iterator`

  returns: `java.util.Iterator<net.minecraft.world.chunk.Chunk>`"
  (^java.util.Iterator [^net.minecraft.world.World world ^java.util.Iterator chunk-iterator]
    (ForgeChunkManager/getPersistentChunksIterableFor world chunk-iterator)))

(defn *ticket-count-available-for
  "Discover the available tickets for the mod in the world

  mod - The mod that will own the tickets - `java.lang.Object`
  world - The world - `net.minecraft.world.World`

  returns: The count of tickets left for the mod in the supplied world - `int`"
  (^Integer [^java.lang.Object mod ^net.minecraft.world.World world]
    (ForgeChunkManager/ticketCountAvailableFor mod world))
  (^Integer [^java.lang.String username]
    (ForgeChunkManager/ticketCountAvailableFor username)))

(defn *reorder-chunk
  "Reorganize the internal chunk list so that the chunk supplied is at the *end* of the list
   This helps if you wish to guarantee a certain \"automatic unload ordering\" for the chunks
   in the ticket list

  ticket - The ticket holding the chunk list - `net.minecraftforge.common.ForgeChunkManager$Ticket`
  chunk - The chunk you wish to push to the end (so that it would be unloaded last) - `net.minecraft.util.math.ChunkPos`"
  ([^net.minecraftforge.common.ForgeChunkManager$Ticket ticket ^net.minecraft.util.math.ChunkPos chunk]
    (ForgeChunkManager/reorderChunk ticket chunk)))

(defn *get-defaults-category
  "returns: `net.minecraftforge.common.config.ConfigCategory`"
  (^net.minecraftforge.common.config.ConfigCategory []
    (ForgeChunkManager/getDefaultsCategory )))

(defn *get-max-ticket-length-for
  "mod-id - `java.lang.String`

  returns: `int`"
  (^Integer [^java.lang.String mod-id]
    (ForgeChunkManager/getMaxTicketLengthFor mod-id)))

(defn *request-ticket
  "Request a chunkloading ticket of the appropriate type for the supplied mod

  mod - The mod requesting a ticket - `java.lang.Object`
  world - The world in which it is requesting the ticket - `net.minecraft.world.World`
  type - The type of ticket - `net.minecraftforge.common.ForgeChunkManager$Type`

  returns: A ticket with which to register chunks for loading, or null if no further tickets are available - `net.minecraftforge.common.ForgeChunkManager$Ticket`"
  (^net.minecraftforge.common.ForgeChunkManager$Ticket [^java.lang.Object mod ^net.minecraft.world.World world ^net.minecraftforge.common.ForgeChunkManager$Type type]
    (ForgeChunkManager/requestTicket mod world type)))

(defn *force-chunk
  "Force the supplied chunk coordinate to be loaded by the supplied ticket. If the ticket's ForgeChunkManager.Ticket.maxDepth is exceeded, the least
   recently registered chunk is unforced and may be unloaded.
   It is safe to force the chunk several times for a ticket, it will not generate duplication or change the ordering.

  ticket - The ticket registering the chunk - `net.minecraftforge.common.ForgeChunkManager$Ticket`
  chunk - The chunk to force - `net.minecraft.util.math.ChunkPos`"
  ([^net.minecraftforge.common.ForgeChunkManager$Ticket ticket ^net.minecraft.util.math.ChunkPos chunk]
    (ForgeChunkManager/forceChunk ticket chunk)))

(defn *fetch-dormant-chunk
  "coords - `long`
  world - `net.minecraft.world.World`

  returns: `net.minecraft.world.chunk.Chunk`"
  (^net.minecraft.world.chunk.Chunk [^Long coords ^net.minecraft.world.World world]
    (ForgeChunkManager/fetchDormantChunk coords world)))

(defn *saved-world-has-forced-chunk-tickets
  "Allows dynamically loading world mods to test if there are chunk tickets in the world
   Mods that add dynamically generated worlds (like Mystcraft) should call this method
   to determine if the world should be loaded during server starting.

  chunk-dir - The chunk directory to test: should be equivalent to WorldServer.getChunkSaveLocation() - `java.io.File`

  returns: if there are tickets outstanding for this world or not - `boolean`"
  (^Boolean [^java.io.File chunk-dir]
    (ForgeChunkManager/savedWorldHasForcedChunkTickets chunk-dir)))

(defn *get-config
  "returns: `net.minecraftforge.common.config.Configuration`"
  (^net.minecraftforge.common.config.Configuration []
    (ForgeChunkManager/getConfig )))

(defn *get-config-for
  "mod - `java.lang.Object`

  returns: `net.minecraftforge.common.config.ConfigCategory`"
  (^net.minecraftforge.common.config.ConfigCategory [^java.lang.Object mod]
    (ForgeChunkManager/getConfigFor mod)))

(defn *release-ticket
  "Release the ticket back to the system. This will also unforce any chunks held by the ticket so that they can be unloaded and/or stop ticking.

  ticket - The ticket to release - `net.minecraftforge.common.ForgeChunkManager$Ticket`"
  ([^net.minecraftforge.common.ForgeChunkManager$Ticket ticket]
    (ForgeChunkManager/releaseTicket ticket)))

(defn *get-persistent-chunks-for
  "The list of persistent chunks in the world. This set is immutable.

  world - `net.minecraft.world.World`

  returns: the list of persistent chunks in the world - `com.google.common.collect.ImmutableSetMultimap<net.minecraft.util.math.ChunkPos,net.minecraftforge.common.ForgeChunkManager$Ticket>`"
  (^com.google.common.collect.ImmutableSetMultimap [^net.minecraft.world.World world]
    (ForgeChunkManager/getPersistentChunksFor world)))

(defn *put-dormant-chunk
  "coords - `long`
  chunk - `net.minecraft.world.chunk.Chunk`"
  ([^Long coords ^net.minecraft.world.chunk.Chunk chunk]
    (ForgeChunkManager/putDormantChunk coords chunk)))

(defn *unforce-chunk
  "Unforce the supplied chunk, allowing it to be unloaded and stop ticking.

  ticket - The ticket holding the chunk - `net.minecraftforge.common.ForgeChunkManager$Ticket`
  chunk - The chunk to unforce - `net.minecraft.util.math.ChunkPos`"
  ([^net.minecraftforge.common.ForgeChunkManager$Ticket ticket ^net.minecraft.util.math.ChunkPos chunk]
    (ForgeChunkManager/unforceChunk ticket chunk)))

