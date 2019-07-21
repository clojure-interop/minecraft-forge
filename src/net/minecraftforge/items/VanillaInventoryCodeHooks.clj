(ns net.minecraftforge.items.VanillaInventoryCodeHooks
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.items VanillaInventoryCodeHooks]))

(defn ->vanilla-inventory-code-hooks
  "Constructor."
  (^VanillaInventoryCodeHooks []
    (new VanillaInventoryCodeHooks )))

(defn *extract-hook
  "Copied from TileEntityHopper#captureDroppedItems and added capability support

  dest - `net.minecraft.tileentity.IHopper`

  returns: Null if we did nothing {no IItemHandler}, True if we moved an item, False if we moved no items - `java.lang.Boolean`"
  (^java.lang.Boolean [^net.minecraft.tileentity.IHopper dest]
    (VanillaInventoryCodeHooks/extractHook dest)))

(defn *dropper-insert-hook
  "Copied from BlockDropper#dispense and added capability support

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  dropper - `net.minecraft.tileentity.TileEntityDispenser`
  slot - `int`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.tileentity.TileEntityDispenser dropper ^Integer slot ^net.minecraft.item.ItemStack stack]
    (VanillaInventoryCodeHooks/dropperInsertHook world pos dropper slot stack)))

(defn *insert-hook
  "Copied from TileEntityHopper#transferItemsOut and added capability support

  hopper - `net.minecraft.tileentity.TileEntityHopper`

  returns: `boolean`"
  (^Boolean [^net.minecraft.tileentity.TileEntityHopper hopper]
    (VanillaInventoryCodeHooks/insertHook hopper)))

(defn *get-item-handler
  "world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`
  side - `net.minecraft.util.EnumFacing`

  returns: `org.apache.commons.lang3.tuple.Pair<net.minecraftforge.items.IItemHandler,java.lang.Object>`"
  (^org.apache.commons.lang3.tuple.Pair [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z ^net.minecraft.util.EnumFacing side]
    (VanillaInventoryCodeHooks/getItemHandler world-in x y z side)))

