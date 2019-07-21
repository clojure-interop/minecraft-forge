(ns net.minecraft.server.integrated.IntegratedServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.integrated IntegratedServer]))

(defn ->integrated-server
  "Constructor.

  client-in - `net.minecraft.client.Minecraft`
  folder-name-in - `java.lang.String`
  world-name-in - `java.lang.String`
  world-settings-in - `net.minecraft.world.WorldSettings`
  auth-service-in - `com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService`
  session-service-in - `com.mojang.authlib.minecraft.MinecraftSessionService`
  profile-repo-in - `com.mojang.authlib.GameProfileRepository`
  profile-cache-in - `net.minecraft.server.management.PlayerProfileCache`"
  (^IntegratedServer [^net.minecraft.client.Minecraft client-in ^java.lang.String folder-name-in ^java.lang.String world-name-in ^net.minecraft.world.WorldSettings world-settings-in ^com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService auth-service-in ^com.mojang.authlib.minecraft.MinecraftSessionService session-service-in ^com.mojang.authlib.GameProfileRepository profile-repo-in ^net.minecraft.server.management.PlayerProfileCache profile-cache-in]
    (new IntegratedServer client-in folder-name-in world-name-in world-settings-in auth-service-in session-service-in profile-repo-in profile-cache-in)))

(defn get-op-permission-level
  "returns: `int`"
  (^Integer [^IntegratedServer this]
    (-> this (.getOpPermissionLevel))))

(defn reload-loot-tables
  ""
  ([^IntegratedServer this]
    (-> this (.reloadLootTables))))

(defn dedicated-server?
  "returns: `boolean`"
  (^Boolean [^IntegratedServer this]
    (-> this (.isDedicatedServer))))

(defn get-data-directory
  "returns: `java.io.File`"
  (^java.io.File [^IntegratedServer this]
    (-> this (.getDataDirectory))))

(defn tick
  ""
  ([^IntegratedServer this]
    (-> this (.tick))))

(defn should-broadcast-rcon-to-ops?
  "returns: `boolean`"
  (^Boolean [^IntegratedServer this]
    (-> this (.shouldBroadcastRconToOps))))

(defn should-broadcast-console-to-ops?
  "returns: `boolean`"
  (^Boolean [^IntegratedServer this]
    (-> this (.shouldBroadcastConsoleToOps))))

(defn should-use-native-transport?
  "returns: `boolean`"
  (^Boolean [^IntegratedServer this]
    (-> this (.shouldUseNativeTransport))))

(defn save-all-worlds
  "is-silent - `boolean`"
  ([^IntegratedServer this ^Boolean is-silent]
    (-> this (.saveAllWorlds is-silent))))

(defn add-server-stats-to-snooper
  "player-snooper - `net.minecraft.profiler.Snooper`"
  ([^IntegratedServer this ^net.minecraft.profiler.Snooper player-snooper]
    (-> this (.addServerStatsToSnooper player-snooper))))

(defn can-structures-spawn?
  "returns: `boolean`"
  (^Boolean [^IntegratedServer this]
    (-> this (.canStructuresSpawn))))

(defn set-game-type
  "game-mode - `net.minecraft.world.GameType`"
  ([^IntegratedServer this ^net.minecraft.world.GameType game-mode]
    (-> this (.setGameType game-mode))))

(defn command-block-enabled?
  "returns: `boolean`"
  (^Boolean [^IntegratedServer this]
    (-> this (.isCommandBlockEnabled))))

(defn share-to-lan
  "type - `net.minecraft.world.GameType`
  allow-cheats - `boolean`

  returns: `java.lang.String`"
  (^java.lang.String [^IntegratedServer this ^net.minecraft.world.GameType type ^Boolean allow-cheats]
    (-> this (.shareToLAN type allow-cheats))))

(defn hardcore?
  "returns: `boolean`"
  (^Boolean [^IntegratedServer this]
    (-> this (.isHardcore))))

(defn get-game-type
  "returns: `net.minecraft.world.GameType`"
  (^net.minecraft.world.GameType [^IntegratedServer this]
    (-> this (.getGameType))))

(defn final-tick
  "report - `net.minecraft.crash.CrashReport`"
  ([^IntegratedServer this ^net.minecraft.crash.CrashReport report]
    (-> this (.finalTick report))))

(defn snooper-enabled?
  "returns: `boolean`"
  (^Boolean [^IntegratedServer this]
    (-> this (.isSnooperEnabled))))

(defn stop-server
  ""
  ([^IntegratedServer this]
    (-> this (.stopServer))))

(defn set-difficulty-for-all-worlds
  "difficulty - `net.minecraft.world.EnumDifficulty`"
  ([^IntegratedServer this ^net.minecraft.world.EnumDifficulty difficulty]
    (-> this (.setDifficultyForAllWorlds difficulty))))

(defn add-server-info-to-crash-report
  "report - `net.minecraft.crash.CrashReport`

  returns: `net.minecraft.crash.CrashReport`"
  (^net.minecraft.crash.CrashReport [^IntegratedServer this ^net.minecraft.crash.CrashReport report]
    (-> this (.addServerInfoToCrashReport report))))

(defn init
  "returns: `boolean`

  throws: java.io.IOException"
  (^Boolean [^IntegratedServer this]
    (-> this (.init))))

(defn initiate-shutdown
  ""
  ([^IntegratedServer this]
    (-> this (.initiateShutdown))))

(defn create-command-manager
  "returns: `net.minecraft.command.ServerCommandManager`"
  (^net.minecraft.command.ServerCommandManager [^IntegratedServer this]
    (-> this (.createCommandManager))))

(defn get-difficulty
  "returns: `net.minecraft.world.EnumDifficulty`"
  (^net.minecraft.world.EnumDifficulty [^IntegratedServer this]
    (-> this (.getDifficulty))))

(defn load-all-worlds
  "save-name - `java.lang.String`
  world-name-in - `java.lang.String`
  seed - `long`
  type - `net.minecraft.world.WorldType`
  generator-options - `java.lang.String`"
  ([^IntegratedServer this ^java.lang.String save-name ^java.lang.String world-name-in ^Long seed ^net.minecraft.world.WorldType type ^java.lang.String generator-options]
    (-> this (.loadAllWorlds save-name world-name-in seed type generator-options))))

(defn get-public?
  "returns: `boolean`"
  (^Boolean [^IntegratedServer this]
    (-> this (.getPublic))))

