(ns net.minecraftforge.event.entity.player.PlayerInteractEvent$LeftClickEmpty
  "This event is fired on the client side when the player left clicks empty space with any ItemStack.
  The server is not aware of when the client left clicks empty space, you will need to tell the server yourself.
  This event cannot be canceled."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerInteractEvent$LeftClickEmpty]))

(defn ->left-click-empty
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`"
  (^PlayerInteractEvent$LeftClickEmpty [^net.minecraft.entity.player.EntityPlayer player]
    (new PlayerInteractEvent$LeftClickEmpty player))
  (^PlayerInteractEvent$LeftClickEmpty [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack stack]
    (new PlayerInteractEvent$LeftClickEmpty player stack)))

