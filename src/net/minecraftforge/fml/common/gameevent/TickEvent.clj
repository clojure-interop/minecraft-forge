(ns net.minecraftforge.fml.common.gameevent.TickEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.gameevent TickEvent]))

(defn ->tick-event
  "Constructor.

  type - `net.minecraftforge.fml.common.gameevent.TickEvent$Type`
  side - `net.minecraftforge.fml.relauncher.Side`
  phase - `net.minecraftforge.fml.common.gameevent.TickEvent$Phase`"
  (^TickEvent [^net.minecraftforge.fml.common.gameevent.TickEvent$Type type ^net.minecraftforge.fml.relauncher.Side side ^net.minecraftforge.fml.common.gameevent.TickEvent$Phase phase]
    (new TickEvent type side phase)))

(defn type
  "Instance Constant.

  type: net.minecraftforge.fml.common.gameevent.TickEvent$Type"
  (^net.minecraftforge.fml.common.gameevent.TickEvent$Type [^TickEvent this]
    (-> this .-type)))

(defn side
  "Instance Constant.

  type: net.minecraftforge.fml.relauncher.Side"
  (^net.minecraftforge.fml.relauncher.Side [^TickEvent this]
    (-> this .-side)))

(defn phase
  "Instance Constant.

  type: net.minecraftforge.fml.common.gameevent.TickEvent$Phase"
  (^net.minecraftforge.fml.common.gameevent.TickEvent$Phase [^TickEvent this]
    (-> this .-phase)))

