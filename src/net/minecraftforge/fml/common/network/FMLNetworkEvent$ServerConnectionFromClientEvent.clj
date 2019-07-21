(ns net.minecraftforge.fml.common.network.FMLNetworkEvent$ServerConnectionFromClientEvent
  "Fired at the server when a client connects to the server."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network FMLNetworkEvent$ServerConnectionFromClientEvent]))

(defn ->server-connection-from-client-event
  "Constructor.

  manager - `net.minecraft.network.NetworkManager`"
  (^FMLNetworkEvent$ServerConnectionFromClientEvent [^net.minecraft.network.NetworkManager manager]
    (new FMLNetworkEvent$ServerConnectionFromClientEvent manager)))

(defn local?
  "returns: `boolean`"
  (^Boolean [^FMLNetworkEvent$ServerConnectionFromClientEvent this]
    (-> this (.isLocal))))

