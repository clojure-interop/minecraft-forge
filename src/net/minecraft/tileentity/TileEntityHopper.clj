(ns net.minecraft.tileentity.TileEntityHopper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityHopper]))

(defn ->tile-entity-hopper
  "Constructor."
  (^TileEntityHopper []
    (new TileEntityHopper )))

(defn *register-fixes-hopper
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (TileEntityHopper/registerFixesHopper fixer)))

(defn *capture-dropped-items
  "hopper - `net.minecraft.tileentity.IHopper`

  returns: `boolean`"
  (^Boolean [^net.minecraft.tileentity.IHopper hopper]
    (TileEntityHopper/captureDroppedItems hopper)))

(defn *put-drop-in-inventory-all-slots
  "p-145898-0 - `net.minecraft.inventory.IInventory`
  item-in - `net.minecraft.inventory.IInventory`
  p-145898-2 - `net.minecraft.entity.item.EntityItem`

  returns: `boolean`"
  (^Boolean [^net.minecraft.inventory.IInventory p-145898-0 ^net.minecraft.inventory.IInventory item-in ^net.minecraft.entity.item.EntityItem p-145898-2]
    (TileEntityHopper/putDropInInventoryAllSlots p-145898-0 item-in p-145898-2)))

(defn *put-stack-in-inventory-all-slots
  "inventory-in - `net.minecraft.inventory.IInventory`
  stack - `net.minecraft.inventory.IInventory`
  side - `net.minecraft.item.ItemStack`
  p-174918-3 - `net.minecraft.util.EnumFacing`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^net.minecraft.inventory.IInventory inventory-in ^net.minecraft.inventory.IInventory stack ^net.minecraft.item.ItemStack side ^net.minecraft.util.EnumFacing p-174918-3]
    (TileEntityHopper/putStackInInventoryAllSlots inventory-in stack side p-174918-3)))

(defn *get-hopper-inventory
  "hopper - `net.minecraft.tileentity.IHopper`

  returns: `net.minecraft.inventory.IInventory`"
  (^net.minecraft.inventory.IInventory [^net.minecraft.tileentity.IHopper hopper]
    (TileEntityHopper/getHopperInventory hopper)))

(defn *get-capture-items
  "world-in - `net.minecraft.world.World`
  p-184292-1 - `double`
  p-184292-3 - `double`
  p-184292-5 - `double`

  returns: `java.util.List<net.minecraft.entity.item.EntityItem>`"
  (^java.util.List [^net.minecraft.world.World world-in ^Double p-184292-1 ^Double p-184292-3 ^Double p-184292-5]
    (TileEntityHopper/getCaptureItems world-in p-184292-1 p-184292-3 p-184292-5)))

(defn *get-inventory-at-position
  "world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`

  returns: `net.minecraft.inventory.IInventory`"
  (^net.minecraft.inventory.IInventory [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (TileEntityHopper/getInventoryAtPosition world-in x y z)))

(defn create-container
  "player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.inventory.Container`"
  (^net.minecraft.inventory.Container [^TileEntityHopper this ^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.createContainer player-inventory player-in))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityHopper this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntityHopper this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn may-transfer
  "returns: `boolean`"
  (^Boolean [^TileEntityHopper this]
    (-> this (.mayTransfer))))

(defn decr-stack-size
  "index - `int`
  count - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^TileEntityHopper this ^Integer index ^Integer count]
    (-> this (.decrStackSize index count))))

(defn get-gui-id
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityHopper this]
    (-> this (.getGuiID))))

(defn get-inventory-stack-limit
  "returns: `int`"
  (^Integer [^TileEntityHopper this]
    (-> this (.getInventoryStackLimit))))

(defn get-last-update-time
  "returns: `long`"
  (^Long [^TileEntityHopper this]
    (-> this (.getLastUpdateTime))))

(defn update
  ""
  ([^TileEntityHopper this]
    (-> this (.update))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityHopper this]
    (-> this (.getName))))

(defn get-y-pos
  "returns: `double`"
  (^Double [^TileEntityHopper this]
    (-> this (.getYPos))))

(defn set-transfer-cooldown
  "ticks - `int`"
  ([^TileEntityHopper this ^Integer ticks]
    (-> this (.setTransferCooldown ticks))))

(defn get-size-inventory
  "returns: `int`"
  (^Integer [^TileEntityHopper this]
    (-> this (.getSizeInventory))))

(defn set-inventory-slot-contents
  "index - `int`
  stack - `net.minecraft.item.ItemStack`"
  ([^TileEntityHopper this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.setInventorySlotContents index stack))))

(defn get-x-pos
  "returns: `double`"
  (^Double [^TileEntityHopper this]
    (-> this (.getXPos))))

(defn get-z-pos
  "returns: `double`"
  (^Double [^TileEntityHopper this]
    (-> this (.getZPos))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^TileEntityHopper this]
    (-> this (.isEmpty))))

