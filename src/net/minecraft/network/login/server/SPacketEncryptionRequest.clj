(ns net.minecraft.network.login.server.SPacketEncryptionRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.login.server SPacketEncryptionRequest]))

(defn ->s-packet-encryption-request
  "Constructor.

  server-id-in - `java.lang.String`
  public-key-in - `java.security.PublicKey`
  verify-token-in - `byte[]`"
  (^SPacketEncryptionRequest [^java.lang.String server-id-in ^java.security.PublicKey public-key-in verify-token-in]
    (new SPacketEncryptionRequest server-id-in public-key-in verify-token-in))
  (^SPacketEncryptionRequest []
    (new SPacketEncryptionRequest )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEncryptionRequest this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEncryptionRequest this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.login.INetHandlerLoginClient`"
  ([^SPacketEncryptionRequest this ^net.minecraft.network.login.INetHandlerLoginClient handler]
    (-> this (.processPacket handler))))

(defn get-server-id
  "returns: `java.lang.String`"
  (^java.lang.String [^SPacketEncryptionRequest this]
    (-> this (.getServerId))))

(defn get-public-key
  "returns: `java.security.PublicKey`"
  (^java.security.PublicKey [^SPacketEncryptionRequest this]
    (-> this (.getPublicKey))))

(defn get-verify-token
  "returns: `byte[]`"
  ([^SPacketEncryptionRequest this]
    (-> this (.getVerifyToken))))

