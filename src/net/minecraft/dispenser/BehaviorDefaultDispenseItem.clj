(ns net.minecraft.dispenser.BehaviorDefaultDispenseItem
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.dispenser BehaviorDefaultDispenseItem]))

(defn ->behavior-default-dispense-item
  "Constructor."
  (^BehaviorDefaultDispenseItem []
    (new BehaviorDefaultDispenseItem )))

(defn *do-dispense
  "world-in - `net.minecraft.world.World`
  stack - `net.minecraft.item.ItemStack`
  speed - `int`
  facing - `net.minecraft.util.EnumFacing`
  position - `net.minecraft.dispenser.IPosition`"
  ([^net.minecraft.world.World world-in ^net.minecraft.item.ItemStack stack ^Integer speed ^net.minecraft.util.EnumFacing facing ^net.minecraft.dispenser.IPosition position]
    (BehaviorDefaultDispenseItem/doDispense world-in stack speed facing position)))

(defn dispense
  "source - `net.minecraft.dispenser.IBlockSource`
  stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^BehaviorDefaultDispenseItem this ^net.minecraft.dispenser.IBlockSource source ^net.minecraft.item.ItemStack stack]
    (-> this (.dispense source stack))))

