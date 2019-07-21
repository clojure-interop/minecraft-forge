(ns net.minecraft.client.network.NetHandlerHandshakeMemory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.network NetHandlerHandshakeMemory]))

(defn ->net-handler-handshake-memory
  "Constructor.

  mc-server-in - `net.minecraft.server.MinecraftServer`
  network-manager-in - `net.minecraft.network.NetworkManager`"
  (^NetHandlerHandshakeMemory [^net.minecraft.server.MinecraftServer mc-server-in ^net.minecraft.network.NetworkManager network-manager-in]
    (new NetHandlerHandshakeMemory mc-server-in network-manager-in)))

(defn process-handshake
  "packet-in - `net.minecraft.network.handshake.client.C00Handshake`"
  ([^NetHandlerHandshakeMemory this ^net.minecraft.network.handshake.client.C00Handshake packet-in]
    (-> this (.processHandshake packet-in))))

(defn on-disconnect
  "reason - `net.minecraft.util.text.ITextComponent`"
  ([^NetHandlerHandshakeMemory this ^net.minecraft.util.text.ITextComponent reason]
    (-> this (.onDisconnect reason))))

