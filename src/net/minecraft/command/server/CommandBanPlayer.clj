(ns net.minecraft.command.server.CommandBanPlayer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command.server CommandBanPlayer]))

(defn ->command-ban-player
  "Constructor."
  (^CommandBanPlayer []
    (new CommandBanPlayer )))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandBanPlayer this]
    (-> this (.getName))))

(defn get-required-permission-level
  "returns: `int`"
  (^Integer [^CommandBanPlayer this]
    (-> this (.getRequiredPermissionLevel))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^CommandBanPlayer this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn check-permission
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`

  returns: `boolean`"
  (^Boolean [^CommandBanPlayer this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender]
    (-> this (.checkPermission server sender))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandBanPlayer this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

(defn get-tab-completions
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`
  target-pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CommandBanPlayer this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args ^net.minecraft.util.math.BlockPos target-pos]
    (-> this (.getTabCompletions server sender args target-pos))))

