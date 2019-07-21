(ns net.minecraftforge.common.ForgeChunkManager$Ticket
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common ForgeChunkManager$Ticket]))

(defn world
  "Instance Constant.

  type: net.minecraft.world.World"
  (^net.minecraft.world.World [^ForgeChunkManager$Ticket this]
    (-> this .-world)))

(defn get-entity
  "Get the entity associated with this ForgeChunkManager.Type.ENTITY type ticket

  returns: the entity - `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^ForgeChunkManager$Ticket this]
    (-> this (.getEntity))))

(defn get-type
  "Gets the ticket type

  returns: `net.minecraftforge.common.ForgeChunkManager$Type`"
  (^net.minecraftforge.common.ForgeChunkManager$Type [^ForgeChunkManager$Ticket this]
    (-> this (.getType))))

(defn bind-entity
  "Bind the entity to the ticket for ForgeChunkManager.Type.ENTITY type tickets. Other types will throw a runtime exception.

  entity - The entity to bind - `net.minecraft.entity.Entity`"
  ([^ForgeChunkManager$Ticket this ^net.minecraft.entity.Entity entity]
    (-> this (.bindEntity entity))))

(defn get-chunk-list
  "Gets a list of requested chunks for this ticket.

  returns: `com.google.common.collect.ImmutableSet<net.minecraft.util.math.ChunkPos>`"
  (^com.google.common.collect.ImmutableSet [^ForgeChunkManager$Ticket this]
    (-> this (.getChunkList))))

(defn get-chunk-list-depth
  "Gets the current max depth for this ticket.
   Should be the same as getMaxChunkListDepth()
   unless setChunkListDepth has been called.

  returns: Current max depth - `int`"
  (^Integer [^ForgeChunkManager$Ticket this]
    (-> this (.getChunkListDepth))))

(defn get-player-name
  "Get the player associated with this ticket

  returns: `java.lang.String`"
  (^java.lang.String [^ForgeChunkManager$Ticket this]
    (-> this (.getPlayerName))))

(defn get-max-chunk-list-depth
  "Get the maximum chunk depth size

  returns: The maximum chunk depth size - `int`"
  (^Integer [^ForgeChunkManager$Ticket this]
    (-> this (.getMaxChunkListDepth))))

(defn get-mod-data
  "Retrieve the NBTTagCompound that stores mod specific data for the chunk ticket.
   Example data to store would be a TileEntity or Block location. This is persisted with the ticket and
   provided to the ForgeChunkManager.LoadingCallback for the mod. It is recommended to use this to recover
   useful state information for the forced chunks.

  returns: The custom compound tag for mods to store additional chunkloading data - `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^ForgeChunkManager$Ticket this]
    (-> this (.getModData))))

(defn get-mod-id
  "Get the associated mod id

  returns: `java.lang.String`"
  (^java.lang.String [^ForgeChunkManager$Ticket this]
    (-> this (.getModId))))

(defn player-ticket?
  "Is this a player associated ticket rather than a mod associated ticket?

  returns: `boolean`"
  (^Boolean [^ForgeChunkManager$Ticket this]
    (-> this (.isPlayerTicket))))

(defn set-chunk-list-depth
  "The chunk list depth can be manipulated up to the maximal grant allowed for the mod. This value is configurable. Once the maximum is reached,
   the least recently forced chunk, by original registration time, is removed from the forced chunk list.

  depth - The new depth to set - `int`"
  ([^ForgeChunkManager$Ticket this ^Integer depth]
    (-> this (.setChunkListDepth depth))))

