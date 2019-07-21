(ns net.minecraftforge.items.wrapper.PlayerArmorInvWrapper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.items.wrapper PlayerArmorInvWrapper]))

(defn ->player-armor-inv-wrapper
  "Constructor.

  inv - `net.minecraft.entity.player.InventoryPlayer`"
  (^PlayerArmorInvWrapper [^net.minecraft.entity.player.InventoryPlayer inv]
    (new PlayerArmorInvWrapper inv)))

(defn insert-item
  "Description copied from interface: IItemHandler

  slot - Slot to insert into. - `int`
  stack - ItemStack to insert. - `net.minecraft.item.ItemStack`
  simulate - If true, the insertion is only simulated - `boolean`

  returns: The remaining ItemStack that was not inserted (if the entire stack is accepted, then return null).
           May be the same as the input ItemStack if unchanged, otherwise a new ItemStack. - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^PlayerArmorInvWrapper this ^Integer slot ^net.minecraft.item.ItemStack stack ^Boolean simulate]
    (-> this (.insertItem slot stack simulate))))

(defn get-inventory-player
  "returns: `net.minecraft.entity.player.InventoryPlayer`"
  (^net.minecraft.entity.player.InventoryPlayer [^PlayerArmorInvWrapper this]
    (-> this (.getInventoryPlayer))))

