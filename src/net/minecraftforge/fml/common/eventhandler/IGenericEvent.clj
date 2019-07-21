(ns net.minecraftforge.fml.common.eventhandler.IGenericEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.eventhandler IGenericEvent]))

(defn get-generic-type
  "returns: `java.lang.reflect.Type`"
  (^java.lang.reflect.Type [^IGenericEvent this]
    (-> this (.getGenericType))))

