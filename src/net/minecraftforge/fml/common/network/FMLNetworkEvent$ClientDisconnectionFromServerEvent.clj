(ns net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientDisconnectionFromServerEvent
  "Fired at the client when the client is disconnected from the server."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network FMLNetworkEvent$ClientDisconnectionFromServerEvent]))

(defn ->client-disconnection-from-server-event
  "Constructor.

  manager - `net.minecraft.network.NetworkManager`"
  (^FMLNetworkEvent$ClientDisconnectionFromServerEvent [^net.minecraft.network.NetworkManager manager]
    (new FMLNetworkEvent$ClientDisconnectionFromServerEvent manager)))

