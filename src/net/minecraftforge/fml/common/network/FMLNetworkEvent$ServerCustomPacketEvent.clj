(ns net.minecraftforge.fml.common.network.FMLNetworkEvent$ServerCustomPacketEvent
  "Fired when a custom packet is received at the server for the channel"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network FMLNetworkEvent$ServerCustomPacketEvent]))

(defn ->server-custom-packet-event
  "Constructor.

  manager - `net.minecraft.network.NetworkManager`
  packet - `net.minecraftforge.fml.common.network.internal.FMLProxyPacket`"
  (^FMLNetworkEvent$ServerCustomPacketEvent [^net.minecraft.network.NetworkManager manager ^net.minecraftforge.fml.common.network.internal.FMLProxyPacket packet]
    (new FMLNetworkEvent$ServerCustomPacketEvent manager packet)))

(defn side
  "returns: `net.minecraftforge.fml.relauncher.Side`"
  (^net.minecraftforge.fml.relauncher.Side [^FMLNetworkEvent$ServerCustomPacketEvent this]
    (-> this (.side))))

