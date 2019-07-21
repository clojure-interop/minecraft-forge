(ns net.minecraftforge.fml.common.network.FMLNetworkEvent$ServerDisconnectionFromClientEvent
  "Fired at the server when a client disconnects."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network FMLNetworkEvent$ServerDisconnectionFromClientEvent]))

(defn ->server-disconnection-from-client-event
  "Constructor.

  manager - `net.minecraft.network.NetworkManager`"
  (^FMLNetworkEvent$ServerDisconnectionFromClientEvent [^net.minecraft.network.NetworkManager manager]
    (new FMLNetworkEvent$ServerDisconnectionFromClientEvent manager)))

