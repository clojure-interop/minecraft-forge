(ns net.minecraft.network.login.client.CPacketEncryptionResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.login.client CPacketEncryptionResponse]))

(defn ->c-packet-encryption-response
  "Constructor.

  secret - `javax.crypto.SecretKey`
  key - `java.security.PublicKey`
  verify-token - `byte[]`"
  (^CPacketEncryptionResponse [^javax.crypto.SecretKey secret ^java.security.PublicKey key verify-token]
    (new CPacketEncryptionResponse secret key verify-token))
  (^CPacketEncryptionResponse []
    (new CPacketEncryptionResponse )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketEncryptionResponse this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketEncryptionResponse this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.login.INetHandlerLoginServer`"
  ([^CPacketEncryptionResponse this ^net.minecraft.network.login.INetHandlerLoginServer handler]
    (-> this (.processPacket handler))))

(defn get-secret-key
  "key - `java.security.PrivateKey`

  returns: `javax.crypto.SecretKey`"
  (^javax.crypto.SecretKey [^CPacketEncryptionResponse this ^java.security.PrivateKey key]
    (-> this (.getSecretKey key))))

(defn get-verify-token
  "key - `java.security.PrivateKey`

  returns: `byte[]`"
  ([^CPacketEncryptionResponse this ^java.security.PrivateKey key]
    (-> this (.getVerifyToken key))))

