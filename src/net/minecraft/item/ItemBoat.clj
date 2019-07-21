(ns net.minecraft.item.ItemBoat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemBoat]))

(defn ->item-boat
  "Constructor.

  type-in - `net.minecraft.entity.item.EntityBoat$Type`"
  (^ItemBoat [^net.minecraft.entity.item.EntityBoat$Type type-in]
    (new ItemBoat type-in)))

(defn on-item-right-click
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand-in - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^ItemBoat this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand-in]
    (-> this (.onItemRightClick world-in player-in hand-in))))

