(ns net.minecraft.inventory.SlotMerchantResult
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory SlotMerchantResult]))

(defn ->slot-merchant-result
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  merchant - `net.minecraft.entity.IMerchant`
  merchant-inventory - `net.minecraft.inventory.InventoryMerchant`
  slot-index - `int`
  x-position - `int`
  y-position - `int`"
  (^SlotMerchantResult [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.entity.IMerchant merchant ^net.minecraft.inventory.InventoryMerchant merchant-inventory ^Integer slot-index ^Integer x-position ^Integer y-position]
    (new SlotMerchantResult player merchant merchant-inventory slot-index x-position y-position)))

(defn item-valid?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^SlotMerchantResult this ^net.minecraft.item.ItemStack stack]
    (-> this (.isItemValid stack))))

(defn decr-stack-size
  "amount - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^SlotMerchantResult this ^Integer amount]
    (-> this (.decrStackSize amount))))

(defn on-take
  "the-player - `net.minecraft.entity.player.EntityPlayer`
  stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^SlotMerchantResult this ^net.minecraft.entity.player.EntityPlayer the-player ^net.minecraft.item.ItemStack stack]
    (-> this (.onTake the-player stack))))

