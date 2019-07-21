(ns net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientCustomPacketEvent
  "Fired when a custom packet is received on the client for the channel"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network FMLNetworkEvent$ClientCustomPacketEvent]))

(defn ->client-custom-packet-event
  "Constructor.

  manager - `net.minecraft.network.NetworkManager`
  packet - `net.minecraftforge.fml.common.network.internal.FMLProxyPacket`"
  (^FMLNetworkEvent$ClientCustomPacketEvent [^net.minecraft.network.NetworkManager manager ^net.minecraftforge.fml.common.network.internal.FMLProxyPacket packet]
    (new FMLNetworkEvent$ClientCustomPacketEvent manager packet)))

(defn side
  "returns: `net.minecraftforge.fml.relauncher.Side`"
  (^net.minecraftforge.fml.relauncher.Side [^FMLNetworkEvent$ClientCustomPacketEvent this]
    (-> this (.side))))

