(ns net.minecraftforge.event.entity.player.PlayerContainerEvent$Close
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerContainerEvent$Close]))

(defn ->close
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  container - `net.minecraft.inventory.Container`"
  (^PlayerContainerEvent$Close [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.inventory.Container container]
    (new PlayerContainerEvent$Close player container)))

