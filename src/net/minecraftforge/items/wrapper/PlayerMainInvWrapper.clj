(ns net.minecraftforge.items.wrapper.PlayerMainInvWrapper
  "Exposes the player inventory WITHOUT the armor inventory as IItemHandler.
  Also takes core of inserting/extracting having the same logic as picking up items."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.items.wrapper PlayerMainInvWrapper]))

(defn ->player-main-inv-wrapper
  "Constructor.

  inv - `net.minecraft.entity.player.InventoryPlayer`"
  (^PlayerMainInvWrapper [^net.minecraft.entity.player.InventoryPlayer inv]
    (new PlayerMainInvWrapper inv)))

(defn insert-item
  "Description copied from interface: IItemHandler

  slot - Slot to insert into. - `int`
  stack - ItemStack to insert. - `net.minecraft.item.ItemStack`
  simulate - If true, the insertion is only simulated - `boolean`

  returns: The remaining ItemStack that was not inserted (if the entire stack is accepted, then return null).
           May be the same as the input ItemStack if unchanged, otherwise a new ItemStack. - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^PlayerMainInvWrapper this ^Integer slot ^net.minecraft.item.ItemStack stack ^Boolean simulate]
    (-> this (.insertItem slot stack simulate))))

(defn get-inventory-player
  "returns: `net.minecraft.entity.player.InventoryPlayer`"
  (^net.minecraft.entity.player.InventoryPlayer [^PlayerMainInvWrapper this]
    (-> this (.getInventoryPlayer))))

