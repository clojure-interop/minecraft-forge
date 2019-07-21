(ns net.minecraftforge.fml.common.gameevent.PlayerEvent$ItemSmeltedEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.gameevent PlayerEvent$ItemSmeltedEvent]))

(defn ->item-smelted-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  crafting - `net.minecraft.item.ItemStack`"
  (^PlayerEvent$ItemSmeltedEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack crafting]
    (new PlayerEvent$ItemSmeltedEvent player crafting)))

(defn smelting
  "Instance Constant.

  type: net.minecraft.item.ItemStack"
  (^net.minecraft.item.ItemStack [^PlayerEvent$ItemSmeltedEvent this]
    (-> this .-smelting)))

