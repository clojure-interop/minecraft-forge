(ns net.minecraft.inventory.SlotCrafting
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory SlotCrafting]))

(defn ->slot-crafting
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  crafting-inventory - `net.minecraft.inventory.InventoryCrafting`
  inventory-in - `net.minecraft.inventory.IInventory`
  slot-index - `int`
  x-position - `int`
  y-position - `int`"
  (^SlotCrafting [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.inventory.InventoryCrafting crafting-inventory ^net.minecraft.inventory.IInventory inventory-in ^Integer slot-index ^Integer x-position ^Integer y-position]
    (new SlotCrafting player crafting-inventory inventory-in slot-index x-position y-position)))

(defn item-valid?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^SlotCrafting this ^net.minecraft.item.ItemStack stack]
    (-> this (.isItemValid stack))))

(defn decr-stack-size
  "amount - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^SlotCrafting this ^Integer amount]
    (-> this (.decrStackSize amount))))

(defn on-take
  "the-player - `net.minecraft.entity.player.EntityPlayer`
  stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^SlotCrafting this ^net.minecraft.entity.player.EntityPlayer the-player ^net.minecraft.item.ItemStack stack]
    (-> this (.onTake the-player stack))))

