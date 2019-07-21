(ns net.minecraft.network.login.INetHandlerLoginClient
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.login INetHandlerLoginClient]))

(defn handle-encryption-request
  "packet-in - `net.minecraft.network.login.server.SPacketEncryptionRequest`"
  ([^INetHandlerLoginClient this ^net.minecraft.network.login.server.SPacketEncryptionRequest packet-in]
    (-> this (.handleEncryptionRequest packet-in))))

(defn handle-login-success
  "packet-in - `net.minecraft.network.login.server.SPacketLoginSuccess`"
  ([^INetHandlerLoginClient this ^net.minecraft.network.login.server.SPacketLoginSuccess packet-in]
    (-> this (.handleLoginSuccess packet-in))))

(defn handle-disconnect
  "packet-in - `net.minecraft.network.login.server.SPacketDisconnect`"
  ([^INetHandlerLoginClient this ^net.minecraft.network.login.server.SPacketDisconnect packet-in]
    (-> this (.handleDisconnect packet-in))))

(defn handle-enable-compression
  "packet-in - `net.minecraft.network.login.server.SPacketEnableCompression`"
  ([^INetHandlerLoginClient this ^net.minecraft.network.login.server.SPacketEnableCompression packet-in]
    (-> this (.handleEnableCompression packet-in))))

