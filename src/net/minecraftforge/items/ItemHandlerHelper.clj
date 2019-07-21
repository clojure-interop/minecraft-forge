(ns net.minecraftforge.items.ItemHandlerHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.items ItemHandlerHelper]))

(defn ->item-handler-helper
  "Constructor."
  (^ItemHandlerHelper []
    (new ItemHandlerHelper )))

(defn *insert-item
  "dest - `net.minecraftforge.items.IItemHandler`
  stack - `net.minecraft.item.ItemStack`
  simulate - `boolean`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^net.minecraftforge.items.IItemHandler dest ^net.minecraft.item.ItemStack stack ^Boolean simulate]
    (ItemHandlerHelper/insertItem dest stack simulate)))

(defn *can-item-stacks-stack?
  "a - `net.minecraft.item.ItemStack`
  b - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack a ^net.minecraft.item.ItemStack b]
    (ItemHandlerHelper/canItemStacksStack a b)))

(defn *can-item-stacks-stack-relaxed?
  "A relaxed version of canItemStacksStack that stacks itemstacks with different metadata if they don't have subtypes.
   This usually only applies when players pick up items.

  a - `net.minecraft.item.ItemStack`
  b - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack a ^net.minecraft.item.ItemStack b]
    (ItemHandlerHelper/canItemStacksStackRelaxed a b)))

(defn *copy-stack-with-size
  "item-stack - `net.minecraft.item.ItemStack`
  size - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^net.minecraft.item.ItemStack item-stack ^Integer size]
    (ItemHandlerHelper/copyStackWithSize item-stack size)))

(defn *insert-item-stacked
  "Inserts the ItemStack into the inventory, filling up already present stacks first.
   This is equivalent to the behaviour of a player picking up an item.
   Note: This function stacks items without subtypes with different metadata together.

  inventory - `net.minecraftforge.items.IItemHandler`
  stack - `net.minecraft.item.ItemStack`
  simulate - `boolean`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^net.minecraftforge.items.IItemHandler inventory ^net.minecraft.item.ItemStack stack ^Boolean simulate]
    (ItemHandlerHelper/insertItemStacked inventory stack simulate)))

(defn *give-item-to-player
  "Inserts the given itemstack into the players inventory.
   If the inventory can't hold it, the item will be dropped in the world at the players position.

  player - The player to give the item to - `net.minecraft.entity.player.EntityPlayer`
  stack - The itemstack to insert - `net.minecraft.item.ItemStack`
  preferred-slot - `int`"
  ([^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack stack ^Integer preferred-slot]
    (ItemHandlerHelper/giveItemToPlayer player stack preferred-slot))
  ([^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack stack]
    (ItemHandlerHelper/giveItemToPlayer player stack)))

(defn *calc-redstone-from-inventory
  "This method uses the standard vanilla algorithm to calculate a comparator output for how \"full\" the inventory is.
   This method is an adaptation of Container#calcRedstoneFromInventory(IInventory).

  inv - The inventory handler to test. - `net.minecraftforge.items.IItemHandler`

  returns: A redstone value in the range [0,15] representing how \"full\" this inventory is. - `int`"
  (^Integer [^net.minecraftforge.items.IItemHandler inv]
    (ItemHandlerHelper/calcRedstoneFromInventory inv)))

