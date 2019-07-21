(ns net.minecraft.server.integrated.IntegratedPlayerList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.integrated IntegratedPlayerList]))

(defn ->integrated-player-list
  "Constructor.

  server - `net.minecraft.server.integrated.IntegratedServer`"
  (^IntegratedPlayerList [^net.minecraft.server.integrated.IntegratedServer server]
    (new IntegratedPlayerList server)))

(defn allow-user-to-connect
  "address - `java.net.SocketAddress`
  profile - `com.mojang.authlib.GameProfile`

  returns: `java.lang.String`"
  (^java.lang.String [^IntegratedPlayerList this ^java.net.SocketAddress address ^com.mojang.authlib.GameProfile profile]
    (-> this (.allowUserToConnect address profile))))

(defn get-server-instance
  "returns: `net.minecraft.server.integrated.IntegratedServer`"
  (^net.minecraft.server.integrated.IntegratedServer [^IntegratedPlayerList this]
    (-> this (.getServerInstance))))

(defn get-host-player-data
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^IntegratedPlayerList this]
    (-> this (.getHostPlayerData))))

