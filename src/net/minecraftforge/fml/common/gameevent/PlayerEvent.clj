(ns net.minecraftforge.fml.common.gameevent.PlayerEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.gameevent PlayerEvent]))

(defn player
  "Instance Constant.

  type: net.minecraft.entity.player.EntityPlayer"
  (^net.minecraft.entity.player.EntityPlayer [^PlayerEvent this]
    (-> this .-player)))

