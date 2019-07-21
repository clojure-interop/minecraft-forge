(ns net.minecraftforge.fml.common.gameevent.PlayerEvent$ItemPickupEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.gameevent PlayerEvent$ItemPickupEvent]))

(defn ->item-pickup-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  picked-up - `net.minecraft.entity.item.EntityItem`"
  (^PlayerEvent$ItemPickupEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.entity.item.EntityItem picked-up]
    (new PlayerEvent$ItemPickupEvent player picked-up)))

(defn picked-up
  "Instance Constant.

  type: net.minecraft.entity.item.EntityItem"
  (^net.minecraft.entity.item.EntityItem [^PlayerEvent$ItemPickupEvent this]
    (-> this .-pickedUp)))

