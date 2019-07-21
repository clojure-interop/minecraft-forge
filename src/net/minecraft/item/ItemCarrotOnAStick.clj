(ns net.minecraft.item.ItemCarrotOnAStick
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemCarrotOnAStick]))

(defn ->item-carrot-on-a-stick
  "Constructor."
  (^ItemCarrotOnAStick []
    (new ItemCarrotOnAStick )))

(defn full-3-d?
  "returns: `boolean`"
  (^Boolean [^ItemCarrotOnAStick this]
    (-> this (.isFull3D))))

(defn should-rotate-around-when-rendering?
  "returns: `boolean`"
  (^Boolean [^ItemCarrotOnAStick this]
    (-> this (.shouldRotateAroundWhenRendering))))

(defn on-item-right-click
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand-in - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^ItemCarrotOnAStick this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand-in]
    (-> this (.onItemRightClick world-in player-in hand-in))))

