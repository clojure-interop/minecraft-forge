(ns net.minecraft.server.dedicated.DedicatedServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.dedicated DedicatedServer]))

(defn ->dedicated-server
  "Constructor.

  anvil-file-in - `java.io.File`
  data-fixer-in - `net.minecraft.util.datafix.DataFixer`
  auth-service-in - `com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService`
  session-service-in - `com.mojang.authlib.minecraft.MinecraftSessionService`
  profile-repo-in - `com.mojang.authlib.GameProfileRepository`
  profile-cache-in - `net.minecraft.server.management.PlayerProfileCache`"
  (^DedicatedServer [^java.io.File anvil-file-in ^net.minecraft.util.datafix.DataFixer data-fixer-in ^com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService auth-service-in ^com.mojang.authlib.minecraft.MinecraftSessionService session-service-in ^com.mojang.authlib.GameProfileRepository profile-repo-in ^net.minecraft.server.management.PlayerProfileCache profile-cache-in]
    (new DedicatedServer anvil-file-in data-fixer-in auth-service-in session-service-in profile-repo-in profile-cache-in)))

(defn pending-command-list
  "Instance Constant.

  type: java.util.List<net.minecraft.server.dedicated.PendingCommand>"
  (^java.util.List [^DedicatedServer this]
    (-> this .-pendingCommandList)))

(defn *-allow-player-logins
  "Static Field.

  type: boolean"
  []
  DedicatedServer/allowPlayerLogins)

(defn get-op-permission-level
  "returns: `int`"
  (^Integer [^DedicatedServer this]
    (-> this (.getOpPermissionLevel))))

(defn dedicated-server?
  "returns: `boolean`"
  (^Boolean [^DedicatedServer this]
    (-> this (.isDedicatedServer))))

(defn get-gui-enabled?
  "returns: `boolean`"
  (^Boolean [^DedicatedServer this]
    (-> this (.getGuiEnabled))))

(defn get-player-list
  "returns: `net.minecraft.server.dedicated.DedicatedPlayerList`"
  (^net.minecraft.server.dedicated.DedicatedPlayerList [^DedicatedServer this]
    (-> this (.getPlayerList))))

(defn announcing-player-achievements?
  "returns: `boolean`"
  (^Boolean [^DedicatedServer this]
    (-> this (.isAnnouncingPlayerAchievements))))

(defn should-broadcast-rcon-to-ops?
  "returns: `boolean`"
  (^Boolean [^DedicatedServer this]
    (-> this (.shouldBroadcastRconToOps))))

(defn allow-spawn-monsters
  "returns: `boolean`"
  (^Boolean [^DedicatedServer this]
    (-> this (.allowSpawnMonsters))))

(defn get-motd
  "returns: `java.lang.String`"
  (^java.lang.String [^DedicatedServer this]
    (-> this (.getMotd))))

(defn execute-pending-commands
  ""
  ([^DedicatedServer this]
    (-> this (.executePendingCommands))))

(defn get-max-world-size
  "returns: `int`"
  (^Integer [^DedicatedServer this]
    (-> this (.getMaxWorldSize))))

(defn should-broadcast-console-to-ops?
  "returns: `boolean`"
  (^Boolean [^DedicatedServer this]
    (-> this (.shouldBroadcastConsoleToOps))))

(defn should-use-native-transport?
  "returns: `boolean`"
  (^Boolean [^DedicatedServer this]
    (-> this (.shouldUseNativeTransport))))

(defn get-string-property
  "key - `java.lang.String`
  default-value - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^DedicatedServer this ^java.lang.String key ^java.lang.String default-value]
    (-> this (.getStringProperty key default-value))))

(defn get-allow-nether?
  "returns: `boolean`"
  (^Boolean [^DedicatedServer this]
    (-> this (.getAllowNether))))

(defn get-hostname
  "returns: `java.lang.String`"
  (^java.lang.String [^DedicatedServer this]
    (-> this (.getHostname))))

(defn get-plugins
  "returns: `java.lang.String`"
  (^java.lang.String [^DedicatedServer this]
    (-> this (.getPlugins))))

(defn load-resource-pack-sha
  "returns: `java.lang.String`"
  (^java.lang.String [^DedicatedServer this]
    (-> this (.loadResourcePackSHA))))

(defn get-boolean-property?
  "key - `java.lang.String`
  default-value - `boolean`

  returns: `boolean`"
  (^Boolean [^DedicatedServer this ^java.lang.String key ^Boolean default-value]
    (-> this (.getBooleanProperty key default-value))))

(defn add-pending-command
  "input - `java.lang.String`
  sender - `net.minecraft.command.ICommandSender`"
  ([^DedicatedServer this ^java.lang.String input ^net.minecraft.command.ICommandSender sender]
    (-> this (.addPendingCommand input sender))))

(defn update-time-light-and-entities
  ""
  ([^DedicatedServer this]
    (-> this (.updateTimeLightAndEntities))))

(defn get-network-compression-threshold
  "returns: `int`"
  (^Integer [^DedicatedServer this]
    (-> this (.getNetworkCompressionThreshold))))

(defn add-server-stats-to-snooper
  "player-snooper - `net.minecraft.profiler.Snooper`"
  ([^DedicatedServer this ^net.minecraft.profiler.Snooper player-snooper]
    (-> this (.addServerStatsToSnooper player-snooper))))

(defn send-message
  "message - `net.minecraft.util.text.ITextComponent`"
  ([^DedicatedServer this ^net.minecraft.util.text.ITextComponent message]
    (-> this (.sendMessage message))))

(defn can-structures-spawn?
  "returns: `boolean`"
  (^Boolean [^DedicatedServer this]
    (-> this (.canStructuresSpawn))))

(defn set-game-type
  "game-mode - `net.minecraft.world.GameType`"
  ([^DedicatedServer this ^net.minecraft.world.GameType game-mode]
    (-> this (.setGameType game-mode))))

(defn command-block-enabled?
  "returns: `boolean`"
  (^Boolean [^DedicatedServer this]
    (-> this (.isCommandBlockEnabled))))

(defn share-to-lan
  "type - `net.minecraft.world.GameType`
  allow-cheats - `boolean`

  returns: `java.lang.String`"
  (^java.lang.String [^DedicatedServer this ^net.minecraft.world.GameType type ^Boolean allow-cheats]
    (-> this (.shareToLAN type allow-cheats))))

(defn get-max-tick-time
  "returns: `long`"
  (^Long [^DedicatedServer this]
    (-> this (.getMaxTickTime))))

(defn hardcore?
  "returns: `boolean`"
  (^Boolean [^DedicatedServer this]
    (-> this (.isHardcore))))

(defn get-game-type
  "returns: `net.minecraft.world.GameType`"
  (^net.minecraft.world.GameType [^DedicatedServer this]
    (-> this (.getGameType))))

(defn get-int-property
  "key - `java.lang.String`
  default-value - `int`

  returns: `int`"
  (^Integer [^DedicatedServer this ^java.lang.String key ^Integer default-value]
    (-> this (.getIntProperty key default-value))))

(defn snooper-enabled?
  "returns: `boolean`"
  (^Boolean [^DedicatedServer this]
    (-> this (.isSnooperEnabled))))

(defn system-exit-now
  ""
  ([^DedicatedServer this]
    (-> this (.systemExitNow))))

(defn block-protected?
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^DedicatedServer this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.isBlockProtected world-in pos player-in))))

(defn set-gui-enabled
  ""
  ([^DedicatedServer this]
    (-> this (.setGuiEnabled))))

(defn get-port
  "returns: `int`"
  (^Integer [^DedicatedServer this]
    (-> this (.getPort))))

(defn add-server-info-to-crash-report
  "report - `net.minecraft.crash.CrashReport`

  returns: `net.minecraft.crash.CrashReport`"
  (^net.minecraft.crash.CrashReport [^DedicatedServer this ^net.minecraft.crash.CrashReport report]
    (-> this (.addServerInfoToCrashReport report))))

(defn init
  "returns: `boolean`

  throws: java.io.IOException"
  (^Boolean [^DedicatedServer this]
    (-> this (.init))))

(defn set-property
  "key - `java.lang.String`
  value - `java.lang.Object`"
  ([^DedicatedServer this ^java.lang.String key ^java.lang.Object value]
    (-> this (.setProperty key value))))

(defn get-settings-filename
  "returns: `java.lang.String`"
  (^java.lang.String [^DedicatedServer this]
    (-> this (.getSettingsFilename))))

(defn get-spawn-protection-size
  "returns: `int`"
  (^Integer [^DedicatedServer this]
    (-> this (.getSpawnProtectionSize))))

(defn get-difficulty
  "returns: `net.minecraft.world.EnumDifficulty`"
  (^net.minecraft.world.EnumDifficulty [^DedicatedServer this]
    (-> this (.getDifficulty))))

(defn handle-r-con-command
  "command - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^DedicatedServer this ^java.lang.String command]
    (-> this (.handleRConCommand command))))

(defn save-properties
  ""
  ([^DedicatedServer this]
    (-> this (.saveProperties))))

(defn set-player-idle-timeout
  "idle-timeout - `int`"
  ([^DedicatedServer this ^Integer idle-timeout]
    (-> this (.setPlayerIdleTimeout idle-timeout))))

