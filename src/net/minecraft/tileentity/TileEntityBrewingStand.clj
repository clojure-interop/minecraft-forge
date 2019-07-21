(ns net.minecraft.tileentity.TileEntityBrewingStand
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityBrewingStand]))

(defn ->tile-entity-brewing-stand
  "Constructor."
  (^TileEntityBrewingStand []
    (new TileEntityBrewingStand )))

(defn *register-fixes-brewing-stand
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (TileEntityBrewingStand/registerFixesBrewingStand fixer)))

(defn create-filled-slots-array
  "returns: `boolean[]`"
  ([^TileEntityBrewingStand this]
    (-> this (.createFilledSlotsArray))))

(defn create-container
  "player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.inventory.Container`"
  (^net.minecraft.inventory.Container [^TileEntityBrewingStand this ^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.createContainer player-inventory player-in))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityBrewingStand this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn get-field-count
  "returns: `int`"
  (^Integer [^TileEntityBrewingStand this]
    (-> this (.getFieldCount))))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntityBrewingStand this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn get-slots-for-face
  "side - `net.minecraft.util.EnumFacing`

  returns: `int[]`"
  ([^TileEntityBrewingStand this ^net.minecraft.util.EnumFacing side]
    (-> this (.getSlotsForFace side))))

(defn decr-stack-size
  "index - `int`
  count - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^TileEntityBrewingStand this ^Integer index ^Integer count]
    (-> this (.decrStackSize index count))))

(defn get-gui-id
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityBrewingStand this]
    (-> this (.getGuiID))))

(defn remove-stack-from-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^TileEntityBrewingStand this ^Integer index]
    (-> this (.removeStackFromSlot index))))

(defn get-inventory-stack-limit
  "returns: `int`"
  (^Integer [^TileEntityBrewingStand this]
    (-> this (.getInventoryStackLimit))))

(defn set-name
  "name - `java.lang.String`"
  ([^TileEntityBrewingStand this ^java.lang.String name]
    (-> this (.setName name))))

(defn update
  ""
  ([^TileEntityBrewingStand this]
    (-> this (.update))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityBrewingStand this]
    (-> this (.getName))))

(defn set-field
  "id - `int`
  value - `int`"
  ([^TileEntityBrewingStand this ^Integer id ^Integer value]
    (-> this (.setField id value))))

(defn get-capability
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: The requested capability. Returns null when ICapabilityProvider.hasCapability(Capability, EnumFacing) would return false. - `<T> T`"
  ([^TileEntityBrewingStand this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.getCapability capability facing))))

(defn get-field
  "id - `int`

  returns: `int`"
  (^Integer [^TileEntityBrewingStand this ^Integer id]
    (-> this (.getField id))))

(defn can-insert-item?
  "index - `int`
  item-stack-in - `net.minecraft.item.ItemStack`
  direction - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^TileEntityBrewingStand this ^Integer index ^net.minecraft.item.ItemStack item-stack-in ^net.minecraft.util.EnumFacing direction]
    (-> this (.canInsertItem index item-stack-in direction))))

(defn has-custom-name?
  "returns: `boolean`"
  (^Boolean [^TileEntityBrewingStand this]
    (-> this (.hasCustomName))))

(defn get-size-inventory
  "returns: `int`"
  (^Integer [^TileEntityBrewingStand this]
    (-> this (.getSizeInventory))))

(defn set-inventory-slot-contents
  "index - `int`
  stack - `net.minecraft.item.ItemStack`"
  ([^TileEntityBrewingStand this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.setInventorySlotContents index stack))))

(defn open-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^TileEntityBrewingStand this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.openInventory player))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^TileEntityBrewingStand this]
    (-> this (.isEmpty))))

(defn usable-by-player?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^TileEntityBrewingStand this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.isUsableByPlayer player))))

(defn can-extract-item?
  "index - `int`
  stack - `net.minecraft.item.ItemStack`
  direction - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^TileEntityBrewingStand this ^Integer index ^net.minecraft.item.ItemStack stack ^net.minecraft.util.EnumFacing direction]
    (-> this (.canExtractItem index stack direction))))

(defn clear
  ""
  ([^TileEntityBrewingStand this]
    (-> this (.clear))))

(defn item-valid-for-slot?
  "index - `int`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^TileEntityBrewingStand this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.isItemValidForSlot index stack))))

(defn get-stack-in-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^TileEntityBrewingStand this ^Integer index]
    (-> this (.getStackInSlot index))))

(defn close-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^TileEntityBrewingStand this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.closeInventory player))))

