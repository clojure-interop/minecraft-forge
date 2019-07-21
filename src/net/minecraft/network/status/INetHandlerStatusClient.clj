(ns net.minecraft.network.status.INetHandlerStatusClient
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.status INetHandlerStatusClient]))

(defn handle-server-info
  "packet-in - `net.minecraft.network.status.server.SPacketServerInfo`"
  ([^INetHandlerStatusClient this ^net.minecraft.network.status.server.SPacketServerInfo packet-in]
    (-> this (.handleServerInfo packet-in))))

(defn handle-pong
  "packet-in - `net.minecraft.network.status.server.SPacketPong`"
  ([^INetHandlerStatusClient this ^net.minecraft.network.status.server.SPacketPong packet-in]
    (-> this (.handlePong packet-in))))

