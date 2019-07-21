(ns net.minecraft.command.CommandFill
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command CommandFill]))

(defn ->command-fill
  "Constructor."
  (^CommandFill []
    (new CommandFill )))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandFill this]
    (-> this (.getName))))

(defn get-required-permission-level
  "returns: `int`"
  (^Integer [^CommandFill this]
    (-> this (.getRequiredPermissionLevel))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^CommandFill this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandFill this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

(defn get-tab-completions
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`
  target-pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CommandFill this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args ^net.minecraft.util.math.BlockPos target-pos]
    (-> this (.getTabCompletions server sender args target-pos))))

