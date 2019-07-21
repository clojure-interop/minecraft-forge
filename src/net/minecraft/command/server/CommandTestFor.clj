(ns net.minecraft.command.server.CommandTestFor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command.server CommandTestFor]))

(defn ->command-test-for
  "Constructor."
  (^CommandTestFor []
    (new CommandTestFor )))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandTestFor this]
    (-> this (.getName))))

(defn get-required-permission-level
  "returns: `int`"
  (^Integer [^CommandTestFor this]
    (-> this (.getRequiredPermissionLevel))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^CommandTestFor this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandTestFor this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

(defn username-index?
  "args - `java.lang.String[]`
  index - `int`

  returns: `boolean`"
  (^Boolean [^CommandTestFor this args ^Integer index]
    (-> this (.isUsernameIndex args index))))

(defn get-tab-completions
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`
  target-pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CommandTestFor this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args ^net.minecraft.util.math.BlockPos target-pos]
    (-> this (.getTabCompletions server sender args target-pos))))

