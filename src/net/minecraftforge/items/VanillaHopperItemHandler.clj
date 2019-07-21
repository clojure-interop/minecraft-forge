(ns net.minecraftforge.items.VanillaHopperItemHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.items VanillaHopperItemHandler]))

(defn ->vanilla-hopper-item-handler
  "Constructor.

  hopper - `net.minecraft.tileentity.TileEntityHopper`"
  (^VanillaHopperItemHandler [^net.minecraft.tileentity.TileEntityHopper hopper]
    (new VanillaHopperItemHandler hopper)))

(defn insert-item
  "Description copied from interface: IItemHandler

  slot - Slot to insert into. - `int`
  stack - ItemStack to insert. - `net.minecraft.item.ItemStack`
  simulate - If true, the insertion is only simulated - `boolean`

  returns: The remaining ItemStack that was not inserted (if the entire stack is accepted, then return null).
           May be the same as the input ItemStack if unchanged, otherwise a new ItemStack. - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^VanillaHopperItemHandler this ^Integer slot ^net.minecraft.item.ItemStack stack ^Boolean simulate]
    (-> this (.insertItem slot stack simulate))))

