(ns net.minecraftforge.fml.common.gameevent.TickEvent$WorldTickEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.gameevent TickEvent$WorldTickEvent]))

(defn ->world-tick-event
  "Constructor.

  side - `net.minecraftforge.fml.relauncher.Side`
  phase - `net.minecraftforge.fml.common.gameevent.TickEvent$Phase`
  world - `net.minecraft.world.World`"
  (^TickEvent$WorldTickEvent [^net.minecraftforge.fml.relauncher.Side side ^net.minecraftforge.fml.common.gameevent.TickEvent$Phase phase ^net.minecraft.world.World world]
    (new TickEvent$WorldTickEvent side phase world)))

(defn world
  "Instance Constant.

  type: net.minecraft.world.World"
  (^net.minecraft.world.World [^TickEvent$WorldTickEvent this]
    (-> this .-world)))

