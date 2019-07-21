(ns net.minecraft.init.Bootstrap$BehaviorDispenseBoat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.init Bootstrap$BehaviorDispenseBoat]))

(defn ->behavior-dispense-boat
  "Constructor.

  boat-type-in - `net.minecraft.entity.item.EntityBoat$Type`"
  (^Bootstrap$BehaviorDispenseBoat [^net.minecraft.entity.item.EntityBoat$Type boat-type-in]
    (new Bootstrap$BehaviorDispenseBoat boat-type-in)))

(defn dispense-stack
  "source - `net.minecraft.dispenser.IBlockSource`
  stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^Bootstrap$BehaviorDispenseBoat this ^net.minecraft.dispenser.IBlockSource source ^net.minecraft.item.ItemStack stack]
    (-> this (.dispenseStack source stack))))

