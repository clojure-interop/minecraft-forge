(ns net.minecraft.command.CommandGameRule
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command CommandGameRule]))

(defn ->command-game-rule
  "Constructor."
  (^CommandGameRule []
    (new CommandGameRule )))

(defn *notify-game-rule-change
  "rules - `net.minecraft.world.GameRules`
  p-184898-1 - `java.lang.String`
  server - `net.minecraft.server.MinecraftServer`"
  ([^net.minecraft.world.GameRules rules ^java.lang.String p-184898-1 ^net.minecraft.server.MinecraftServer server]
    (CommandGameRule/notifyGameRuleChange rules p-184898-1 server)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandGameRule this]
    (-> this (.getName))))

(defn get-required-permission-level
  "returns: `int`"
  (^Integer [^CommandGameRule this]
    (-> this (.getRequiredPermissionLevel))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^CommandGameRule this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandGameRule this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

(defn get-tab-completions
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`
  target-pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CommandGameRule this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args ^net.minecraft.util.math.BlockPos target-pos]
    (-> this (.getTabCompletions server sender args target-pos))))

