(ns net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickItem
  "This event is fired on both sides before the player triggers Item.onItemRightClick(net.minecraft.world.World, net.minecraft.entity.player.EntityPlayer, net.minecraft.util.EnumHand).
  Note that this is NOT fired if the player is targeting a block. For that case, see PlayerInteractEvent.RightClickBlock.
  Canceling the event clientside causes processing to continue to the other hands,
  while canceling serverside will simply do no further processing."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerInteractEvent$RightClickItem]))

(defn ->right-click-item
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`"
  (^PlayerInteractEvent$RightClickItem [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (new PlayerInteractEvent$RightClickItem player hand)))

