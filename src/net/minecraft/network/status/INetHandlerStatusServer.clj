(ns net.minecraft.network.status.INetHandlerStatusServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.status INetHandlerStatusServer]))

(defn process-ping
  "packet-in - `net.minecraft.network.status.client.CPacketPing`"
  ([^INetHandlerStatusServer this ^net.minecraft.network.status.client.CPacketPing packet-in]
    (-> this (.processPing packet-in))))

(defn process-server-query
  "packet-in - `net.minecraft.network.status.client.CPacketServerQuery`"
  ([^INetHandlerStatusServer this ^net.minecraft.network.status.client.CPacketServerQuery packet-in]
    (-> this (.processServerQuery packet-in))))

