(ns net.minecraft.command.server.CommandBanIp
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command.server CommandBanIp]))

(defn ->command-ban-ip
  "Constructor."
  (^CommandBanIp []
    (new CommandBanIp )))

(def *-ip-pattern
  "Static Constant.

  type: java.util.regex.Pattern"
  CommandBanIp/IP_PATTERN)

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandBanIp this]
    (-> this (.getName))))

(defn get-required-permission-level
  "returns: `int`"
  (^Integer [^CommandBanIp this]
    (-> this (.getRequiredPermissionLevel))))

(defn check-permission
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`

  returns: `boolean`"
  (^Boolean [^CommandBanIp this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender]
    (-> this (.checkPermission server sender))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^CommandBanIp this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandBanIp this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

(defn get-tab-completions
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`
  target-pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CommandBanIp this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args ^net.minecraft.util.math.BlockPos target-pos]
    (-> this (.getTabCompletions server sender args target-pos))))

