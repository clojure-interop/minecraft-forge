(ns net.minecraft.item.ItemChorusFruit
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemChorusFruit]))

(defn ->item-chorus-fruit
  "Constructor.

  amount - `int`
  saturation - `float`"
  (^ItemChorusFruit [^Integer amount ^Float saturation]
    (new ItemChorusFruit amount saturation)))

(defn on-item-use-finish
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  entity-living - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ItemChorusFruit this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase entity-living]
    (-> this (.onItemUseFinish stack world-in entity-living))))

