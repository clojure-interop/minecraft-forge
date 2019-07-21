(ns net.minecraftforge.fml.common.gameevent.TickEvent$ServerTickEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.gameevent TickEvent$ServerTickEvent]))

(defn ->server-tick-event
  "Constructor.

  phase - `net.minecraftforge.fml.common.gameevent.TickEvent$Phase`"
  (^TickEvent$ServerTickEvent [^net.minecraftforge.fml.common.gameevent.TickEvent$Phase phase]
    (new TickEvent$ServerTickEvent phase)))

