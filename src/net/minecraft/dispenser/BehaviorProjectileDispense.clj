(ns net.minecraft.dispenser.BehaviorProjectileDispense
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.dispenser BehaviorProjectileDispense]))

(defn ->behavior-projectile-dispense
  "Constructor."
  (^BehaviorProjectileDispense []
    (new BehaviorProjectileDispense )))

(defn dispense-stack
  "source - `net.minecraft.dispenser.IBlockSource`
  stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^BehaviorProjectileDispense this ^net.minecraft.dispenser.IBlockSource source ^net.minecraft.item.ItemStack stack]
    (-> this (.dispenseStack source stack))))

