(ns net.minecraftforge.event.entity.player.PlayerContainerEvent$Open
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerContainerEvent$Open]))

(defn ->open
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  container - `net.minecraft.inventory.Container`"
  (^PlayerContainerEvent$Open [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.inventory.Container container]
    (new PlayerContainerEvent$Open player container)))

