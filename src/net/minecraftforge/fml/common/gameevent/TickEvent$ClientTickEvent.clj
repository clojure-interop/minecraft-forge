(ns net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.gameevent TickEvent$ClientTickEvent]))

(defn ->client-tick-event
  "Constructor.

  phase - `net.minecraftforge.fml.common.gameevent.TickEvent$Phase`"
  (^TickEvent$ClientTickEvent [^net.minecraftforge.fml.common.gameevent.TickEvent$Phase phase]
    (new TickEvent$ClientTickEvent phase)))

