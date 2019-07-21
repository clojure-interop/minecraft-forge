(ns net.minecraftforge.fml.common.network.FMLNetworkEvent$CustomPacketEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network FMLNetworkEvent$CustomPacketEvent]))

(defn side
  "returns: `net.minecraftforge.fml.relauncher.Side`"
  (^net.minecraftforge.fml.relauncher.Side [^FMLNetworkEvent$CustomPacketEvent this]
    (-> this (.side))))

(defn get-packet
  "The packet that generated the event

  returns: `net.minecraftforge.fml.common.network.internal.FMLProxyPacket`"
  (^net.minecraftforge.fml.common.network.internal.FMLProxyPacket [^FMLNetworkEvent$CustomPacketEvent this]
    (-> this (.getPacket))))

(defn get-reply
  "Set this packet to reply to the originator

  returns: `net.minecraftforge.fml.common.network.internal.FMLProxyPacket`"
  (^net.minecraftforge.fml.common.network.internal.FMLProxyPacket [^FMLNetworkEvent$CustomPacketEvent this]
    (-> this (.getReply))))

(defn set-reply
  "reply - `net.minecraftforge.fml.common.network.internal.FMLProxyPacket`"
  ([^FMLNetworkEvent$CustomPacketEvent this ^net.minecraftforge.fml.common.network.internal.FMLProxyPacket reply]
    (-> this (.setReply reply))))

