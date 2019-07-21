(ns net.minecraft.command.server.CommandMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command.server CommandMessage]))

(defn ->command-message
  "Constructor."
  (^CommandMessage []
    (new CommandMessage )))

(defn get-aliases
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CommandMessage this]
    (-> this (.getAliases))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandMessage this]
    (-> this (.getName))))

(defn get-required-permission-level
  "returns: `int`"
  (^Integer [^CommandMessage this]
    (-> this (.getRequiredPermissionLevel))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^CommandMessage this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandMessage this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

(defn get-tab-completions
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`
  target-pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CommandMessage this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args ^net.minecraft.util.math.BlockPos target-pos]
    (-> this (.getTabCompletions server sender args target-pos))))

(defn username-index?
  "args - `java.lang.String[]`
  index - `int`

  returns: `boolean`"
  (^Boolean [^CommandMessage this args ^Integer index]
    (-> this (.isUsernameIndex args index))))

