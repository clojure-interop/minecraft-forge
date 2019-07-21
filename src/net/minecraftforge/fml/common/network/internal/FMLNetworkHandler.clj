(ns net.minecraftforge.fml.common.network.internal.FMLNetworkHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.internal FMLNetworkHandler]))

(defn ->fml-network-handler
  "Constructor."
  (^FMLNetworkHandler []
    (new FMLNetworkHandler )))

(def *-read-timeout
  "Static Constant.

  type: int"
  FMLNetworkHandler/READ_TIMEOUT)

(def *-login-timeout
  "Static Constant.

  type: int"
  FMLNetworkHandler/LOGIN_TIMEOUT)

(defn *fml-server-handshake
  "scm - `net.minecraft.server.management.PlayerList`
  manager - `net.minecraft.network.NetworkManager`
  player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^net.minecraft.server.management.PlayerList scm ^net.minecraft.network.NetworkManager manager ^net.minecraft.entity.player.EntityPlayerMP player]
    (FMLNetworkHandler/fmlServerHandshake scm manager player)))

(defn *fml-client-handshake
  "network-manager - `net.minecraft.network.NetworkManager`"
  ([^net.minecraft.network.NetworkManager network-manager]
    (FMLNetworkHandler/fmlClientHandshake network-manager)))

(defn *open-gui
  "entity-player - `net.minecraft.entity.player.EntityPlayer`
  mod - `java.lang.Object`
  mod-gui-id - `int`
  world - `net.minecraft.world.World`
  x - `int`
  y - `int`
  z - `int`"
  ([^net.minecraft.entity.player.EntityPlayer entity-player ^java.lang.Object mod ^Integer mod-gui-id ^net.minecraft.world.World world ^Integer x ^Integer y ^Integer z]
    (FMLNetworkHandler/openGui entity-player mod mod-gui-id world x y z)))

(defn *get-entity-spawning-packet
  "entity - `net.minecraft.entity.Entity`

  returns: `net.minecraft.network.Packet<?>`"
  (^net.minecraft.network.Packet [^net.minecraft.entity.Entity entity]
    (FMLNetworkHandler/getEntitySpawningPacket entity)))

(defn *check-mod-list
  "mod-list-packet - `net.minecraftforge.fml.common.network.handshake.FMLHandshakeMessage$ModList`
  side - `net.minecraftforge.fml.relauncher.Side`

  returns: `java.lang.String`"
  (^java.lang.String [^net.minecraftforge.fml.common.network.handshake.FMLHandshakeMessage$ModList mod-list-packet ^net.minecraftforge.fml.relauncher.Side side]
    (FMLNetworkHandler/checkModList mod-list-packet side)))

(defn *register-channel
  "container - `net.minecraftforge.fml.common.FMLContainer`
  side - `net.minecraftforge.fml.relauncher.Side`"
  ([^net.minecraftforge.fml.common.FMLContainer container ^net.minecraftforge.fml.relauncher.Side side]
    (FMLNetworkHandler/registerChannel container side)))

(defn *forward-handshake
  "push - `net.minecraftforge.fml.common.network.internal.FMLMessage$CompleteHandshake`
  target - `net.minecraftforge.fml.common.network.handshake.NetworkDispatcher`
  side - `net.minecraftforge.fml.relauncher.Side`

  returns: `java.util.List<net.minecraftforge.fml.common.network.internal.FMLProxyPacket>`"
  (^java.util.List [^net.minecraftforge.fml.common.network.internal.FMLMessage$CompleteHandshake push ^net.minecraftforge.fml.common.network.handshake.NetworkDispatcher target ^net.minecraftforge.fml.relauncher.Side side]
    (FMLNetworkHandler/forwardHandshake push target side)))

(defn *enhance-status-query
  "jsonobject - `com.google.gson.JsonObject`"
  ([^com.google.gson.JsonObject jsonobject]
    (FMLNetworkHandler/enhanceStatusQuery jsonobject)))

