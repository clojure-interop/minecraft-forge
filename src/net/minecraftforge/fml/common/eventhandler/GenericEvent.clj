(ns net.minecraftforge.fml.common.eventhandler.GenericEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.eventhandler GenericEvent]))

(defn get-generic-type
  "returns: `java.lang.reflect.Type`"
  (^java.lang.reflect.Type [^GenericEvent this]
    (-> this (.getGenericType))))

