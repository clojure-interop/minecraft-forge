(ns net.minecraft.server.network.NetHandlerStatusServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.network NetHandlerStatusServer]))

(defn ->net-handler-status-server
  "Constructor.

  server-in - `net.minecraft.server.MinecraftServer`
  net-manager - `net.minecraft.network.NetworkManager`"
  (^NetHandlerStatusServer [^net.minecraft.server.MinecraftServer server-in ^net.minecraft.network.NetworkManager net-manager]
    (new NetHandlerStatusServer server-in net-manager)))

(defn on-disconnect
  "reason - `net.minecraft.util.text.ITextComponent`"
  ([^NetHandlerStatusServer this ^net.minecraft.util.text.ITextComponent reason]
    (-> this (.onDisconnect reason))))

(defn process-server-query
  "packet-in - `net.minecraft.network.status.client.CPacketServerQuery`"
  ([^NetHandlerStatusServer this ^net.minecraft.network.status.client.CPacketServerQuery packet-in]
    (-> this (.processServerQuery packet-in))))

(defn process-ping
  "packet-in - `net.minecraft.network.status.client.CPacketPing`"
  ([^NetHandlerStatusServer this ^net.minecraft.network.status.client.CPacketPing packet-in]
    (-> this (.processPing packet-in))))

