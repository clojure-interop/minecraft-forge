(ns net.minecraftforge.fml.common.network.simpleimpl.MessageContext
  "Context for the IMessageHandler"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.simpleimpl MessageContext]))

(defn net-handler
  "Instance Constant.

  The INetHandler for this message. It could be a client or server handler, depending
   on the side received.

  type: net.minecraft.network.INetHandler"
  (^net.minecraft.network.INetHandler [^MessageContext this]
    (-> this .-netHandler)))

(defn side
  "Instance Constant.

  The Side this message has been received on

  type: net.minecraftforge.fml.relauncher.Side"
  (^net.minecraftforge.fml.relauncher.Side [^MessageContext this]
    (-> this .-side)))

(defn get-server-handler
  "returns: `net.minecraft.network.NetHandlerPlayServer`"
  (^net.minecraft.network.NetHandlerPlayServer [^MessageContext this]
    (-> this (.getServerHandler))))

(defn get-client-handler
  "returns: `net.minecraft.client.network.NetHandlerPlayClient`"
  (^net.minecraft.client.network.NetHandlerPlayClient [^MessageContext this]
    (-> this (.getClientHandler))))

