(ns net.minecraftforge.fml.common.network.PacketLoggingHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network PacketLoggingHandler]))

(defn ->packet-logging-handler
  "Constructor."
  (^PacketLoggingHandler []
    (new PacketLoggingHandler )))

(defn *register
  "manager - `net.minecraft.network.NetworkManager`"
  ([^net.minecraft.network.NetworkManager manager]
    (PacketLoggingHandler/register manager)))

