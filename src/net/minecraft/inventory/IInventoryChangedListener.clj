(ns net.minecraft.inventory.IInventoryChangedListener
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory IInventoryChangedListener]))

(defn on-inventory-changed
  "inv-basic - `net.minecraft.inventory.IInventory`"
  ([^IInventoryChangedListener this ^net.minecraft.inventory.IInventory inv-basic]
    (-> this (.onInventoryChanged inv-basic))))

