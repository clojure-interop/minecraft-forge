(ns net.minecraft.tileentity.TileEntityShulkerBox
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityShulkerBox]))

(defn ->tile-entity-shulker-box
  "Constructor.

  color-in - `net.minecraft.item.EnumDyeColor`"
  (^TileEntityShulkerBox [^net.minecraft.item.EnumDyeColor color-in]
    (new TileEntityShulkerBox color-in))
  (^TileEntityShulkerBox []
    (new TileEntityShulkerBox )))

(defn *register-fixes-shulker-box
  "p-190593-0 - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer p-190593-0]
    (TileEntityShulkerBox/registerFixesShulkerBox p-190593-0)))

(defn create-container
  "player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.inventory.Container`"
  (^net.minecraft.inventory.Container [^TileEntityShulkerBox this ^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.createContainer player-inventory player-in))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityShulkerBox this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntityShulkerBox this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn get-slots-for-face
  "side - `net.minecraft.util.EnumFacing`

  returns: `int[]`"
  ([^TileEntityShulkerBox this ^net.minecraft.util.EnumFacing side]
    (-> this (.getSlotsForFace side))))

(defn cleared?
  "returns: `boolean`"
  (^Boolean [^TileEntityShulkerBox this]
    (-> this (.isCleared))))

(defn get-gui-id
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityShulkerBox this]
    (-> this (.getGuiID))))

(defn get-inventory-stack-limit
  "returns: `int`"
  (^Integer [^TileEntityShulkerBox this]
    (-> this (.getInventoryStackLimit))))

(defn get-progress
  "p-190585-1 - `float`

  returns: `float`"
  (^Float [^TileEntityShulkerBox this ^Float p-190585-1]
    (-> this (.getProgress p-190585-1))))

(defn update
  ""
  ([^TileEntityShulkerBox this]
    (-> this (.update))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityShulkerBox this]
    (-> this (.getName))))

(defn get-update-packet
  "returns: `net.minecraft.network.play.server.SPacketUpdateTileEntity`"
  (^net.minecraft.network.play.server.SPacketUpdateTileEntity [^TileEntityShulkerBox this]
    (-> this (.getUpdatePacket))))

(defn save-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityShulkerBox this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.saveToNbt compound))))

(defn can-insert-item?
  "index - `int`
  item-stack-in - `net.minecraft.item.ItemStack`
  direction - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^TileEntityShulkerBox this ^Integer index ^net.minecraft.item.ItemStack item-stack-in ^net.minecraft.util.EnumFacing direction]
    (-> this (.canInsertItem index item-stack-in direction))))

(defn destroyed-by-creative-player?
  "returns: `boolean`"
  (^Boolean [^TileEntityShulkerBox this]
    (-> this (.isDestroyedByCreativePlayer))))

(defn get-size-inventory
  "returns: `int`"
  (^Integer [^TileEntityShulkerBox this]
    (-> this (.getSizeInventory))))

(defn load-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntityShulkerBox this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.loadFromNbt compound))))

(defn open-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^TileEntityShulkerBox this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.openInventory player))))

(defn should-drop?
  "returns: `boolean`"
  (^Boolean [^TileEntityShulkerBox this]
    (-> this (.shouldDrop))))

(defn set-destroyed-by-creative-player
  "p-190579-1 - `boolean`"
  ([^TileEntityShulkerBox this ^Boolean p-190579-1]
    (-> this (.setDestroyedByCreativePlayer p-190579-1))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^TileEntityShulkerBox this]
    (-> this (.isEmpty))))

(defn can-extract-item?
  "index - `int`
  stack - `net.minecraft.item.ItemStack`
  direction - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^TileEntityShulkerBox this ^Integer index ^net.minecraft.item.ItemStack stack ^net.minecraft.util.EnumFacing direction]
    (-> this (.canExtractItem index stack direction))))

(defn clear
  ""
  ([^TileEntityShulkerBox this]
    (-> this (.clear))))

(defn get-color
  "returns: `net.minecraft.item.EnumDyeColor`"
  (^net.minecraft.item.EnumDyeColor [^TileEntityShulkerBox this]
    (-> this (.getColor))))

(defn get-bounding-box
  "p-190584-1 - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^TileEntityShulkerBox this ^net.minecraft.block.state.IBlockState p-190584-1]
    (-> this (.getBoundingBox p-190584-1))))

(defn receive-client-event
  "id - `int`
  type - `int`

  returns: `boolean`"
  (^Boolean [^TileEntityShulkerBox this ^Integer id ^Integer type]
    (-> this (.receiveClientEvent id type))))

(defn get-animation-status
  "returns: `net.minecraft.tileentity.TileEntityShulkerBox$AnimationStatus`"
  (^net.minecraft.tileentity.TileEntityShulkerBox$AnimationStatus [^TileEntityShulkerBox this]
    (-> this (.getAnimationStatus))))

(defn close-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^TileEntityShulkerBox this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.closeInventory player))))

