(ns net.minecraftforge.fml.common.IFuelHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common IFuelHandler]))

(defn get-burn-time
  "fuel - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^IFuelHandler this ^net.minecraft.item.ItemStack fuel]
    (-> this (.getBurnTime fuel))))

