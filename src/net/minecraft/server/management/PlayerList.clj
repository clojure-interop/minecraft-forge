(ns net.minecraft.server.management.PlayerList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.management PlayerList]))

(defn ->player-list
  "Constructor.

  server - `net.minecraft.server.MinecraftServer`"
  (^PlayerList [^net.minecraft.server.MinecraftServer server]
    (new PlayerList server)))

(def *-file-playerbans
  "Static Constant.

  type: java.io.File"
  PlayerList/FILE_PLAYERBANS)

(def *-file-ipbans
  "Static Constant.

  type: java.io.File"
  PlayerList/FILE_IPBANS)

(def *-file-ops
  "Static Constant.

  type: java.io.File"
  PlayerList/FILE_OPS)

(def *-file-whitelist
  "Static Constant.

  type: java.io.File"
  PlayerList/FILE_WHITELIST)

(defn remove-op
  "profile - `com.mojang.authlib.GameProfile`"
  ([^PlayerList this ^com.mojang.authlib.GameProfile profile]
    (-> this (.removeOp profile))))

(defn get-available-player-dat
  "returns: `java.lang.String[]`"
  ([^PlayerList this]
    (-> this (.getAvailablePlayerDat))))

(defn get-player-by-uuid
  "player-uuid - `java.util.UUID`

  returns: `net.minecraft.entity.player.EntityPlayerMP`"
  (^net.minecraft.entity.player.EntityPlayerMP [^PlayerList this ^java.util.UUID player-uuid]
    (-> this (.getPlayerByUUID player-uuid))))

(defn update-permission-level
  "player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^PlayerList this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.updatePermissionLevel player))))

(defn add-op
  "profile - `com.mojang.authlib.GameProfile`"
  ([^PlayerList this ^com.mojang.authlib.GameProfile profile]
    (-> this (.addOp profile))))

(defn get-server-instance
  "returns: `net.minecraft.server.MinecraftServer`"
  (^net.minecraft.server.MinecraftServer [^PlayerList this]
    (-> this (.getServerInstance))))

(defn get-opped-players
  "returns: `net.minecraft.server.management.UserListOps`"
  (^net.minecraft.server.management.UserListOps [^PlayerList this]
    (-> this (.getOppedPlayers))))

(defn get-player-stats-file
  "player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.stats.StatisticsManagerServer`"
  (^net.minecraft.stats.StatisticsManagerServer [^PlayerList this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.getPlayerStatsFile player-in))))

(defn set-view-distance
  "distance - `int`"
  ([^PlayerList this ^Integer distance]
    (-> this (.setViewDistance distance))))

(defn send-to-all-near-except
  "except - `net.minecraft.entity.player.EntityPlayer`
  x - `double`
  y - `double`
  z - `double`
  radius - `double`
  dimension - `int`
  packet-in - `net.minecraft.network.Packet`"
  ([^PlayerList this ^net.minecraft.entity.player.EntityPlayer except ^Double x ^Double y ^Double z ^Double radius ^Integer dimension ^net.minecraft.network.Packet packet-in]
    (-> this (.sendToAllNearExcept except x y z radius dimension packet-in))))

(defn get-max-players
  "returns: `int`"
  (^Integer [^PlayerList this]
    (-> this (.getMaxPlayers))))

(defn player-logged-in
  "player-in - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^PlayerList this ^net.minecraft.entity.player.EntityPlayerMP player-in]
    (-> this (.playerLoggedIn player-in))))

(defn get-view-distance
  "returns: `int`"
  (^Integer [^PlayerList this]
    (-> this (.getViewDistance))))

(defn set-white-list-enabled
  "whitelist-enabled - `boolean`"
  ([^PlayerList this ^Boolean whitelist-enabled]
    (-> this (.setWhiteListEnabled whitelist-enabled))))

(defn transfer-entity-to-world
  "entity-in - `net.minecraft.entity.Entity`
  last-dimension - `int`
  old-world-in - `net.minecraft.world.WorldServer`
  to-world-in - `net.minecraft.world.WorldServer`
  teleporter - `net.minecraft.world.Teleporter`"
  ([^PlayerList this ^net.minecraft.entity.Entity entity-in ^Integer last-dimension ^net.minecraft.world.WorldServer old-world-in ^net.minecraft.world.WorldServer to-world-in ^net.minecraft.world.Teleporter teleporter]
    (-> this (.transferEntityToWorld entity-in last-dimension old-world-in to-world-in teleporter)))
  ([^PlayerList this ^net.minecraft.entity.Entity entity-in ^Integer last-dimension ^net.minecraft.world.WorldServer old-world-in ^net.minecraft.world.WorldServer to-world-in]
    (-> this (.transferEntityToWorld entity-in last-dimension old-world-in to-world-in))))

(defn get-players
  "returns: `java.util.List<net.minecraft.entity.player.EntityPlayerMP>`"
  (^java.util.List [^PlayerList this]
    (-> this (.getPlayers))))

(defn player-logged-out
  "player-in - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^PlayerList this ^net.minecraft.entity.player.EntityPlayerMP player-in]
    (-> this (.playerLoggedOut player-in))))

(defn set-player-manager
  "world-servers - `net.minecraft.world.WorldServer[]`"
  ([^PlayerList this world-servers]
    (-> this (.setPlayerManager world-servers))))

(defn update-time-and-weather-for-player
  "player-in - `net.minecraft.entity.player.EntityPlayerMP`
  world-in - `net.minecraft.world.WorldServer`"
  ([^PlayerList this ^net.minecraft.entity.player.EntityPlayerMP player-in ^net.minecraft.world.WorldServer world-in]
    (-> this (.updateTimeAndWeatherForPlayer player-in world-in))))

(defn get-online-player-profiles
  "returns: `com.mojang.authlib.GameProfile[]`"
  ([^PlayerList this]
    (-> this (.getOnlinePlayerProfiles))))

(defn get-whitelisted-players
  "returns: `net.minecraft.server.management.UserListWhitelist`"
  (^net.minecraft.server.management.UserListWhitelist [^PlayerList this]
    (-> this (.getWhitelistedPlayers))))

(defn save-all-player-data
  ""
  ([^PlayerList this]
    (-> this (.saveAllPlayerData))))

(defn get-whitelisted-player-names
  "returns: `java.lang.String[]`"
  ([^PlayerList this]
    (-> this (.getWhitelistedPlayerNames))))

(defn get-online-player-names
  "returns: `java.lang.String[]`"
  ([^PlayerList this]
    (-> this (.getOnlinePlayerNames))))

(defn send-message-to-team-or-all-players
  "player - `net.minecraft.entity.player.EntityPlayer`
  message - `net.minecraft.util.text.ITextComponent`"
  ([^PlayerList this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.text.ITextComponent message]
    (-> this (.sendMessageToTeamOrAllPlayers player message))))

(defn send-message-to-all-team-members
  "player - `net.minecraft.entity.player.EntityPlayer`
  message - `net.minecraft.util.text.ITextComponent`"
  ([^PlayerList this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.text.ITextComponent message]
    (-> this (.sendMessageToAllTeamMembers player message))))

(defn initialize-connection-to-player
  "net-manager - `net.minecraft.network.NetworkManager`
  player-in - `net.minecraft.entity.player.EntityPlayerMP`
  nethandlerplayserver - `net.minecraft.network.NetHandlerPlayServer`"
  ([^PlayerList this ^net.minecraft.network.NetworkManager net-manager ^net.minecraft.entity.player.EntityPlayerMP player-in ^net.minecraft.network.NetHandlerPlayServer nethandlerplayserver]
    (-> this (.initializeConnectionToPlayer net-manager player-in nethandlerplayserver))))

(defn sync-player-inventory
  "player-in - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^PlayerList this ^net.minecraft.entity.player.EntityPlayerMP player-in]
    (-> this (.syncPlayerInventory player-in))))

(defn white-list-enabled?
  "returns: `boolean`"
  (^Boolean [^PlayerList this]
    (-> this (.isWhiteListEnabled))))

(defn get-opped-player-names
  "returns: `java.lang.String[]`"
  ([^PlayerList this]
    (-> this (.getOppedPlayerNames))))

(defn set-commands-allowed-for-all
  "p-72387-1 - `boolean`"
  ([^PlayerList this ^Boolean p-72387-1]
    (-> this (.setCommandsAllowedForAll p-72387-1))))

(defn send-message
  "component - `net.minecraft.util.text.ITextComponent`
  is-system - `boolean`"
  ([^PlayerList this ^net.minecraft.util.text.ITextComponent component ^Boolean is-system]
    (-> this (.sendMessage component is-system)))
  ([^PlayerList this ^net.minecraft.util.text.ITextComponent component]
    (-> this (.sendMessage component))))

(defn on-tick
  ""
  ([^PlayerList this]
    (-> this (.onTick))))

(defn can-send-commands?
  "profile - `com.mojang.authlib.GameProfile`

  returns: `boolean`"
  (^Boolean [^PlayerList this ^com.mojang.authlib.GameProfile profile]
    (-> this (.canSendCommands profile))))

(defn transfer-player-to-dimension
  "player - `net.minecraft.entity.player.EntityPlayerMP`
  dimension-in - `int`
  teleporter - `net.minecraft.world.Teleporter`"
  ([^PlayerList this ^net.minecraft.entity.player.EntityPlayerMP player ^Integer dimension-in ^net.minecraft.world.Teleporter teleporter]
    (-> this (.transferPlayerToDimension player dimension-in teleporter))))

(defn set-game-type
  "game-mode-in - `net.minecraft.world.GameType`"
  ([^PlayerList this ^net.minecraft.world.GameType game-mode-in]
    (-> this (.setGameType game-mode-in))))

(defn create-player-for-user
  "profile - `com.mojang.authlib.GameProfile`

  returns: `net.minecraft.entity.player.EntityPlayerMP`"
  (^net.minecraft.entity.player.EntityPlayerMP [^PlayerList this ^com.mojang.authlib.GameProfile profile]
    (-> this (.createPlayerForUser profile))))

(defn allow-user-to-connect
  "address - `java.net.SocketAddress`
  profile - `com.mojang.authlib.GameProfile`

  returns: `java.lang.String`"
  (^java.lang.String [^PlayerList this ^java.net.SocketAddress address ^com.mojang.authlib.GameProfile profile]
    (-> this (.allowUserToConnect address profile))))

(defn remove-all-players
  ""
  ([^PlayerList this]
    (-> this (.removeAllPlayers))))

(defn read-player-data-from-file
  "player-in - `net.minecraft.entity.player.EntityPlayerMP`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^PlayerList this ^net.minecraft.entity.player.EntityPlayerMP player-in]
    (-> this (.readPlayerDataFromFile player-in))))

(defn get-players-matching-address
  "address - `java.lang.String`

  returns: `java.util.List<net.minecraft.entity.player.EntityPlayerMP>`"
  (^java.util.List [^PlayerList this ^java.lang.String address]
    (-> this (.getPlayersMatchingAddress address))))

(defn get-host-player-data
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^PlayerList this]
    (-> this (.getHostPlayerData))))

(defn send-packet-to-all-players
  "packet-in - `net.minecraft.network.Packet`"
  ([^PlayerList this ^net.minecraft.network.Packet packet-in]
    (-> this (.sendPacketToAllPlayers packet-in))))

(defn reload-whitelist
  ""
  ([^PlayerList this]
    (-> this (.reloadWhitelist))))

(defn get-player-nbt
  "player - `net.minecraft.entity.player.EntityPlayerMP`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^PlayerList this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.getPlayerNBT player))))

(defn get-formatted-list-of-players
  "include-uui-ds - `boolean`

  returns: `java.lang.String`"
  (^java.lang.String [^PlayerList this ^Boolean include-uui-ds]
    (-> this (.getFormattedListOfPlayers include-uui-ds))))

(defn get-banned-i-ps
  "returns: `net.minecraft.server.management.UserListIPBans`"
  (^net.minecraft.server.management.UserListIPBans [^PlayerList this]
    (-> this (.getBannedIPs))))

(defn add-whitelisted-player
  "profile - `com.mojang.authlib.GameProfile`"
  ([^PlayerList this ^com.mojang.authlib.GameProfile profile]
    (-> this (.addWhitelistedPlayer profile))))

(defn server-update-moving-player
  "player-in - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^PlayerList this ^net.minecraft.entity.player.EntityPlayerMP player-in]
    (-> this (.serverUpdateMovingPlayer player-in))))

(defn remove-player-from-whitelist
  "profile - `com.mojang.authlib.GameProfile`"
  ([^PlayerList this ^com.mojang.authlib.GameProfile profile]
    (-> this (.removePlayerFromWhitelist profile))))

(defn get-player-by-username
  "username - `java.lang.String`

  returns: `net.minecraft.entity.player.EntityPlayerMP`"
  (^net.minecraft.entity.player.EntityPlayerMP [^PlayerList this ^java.lang.String username]
    (-> this (.getPlayerByUsername username))))

(defn prepare-player
  "player-in - `net.minecraft.entity.player.EntityPlayerMP`
  world-in - `net.minecraft.world.WorldServer`"
  ([^PlayerList this ^net.minecraft.entity.player.EntityPlayerMP player-in ^net.minecraft.world.WorldServer world-in]
    (-> this (.preparePlayer player-in world-in))))

(defn bypasses-player-limit
  "profile - `com.mojang.authlib.GameProfile`

  returns: `boolean`"
  (^Boolean [^PlayerList this ^com.mojang.authlib.GameProfile profile]
    (-> this (.bypassesPlayerLimit profile))))

(defn get-entity-view-distance
  "returns: `int`"
  (^Integer [^PlayerList this]
    (-> this (.getEntityViewDistance))))

(defn send-packet-to-all-players-in-dimension
  "packet-in - `net.minecraft.network.Packet`
  dimension - `int`"
  ([^PlayerList this ^net.minecraft.network.Packet packet-in ^Integer dimension]
    (-> this (.sendPacketToAllPlayersInDimension packet-in dimension))))

(defn can-join?
  "profile - `com.mojang.authlib.GameProfile`

  returns: `boolean`"
  (^Boolean [^PlayerList this ^com.mojang.authlib.GameProfile profile]
    (-> this (.canJoin profile))))

(defn recreate-player-entity
  "player-in - `net.minecraft.entity.player.EntityPlayerMP`
  dimension - `int`
  conquered-end - `boolean`

  returns: `net.minecraft.entity.player.EntityPlayerMP`"
  (^net.minecraft.entity.player.EntityPlayerMP [^PlayerList this ^net.minecraft.entity.player.EntityPlayerMP player-in ^Integer dimension ^Boolean conquered-end]
    (-> this (.recreatePlayerEntity player-in dimension conquered-end))))

(defn change-player-dimension
  "player - `net.minecraft.entity.player.EntityPlayerMP`
  dimension-in - `int`"
  ([^PlayerList this ^net.minecraft.entity.player.EntityPlayerMP player ^Integer dimension-in]
    (-> this (.changePlayerDimension player dimension-in))))

(defn get-banned-players
  "returns: `net.minecraft.server.management.UserListBans`"
  (^net.minecraft.server.management.UserListBans [^PlayerList this]
    (-> this (.getBannedPlayers))))

(defn get-current-player-count
  "returns: `int`"
  (^Integer [^PlayerList this]
    (-> this (.getCurrentPlayerCount))))

