(ns net.minecraft.item.ItemGlassBottle
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemGlassBottle]))

(defn ->item-glass-bottle
  "Constructor."
  (^ItemGlassBottle []
    (new ItemGlassBottle )))

(defn on-item-right-click
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand-in - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^ItemGlassBottle this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand-in]
    (-> this (.onItemRightClick world-in player-in hand-in))))

