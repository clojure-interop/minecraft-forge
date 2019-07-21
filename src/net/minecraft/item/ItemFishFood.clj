(ns net.minecraft.item.ItemFishFood
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemFishFood]))

(defn ->item-fish-food
  "Constructor.

  cooked - `boolean`"
  (^ItemFishFood [^Boolean cooked]
    (new ItemFishFood cooked)))

(defn get-heal-amount
  "stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^ItemFishFood this ^net.minecraft.item.ItemStack stack]
    (-> this (.getHealAmount stack))))

(defn get-saturation-modifier
  "stack - `net.minecraft.item.ItemStack`

  returns: `float`"
  (^Float [^ItemFishFood this ^net.minecraft.item.ItemStack stack]
    (-> this (.getSaturationModifier stack))))

(defn get-sub-items
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  sub-items - `net.minecraft.util.NonNullList`"
  ([^ItemFishFood this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList sub-items]
    (-> this (.getSubItems item-in tab sub-items))))

(defn get-unlocalized-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^ItemFishFood this ^net.minecraft.item.ItemStack stack]
    (-> this (.getUnlocalizedName stack))))

