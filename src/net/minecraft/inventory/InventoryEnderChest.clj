(ns net.minecraft.inventory.InventoryEnderChest
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory InventoryEnderChest]))

(defn ->inventory-ender-chest
  "Constructor."
  (^InventoryEnderChest []
    (new InventoryEnderChest )))

(defn set-chest-tile-entity
  "chest-tile-entity - `net.minecraft.tileentity.TileEntityEnderChest`"
  ([^InventoryEnderChest this ^net.minecraft.tileentity.TileEntityEnderChest chest-tile-entity]
    (-> this (.setChestTileEntity chest-tile-entity))))

(defn load-inventory-from-nbt
  "p-70486-1 - `net.minecraft.nbt.NBTTagList`"
  ([^InventoryEnderChest this ^net.minecraft.nbt.NBTTagList p-70486-1]
    (-> this (.loadInventoryFromNBT p-70486-1))))

(defn save-inventory-to-nbt
  "returns: `net.minecraft.nbt.NBTTagList`"
  (^net.minecraft.nbt.NBTTagList [^InventoryEnderChest this]
    (-> this (.saveInventoryToNBT))))

(defn usable-by-player?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^InventoryEnderChest this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.isUsableByPlayer player))))

(defn open-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^InventoryEnderChest this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.openInventory player))))

(defn close-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^InventoryEnderChest this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.closeInventory player))))

