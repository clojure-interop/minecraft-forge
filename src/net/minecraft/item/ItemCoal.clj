(ns net.minecraft.item.ItemCoal
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemCoal]))

(defn ->item-coal
  "Constructor."
  (^ItemCoal []
    (new ItemCoal )))

(defn get-unlocalized-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^ItemCoal this ^net.minecraft.item.ItemStack stack]
    (-> this (.getUnlocalizedName stack))))

(defn get-sub-items
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  sub-items - `net.minecraft.util.NonNullList`"
  ([^ItemCoal this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList sub-items]
    (-> this (.getSubItems item-in tab sub-items))))

