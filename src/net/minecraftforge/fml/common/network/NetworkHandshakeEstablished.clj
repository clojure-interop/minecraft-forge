(ns net.minecraftforge.fml.common.network.NetworkHandshakeEstablished
  "This message is sent through all channels affected by a currently occurring handshake. It is guaranteed to
  be able to send a custom payload packet, however, interaction with minecraft and world state is NOT assured
  as it is likely this is fired on a netty handler thread, not a world processing thread.

  If you wish to send an outbound message through your channel, bind the FMLOutboundHandler.FML_MESSAGETARGET
  property of your channel to the supplied dispatcher."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network NetworkHandshakeEstablished]))

(defn ->network-handshake-established
  "Constructor.

  dispatcher - `net.minecraftforge.fml.common.network.handshake.NetworkDispatcher`
  net-handler - `net.minecraft.network.INetHandler`
  origin - `net.minecraftforge.fml.relauncher.Side`"
  (^NetworkHandshakeEstablished [^net.minecraftforge.fml.common.network.handshake.NetworkDispatcher dispatcher ^net.minecraft.network.INetHandler net-handler ^net.minecraftforge.fml.relauncher.Side origin]
    (new NetworkHandshakeEstablished dispatcher net-handler origin)))

(defn dispatcher
  "Instance Constant.

  type: net.minecraftforge.fml.common.network.handshake.NetworkDispatcher"
  (^net.minecraftforge.fml.common.network.handshake.NetworkDispatcher [^NetworkHandshakeEstablished this]
    (-> this .-dispatcher)))

(defn side
  "Instance Constant.

  type: net.minecraftforge.fml.relauncher.Side"
  (^net.minecraftforge.fml.relauncher.Side [^NetworkHandshakeEstablished this]
    (-> this .-side)))

(defn net-handler
  "Instance Constant.

  type: net.minecraft.network.INetHandler"
  (^net.minecraft.network.INetHandler [^NetworkHandshakeEstablished this]
    (-> this .-netHandler)))

