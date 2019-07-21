(ns net.minecraftforge.event.entity.player.PlayerContainerEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerContainerEvent]))

(defn ->player-container-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  container - `net.minecraft.inventory.Container`"
  (^PlayerContainerEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.inventory.Container container]
    (new PlayerContainerEvent player container)))

(defn get-container
  "returns: `net.minecraft.inventory.Container`"
  (^net.minecraft.inventory.Container [^PlayerContainerEvent this]
    (-> this (.getContainer))))

