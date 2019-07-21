(ns net.minecraft.network.login.client.CPacketLoginStart
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.login.client CPacketLoginStart]))

(defn ->c-packet-login-start
  "Constructor.

  profile-in - `com.mojang.authlib.GameProfile`"
  (^CPacketLoginStart [^com.mojang.authlib.GameProfile profile-in]
    (new CPacketLoginStart profile-in))
  (^CPacketLoginStart []
    (new CPacketLoginStart )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketLoginStart this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketLoginStart this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.login.INetHandlerLoginServer`"
  ([^CPacketLoginStart this ^net.minecraft.network.login.INetHandlerLoginServer handler]
    (-> this (.processPacket handler))))

(defn get-profile
  "returns: `com.mojang.authlib.GameProfile`"
  (^com.mojang.authlib.GameProfile [^CPacketLoginStart this]
    (-> this (.getProfile))))

