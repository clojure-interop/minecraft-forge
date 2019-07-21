(ns net.minecraft.item.ItemAxe
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemAxe]))

(defn get-str-vs-block
  "stack - `net.minecraft.item.ItemStack`
  state - `net.minecraft.block.state.IBlockState`

  returns: `float`"
  (^Float [^ItemAxe this ^net.minecraft.item.ItemStack stack ^net.minecraft.block.state.IBlockState state]
    (-> this (.getStrVsBlock stack state))))

