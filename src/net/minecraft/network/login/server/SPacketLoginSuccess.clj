(ns net.minecraft.network.login.server.SPacketLoginSuccess
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.login.server SPacketLoginSuccess]))

(defn ->s-packet-login-success
  "Constructor.

  profile-in - `com.mojang.authlib.GameProfile`"
  (^SPacketLoginSuccess [^com.mojang.authlib.GameProfile profile-in]
    (new SPacketLoginSuccess profile-in))
  (^SPacketLoginSuccess []
    (new SPacketLoginSuccess )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketLoginSuccess this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketLoginSuccess this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.login.INetHandlerLoginClient`"
  ([^SPacketLoginSuccess this ^net.minecraft.network.login.INetHandlerLoginClient handler]
    (-> this (.processPacket handler))))

(defn get-profile
  "returns: `com.mojang.authlib.GameProfile`"
  (^com.mojang.authlib.GameProfile [^SPacketLoginSuccess this]
    (-> this (.getProfile))))

