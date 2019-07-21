(ns net.minecraft.item.ItemSaddle
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemSaddle]))

(defn ->item-saddle
  "Constructor."
  (^ItemSaddle []
    (new ItemSaddle )))

(defn item-interaction-for-entity
  "stack - `net.minecraft.item.ItemStack`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  target - `net.minecraft.entity.EntityLivingBase`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^ItemSaddle this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.entity.EntityLivingBase target ^net.minecraft.util.EnumHand hand]
    (-> this (.itemInteractionForEntity stack player-in target hand))))

