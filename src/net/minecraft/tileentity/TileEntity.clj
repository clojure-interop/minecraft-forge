(ns net.minecraft.tileentity.TileEntity
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntity]))

(defn ->tile-entity
  "Constructor."
  (^TileEntity []
    (new TileEntity )))

(def *-infinite-extent-aabb
  "Static Constant.

  Sometimes default render bounding box: infinite in scope. Used to control rendering on TileEntitySpecialRenderer.

  type: net.minecraft.util.math.AxisAlignedBB"
  TileEntity/INFINITE_EXTENT_AABB)

(defn *get-key
  "p-190559-0 - `java.lang.Class`

  returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^java.lang.Class p-190559-0]
    (TileEntity/getKey p-190559-0)))

(defn *create
  "world-in - `net.minecraft.world.World`
  compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.tileentity.TileEntity`"
  (^net.minecraft.tileentity.TileEntity [^net.minecraft.world.World world-in ^net.minecraft.nbt.NBTTagCompound compound]
    (TileEntity/create world-in compound)))

(defn should-render-in-pass?
  "pass - `int`

  returns: `boolean`"
  (^Boolean [^TileEntity this ^Integer pass]
    (-> this (.shouldRenderInPass pass))))

(defn has-world?
  "returns: `boolean`"
  (^Boolean [^TileEntity this]
    (-> this (.hasWorld))))

(defn add-info-to-crash-report
  "report-category - `net.minecraft.crash.CrashReportCategory`"
  ([^TileEntity this ^net.minecraft.crash.CrashReportCategory report-category]
    (-> this (.addInfoToCrashReport report-category))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntity this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn update-containing-block-info
  ""
  ([^TileEntity this]
    (-> this (.updateContainingBlockInfo))))

(defn set-pos
  "pos-in - `net.minecraft.util.math.BlockPos`"
  ([^TileEntity this ^net.minecraft.util.math.BlockPos pos-in]
    (-> this (.setPos pos-in))))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntity this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn on-data-packet
  "Called when you receive a TileEntityData packet for the location this
   TileEntity is currently in. On the client, the NetworkManager will always
   be the remote server. On the server, it will be whomever is responsible for
   sending the packet.

  net - The NetworkManager the packet originated from - `net.minecraft.network.NetworkManager`
  pkt - The data packet - `net.minecraft.network.play.server.SPacketUpdateTileEntity`"
  ([^TileEntity this ^net.minecraft.network.NetworkManager net ^net.minecraft.network.play.server.SPacketUpdateTileEntity pkt]
    (-> this (.onDataPacket net pkt))))

(defn set-world
  "world-in - `net.minecraft.world.World`"
  ([^TileEntity this ^net.minecraft.world.World world-in]
    (-> this (.setWorld world-in))))

(defn should-refresh?
  "Called from Chunk.setBlockIDWithMetadata and Chunk.fillChunk, determines if this tile entity should be re-created when the ID, or Metadata changes.
   Use with caution as this will leave straggler TileEntities, or create conflicts with other TileEntities if not used properly.

  world - Current world - `net.minecraft.world.World`
  pos - Tile's world position - `net.minecraft.util.math.BlockPos`
  old-state - The old ID of the block - `net.minecraft.block.state.IBlockState`
  new-sate - `net.minecraft.block.state.IBlockState`

  returns: true forcing the invalidation of the existing TE, false not to invalidate the existing TE - `boolean`"
  (^Boolean [^TileEntity this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState old-state ^net.minecraft.block.state.IBlockState new-sate]
    (-> this (.shouldRefresh world pos old-state new-sate))))

(defn only-ops-can-set-nbt
  "returns: `boolean`"
  (^Boolean [^TileEntity this]
    (-> this (.onlyOpsCanSetNbt))))

(defn get-tile-data
  "Gets a NBTTagCompound that can be used to store custom data for this tile entity.
   It will be written, and read from disc, so it persists over world saves.

  returns: A compound tag for custom data - `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntity this]
    (-> this (.getTileData))))

(defn validate
  ""
  ([^TileEntity this]
    (-> this (.validate))))

(defn get-update-tag
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntity this]
    (-> this (.getUpdateTag))))

(defn can-render-breaking?
  "Checks if this tile entity knows how to render its 'breaking' overlay effect.
   If this returns true, The TileEntitySpecialRenderer will be called again with break progress set.

  returns: True to re-render tile with breaking effect. - `boolean`"
  (^Boolean [^TileEntity this]
    (-> this (.canRenderBreaking))))

(defn get-block-metadata
  "returns: `int`"
  (^Integer [^TileEntity this]
    (-> this (.getBlockMetadata))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^TileEntity this]
    (-> this (.getDisplayName))))

(defn get-max-render-distance-squared
  "returns: `double`"
  (^Double [^TileEntity this]
    (-> this (.getMaxRenderDistanceSquared))))

(defn get-capability
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: The requested capability. Returns null when ICapabilityProvider.hasCapability(Capability, EnumFacing) would return false. - `<T> T`"
  ([^TileEntity this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.getCapability capability facing))))

(defn get-update-packet
  "returns: `net.minecraft.network.play.server.SPacketUpdateTileEntity`"
  (^net.minecraft.network.play.server.SPacketUpdateTileEntity [^TileEntity this]
    (-> this (.getUpdatePacket))))

(defn serialize-nbt
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntity this]
    (-> this (.serializeNBT))))

(defn has-fast-renderer?
  "If the TileEntitySpecialRenderer associated with this TileEntity can be batched in with another renderers, and won't access the GL state.
   If TileEntity returns true, then TESR should have the same functionality as (and probably extend) the FastTESR class.

  returns: `boolean`"
  (^Boolean [^TileEntity this]
    (-> this (.hasFastRenderer))))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^TileEntity this]
    (-> this (.getWorld))))

(defn has-capability?
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: True if this object supports the capability. - `boolean`"
  (^Boolean [^TileEntity this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.hasCapability capability facing))))

(defn invalidate
  ""
  ([^TileEntity this]
    (-> this (.invalidate))))

(defn get-block-type
  "returns: `net.minecraft.block.Block`"
  (^net.minecraft.block.Block [^TileEntity this]
    (-> this (.getBlockType))))

(defn get-distance-sq
  "x - `double`
  y - `double`
  z - `double`

  returns: `double`"
  (^Double [^TileEntity this ^Double x ^Double y ^Double z]
    (-> this (.getDistanceSq x y z))))

(defn mirror
  "mirror-in - `net.minecraft.util.Mirror`"
  ([^TileEntity this ^net.minecraft.util.Mirror mirror-in]
    (-> this (.mirror mirror-in))))

(defn on-chunk-unload
  "Called when the chunk this TileEntity is on is Unloaded."
  ([^TileEntity this]
    (-> this (.onChunkUnload))))

(defn get-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^TileEntity this]
    (-> this (.getPos))))

(defn on-load
  "Called from the Chunk when this is first added to the world. Override instead of adding
   if (firstTick) stuff in update. Happens after validate and after it has been placed into the Chunk tileEntity
   map."
  ([^TileEntity this]
    (-> this (.onLoad))))

(defn deserialize-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntity this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.deserializeNBT nbt))))

(defn rotate
  "rotation-in - `net.minecraft.util.Rotation`"
  ([^TileEntity this ^net.minecraft.util.Rotation rotation-in]
    (-> this (.rotate rotation-in))))

(defn invalid?
  "returns: `boolean`"
  (^Boolean [^TileEntity this]
    (-> this (.isInvalid))))

(defn handle-update-tag
  "Called when the chunk's TE update tag, gotten from getUpdateTag(), is received on the client.

   Used to handle this tag in a special way. By default this simply calls readFromNBT(NBTTagCompound).

  tag - The NBTTagCompound sent from getUpdateTag() - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntity this ^net.minecraft.nbt.NBTTagCompound tag]
    (-> this (.handleUpdateTag tag))))

(defn receive-client-event
  "id - `int`
  type - `int`

  returns: `boolean`"
  (^Boolean [^TileEntity this ^Integer id ^Integer type]
    (-> this (.receiveClientEvent id type))))

(defn mark-dirty
  ""
  ([^TileEntity this]
    (-> this (.markDirty))))

(defn get-render-bounding-box
  "Return an AxisAlignedBB that controls the visible scope of a TileEntitySpecialRenderer associated with this TileEntity
   Defaults to the collision bounding box Block#getCollisionBoundingBoxFromPool(World, int, int, int) associated with the block
   at this location.

  returns: an appropriately size AxisAlignedBB for the TileEntity - `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^TileEntity this]
    (-> this (.getRenderBoundingBox))))

(defn restrict-nbt-copy
  "Determines if the player can overwrite the NBT data of this tile entity while they place it using a ItemStack.
   Added as a fix for MC-75630 - Exploit with signs and command blocks

  returns: True to prevent NBT copy, false to allow. - `boolean`"
  (^Boolean [^TileEntity this]
    (-> this (.restrictNBTCopy))))

