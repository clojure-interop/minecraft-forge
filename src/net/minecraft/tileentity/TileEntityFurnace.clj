(ns net.minecraft.tileentity.TileEntityFurnace
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityFurnace]))

(defn ->tile-entity-furnace
  "Constructor."
  (^TileEntityFurnace []
    (new TileEntityFurnace )))

(defn *register-fixes-furnace
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (TileEntityFurnace/registerFixesFurnace fixer)))

(defn *burning?
  "inventory - `net.minecraft.inventory.IInventory`

  returns: `boolean`"
  (^Boolean [^net.minecraft.inventory.IInventory inventory]
    (TileEntityFurnace/isBurning inventory)))

(defn *get-item-burn-time
  "stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^net.minecraft.item.ItemStack stack]
    (TileEntityFurnace/getItemBurnTime stack)))

(defn *item-fuel?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack stack]
    (TileEntityFurnace/isItemFuel stack)))

(defn create-container
  "player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.inventory.Container`"
  (^net.minecraft.inventory.Container [^TileEntityFurnace this ^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.createContainer player-inventory player-in))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityFurnace this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn get-cook-time
  "stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^TileEntityFurnace this ^net.minecraft.item.ItemStack stack]
    (-> this (.getCookTime stack))))

(defn get-field-count
  "returns: `int`"
  (^Integer [^TileEntityFurnace this]
    (-> this (.getFieldCount))))

(defn burning?
  "returns: `boolean`"
  (^Boolean [^TileEntityFurnace this]
    (-> this (.isBurning))))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntityFurnace this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn get-slots-for-face
  "side - `net.minecraft.util.EnumFacing`

  returns: `int[]`"
  ([^TileEntityFurnace this ^net.minecraft.util.EnumFacing side]
    (-> this (.getSlotsForFace side))))

(defn decr-stack-size
  "index - `int`
  count - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^TileEntityFurnace this ^Integer index ^Integer count]
    (-> this (.decrStackSize index count))))

(defn get-gui-id
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityFurnace this]
    (-> this (.getGuiID))))

(defn remove-stack-from-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^TileEntityFurnace this ^Integer index]
    (-> this (.removeStackFromSlot index))))

(defn get-inventory-stack-limit
  "returns: `int`"
  (^Integer [^TileEntityFurnace this]
    (-> this (.getInventoryStackLimit))))

(defn update
  ""
  ([^TileEntityFurnace this]
    (-> this (.update))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityFurnace this]
    (-> this (.getName))))

(defn set-field
  "id - `int`
  value - `int`"
  ([^TileEntityFurnace this ^Integer id ^Integer value]
    (-> this (.setField id value))))

(defn get-capability
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: The requested capability. Returns null when ICapabilityProvider.hasCapability(Capability, EnumFacing) would return false. - `<T> T`"
  ([^TileEntityFurnace this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.getCapability capability facing))))

(defn get-field
  "id - `int`

  returns: `int`"
  (^Integer [^TileEntityFurnace this ^Integer id]
    (-> this (.getField id))))

(defn can-insert-item?
  "index - `int`
  item-stack-in - `net.minecraft.item.ItemStack`
  direction - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^TileEntityFurnace this ^Integer index ^net.minecraft.item.ItemStack item-stack-in ^net.minecraft.util.EnumFacing direction]
    (-> this (.canInsertItem index item-stack-in direction))))

(defn has-custom-name?
  "returns: `boolean`"
  (^Boolean [^TileEntityFurnace this]
    (-> this (.hasCustomName))))

(defn get-size-inventory
  "returns: `int`"
  (^Integer [^TileEntityFurnace this]
    (-> this (.getSizeInventory))))

(defn set-inventory-slot-contents
  "index - `int`
  stack - `net.minecraft.item.ItemStack`"
  ([^TileEntityFurnace this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.setInventorySlotContents index stack))))

(defn open-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^TileEntityFurnace this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.openInventory player))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^TileEntityFurnace this]
    (-> this (.isEmpty))))

(defn usable-by-player?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^TileEntityFurnace this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.isUsableByPlayer player))))

(defn can-extract-item?
  "index - `int`
  stack - `net.minecraft.item.ItemStack`
  direction - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^TileEntityFurnace this ^Integer index ^net.minecraft.item.ItemStack stack ^net.minecraft.util.EnumFacing direction]
    (-> this (.canExtractItem index stack direction))))

(defn clear
  ""
  ([^TileEntityFurnace this]
    (-> this (.clear))))

(defn smelt-item
  ""
  ([^TileEntityFurnace this]
    (-> this (.smeltItem))))

(defn item-valid-for-slot?
  "index - `int`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^TileEntityFurnace this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.isItemValidForSlot index stack))))

(defn set-custom-inventory-name
  "p-145951-1 - `java.lang.String`"
  ([^TileEntityFurnace this ^java.lang.String p-145951-1]
    (-> this (.setCustomInventoryName p-145951-1))))

(defn get-stack-in-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^TileEntityFurnace this ^Integer index]
    (-> this (.getStackInSlot index))))

(defn close-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^TileEntityFurnace this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.closeInventory player))))

