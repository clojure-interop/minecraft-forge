(ns net.minecraftforge.fml.common.eventhandler.IEventListener
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.eventhandler IEventListener]))

(defn invoke
  "event - `net.minecraftforge.fml.common.eventhandler.Event`"
  ([^IEventListener this ^net.minecraftforge.fml.common.eventhandler.Event event]
    (-> this (.invoke event))))

