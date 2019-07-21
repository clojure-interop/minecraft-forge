(ns net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickEmpty
  "This event is fired on the client side when the player right clicks empty space with an empty hand.
  The server is not aware of when the client right clicks empty space with an empty hand, you will need to tell the server yourself.
  This event cannot be canceled."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerInteractEvent$RightClickEmpty]))

(defn ->right-click-empty
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`"
  (^PlayerInteractEvent$RightClickEmpty [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (new PlayerInteractEvent$RightClickEmpty player hand)))

