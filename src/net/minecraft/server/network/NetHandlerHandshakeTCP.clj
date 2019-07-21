(ns net.minecraft.server.network.NetHandlerHandshakeTCP
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.network NetHandlerHandshakeTCP]))

(defn ->net-handler-handshake-tcp
  "Constructor.

  server-in - `net.minecraft.server.MinecraftServer`
  net-manager - `net.minecraft.network.NetworkManager`"
  (^NetHandlerHandshakeTCP [^net.minecraft.server.MinecraftServer server-in ^net.minecraft.network.NetworkManager net-manager]
    (new NetHandlerHandshakeTCP server-in net-manager)))

(defn process-handshake
  "packet-in - `net.minecraft.network.handshake.client.C00Handshake`"
  ([^NetHandlerHandshakeTCP this ^net.minecraft.network.handshake.client.C00Handshake packet-in]
    (-> this (.processHandshake packet-in))))

(defn on-disconnect
  "reason - `net.minecraft.util.text.ITextComponent`"
  ([^NetHandlerHandshakeTCP this ^net.minecraft.util.text.ITextComponent reason]
    (-> this (.onDisconnect reason))))

