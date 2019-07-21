(ns net.minecraft.client.renderer.color.IItemColor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.color IItemColor]))

(defn get-color-from-itemstack
  "stack - `net.minecraft.item.ItemStack`
  tint-index - `int`

  returns: `int`"
  (^Integer [^IItemColor this ^net.minecraft.item.ItemStack stack ^Integer tint-index]
    (-> this (.getColorFromItemstack stack tint-index))))

