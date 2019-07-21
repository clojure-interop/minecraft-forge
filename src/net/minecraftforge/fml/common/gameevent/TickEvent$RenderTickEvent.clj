(ns net.minecraftforge.fml.common.gameevent.TickEvent$RenderTickEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.gameevent TickEvent$RenderTickEvent]))

(defn ->render-tick-event
  "Constructor.

  phase - `net.minecraftforge.fml.common.gameevent.TickEvent$Phase`
  render-tick-time - `float`"
  (^TickEvent$RenderTickEvent [^net.minecraftforge.fml.common.gameevent.TickEvent$Phase phase ^Float render-tick-time]
    (new TickEvent$RenderTickEvent phase render-tick-time)))

(defn render-tick-time
  "Instance Constant.

  type: float"
  (^Float [^TickEvent$RenderTickEvent this]
    (-> this .-renderTickTime)))

