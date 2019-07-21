(ns net.minecraft.tileentity.TileEntityDispenser
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityDispenser]))

(defn ->tile-entity-dispenser
  "Constructor."
  (^TileEntityDispenser []
    (new TileEntityDispenser )))

(defn *register-fixes
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (TileEntityDispenser/registerFixes fixer)))

(defn create-container
  "player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.inventory.Container`"
  (^net.minecraft.inventory.Container [^TileEntityDispenser this ^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.createContainer player-inventory player-in))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityDispenser this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntityDispenser this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn get-gui-id
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityDispenser this]
    (-> this (.getGuiID))))

(defn get-inventory-stack-limit
  "returns: `int`"
  (^Integer [^TileEntityDispenser this]
    (-> this (.getInventoryStackLimit))))

(defn get-dispense-slot
  "returns: `int`"
  (^Integer [^TileEntityDispenser this]
    (-> this (.getDispenseSlot))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityDispenser this]
    (-> this (.getName))))

(defn get-size-inventory
  "returns: `int`"
  (^Integer [^TileEntityDispenser this]
    (-> this (.getSizeInventory))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^TileEntityDispenser this]
    (-> this (.isEmpty))))

(defn add-item-stack
  "stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^TileEntityDispenser this ^net.minecraft.item.ItemStack stack]
    (-> this (.addItemStack stack))))

