(ns net.minecraftforge.fml.common.event.FMLLoadEvent
  "Internal only event, used to begin the lifecycle of loading mods."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLLoadEvent]))

(defn ->fml-load-event
  "Constructor."
  (^FMLLoadEvent []
    (new FMLLoadEvent )))

