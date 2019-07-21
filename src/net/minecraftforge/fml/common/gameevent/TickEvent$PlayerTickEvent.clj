(ns net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.gameevent TickEvent$PlayerTickEvent]))

(defn ->player-tick-event
  "Constructor.

  phase - `net.minecraftforge.fml.common.gameevent.TickEvent$Phase`
  player - `net.minecraft.entity.player.EntityPlayer`"
  (^TickEvent$PlayerTickEvent [^net.minecraftforge.fml.common.gameevent.TickEvent$Phase phase ^net.minecraft.entity.player.EntityPlayer player]
    (new TickEvent$PlayerTickEvent phase player)))

(defn player
  "Instance Constant.

  type: net.minecraft.entity.player.EntityPlayer"
  (^net.minecraft.entity.player.EntityPlayer [^TickEvent$PlayerTickEvent this]
    (-> this .-player)))

