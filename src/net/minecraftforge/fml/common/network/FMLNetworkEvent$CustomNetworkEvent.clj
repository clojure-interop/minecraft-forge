(ns net.minecraftforge.fml.common.network.FMLNetworkEvent$CustomNetworkEvent
  "Fired when a custom event, such as NetworkHandshakeEstablished is fired for the channel"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network FMLNetworkEvent$CustomNetworkEvent]))

(defn ->custom-network-event
  "Constructor.

  wrapped-event - `java.lang.Object`"
  (^FMLNetworkEvent$CustomNetworkEvent [^java.lang.Object wrapped-event]
    (new FMLNetworkEvent$CustomNetworkEvent wrapped-event)))

(defn get-wrapped-event
  "returns: `java.lang.Object`"
  (^java.lang.Object [^FMLNetworkEvent$CustomNetworkEvent this]
    (-> this (.getWrappedEvent))))

