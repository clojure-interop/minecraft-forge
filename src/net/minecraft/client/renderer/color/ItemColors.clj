(ns net.minecraft.client.renderer.color.ItemColors
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.color ItemColors]))

(defn ->item-colors
  "Constructor."
  (^ItemColors []
    (new ItemColors )))

(defn *init
  "colors - `net.minecraft.client.renderer.color.BlockColors`

  returns: `net.minecraft.client.renderer.color.ItemColors`"
  (^net.minecraft.client.renderer.color.ItemColors [^net.minecraft.client.renderer.color.BlockColors colors]
    (ItemColors/init colors)))

(defn get-color-from-itemstack
  "stack - `net.minecraft.item.ItemStack`
  tint-index - `int`

  returns: `int`"
  (^Integer [^ItemColors this ^net.minecraft.item.ItemStack stack ^Integer tint-index]
    (-> this (.getColorFromItemstack stack tint-index))))

(defn register-item-color-handler
  "item-color - `net.minecraft.client.renderer.color.IItemColor`
  blocks-in - `net.minecraft.block.Block`"
  ([^ItemColors this ^net.minecraft.client.renderer.color.IItemColor item-color ^net.minecraft.block.Block blocks-in]
    (-> this (.registerItemColorHandler item-color blocks-in))))

