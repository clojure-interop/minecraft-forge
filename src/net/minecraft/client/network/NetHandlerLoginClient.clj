(ns net.minecraft.client.network.NetHandlerLoginClient
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.network NetHandlerLoginClient]))

(defn ->net-handler-login-client
  "Constructor.

  network-manager-in - `net.minecraft.network.NetworkManager`
  mc-in - `net.minecraft.client.Minecraft`
  previous-screen-in - `net.minecraft.client.gui.GuiScreen`"
  (^NetHandlerLoginClient [^net.minecraft.network.NetworkManager network-manager-in ^net.minecraft.client.Minecraft mc-in ^net.minecraft.client.gui.GuiScreen previous-screen-in]
    (new NetHandlerLoginClient network-manager-in mc-in previous-screen-in)))

(defn handle-encryption-request
  "packet-in - `net.minecraft.network.login.server.SPacketEncryptionRequest`"
  ([^NetHandlerLoginClient this ^net.minecraft.network.login.server.SPacketEncryptionRequest packet-in]
    (-> this (.handleEncryptionRequest packet-in))))

(defn handle-login-success
  "packet-in - `net.minecraft.network.login.server.SPacketLoginSuccess`"
  ([^NetHandlerLoginClient this ^net.minecraft.network.login.server.SPacketLoginSuccess packet-in]
    (-> this (.handleLoginSuccess packet-in))))

(defn on-disconnect
  "reason - `net.minecraft.util.text.ITextComponent`"
  ([^NetHandlerLoginClient this ^net.minecraft.util.text.ITextComponent reason]
    (-> this (.onDisconnect reason))))

(defn handle-disconnect
  "packet-in - `net.minecraft.network.login.server.SPacketDisconnect`"
  ([^NetHandlerLoginClient this ^net.minecraft.network.login.server.SPacketDisconnect packet-in]
    (-> this (.handleDisconnect packet-in))))

(defn handle-enable-compression
  "packet-in - `net.minecraft.network.login.server.SPacketEnableCompression`"
  ([^NetHandlerLoginClient this ^net.minecraft.network.login.server.SPacketEnableCompression packet-in]
    (-> this (.handleEnableCompression packet-in))))

