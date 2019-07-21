(ns net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
  "A message handler based on IMessage. Implement and override onMessage(IMessage, MessageContext) to
  process your packet. Supply the class to SimpleNetworkWrapper.registerMessage(Class, Class, int, net.minecraftforge.fml.relauncher.Side)
  to register both the message type and it's associated handler."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.simpleimpl IMessageHandler]))

(defn on-message
  "Called when a message is received of the appropriate type. You can optionally return a reply message, or null if no reply
   is needed.

  message - The message - `REQ`
  ctx - `net.minecraftforge.fml.common.network.simpleimpl.MessageContext`

  returns: an optional return message - `REPLY`"
  ([^IMessageHandler this message ^net.minecraftforge.fml.common.network.simpleimpl.MessageContext ctx]
    (-> this (.onMessage message ctx))))

