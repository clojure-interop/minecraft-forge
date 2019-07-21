(ns net.minecraft.dispenser.IBehaviorDispenseItem
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.dispenser IBehaviorDispenseItem]))

(defn dispense
  "source - `net.minecraft.dispenser.IBlockSource`
  stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^IBehaviorDispenseItem this ^net.minecraft.dispenser.IBlockSource source ^net.minecraft.item.ItemStack stack]
    (-> this (.dispense source stack))))

