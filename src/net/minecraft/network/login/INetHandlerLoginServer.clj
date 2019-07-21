(ns net.minecraft.network.login.INetHandlerLoginServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.login INetHandlerLoginServer]))

(defn process-login-start
  "packet-in - `net.minecraft.network.login.client.CPacketLoginStart`"
  ([^INetHandlerLoginServer this ^net.minecraft.network.login.client.CPacketLoginStart packet-in]
    (-> this (.processLoginStart packet-in))))

(defn process-encryption-response
  "packet-in - `net.minecraft.network.login.client.CPacketEncryptionResponse`"
  ([^INetHandlerLoginServer this ^net.minecraft.network.login.client.CPacketEncryptionResponse packet-in]
    (-> this (.processEncryptionResponse packet-in))))

