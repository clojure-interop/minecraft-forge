(ns net.minecraft.item.ItemEgg
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemEgg]))

(defn ->item-egg
  "Constructor."
  (^ItemEgg []
    (new ItemEgg )))

(defn on-item-right-click
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand-in - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^ItemEgg this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand-in]
    (-> this (.onItemRightClick world-in player-in hand-in))))

