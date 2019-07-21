(ns net.minecraftforge.fml.common.event.FMLEvent
  "Parent type to all FML events. This is based on Guava EventBus. Event Subscription isn't using the Guava annotation
  however, it's using a custom annotation specific to FML Mod.EventHandler"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLEvent]))

(defn ->fml-event
  "Constructor."
  (^FMLEvent []
    (new FMLEvent )))

(defn get-event-type
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLEvent this]
    (-> this (.getEventType))))

(defn description
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLEvent this]
    (-> this (.description))))

(defn apply-mod-container
  "active-container - `net.minecraftforge.fml.common.ModContainer`"
  ([^FMLEvent this ^net.minecraftforge.fml.common.ModContainer active-container]
    (-> this (.applyModContainer active-container))))

