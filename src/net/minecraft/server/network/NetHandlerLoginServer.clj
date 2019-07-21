(ns net.minecraft.server.network.NetHandlerLoginServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.network NetHandlerLoginServer]))

(defn ->net-handler-login-server
  "Constructor.

  server-in - `net.minecraft.server.MinecraftServer`
  network-manager-in - `net.minecraft.network.NetworkManager`"
  (^NetHandlerLoginServer [^net.minecraft.server.MinecraftServer server-in ^net.minecraft.network.NetworkManager network-manager-in]
    (new NetHandlerLoginServer server-in network-manager-in)))

(defn network-manager
  "Instance Constant.

  type: net.minecraft.network.NetworkManager"
  (^net.minecraft.network.NetworkManager [^NetHandlerLoginServer this]
    (-> this .-networkManager)))

(defn update
  ""
  ([^NetHandlerLoginServer this]
    (-> this (.update))))

(defn close-connection
  "reason - `java.lang.String`"
  ([^NetHandlerLoginServer this ^java.lang.String reason]
    (-> this (.closeConnection reason))))

(defn try-accept-player
  ""
  ([^NetHandlerLoginServer this]
    (-> this (.tryAcceptPlayer))))

(defn on-disconnect
  "reason - `net.minecraft.util.text.ITextComponent`"
  ([^NetHandlerLoginServer this ^net.minecraft.util.text.ITextComponent reason]
    (-> this (.onDisconnect reason))))

(defn get-connection-info
  "returns: `java.lang.String`"
  (^java.lang.String [^NetHandlerLoginServer this]
    (-> this (.getConnectionInfo))))

(defn process-login-start
  "packet-in - `net.minecraft.network.login.client.CPacketLoginStart`"
  ([^NetHandlerLoginServer this ^net.minecraft.network.login.client.CPacketLoginStart packet-in]
    (-> this (.processLoginStart packet-in))))

(defn process-encryption-response
  "packet-in - `net.minecraft.network.login.client.CPacketEncryptionResponse`"
  ([^NetHandlerLoginServer this ^net.minecraft.network.login.client.CPacketEncryptionResponse packet-in]
    (-> this (.processEncryptionResponse packet-in))))

