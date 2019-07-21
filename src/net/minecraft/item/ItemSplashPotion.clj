(ns net.minecraft.item.ItemSplashPotion
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemSplashPotion]))

(defn ->item-splash-potion
  "Constructor."
  (^ItemSplashPotion []
    (new ItemSplashPotion )))

(defn get-item-stack-display-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^ItemSplashPotion this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemStackDisplayName stack))))

(defn on-item-right-click
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand-in - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^ItemSplashPotion this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand-in]
    (-> this (.onItemRightClick world-in player-in hand-in))))

