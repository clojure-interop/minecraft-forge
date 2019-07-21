(ns net.minecraft.server.MinecraftServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server MinecraftServer]))

(defn ->minecraft-server
  "Constructor.

  anvil-file-in - `java.io.File`
  proxy-in - `java.net.Proxy`
  data-fixer-in - `net.minecraft.util.datafix.DataFixer`
  auth-service-in - `com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService`
  session-service-in - `com.mojang.authlib.minecraft.MinecraftSessionService`
  profile-repo-in - `com.mojang.authlib.GameProfileRepository`
  profile-cache-in - `net.minecraft.server.management.PlayerProfileCache`"
  (^MinecraftServer [^java.io.File anvil-file-in ^java.net.Proxy proxy-in ^net.minecraft.util.datafix.DataFixer data-fixer-in ^com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService auth-service-in ^com.mojang.authlib.minecraft.MinecraftSessionService session-service-in ^com.mojang.authlib.GameProfileRepository profile-repo-in ^net.minecraft.server.management.PlayerProfileCache profile-cache-in]
    (new MinecraftServer anvil-file-in proxy-in data-fixer-in auth-service-in session-service-in profile-repo-in profile-cache-in)))

(def *-user-cache-file
  "Static Constant.

  type: java.io.File"
  MinecraftServer/USER_CACHE_FILE)

(defn command-manager
  "Instance Constant.

  type: net.minecraft.command.ICommandManager"
  (^net.minecraft.command.ICommandManager [^MinecraftServer this]
    (-> this .-commandManager)))

(defn the-profiler
  "Instance Constant.

  type: net.minecraft.profiler.Profiler"
  (^net.minecraft.profiler.Profiler [^MinecraftServer this]
    (-> this .-theProfiler)))

(defn worlds
  "Instance Field.

  type: net.minecraft.world.WorldServer[]"
  ([^MinecraftServer this]
    (-> this .-worlds)))

(defn current-task
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^MinecraftServer this]
    (-> this .-currentTask)))

(defn percent-done
  "Instance Field.

  type: int"
  (^Integer [^MinecraftServer this]
    (-> this .-percentDone)))

(defn tick-time-array
  "Instance Constant.

  type: long[]"
  ([^MinecraftServer this]
    (-> this .-tickTimeArray)))

(defn world-tick-times
  "Instance Field.

  type: java.util.Hashtable<java.lang.Integer,long[]>"
  ([^MinecraftServer this]
    (-> this .-worldTickTimes)))

(defn future-task-queue
  "Instance Constant.

  type: java.util.Queue<java.util.concurrent.FutureTask<?>>"
  (^java.util.Queue [^MinecraftServer this]
    (-> this .-futureTaskQueue)))

(defn *get-current-time-millis
  "returns: `long`"
  (^Long []
    (MinecraftServer/getCurrentTimeMillis )))

(defn *main
  "p-main-0 - `java.lang.String[]`"
  ([p-main-0]
    (MinecraftServer/main p-main-0)))

(defn debugging-enabled?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.isDebuggingEnabled))))

(defn get-op-permission-level
  "returns: `int`"
  (^Integer [^MinecraftServer this]
    (-> this (.getOpPermissionLevel))))

(defn log-severe
  "msg - `java.lang.String`"
  ([^MinecraftServer this ^java.lang.String msg]
    (-> this (.logSevere msg))))

(defn demo?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.isDemo))))

(defn add-server-type-to-snooper
  "player-snooper - `net.minecraft.profiler.Snooper`"
  ([^MinecraftServer this ^net.minecraft.profiler.Snooper player-snooper]
    (-> this (.addServerTypeToSnooper player-snooper))))

(defn dedicated-server?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.isDedicatedServer))))

(defn get-gui-enabled?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.getGuiEnabled))))

(defn get-player-list
  "returns: `net.minecraft.server.management.PlayerList`"
  (^net.minecraft.server.management.PlayerList [^MinecraftServer this]
    (-> this (.getPlayerList))))

(defn get-data-directory
  "returns: `java.io.File`"
  (^java.io.File [^MinecraftServer this]
    (-> this (.getDataDirectory))))

(defn set-server-owner
  "owner - `java.lang.String`"
  ([^MinecraftServer this ^java.lang.String owner]
    (-> this (.setServerOwner owner))))

(defn tick
  ""
  ([^MinecraftServer this]
    (-> this (.tick))))

(defn announcing-player-achievements?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.isAnnouncingPlayerAchievements))))

(defn world-icon-set?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.isWorldIconSet))))

(defn get-max-player-idle-minutes
  "returns: `int`"
  (^Integer [^MinecraftServer this]
    (-> this (.getMaxPlayerIdleMinutes))))

(defn get-tab-completions
  "sender - `net.minecraft.command.ICommandSender`
  input - `java.lang.String`
  pos - `net.minecraft.util.math.BlockPos`
  has-target-block - `boolean`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^MinecraftServer this ^net.minecraft.command.ICommandSender sender ^java.lang.String input ^net.minecraft.util.math.BlockPos pos ^Boolean has-target-block]
    (-> this (.getTabCompletions sender input pos has-target-block))))

(defn start-server-thread
  ""
  ([^MinecraftServer this]
    (-> this (.startServerThread))))

(defn should-broadcast-rcon-to-ops?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.shouldBroadcastRconToOps))))

(defn allow-spawn-monsters
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.allowSpawnMonsters))))

(defn get-server-status-response
  "returns: `net.minecraft.network.ServerStatusResponse`"
  (^net.minecraft.network.ServerStatusResponse [^MinecraftServer this]
    (-> this (.getServerStatusResponse))))

(defn get-command-sender-entity
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^MinecraftServer this]
    (-> this (.getCommandSenderEntity))))

(defn get-position-vector
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^MinecraftServer this]
    (-> this (.getPositionVector))))

(defn get-server-mod-name
  "returns: `java.lang.String`"
  (^java.lang.String [^MinecraftServer this]
    (-> this (.getServerModName))))

(defn get-max-players
  "returns: `int`"
  (^Integer [^MinecraftServer this]
    (-> this (.getMaxPlayers))))

(defn get-world-icon-file
  "returns: `java.io.File`"
  (^java.io.File [^MinecraftServer this]
    (-> this (.getWorldIconFile))))

(defn get-max-world-size
  "returns: `int`"
  (^Integer [^MinecraftServer this]
    (-> this (.getMaxWorldSize))))

(defn should-broadcast-console-to-ops?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.shouldBroadcastConsoleToOps))))

(defn server-in-online-mode?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.isServerInOnlineMode))))

(defn set-force-gamemode
  "force - `boolean`"
  ([^MinecraftServer this ^Boolean force]
    (-> this (.setForceGamemode force))))

(defn server-is-in-run-loop
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.serverIsInRunLoop))))

(defn should-use-native-transport?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.shouldUseNativeTransport))))

(defn get-minecraft-session-service
  "returns: `com.mojang.authlib.minecraft.MinecraftSessionService`"
  (^com.mojang.authlib.minecraft.MinecraftSessionService [^MinecraftServer this]
    (-> this (.getMinecraftSessionService))))

(defn set-prevent-proxy-connections
  "p-190517-1 - `boolean`"
  ([^MinecraftServer this ^Boolean p-190517-1]
    (-> this (.setPreventProxyConnections p-190517-1))))

(defn get-allow-nether?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.getAllowNether))))

(defn refresh-status-next-tick
  ""
  ([^MinecraftServer this]
    (-> this (.refreshStatusNextTick))))

(defn get-server
  "returns: `net.minecraft.server.MinecraftServer`"
  (^net.minecraft.server.MinecraftServer [^MinecraftServer this]
    (-> this (.getServer))))

(defn set-can-spawn-animals
  "spawn-animals - `boolean`"
  ([^MinecraftServer this ^Boolean spawn-animals]
    (-> this (.setCanSpawnAnimals spawn-animals))))

(defn save-all-worlds
  "is-silent - `boolean`"
  ([^MinecraftServer this ^Boolean is-silent]
    (-> this (.saveAllWorlds is-silent))))

(defn get-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^MinecraftServer this]
    (-> this (.getPosition))))

(defn get-tick-counter
  "returns: `int`"
  (^Integer [^MinecraftServer this]
    (-> this (.getTickCounter))))

(defn set-can-spawn-np-cs
  "spawn-npcs - `boolean`"
  ([^MinecraftServer this ^Boolean spawn-npcs]
    (-> this (.setCanSpawnNPCs spawn-npcs))))

(defn register-tickable
  "tickable - `net.minecraft.util.ITickable`"
  ([^MinecraftServer this ^net.minecraft.util.ITickable tickable]
    (-> this (.registerTickable tickable))))

(defn set-server-port
  "port - `int`"
  ([^MinecraftServer this ^Integer port]
    (-> this (.setServerPort port))))

(defn set-resource-pack-from-world
  "world-name-in - `java.lang.String`
  save-handler-in - `net.minecraft.world.storage.ISaveHandler`"
  ([^MinecraftServer this ^java.lang.String world-name-in ^net.minecraft.world.storage.ISaveHandler save-handler-in]
    (-> this (.setResourcePackFromWorld world-name-in save-handler-in))))

(defn set-command-stat
  "type - `net.minecraft.command.CommandResultStats$Type`
  amount - `int`"
  ([^MinecraftServer this ^net.minecraft.command.CommandResultStats$Type type ^Integer amount]
    (-> this (.setCommandStat type amount))))

(defn get-game-profile-repository
  "returns: `com.mojang.authlib.GameProfileRepository`"
  (^com.mojang.authlib.GameProfileRepository [^MinecraftServer this]
    (-> this (.getGameProfileRepository))))

(defn get-online-player-profiles
  "returns: `com.mojang.authlib.GameProfile[]`"
  ([^MinecraftServer this]
    (-> this (.getOnlinePlayerProfiles))))

(defn set-motd
  "motd-in - `java.lang.String`"
  ([^MinecraftServer this ^java.lang.String motd-in]
    (-> this (.setMOTD motd-in))))

(defn run
  ""
  ([^MinecraftServer this]
    (-> this (.run))))

(defn add-scheduled-task
  "runnable-to-schedule - `java.lang.Runnable`

  returns: `com.google.common.util.concurrent.ListenableFuture<java.lang.Object>`"
  (^com.google.common.util.concurrent.ListenableFuture [^MinecraftServer this ^java.lang.Runnable runnable-to-schedule]
    (-> this (.addScheduledTask runnable-to-schedule))))

(defn get-server-port
  "returns: `int`"
  (^Integer [^MinecraftServer this]
    (-> this (.getServerPort))))

(defn get-can-spawn-animals?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.getCanSpawnAnimals))))

(defn update-time-light-and-entities
  ""
  ([^MinecraftServer this]
    (-> this (.updateTimeLightAndEntities))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^MinecraftServer this]
    (-> this (.getDisplayName))))

(defn get-network-compression-threshold
  "returns: `int`"
  (^Integer [^MinecraftServer this]
    (-> this (.getNetworkCompressionThreshold))))

(defn get-server-hostname
  "returns: `java.lang.String`"
  (^java.lang.String [^MinecraftServer this]
    (-> this (.getServerHostname))))

(defn log-warning
  "msg - `java.lang.String`"
  ([^MinecraftServer this ^java.lang.String msg]
    (-> this (.logWarning msg))))

(defn get-online-player-names
  "returns: `java.lang.String[]`"
  ([^MinecraftServer this]
    (-> this (.getOnlinePlayerNames))))

(defn add-server-stats-to-snooper
  "player-snooper - `net.minecraft.profiler.Snooper`"
  ([^MinecraftServer this ^net.minecraft.profiler.Snooper player-snooper]
    (-> this (.addServerStatsToSnooper player-snooper))))

(defn flight-allowed?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.isFlightAllowed))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^MinecraftServer this]
    (-> this (.getName))))

(defn apply-server-icon-to-response
  "response - `net.minecraft.network.ServerStatusResponse`"
  ([^MinecraftServer this ^net.minecraft.network.ServerStatusResponse response]
    (-> this (.applyServerIconToResponse response))))

(defn get-build-limit
  "returns: `int`"
  (^Integer [^MinecraftServer this]
    (-> this (.getBuildLimit))))

(defn get-resource-pack-hash
  "returns: `java.lang.String`"
  (^java.lang.String [^MinecraftServer this]
    (-> this (.getResourcePackHash))))

(defn get-can-spawn-np-cs?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.getCanSpawnNPCs))))

(defn get-player-usage-snooper
  "returns: `net.minecraft.profiler.Snooper`"
  (^net.minecraft.profiler.Snooper [^MinecraftServer this]
    (-> this (.getPlayerUsageSnooper))))

(defn send-message
  "component - `net.minecraft.util.text.ITextComponent`"
  ([^MinecraftServer this ^net.minecraft.util.text.ITextComponent component]
    (-> this (.sendMessage component))))

(defn send-command-feedback
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.sendCommandFeedback))))

(defn log-info
  "msg - `java.lang.String`"
  ([^MinecraftServer this ^java.lang.String msg]
    (-> this (.logInfo msg))))

(defn set-demo
  "demo - `boolean`"
  ([^MinecraftServer this ^Boolean demo]
    (-> this (.setDemo demo))))

(defn get-server-proxy
  "returns: `java.net.Proxy`"
  (^java.net.Proxy [^MinecraftServer this]
    (-> this (.getServerProxy))))

(defn can-structures-spawn?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.canStructuresSpawn))))

(defn enable-profiling
  ""
  ([^MinecraftServer this]
    (-> this (.enableProfiling))))

(defn call-from-main-thread
  "callable - `java.util.concurrent.Callable`

  returns: `<V> com.google.common.util.concurrent.ListenableFuture<V>`"
  ([^MinecraftServer this ^java.util.concurrent.Callable callable]
    (-> this (.callFromMainThread callable))))

(defn get-folder-name
  "returns: `java.lang.String`"
  (^java.lang.String [^MinecraftServer this]
    (-> this (.getFolderName))))

(defn set-game-type
  "game-mode - `net.minecraft.world.GameType`"
  ([^MinecraftServer this ^net.minecraft.world.GameType game-mode]
    (-> this (.setGameType game-mode))))

(defn command-block-enabled?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.isCommandBlockEnabled))))

(defn set-build-limit
  "max-build-height - `int`"
  ([^MinecraftServer this ^Integer max-build-height]
    (-> this (.setBuildLimit max-build-height))))

(defn get-user-message
  "returns: `java.lang.String`"
  (^java.lang.String [^MinecraftServer this]
    (-> this (.getUserMessage))))

(defn get-entity-from-uuid
  "uuid - `java.util.UUID`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^MinecraftServer this ^java.util.UUID uuid]
    (-> this (.getEntityFromUuid uuid))))

(defn share-to-lan
  "type - `net.minecraft.world.GameType`
  allow-cheats - `boolean`

  returns: `java.lang.String`"
  (^java.lang.String [^MinecraftServer this ^net.minecraft.world.GameType type ^Boolean allow-cheats]
    (-> this (.shareToLAN type allow-cheats))))

(defn hardcore?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.isHardcore))))

(defn get-key-pair
  "returns: `java.security.KeyPair`"
  (^java.security.KeyPair [^MinecraftServer this]
    (-> this (.getKeyPair))))

(defn get-game-type
  "returns: `net.minecraft.world.GameType`"
  (^net.minecraft.world.GameType [^MinecraftServer this]
    (-> this (.getGameType))))

(defn final-tick
  "report - `net.minecraft.crash.CrashReport`"
  ([^MinecraftServer this ^net.minecraft.crash.CrashReport report]
    (-> this (.finalTick report))))

(defn initial-world-chunk-load
  ""
  ([^MinecraftServer this]
    (-> this (.initialWorldChunkLoad))))

(defn set-hostname
  "host - `java.lang.String`"
  ([^MinecraftServer this ^java.lang.String host]
    (-> this (.setHostname host))))

(defn server-stopped?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.isServerStopped))))

(defn get-current-time
  "returns: `long`"
  (^Long [^MinecraftServer this]
    (-> this (.getCurrentTime))))

(defn get-entity-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^MinecraftServer this]
    (-> this (.getEntityWorld))))

(defn set-folder-name
  "name - `java.lang.String`"
  ([^MinecraftServer this ^java.lang.String name]
    (-> this (.setFolderName name))))

(defn snooper-enabled?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.isSnooperEnabled))))

(defn pvp-enabled?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.isPVPEnabled))))

(defn get-prevent-proxy-connections?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.getPreventProxyConnections))))

(defn log-debug
  "msg - `java.lang.String`"
  ([^MinecraftServer this ^java.lang.String msg]
    (-> this (.logDebug msg))))

(defn system-exit-now
  ""
  ([^MinecraftServer this]
    (-> this (.systemExitNow))))

(defn stop-server
  ""
  ([^MinecraftServer this]
    (-> this (.stopServer))))

(defn set-allow-flight
  "allow - `boolean`"
  ([^MinecraftServer this ^Boolean allow]
    (-> this (.setAllowFlight allow))))

(defn set-resource-pack
  "url - `java.lang.String`
  hash - `java.lang.String`"
  ([^MinecraftServer this ^java.lang.String url ^java.lang.String hash]
    (-> this (.setResourcePack url hash))))

(defn set-online-mode
  "online - `boolean`"
  ([^MinecraftServer this ^Boolean online]
    (-> this (.setOnlineMode online))))

(defn get-world-name
  "returns: `java.lang.String`"
  (^java.lang.String [^MinecraftServer this]
    (-> this (.getWorldName))))

(defn block-protected?
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^MinecraftServer this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.isBlockProtected world-in pos player-in))))

(defn can-create-bonus-chest
  "enable - `boolean`"
  ([^MinecraftServer this ^Boolean enable]
    (-> this (.canCreateBonusChest enable))))

(defn convert-map-if-needed
  "world-name-in - `java.lang.String`"
  ([^MinecraftServer this ^java.lang.String world-name-in]
    (-> this (.convertMapIfNeeded world-name-in))))

(defn set-allow-pvp
  "allow-pvp - `boolean`"
  ([^MinecraftServer this ^Boolean allow-pvp]
    (-> this (.setAllowPvp allow-pvp))))

(defn set-difficulty-for-all-worlds
  "difficulty - `net.minecraft.world.EnumDifficulty`"
  ([^MinecraftServer this ^net.minecraft.world.EnumDifficulty difficulty]
    (-> this (.setDifficultyForAllWorlds difficulty))))

(defn get-force-gamemode?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.getForceGamemode))))

(defn world-server-for-dimension
  "dimension - `int`

  returns: `net.minecraft.world.WorldServer`"
  (^net.minecraft.world.WorldServer [^MinecraftServer this ^Integer dimension]
    (-> this (.worldServerForDimension dimension))))

(defn get-data-fixer
  "returns: `net.minecraft.util.datafix.DataFixer`"
  (^net.minecraft.util.datafix.DataFixer [^MinecraftServer this]
    (-> this (.getDataFixer))))

(defn add-server-info-to-crash-report
  "report - `net.minecraft.crash.CrashReport`

  returns: `net.minecraft.crash.CrashReport`"
  (^net.minecraft.crash.CrashReport [^MinecraftServer this ^net.minecraft.crash.CrashReport report]
    (-> this (.addServerInfoToCrashReport report))))

(defn init
  "returns: `boolean`

  throws: java.io.IOException"
  (^Boolean [^MinecraftServer this]
    (-> this (.init))))

(defn set-key-pair
  "key-pair - `java.security.KeyPair`"
  ([^MinecraftServer this ^java.security.KeyPair key-pair]
    (-> this (.setKeyPair key-pair))))

(defn server-running?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.isServerRunning))))

(defn initiate-shutdown
  ""
  ([^MinecraftServer this]
    (-> this (.initiateShutdown))))

(defn get-file
  "file-name - `java.lang.String`

  returns: `java.io.File`"
  (^java.io.File [^MinecraftServer this ^java.lang.String file-name]
    (-> this (.getFile file-name))))

(defn can-use-command?
  "perm-level - `int`
  command-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^MinecraftServer this ^Integer perm-level ^java.lang.String command-name]
    (-> this (.canUseCommand perm-level command-name))))

(defn set-world-name
  "world-name-in - `java.lang.String`"
  ([^MinecraftServer this ^java.lang.String world-name-in]
    (-> this (.setWorldName world-name-in))))

(defn get-motd
  "returns: `java.lang.String`"
  (^java.lang.String [^MinecraftServer this]
    (-> this (.getMOTD))))

(defn single-player?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.isSinglePlayer))))

(defn calling-from-minecraft-thread?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.isCallingFromMinecraftThread))))

(defn get-player-profile-cache
  "returns: `net.minecraft.server.management.PlayerProfileCache`"
  (^net.minecraft.server.management.PlayerProfileCache [^MinecraftServer this]
    (-> this (.getPlayerProfileCache))))

(defn get-spawn-protection-size
  "returns: `int`"
  (^Integer [^MinecraftServer this]
    (-> this (.getSpawnProtectionSize))))

(defn get-minecraft-version
  "returns: `java.lang.String`"
  (^java.lang.String [^MinecraftServer this]
    (-> this (.getMinecraftVersion))))

(defn get-server-owner
  "returns: `java.lang.String`"
  (^java.lang.String [^MinecraftServer this]
    (-> this (.getServerOwner))))

(defn create-command-manager
  "returns: `net.minecraft.command.ServerCommandManager`"
  (^net.minecraft.command.ServerCommandManager [^MinecraftServer this]
    (-> this (.createCommandManager))))

(defn get-server-thread
  "returns: `java.lang.Thread`"
  (^java.lang.Thread [^MinecraftServer this]
    (-> this (.getServerThread))))

(defn get-difficulty
  "returns: `net.minecraft.world.EnumDifficulty`"
  (^net.minecraft.world.EnumDifficulty [^MinecraftServer this]
    (-> this (.getDifficulty))))

(defn get-spawn-radius
  "world-in - `net.minecraft.world.WorldServer`

  returns: `int`"
  (^Integer [^MinecraftServer this ^net.minecraft.world.WorldServer world-in]
    (-> this (.getSpawnRadius world-in))))

(defn get-resource-pack-url
  "returns: `java.lang.String`"
  (^java.lang.String [^MinecraftServer this]
    (-> this (.getResourcePackUrl))))

(defn get-active-anvil-converter
  "returns: `net.minecraft.world.storage.ISaveFormat`"
  (^net.minecraft.world.storage.ISaveFormat [^MinecraftServer this]
    (-> this (.getActiveAnvilConverter))))

(defn set-player-list
  "list - `net.minecraft.server.management.PlayerList`"
  ([^MinecraftServer this ^net.minecraft.server.management.PlayerList list]
    (-> this (.setPlayerList list))))

(defn get-network-system
  "returns: `net.minecraft.network.NetworkSystem`"
  (^net.minecraft.network.NetworkSystem [^MinecraftServer this]
    (-> this (.getNetworkSystem))))

(defn get-command-manager
  "returns: `net.minecraft.command.ICommandManager`"
  (^net.minecraft.command.ICommandManager [^MinecraftServer this]
    (-> this (.getCommandManager))))

(defn load-all-worlds
  "save-name - `java.lang.String`
  world-name-in - `java.lang.String`
  seed - `long`
  type - `net.minecraft.world.WorldType`
  generator-options - `java.lang.String`"
  ([^MinecraftServer this ^java.lang.String save-name ^java.lang.String world-name-in ^Long seed ^net.minecraft.world.WorldType type ^java.lang.String generator-options]
    (-> this (.loadAllWorlds save-name world-name-in seed type generator-options))))

(defn set-player-idle-timeout
  "idle-timeout - `int`"
  ([^MinecraftServer this ^Integer idle-timeout]
    (-> this (.setPlayerIdleTimeout idle-timeout))))

(defn anvil-file-set?
  "returns: `boolean`"
  (^Boolean [^MinecraftServer this]
    (-> this (.isAnvilFileSet))))

(defn get-current-player-count
  "returns: `int`"
  (^Integer [^MinecraftServer this]
    (-> this (.getCurrentPlayerCount))))

