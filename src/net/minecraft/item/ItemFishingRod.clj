(ns net.minecraft.item.ItemFishingRod
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemFishingRod]))

(defn ->item-fishing-rod
  "Constructor."
  (^ItemFishingRod []
    (new ItemFishingRod )))

(defn full-3-d?
  "returns: `boolean`"
  (^Boolean [^ItemFishingRod this]
    (-> this (.isFull3D))))

(defn should-rotate-around-when-rendering?
  "returns: `boolean`"
  (^Boolean [^ItemFishingRod this]
    (-> this (.shouldRotateAroundWhenRendering))))

(defn on-item-right-click
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand-in - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^ItemFishingRod this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand-in]
    (-> this (.onItemRightClick world-in player-in hand-in))))

(defn get-item-enchantability
  "returns: `int`"
  (^Integer [^ItemFishingRod this]
    (-> this (.getItemEnchantability))))

