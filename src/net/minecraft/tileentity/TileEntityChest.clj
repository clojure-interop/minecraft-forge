(ns net.minecraft.tileentity.TileEntityChest
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityChest]))

(defn ->tile-entity-chest
  "Constructor.

  type-in - `net.minecraft.block.BlockChest$Type`"
  (^TileEntityChest [^net.minecraft.block.BlockChest$Type type-in]
    (new TileEntityChest type-in))
  (^TileEntityChest []
    (new TileEntityChest )))

(defn adjacent-chest-checked
  "Instance Field.

  type: boolean"
  (^Boolean [^TileEntityChest this]
    (-> this .-adjacentChestChecked)))

(defn adjacent-chest-z-neg
  "Instance Field.

  type: net.minecraft.tileentity.TileEntityChest"
  (^net.minecraft.tileentity.TileEntityChest [^TileEntityChest this]
    (-> this .-adjacentChestZNeg)))

(defn adjacent-chest-x-pos
  "Instance Field.

  type: net.minecraft.tileentity.TileEntityChest"
  (^net.minecraft.tileentity.TileEntityChest [^TileEntityChest this]
    (-> this .-adjacentChestXPos)))

(defn adjacent-chest-x-neg
  "Instance Field.

  type: net.minecraft.tileentity.TileEntityChest"
  (^net.minecraft.tileentity.TileEntityChest [^TileEntityChest this]
    (-> this .-adjacentChestXNeg)))

(defn adjacent-chest-z-pos
  "Instance Field.

  type: net.minecraft.tileentity.TileEntityChest"
  (^net.minecraft.tileentity.TileEntityChest [^TileEntityChest this]
    (-> this .-adjacentChestZPos)))

(defn lid-angle
  "Instance Field.

  type: float"
  (^Float [^TileEntityChest this]
    (-> this .-lidAngle)))

(defn prev-lid-angle
  "Instance Field.

  type: float"
  (^Float [^TileEntityChest this]
    (-> this .-prevLidAngle)))

(defn num-players-using
  "Instance Field.

  type: int"
  (^Integer [^TileEntityChest this]
    (-> this .-numPlayersUsing)))

(defn double-chest-handler
  "Instance Field.

  type: net.minecraftforge.items.VanillaDoubleChestItemHandler"
  (^net.minecraftforge.items.VanillaDoubleChestItemHandler [^TileEntityChest this]
    (-> this .-doubleChestHandler)))

(defn *register-fixes-chest
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (TileEntityChest/registerFixesChest fixer)))

(defn create-container
  "player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.inventory.Container`"
  (^net.minecraft.inventory.Container [^TileEntityChest this ^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.createContainer player-inventory player-in))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityChest this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn update-containing-block-info
  ""
  ([^TileEntityChest this]
    (-> this (.updateContainingBlockInfo))))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntityChest this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn get-gui-id
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityChest this]
    (-> this (.getGuiID))))

(defn get-inventory-stack-limit
  "returns: `int`"
  (^Integer [^TileEntityChest this]
    (-> this (.getInventoryStackLimit))))

(defn update
  ""
  ([^TileEntityChest this]
    (-> this (.update))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityChest this]
    (-> this (.getName))))

(defn get-capability
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: The requested capability. Returns null when ICapabilityProvider.hasCapability(Capability, EnumFacing) would return false. - `<T> T`"
  ([^TileEntityChest this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.getCapability capability facing))))

(defn check-for-adjacent-chests
  ""
  ([^TileEntityChest this]
    (-> this (.checkForAdjacentChests))))

(defn invalidate
  ""
  ([^TileEntityChest this]
    (-> this (.invalidate))))

(defn get-size-inventory
  "returns: `int`"
  (^Integer [^TileEntityChest this]
    (-> this (.getSizeInventory))))

(defn get-single-chest-handler
  "returns: `net.minecraftforge.items.IItemHandler`"
  (^net.minecraftforge.items.IItemHandler [^TileEntityChest this]
    (-> this (.getSingleChestHandler))))

(defn get-chest-type
  "returns: `net.minecraft.block.BlockChest$Type`"
  (^net.minecraft.block.BlockChest$Type [^TileEntityChest this]
    (-> this (.getChestType))))

(defn open-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^TileEntityChest this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.openInventory player))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^TileEntityChest this]
    (-> this (.isEmpty))))

(defn receive-client-event
  "id - `int`
  type - `int`

  returns: `boolean`"
  (^Boolean [^TileEntityChest this ^Integer id ^Integer type]
    (-> this (.receiveClientEvent id type))))

(defn close-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^TileEntityChest this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.closeInventory player))))

