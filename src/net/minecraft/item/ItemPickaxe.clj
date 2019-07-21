(ns net.minecraft.item.ItemPickaxe
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemPickaxe]))

(defn can-harvest-block?
  "block-in - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^ItemPickaxe this ^net.minecraft.block.state.IBlockState block-in]
    (-> this (.canHarvestBlock block-in))))

(defn get-str-vs-block
  "stack - `net.minecraft.item.ItemStack`
  state - `net.minecraft.block.state.IBlockState`

  returns: `float`"
  (^Float [^ItemPickaxe this ^net.minecraft.item.ItemStack stack ^net.minecraft.block.state.IBlockState state]
    (-> this (.getStrVsBlock stack state))))

