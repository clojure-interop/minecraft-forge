(ns net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientConnectedToServerEvent
  "Fired at the client when a client connects to a server"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network FMLNetworkEvent$ClientConnectedToServerEvent]))

(defn ->client-connected-to-server-event
  "Constructor.

  manager - `net.minecraft.network.NetworkManager`
  connection-type - `java.lang.String`"
  (^FMLNetworkEvent$ClientConnectedToServerEvent [^net.minecraft.network.NetworkManager manager ^java.lang.String connection-type]
    (new FMLNetworkEvent$ClientConnectedToServerEvent manager connection-type)))

(defn local?
  "returns: `boolean`"
  (^Boolean [^FMLNetworkEvent$ClientConnectedToServerEvent this]
    (-> this (.isLocal))))

(defn get-connection-type
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLNetworkEvent$ClientConnectedToServerEvent this]
    (-> this (.getConnectionType))))

