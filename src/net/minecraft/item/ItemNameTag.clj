(ns net.minecraft.item.ItemNameTag
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemNameTag]))

(defn ->item-name-tag
  "Constructor."
  (^ItemNameTag []
    (new ItemNameTag )))

(defn item-interaction-for-entity
  "stack - `net.minecraft.item.ItemStack`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  target - `net.minecraft.entity.EntityLivingBase`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^ItemNameTag this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.entity.EntityLivingBase target ^net.minecraft.util.EnumHand hand]
    (-> this (.itemInteractionForEntity stack player-in target hand))))

