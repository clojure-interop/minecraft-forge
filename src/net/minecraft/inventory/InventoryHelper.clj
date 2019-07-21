(ns net.minecraft.inventory.InventoryHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory InventoryHelper]))

(defn ->inventory-helper
  "Constructor."
  (^InventoryHelper []
    (new InventoryHelper )))

(defn *drop-inventory-items
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  inventory - `net.minecraft.inventory.IInventory`"
  ([^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.inventory.IInventory inventory]
    (InventoryHelper/dropInventoryItems world-in pos inventory)))

(defn *spawn-item-stack
  "world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`
  stack - `net.minecraft.item.ItemStack`"
  ([^net.minecraft.world.World world-in ^Double x ^Double y ^Double z ^net.minecraft.item.ItemStack stack]
    (InventoryHelper/spawnItemStack world-in x y z stack)))

