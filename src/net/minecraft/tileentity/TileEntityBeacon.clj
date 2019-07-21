(ns net.minecraft.tileentity.TileEntityBeacon
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityBeacon]))

(defn ->tile-entity-beacon
  "Constructor."
  (^TileEntityBeacon []
    (new TileEntityBeacon )))

(def *-effects-list
  "Static Constant.

  type: net.minecraft.potion.Potion[][]"
  TileEntityBeacon/EFFECTS_LIST)

(defn create-container
  "player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.inventory.Container`"
  (^net.minecraft.inventory.Container [^TileEntityBeacon this ^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.createContainer player-inventory player-in))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityBeacon this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn update-beacon
  ""
  ([^TileEntityBeacon this]
    (-> this (.updateBeacon))))

(defn get-beam-segments
  "returns: `java.util.List<net.minecraft.tileentity.TileEntityBeacon$BeamSegment>`"
  (^java.util.List [^TileEntityBeacon this]
    (-> this (.getBeamSegments))))

(defn get-field-count
  "returns: `int`"
  (^Integer [^TileEntityBeacon this]
    (-> this (.getFieldCount))))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntityBeacon this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn get-slots-for-face
  "side - `net.minecraft.util.EnumFacing`

  returns: `int[]`"
  ([^TileEntityBeacon this ^net.minecraft.util.EnumFacing side]
    (-> this (.getSlotsForFace side))))

(defn decr-stack-size
  "index - `int`
  count - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^TileEntityBeacon this ^Integer index ^Integer count]
    (-> this (.decrStackSize index count))))

(defn get-gui-id
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityBeacon this]
    (-> this (.getGuiID))))

(defn remove-stack-from-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^TileEntityBeacon this ^Integer index]
    (-> this (.removeStackFromSlot index))))

(defn get-inventory-stack-limit
  "returns: `int`"
  (^Integer [^TileEntityBeacon this]
    (-> this (.getInventoryStackLimit))))

(defn set-name
  "name - `java.lang.String`"
  ([^TileEntityBeacon this ^java.lang.String name]
    (-> this (.setName name))))

(defn get-update-tag
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityBeacon this]
    (-> this (.getUpdateTag))))

(defn update
  ""
  ([^TileEntityBeacon this]
    (-> this (.update))))

(defn get-max-render-distance-squared
  "returns: `double`"
  (^Double [^TileEntityBeacon this]
    (-> this (.getMaxRenderDistanceSquared))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityBeacon this]
    (-> this (.getName))))

(defn should-beam-render
  "returns: `float`"
  (^Float [^TileEntityBeacon this]
    (-> this (.shouldBeamRender))))

(defn set-field
  "id - `int`
  value - `int`"
  ([^TileEntityBeacon this ^Integer id ^Integer value]
    (-> this (.setField id value))))

(defn get-update-packet
  "returns: `net.minecraft.network.play.server.SPacketUpdateTileEntity`"
  (^net.minecraft.network.play.server.SPacketUpdateTileEntity [^TileEntityBeacon this]
    (-> this (.getUpdatePacket))))

(defn get-field
  "id - `int`

  returns: `int`"
  (^Integer [^TileEntityBeacon this ^Integer id]
    (-> this (.getField id))))

(defn can-insert-item?
  "index - `int`
  item-stack-in - `net.minecraft.item.ItemStack`
  direction - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^TileEntityBeacon this ^Integer index ^net.minecraft.item.ItemStack item-stack-in ^net.minecraft.util.EnumFacing direction]
    (-> this (.canInsertItem index item-stack-in direction))))

(defn has-custom-name?
  "returns: `boolean`"
  (^Boolean [^TileEntityBeacon this]
    (-> this (.hasCustomName))))

(defn get-size-inventory
  "returns: `int`"
  (^Integer [^TileEntityBeacon this]
    (-> this (.getSizeInventory))))

(defn set-inventory-slot-contents
  "index - `int`
  stack - `net.minecraft.item.ItemStack`"
  ([^TileEntityBeacon this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.setInventorySlotContents index stack))))

(defn open-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^TileEntityBeacon this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.openInventory player))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^TileEntityBeacon this]
    (-> this (.isEmpty))))

(defn usable-by-player?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^TileEntityBeacon this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.isUsableByPlayer player))))

(defn can-extract-item?
  "index - `int`
  stack - `net.minecraft.item.ItemStack`
  direction - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^TileEntityBeacon this ^Integer index ^net.minecraft.item.ItemStack stack ^net.minecraft.util.EnumFacing direction]
    (-> this (.canExtractItem index stack direction))))

(defn clear
  ""
  ([^TileEntityBeacon this]
    (-> this (.clear))))

(defn item-valid-for-slot?
  "index - `int`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^TileEntityBeacon this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.isItemValidForSlot index stack))))

(defn receive-client-event
  "id - `int`
  type - `int`

  returns: `boolean`"
  (^Boolean [^TileEntityBeacon this ^Integer id ^Integer type]
    (-> this (.receiveClientEvent id type))))

(defn get-stack-in-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^TileEntityBeacon this ^Integer index]
    (-> this (.getStackInSlot index))))

(defn close-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^TileEntityBeacon this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.closeInventory player))))

