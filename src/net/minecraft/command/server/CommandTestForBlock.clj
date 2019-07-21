(ns net.minecraft.command.server.CommandTestForBlock
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command.server CommandTestForBlock]))

(defn ->command-test-for-block
  "Constructor."
  (^CommandTestForBlock []
    (new CommandTestForBlock )))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandTestForBlock this]
    (-> this (.getName))))

(defn get-required-permission-level
  "returns: `int`"
  (^Integer [^CommandTestForBlock this]
    (-> this (.getRequiredPermissionLevel))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^CommandTestForBlock this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandTestForBlock this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

(defn get-tab-completions
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`
  target-pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CommandTestForBlock this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args ^net.minecraft.util.math.BlockPos target-pos]
    (-> this (.getTabCompletions server sender args target-pos))))

