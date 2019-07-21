(ns net.minecraft.command.CommandHelp
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command CommandHelp]))

(defn ->command-help
  "Constructor."
  (^CommandHelp []
    (new CommandHelp )))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandHelp this]
    (-> this (.getName))))

(defn get-required-permission-level
  "returns: `int`"
  (^Integer [^CommandHelp this]
    (-> this (.getRequiredPermissionLevel))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^CommandHelp this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn get-aliases
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CommandHelp this]
    (-> this (.getAliases))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandHelp this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

(defn get-tab-completions
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`
  target-pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CommandHelp this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args ^net.minecraft.util.math.BlockPos target-pos]
    (-> this (.getTabCompletions server sender args target-pos))))

