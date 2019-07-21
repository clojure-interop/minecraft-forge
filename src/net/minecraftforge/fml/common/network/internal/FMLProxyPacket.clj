(ns net.minecraftforge.fml.common.network.internal.FMLProxyPacket
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.internal FMLProxyPacket]))

(defn ->fml-proxy-packet
  "Constructor.

  payload - `net.minecraft.network.PacketBuffer`
  channel - `java.lang.String`"
  (^FMLProxyPacket [^net.minecraft.network.PacketBuffer payload ^java.lang.String channel]
    (new FMLProxyPacket payload channel))
  (^FMLProxyPacket [^net.minecraft.network.play.server.SPacketCustomPayload original]
    (new FMLProxyPacket original)))

(def *-max-length
  "Static Constant.

  type: int"
  FMLProxyPacket/MAX_LENGTH)

(defn get-dispatcher
  "returns: `net.minecraftforge.fml.common.network.handshake.NetworkDispatcher`"
  (^net.minecraftforge.fml.common.network.handshake.NetworkDispatcher [^FMLProxyPacket this]
    (-> this (.getDispatcher))))

(defn read-packet-data
  "packetbuffer - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^FMLProxyPacket this ^net.minecraft.network.PacketBuffer packetbuffer]
    (-> this (.readPacketData packetbuffer))))

(defn handler
  "returns: `net.minecraft.network.INetHandler`"
  (^net.minecraft.network.INetHandler [^FMLProxyPacket this]
    (-> this (.handler))))

(defn copy
  "returns: `net.minecraftforge.fml.common.network.internal.FMLProxyPacket`"
  (^net.minecraftforge.fml.common.network.internal.FMLProxyPacket [^FMLProxyPacket this]
    (-> this (.copy))))

(defn set-dispatcher
  "network-dispatcher - `net.minecraftforge.fml.common.network.handshake.NetworkDispatcher`"
  ([^FMLProxyPacket this ^net.minecraftforge.fml.common.network.handshake.NetworkDispatcher network-dispatcher]
    (-> this (.setDispatcher network-dispatcher))))

(defn get-origin
  "returns: `net.minecraft.network.NetworkManager`"
  (^net.minecraft.network.NetworkManager [^FMLProxyPacket this]
    (-> this (.getOrigin))))

(defn to-c-17-packet
  "returns: `net.minecraft.network.Packet<net.minecraft.network.play.INetHandlerPlayServer>`"
  (^net.minecraft.network.Packet [^FMLProxyPacket this]
    (-> this (.toC17Packet))))

(defn process-packet
  "inethandler - `net.minecraft.network.INetHandler`"
  ([^FMLProxyPacket this ^net.minecraft.network.INetHandler inethandler]
    (-> this (.processPacket inethandler))))

(defn write-packet-data
  "packetbuffer - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^FMLProxyPacket this ^net.minecraft.network.PacketBuffer packetbuffer]
    (-> this (.writePacketData packetbuffer))))

(defn to-s-3-f-packets
  "returns: `java.util.List<net.minecraft.network.Packet<net.minecraft.network.play.INetHandlerPlayClient>>`

  throws: java.io.IOException"
  (^java.util.List [^FMLProxyPacket this]
    (-> this (.toS3FPackets))))

(defn channel
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLProxyPacket this]
    (-> this (.channel))))

(defn get-target
  "returns: `net.minecraftforge.fml.relauncher.Side`"
  (^net.minecraftforge.fml.relauncher.Side [^FMLProxyPacket this]
    (-> this (.getTarget))))

(defn payload
  "returns: `io.netty.buffer.ByteBuf`"
  (^io.netty.buffer.ByteBuf [^FMLProxyPacket this]
    (-> this (.payload))))

(defn set-target
  "target - `net.minecraftforge.fml.relauncher.Side`"
  ([^FMLProxyPacket this ^net.minecraftforge.fml.relauncher.Side target]
    (-> this (.setTarget target))))

