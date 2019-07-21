(ns net.minecraftforge.fml.common.AutomaticEventSubscriber
  "Automatic eventbus subscriber - reads Mod.EventBusSubscriber
  annotations and passes the class instances to the net.minecraftforge.common.MinecraftForge.EVENT_BUS"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common AutomaticEventSubscriber]))

(defn ->automatic-event-subscriber
  "Constructor."
  (^AutomaticEventSubscriber []
    (new AutomaticEventSubscriber )))

(defn *inject
  "mod - `net.minecraftforge.fml.common.ModContainer`
  data - `net.minecraftforge.fml.common.discovery.ASMDataTable`
  side - `net.minecraftforge.fml.relauncher.Side`"
  ([^net.minecraftforge.fml.common.ModContainer mod ^net.minecraftforge.fml.common.discovery.ASMDataTable data ^net.minecraftforge.fml.relauncher.Side side]
    (AutomaticEventSubscriber/inject mod data side)))

