(ns net.minecraft.entity.item.EntityMinecartContainer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityMinecartContainer]))

(defn ->entity-minecart-container
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntityMinecartContainer [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntityMinecartContainer world-in x y z))
  (^EntityMinecartContainer [^net.minecraft.world.World world-in]
    (new EntityMinecartContainer world-in)))

(defn drop-contents-when-dead
  "Instance Field.

  type: boolean"
  (^Boolean [^EntityMinecartContainer this]
    (-> this .-dropContentsWhenDead)))

(defn item-handler
  "Instance Field.

  type: net.minecraftforge.items.IItemHandler"
  (^net.minecraftforge.items.IItemHandler [^EntityMinecartContainer this]
    (-> this .-itemHandler)))

(defn *add-data-fixers
  "p-190574-0 - `net.minecraft.util.datafix.DataFixer`
  p-190574-1 - `java.lang.Class`"
  ([^net.minecraft.util.datafix.DataFixer p-190574-0 ^java.lang.Class p-190574-1]
    (EntityMinecartContainer/addDataFixers p-190574-0 p-190574-1)))

(defn set-loot-table
  "loot-table-in - `net.minecraft.util.ResourceLocation`
  loot-table-seed-in - `long`"
  ([^EntityMinecartContainer this ^net.minecraft.util.ResourceLocation loot-table-in ^Long loot-table-seed-in]
    (-> this (.setLootTable loot-table-in loot-table-seed-in))))

(defn get-field-count
  "returns: `int`"
  (^Integer [^EntityMinecartContainer this]
    (-> this (.getFieldCount))))

(defn locked?
  "returns: `boolean`"
  (^Boolean [^EntityMinecartContainer this]
    (-> this (.isLocked))))

(defn decr-stack-size
  "index - `int`
  count - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^EntityMinecartContainer this ^Integer index ^Integer count]
    (-> this (.decrStackSize index count))))

(defn remove-stack-from-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^EntityMinecartContainer this ^Integer index]
    (-> this (.removeStackFromSlot index))))

(defn get-inventory-stack-limit
  "returns: `int`"
  (^Integer [^EntityMinecartContainer this]
    (-> this (.getInventoryStackLimit))))

(defn process-initial-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityMinecartContainer this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInitialInteract player hand))))

(defn set-field
  "id - `int`
  value - `int`"
  ([^EntityMinecartContainer this ^Integer id ^Integer value]
    (-> this (.setField id value))))

(defn kill-minecart
  "source - `net.minecraft.util.DamageSource`"
  ([^EntityMinecartContainer this ^net.minecraft.util.DamageSource source]
    (-> this (.killMinecart source))))

(defn get-capability
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: The requested capability. Returns null when ICapabilityProvider.hasCapability(Capability, EnumFacing) would return false. - `<T> T`"
  ([^EntityMinecartContainer this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.getCapability capability facing))))

(defn get-field
  "id - `int`

  returns: `int`"
  (^Integer [^EntityMinecartContainer this ^Integer id]
    (-> this (.getField id))))

(defn has-capability?
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: True if this object supports the capability. - `boolean`"
  (^Boolean [^EntityMinecartContainer this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.hasCapability capability facing))))

(defn set-lock-code
  "code - `net.minecraft.world.LockCode`"
  ([^EntityMinecartContainer this ^net.minecraft.world.LockCode code]
    (-> this (.setLockCode code))))

(defn get-lock-code
  "returns: `net.minecraft.world.LockCode`"
  (^net.minecraft.world.LockCode [^EntityMinecartContainer this]
    (-> this (.getLockCode))))

(defn set-inventory-slot-contents
  "index - `int`
  stack - `net.minecraft.item.ItemStack`"
  ([^EntityMinecartContainer this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.setInventorySlotContents index stack))))

(defn open-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^EntityMinecartContainer this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.openInventory player))))

(defn get-loot-table
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^EntityMinecartContainer this]
    (-> this (.getLootTable))))

(defn add-loot
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^EntityMinecartContainer this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.addLoot player))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^EntityMinecartContainer this]
    (-> this (.isEmpty))))

(defn usable-by-player?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^EntityMinecartContainer this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.isUsableByPlayer player))))

(defn clear
  ""
  ([^EntityMinecartContainer this]
    (-> this (.clear))))

(defn set-drop-items-when-dead
  "drop-when-dead - `boolean`"
  ([^EntityMinecartContainer this ^Boolean drop-when-dead]
    (-> this (.setDropItemsWhenDead drop-when-dead))))

(defn item-valid-for-slot?
  "index - `int`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^EntityMinecartContainer this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.isItemValidForSlot index stack))))

(defn set-dead
  ""
  ([^EntityMinecartContainer this]
    (-> this (.setDead))))

(defn mark-dirty
  ""
  ([^EntityMinecartContainer this]
    (-> this (.markDirty))))

(defn change-dimension
  "dimension-in - `int`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^EntityMinecartContainer this ^Integer dimension-in]
    (-> this (.changeDimension dimension-in))))

(defn get-stack-in-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^EntityMinecartContainer this ^Integer index]
    (-> this (.getStackInSlot index))))

(defn close-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^EntityMinecartContainer this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.closeInventory player))))

