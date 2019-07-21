(ns net.minecraft.command.CommandLocate
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command CommandLocate]))

(defn ->command-locate
  "Constructor."
  (^CommandLocate []
    (new CommandLocate )))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandLocate this]
    (-> this (.getName))))

(defn get-required-permission-level
  "returns: `int`"
  (^Integer [^CommandLocate this]
    (-> this (.getRequiredPermissionLevel))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^CommandLocate this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandLocate this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

(defn get-tab-completions
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`
  target-pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CommandLocate this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args ^net.minecraft.util.math.BlockPos target-pos]
    (-> this (.getTabCompletions server sender args target-pos))))

