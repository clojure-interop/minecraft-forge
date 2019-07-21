(ns net.minecraftforge.fluids.DispenseFluidContainer
  "Fills or drains a fluid container item using a Dispenser."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids DispenseFluidContainer]))

(defn *get-instance
  "returns: `net.minecraftforge.fluids.DispenseFluidContainer`"
  (^net.minecraftforge.fluids.DispenseFluidContainer []
    (DispenseFluidContainer/getInstance )))

(defn dispense-stack
  "source - `net.minecraft.dispenser.IBlockSource`
  stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^DispenseFluidContainer this ^net.minecraft.dispenser.IBlockSource source ^net.minecraft.item.ItemStack stack]
    (-> this (.dispenseStack source stack))))

