(ns net.minecraft.item.ItemSoup
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemSoup]))

(defn ->item-soup
  "Constructor.

  heal-amount - `int`"
  (^ItemSoup [^Integer heal-amount]
    (new ItemSoup heal-amount)))

(defn on-item-use-finish
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  entity-living - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ItemSoup this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase entity-living]
    (-> this (.onItemUseFinish stack world-in entity-living))))

